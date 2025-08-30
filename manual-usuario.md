# manual-usuario.md

# 📘 Manual de Usuario – Compilador RemiLang

Este manual explica cómo usar el compilador **RemiLang**.

---

## 📥 Requisitos previos

* Java 17 instalado (`java -version`).
* Maven instalado (`mvn -version`).

---

## ▶️ Pasos de uso

1. Compilar el proyecto
     ```bash
     mvn clean compile
     ```
2. Análisis léxico
     ```bash
     mvn exec:java -Dexec.mainClass=com.remilang.Main -Dexec.args=rutaEntrada.remi
     ```
     👉 Esto genera tokens_output.txt con todos los tokens.
3. Análisis sintáctico
     ```bash
     mvn exec:java -Dexec.mainClass=com.remilang.MainParse -Dexec.args=rutaEntrada.remi
     ```
4. Análisis semántico
     ```bash
     mvn exec:java -Dexec.mainClass=com.remilang.SemanticMain -Dexec.args=rutaEntrada.remi
     ```
5. Generación de código
     ```bash
     mvn exec:java -Dexec.mainClass=com.remilang.MainCodeGen -Dexec.args=rutaEntrada.remi
     ```
6. Compilar y ejecutar el código generado
     ```bash
     javac target/RemiPrograma.java
     java -cp target RemiPrograma
     ```

---

## 📖 Ejemplo de entrada (rutaEntrada.remi)
```java
SI 5 > 3
  IMPRIMIR "mayor"
SINO
  IMPRIMIR "menor o igual"
FIN

x = 0
MIENTRAS x < 3
  IMPRIMIR "loop"
  x = x + 1
FIN
```

---

## 🌳 Árbol sintáctico esperado
```txt
(programa 
   (sentencia 
      (condicional SI (expr (expr (literal 5)) > (expr (literal 3))) 
         (bloque (sentencia (imprimir IMPRIMIR (expresion_cadena "mayor")))) 
         SINO 
         (bloque (sentencia (imprimir IMPRIMIR (expresion_cadena "menor o igual")))) 
         FIN)) 
   (sentencia 
      (asignacion x = (expr (literal 0)))) 
   (sentencia 
      (bucle_mientras MIENTRAS (expr (expr x) < (expr (literal 3))) 
         (bloque 
            (sentencia (imprimir IMPRIMIR (expresion_cadena "loop"))) 
            (sentencia (asignacion x = (expr (expr x) + (expr (literal 1)))))) 
         FIN)) 
   <EOF>)
```

---

## 📤 Resultado en Java generado
```java
public class RemiPrograma {
    public static void main(String[] args) throws Exception {
        if ((5 > 3)) {
            System.out.println("mayor");
        } else {
            System.out.println("menor o igual");
        }
        int x = 0;
        while ((x < 3)) {
            System.out.println("loop");
            x = (x + 1);
        }
    }
}
```