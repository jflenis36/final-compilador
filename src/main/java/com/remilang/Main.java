package com.remilang;

import org.antlr.v4.runtime.*;
import java.nio.file.*;
import java.util.*;
import java.io.*;

public class Main {
    private static final Map<String, String> FRIENDLY = new HashMap<>();
    static {
          FRIENDLY.put("IDENTIFICADOR", "Identificador");
FRIENDLY.put("CADENA_LITERAL", "Cadena");
FRIENDLY.put("ENTERO", "Entero");
FRIENDLY.put("BOOLEANO_VERDADERO", "Booleano");
FRIENDLY.put("BOOLEANO_FALSO", "Booleano");

FRIENDLY.put("SUMAR", "SUMAR");
FRIENDLY.put("RESTAR", "RESTAR");
FRIENDLY.put("MULTIPLICAR", "MULTIPLICAR");
FRIENDLY.put("DIVIDIR", "DIVIDIR");
FRIENDLY.put("MODULO", "MODULO");

FRIENDLY.put("MAYOR_O_IGUAL_QUE", "MAYOR_O_IGUAL_QUE");
FRIENDLY.put("MENOR_O_IGUAL_QUE", "MENOR_O_IGUAL_QUE");
FRIENDLY.put("IGUAL_QUE", "IGUAL_QUE");
FRIENDLY.put("DIFERENTE_QUE", "DIFERENTE_QUE");
FRIENDLY.put("MAYOR_QUE", "MAYOR_QUE");
FRIENDLY.put("MENOR_QUE", "MENOR_QUE");

FRIENDLY.put("Y", "Y");
FRIENDLY.put("O", "O");
FRIENDLY.put("NO", "NO");

FRIENDLY.put("ASIGNAR", "ASIGNAR");
FRIENDLY.put("SUMAR_ASIGNAR", "SUMAR_ASIGNAR");
FRIENDLY.put("RESTAR_ASIGNAR", "RESTAR_ASIGNAR");
FRIENDLY.put("MULTIPLICAR_ASIGNAR", "MULTIPLICAR_ASIGNAR");
FRIENDLY.put("DIVIDIR_ASIGNAR", "DIVIDIR_ASIGNAR");
FRIENDLY.put("MODULO_ASIGNAR", "MODULO_ASIGNAR");

FRIENDLY.put("PARENTESIS_IZQUIERDO", "PARENTESIS_IZQUIERDO");
FRIENDLY.put("PARENTESIS_DERECHO", "PARENTESIS_DERECHO");
FRIENDLY.put("LLAVE_IZQUIERDA", "LLAVE_IZQUIERDA");
FRIENDLY.put("LLAVE_DERECHA", "LLAVE_DERECHA");
FRIENDLY.put("CORCHETE_IZQUIERDO", "CORCHETE_IZQUIERDO");
FRIENDLY.put("CORCHETE_DERECHO", "CORCHETE_DERECHO");
FRIENDLY.put("COMA", "COMA");
FRIENDLY.put("PUNTO_Y_COMA", "PUNTO_Y_COMA");

FRIENDLY.put("COMENTARIO_LINEA", "Comentario");
FRIENDLY.put("COMENTARIO_BLOQUE", "Comentario");

// Palabras clave de tipos (si las usas)
FRIENDLY.put("ENTERO_TIPO", "ENTERO");
FRIENDLY.put("CADENA_TIPO", "CADENA");
FRIENDLY.put("BOOLEANO_TIPO", "BOOLEANO");
FRIENDLY.put("ARREGLO_TIPO", "ARREGLO");

// Control de flujo y E/S
FRIENDLY.put("SI", "SI");
FRIENDLY.put("SINO", "SINO");
FRIENDLY.put("FIN", "FIN");
FRIENDLY.put("MIENTRAS", "MIENTRAS");
FRIENDLY.put("IMPRIMIR", "IMPRIMIR");
    }

    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Uso: mvn exec:java -Dexec.mainClass=com.remilang.Main -Dexec.args=\"archivo.remi\"");
            return;
        }

        // Leer archivo fuente
        String sourcePath = args[0];
        CharStream input = CharStreams.fromPath(Paths.get(sourcePath));

        // Lexer
        RemiLangLexer lexer = new RemiLangLexer(input);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        tokenStream.fill();

        // Construir salida
        StringBuilder out = new StringBuilder();
        for (Token t : tokenStream.getTokens()) {
            if (t.getType() == Token.EOF) continue;
            String typeName = RemiLangLexer.VOCABULARY.getSymbolicName(t.getType());
            String label = FRIENDLY.getOrDefault(typeName, typeName);
            out.append(String.format("%-10s : %s%n", label, t.getText()));
        }

        // Imprimir en consola
        System.out.print(out.toString());

        // Guardar evidencia en archivo
        Path outDir = Paths.get("target");
        try { Files.createDirectories(outDir); } catch (IOException ignored) {}
        Path outFile = outDir.resolve("tokens_output.txt");
        Files.write(outFile, out.toString().getBytes());
        System.out.println("\n>> Tokens también guardados en: " + outFile.toAbsolutePath());
    }
}
