# README.md

# 📘 Compilador RemiLang

Este proyecto implementa un **compilador completo** para el lenguaje **RemiLang** usando **ANTLR4 y Java**.  
Incluye todas las fases clásicas:

1. **Análisis léxico** – Generación de tokens.
2. **Análisis sintáctico** – Construcción del árbol de análisis.
3. **Análisis semántico** – Verificación de tipos, declaraciones y errores.
4. **Generación de código** – Traducción a un programa en **Java ejecutable**.

---

## 🚀 Cómo compilar el proyecto

```bash
mvn clean compile
```

---

## ▶️ Ejecución por fases

- Análisis léxico
```bash
mvn "exec:java" "-Dexec.mainClass=com.remilang.Main" "-Dexec.args=ejemplo.remi"
```

- Análisis sintáctico
```bash
mvn exec:java "-Dexec.mainClass=com.remilang.MainParse" "-Dexec.args=ejemplo.remi"
```

- Análisis semántico
```bash
mvn "-Dexec.mainClass=com.remilang.SemanticMain" "-Dexec.args=ejemplo.remi" exec:java
```

- Generación de código
```bash
mvn exec:java "-Dexec.mainClass=com.remilang.MainCodeGen" "-Dexec.args=ejemplo.remi"
```

Esto generará un archivo `RemiPrograma.java` en la carpeta `target/`.

---

## ▶️ Compilar y ejecutar el código generados
```bash
javac target/RemiPrograma.java
java -cp target RemiPrograma
```

---

## 📂 Estructura de directorios

```bash
src/
 └── main/
     ├── antlr4/
     │   └── RemiLang.g4             # Gramática del lenguaje
     └── java/com/remilang/
         ├── AnalizadorSemantico.java
         ├── CodeGen.java
         ├── Main.java               # Léxico
         ├── MainParse.java          # Sintaxis
         ├── SemanticMain.java       # Semántica
         ├── MainCodeGen.java        # Generación de código
         ├── Simbolo.java
         ├── TablaSimbolos.java
         └── Tipo.java

target/
 ├── RemiPrograma.java               # Código Java generado
 ├── RemiPrograma.class              # Clase compilada
 ├── tokens_output.txt               # Tokens del análisis léxico
 ├── parse_output.txt                # Árbol sintáctico
 └── semantics_report.txt            # Reporte semántico
```

---

## 📖 Documentación
- [📘 Manual Técnico](manual-tecnico.md)  
- [📘 Manual de Usuario](manual-usuario.md)  