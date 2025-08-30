package com.remilang;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.nio.file.*;
import java.io.*;

// Fase 2: analizador sintáctico con errores en español y árbol sintáctico
public class MainParse {

    // Listener de errores amigable (en español)
    static class ErroresEspanol extends BaseErrorListener {
        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                int line, int charPositionInLine, String msg, RecognitionException e) {
            String simb = (offendingSymbol instanceof Token) ? ((Token) offendingSymbol).getText() : String.valueOf(offendingSymbol);
            System.err.printf("Error de sintaxis en línea %d, columna %d: símbolo '%s'. Detalle: %s%n",
                    line, charPositionInLine, simb, msg);
        }
    }

    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Uso: mvn exec:java -Dexec.mainClass=com.remilang.MainParse -Dexec.args=\"archivo.remi\"");
            return;
        }

        String source = args[0];
        CharStream input = CharStreams.fromPath(Paths.get(source));

        RemiLangLexer lexer = new RemiLangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RemiLangParser parser = new RemiLangParser(tokens);

        // Errores en español
        parser.removeErrorListeners();
        parser.addErrorListener(new ErroresEspanol());

        ParseTree tree = parser.programa();

        // 1) Mostrar árbol en consola
        System.out.println(tree.toStringTree(parser));

        // 2) Guardar evidencia en archivo
        Path outDir = Paths.get("target");
        Files.createDirectories(outDir);
        Path out = outDir.resolve("parse_output.txt");
        Files.write(out, tree.toStringTree(parser).getBytes());
        System.out.println(">> Árbol sintáctico guardado en: " + out.toAbsolutePath());
    }
}
