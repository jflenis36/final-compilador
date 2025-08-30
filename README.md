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
mvn exec:java -Dexec.mainClass=com.remilang.Main -Dexec.args=rutaEntrada.remi
```

- Análisis léxico
```bash
mvn exec:java -Dexec.mainClass=com.remilang.MainParse -Dexec.args=rutaEntrada.remi
```

- Análisis léxico
```bash
mvn exec:java -Dexec.mainClass=com.remilang.SemanticMain -Dexec.args=rutaEntrada.remi
```

- Análisis léxico
```bash
mvn exec:java -Dexec.mainClass=com.remilang.MainCodeGen -Dexec.args=rutaEntrada.remi
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


---

## 📖 Documentación
- [📘 Manual Técnico](manual-tecnico,md)  
- [📘 Manual de Usuario](manual-usuario.md)  