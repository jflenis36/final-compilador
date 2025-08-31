# manua-tecnico.md

# 🛠️ Manual Técnico – Compilador RemiLang

Este manual describe los aspectos internos y técnicos del compilador **RemiLang**.

---

## 📐 Arquitectura del compilador

El compilador está dividido en **4 fases principales**:

1. Léxico (`Main.java`)
     * Usa ANTLR para generar el lexer.
     * Exporta los tokens en `tokens_output.txt`.
2. Sintáctico (`MainParse.java`)
     * Construye el árbol de análisis (AST).
     * Exporta el resultado en `parse_output.txt`.
3. Semántico (`SemanticMain.java`, `AnalizadorSemantico.java`)
     * Usa tabla de símbolos (`TablaSimbolos.java` + `Simbolo.java`).
     * Verifica declaraciones, tipos y usos de variables.
     * Exporta reporte en `semantics_report.txt`.
4. Generación de código (`MainCodeGen.java`, `CodeGen.java`)
     * Traduce el AST a Java.
     * Genera `RemiPrograma.java` en la carpeta `target/`.

---

## 📂 Estructura del proyecto
```bash
src/
 ├── main/antlr4/RemiLang.g4         # Gramática ANTLR
 └── main/java/com/remilang/         # Código fuente
     ├── Main.java                   # Análisis léxico
     ├── MainParse.java              # Análisis sintáctico
     ├── SemanticMain.java           # Entrada del análisis semántico
     ├── AnalizadorSemantico.java    # Implementación de la semántica
     ├── MainCodeGen.java            # Entrada de generación de código
     ├── CodeGen.java                # Traductor a Java
     ├── Tipo.java                   # Tipos soportados
     ├── Simbolo.java                # Representación de variables
     └── TablaSimbolos.java          # Manejo de tabla de símbolos
```

---

## 🔧 Dependencias

* ANTLR 4.13.2
* Java 17
* Maven 3.8+

---

## ⚙️ Flujo de ejecución

1. `mvn clean compile` <br>
     Compila el proyecto y genera las clases de ANTLR.
2. `mvn "exec:java" "-Dexec.mainClass=com.remilang.Main" "-Dexec.args=ejemplo.remi"`<br>
     Genera los tokens (`tokens_output.txt`).
3. `mvn exec:java "-Dexec.mainClass=com.remilang.MainParse" "-Dexec.args=ejemplo.remi"`<br>
     Genera el árbol sintáctico (`parse_output.txt`).
4. `mvn "-Dexec.mainClass=com.remilang.SemanticMain" "-Dexec.args=ejemplo.remi" exec:java`<br>
     Verifica errores semánticos (`semantics_report.txt`).
5. `mvn exec:java "-Dexec.mainClass=com.remilang.MainCodeGen" "-Dexec.args=ejemplo.remi"`<br>
     Genera el archivo `RemiPrograma.java`.