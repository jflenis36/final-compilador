package com.remilang;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.nio.file.*;
import java.io.*;

public class MainCodeGen {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Uso:");
            System.out.println("  mvn exec:java -Dexec.mainClass=com.remilang.MainCodeGen -Dexec.args=\"archivo.remi\"");
            return;
        }

        // Parse
        CharStream input = CharStreams.fromPath(Paths.get(args[0]));
        RemiLangLexer lexer = new RemiLangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RemiLangParser parser = new RemiLangParser(tokens);

        parser.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener() {
            @Override public void syntaxError(Recognizer<?, ?> r, Object off,
                                              int line, int charPos, String msg, RecognitionException e) {
                System.err.printf("Error de sintaxis L%d:C%d: %s%n", line, charPos, msg);
            }
        });

        ParseTree tree = parser.programa();

        // Semántica: si hay errores, no generamos
        AnalizadorSemantico sem = new AnalizadorSemantico();
        sem.visit(tree);
        if (!sem.getErrores().isEmpty()) {
            System.out.println("❌ Hay errores semánticos. No se genera código.");
            sem.reportarSalida();
            System.exit(1);
        } else {
            System.out.println("✅ Semántica OK. Generando Java...");
        }

        // Generación
        CodeGen gen = new CodeGen();
        Path outFile = Paths.get("target", "RemiPrograma.java");
        gen.generate((RemiLangParser.ProgramaContext) tree, outFile);

        System.out.println(">> Archivo generado: " + outFile.toAbsolutePath());
        System.out.println("Compila y ejecuta así:");
        System.out.println("  javac " + outFile.toString());
        System.out.println("  java -cp target RemiPrograma");
    }
}