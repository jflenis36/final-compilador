package com.remilang;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.nio.file.*;

public class SemanticMain {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Uso: mvn exec:java -Dexec.mainClass=com.remilang.SemanticMain -Dexec.args=\"archivo.remi\"");
            return;
        }
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
        AnalizadorSemantico sem = new AnalizadorSemantico();
        sem.visit(tree);
        sem.reportarSalida();
    }
}