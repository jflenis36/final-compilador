# ==========================================
# PowerShell - Ejecuta todos los casos de prueba
# Funciona si lo corres desde la RAÍZ o desde test/
# Uso:
#   Set-ExecutionPolicy -Scope Process -ExecutionPolicy RemoteSigned
#   .\run-all.ps1      (si está en raíz)
#   .\test\run-all.ps1 (si lo dejas en test/)
# ==========================================

$ErrorActionPreference = "Stop"
# Evita moji-bake en acentos/emoji
[Console]::OutputEncoding = [System.Text.UTF8Encoding]::UTF8
$OutputEncoding = [System.Text.UTF8Encoding]::UTF8

# 1) Determinar carpeta del script y buscar la RAÍZ (donde está pom.xml)
$scriptDir = Split-Path -Parent $MyInvocation.MyCommand.Path
Set-Location $scriptDir

function Find-ProjectRoot {
  $d = Get-Location
  while ($null -ne $d) {
    if (Test-Path (Join-Path $d "pom.xml")) { return $d }
    $parent = Split-Path $d -Parent
    if ($parent -eq $d) { break }
    Set-Location $parent
    $d = Get-Location
  }
  throw "No se encontró pom.xml al subir directorios."
}
$root = Find-ProjectRoot
Set-Location $root

# 2) Resolver carpeta de casos: 'test/' (preferido) o 'tests/'
$casesRoot = if (Test-Path (Join-Path $root "test")) {
  Join-Path $root "test"
} elseif (Test-Path (Join-Path $root "tests")) {
  Join-Path $root "tests"
} else {
  throw "No existe carpeta 'test' ni 'tests' en: $root"
}

function Show-File($path, $title) {
  if (Test-Path $path) {
    Write-Host ""
    Write-Host "===== $title ($path) =====" -ForegroundColor Cyan
    Get-Content -Raw $path | Write-Host
  } else {
    Write-Host ">> No se encontró $path" -ForegroundColor Yellow
  }
}

function Clean-Targets() {
  foreach ($f in @(
    "target\tokens_output.txt",
    "target\parse_output.txt",
    "target\semantics_report.txt",
    "target\RemiPrograma.java",
    "target\RemiPrograma.class"
  )) {
    if (Test-Path $f) { Remove-Item $f -Force -ErrorAction SilentlyContinue }
  }
}

# --- LLAMADAS A MAVEN SEGURAS EN POWERSHELL ---
function MVN-Exec([string]$mainClass, [string]$argsStr) {
  # Pasamos los -D... entre comillas para que PS no los procese.
  & mvn -q exec:java ("-Dexec.mainClass={0}" -f $mainClass) ("-Dexec.args={0}" -f $argsStr)
}

function Run-One($filePath) {
  Write-Host "---------------------------------------"
  Write-Host "Archivo: $filePath"
  Write-Host "---------------------------------------"
  Clean-Targets

  Write-Host "[LÉXICO] -> tokens_output.txt"
  MVN-Exec "com.remilang.Main" $filePath
  Show-File "target\tokens_output.txt" "TOKENS"

  Write-Host "[SINTAXIS] -> parse_output.txt"
  MVN-Exec "com.remilang.MainParse" $filePath
  Show-File "target\parse_output.txt" "ÁRBOL SINTÁCTICO"

  Write-Host "[SEMÁNTICA] -> semantics_report.txt"
  MVN-Exec "com.remilang.SemanticMain" $filePath
  Show-File "target\semantics_report.txt" "REPORTE SEMÁNTICO"

  # Detectar errores semánticos
  $semFile = "target\semantics_report.txt"
  $hasErrors = $false
  if (Test-Path $semFile) {
    $mark = Select-String -Path $semFile -Pattern "❌","error" -SimpleMatch -Quiet -CaseSensitive:$false
    $hasErrors = [bool]$mark
  }

  if (-not $hasErrors) {
    Write-Host "[CODEGEN] -> RemiPrograma.java"
    MVN-Exec "com.remilang.MainCodeGen" $filePath
    Show-File "target\RemiPrograma.java" "JAVA GENERADO"

    if (Test-Path "target\RemiPrograma.java") {
      Write-Host "[JAVAC] compilando generado"
      javac target\RemiPrograma.java
      Write-Host "[JAVA] ejecutando RemiPrograma"
      & java -cp target RemiPrograma
    }
  } else {
    Write-Host "→ Se detectaron errores semánticos (no se genera código)." -ForegroundColor Yellow
  }

  Write-Host ""
}

Write-Host "== 1) Compilando proyecto =="
mvn -q clean compile

function Run-Dir($name) {
  $dir = Join-Path $casesRoot $name
  Write-Host "== Ejecutando casos $name =="
  if (Test-Path $dir) {
    Get-ChildItem (Join-Path $dir "*.remi") -ErrorAction SilentlyContinue | ForEach-Object { Run-One $_.FullName }
  } else {
    Write-Host ">> No existe $dir (se omite)" -ForegroundColor Yellow
  }
}

Run-Dir "success"
Run-Dir "parse_error"
Run-Dir "semantic_error"

Write-Host "== Listo. Revisa también la carpeta 'target/' por los artefactos generados. =="
