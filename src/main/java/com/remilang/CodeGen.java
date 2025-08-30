package com.remilang;

import java.nio.file.*;
import java.io.*;
import java.util.*;
import org.antlr.v4.runtime.tree.*;

public class CodeGen extends RemiLangBaseVisitor<String> {

    private final StringBuilder out = new StringBuilder();
    private int indent = 0;

    // Scope simple: nombre -> Tipo
    private final Deque<Map<String,Tipo>> scopes = new ArrayDeque<>();

    public CodeGen() {
        scopes.push(new HashMap<>()); // global
    }

    /* ===== Utilidades ===== */
    private void nl() { out.append('\n'); }
    private void ind() { out.append("    ".repeat(indent)); }
    private Map<String,Tipo> scope() { return scopes.peek(); }

    private void openScope() { scopes.push(new HashMap<>(scope())); } // clona visibles
    private void closeScope() { scopes.pop(); }

    private void emitLine(String s) { ind(); out.append(s); nl(); }
    private void emit(String s) { out.append(s); }

    private boolean declared(String id) { return scope().containsKey(id); }
    private void declare(String id, Tipo t) { scope().put(id, t); }

    private String javaType(Tipo t) {
        switch (t) {
            case ENTERO: return "int";
            case CADENA: return "String";
            case BOOLEANO: return "boolean";
            case ARREGLO_ENTERO: return "int[]";
            case ARREGLO_CADENA: return "String[]";
            case ARREGLO_BOOLEANO: return "boolean[]";
            case ARREGLO_DESCONOCIDO: return "Object[]";
            default: return "Object";
        }
    }

    /* ====== Entrada ====== */
    public void generate(RemiLangParser.ProgramaContext tree, Path outFile) throws IOException {
        emitLine("public class RemiPrograma {");
        indent++;
        emitLine("public static void main(String[] args) throws Exception {");
        indent++;

        for (var s : tree.sentencia()) visit(s);

        indent--;
        emitLine("}");
        indent--;
        emitLine("}");

        Files.createDirectories(outFile.getParent());
        Files.writeString(outFile, out.toString());
    }

    /* ====== Sentencias ====== */
    @Override
    public String visitImprimir(RemiLangParser.ImprimirContext ctx) {
        String e = visit(ctx.expr());
        emitLine("System.out.println(" + e + ");");
        return null;
    }

    @Override
    public String visitDeclaracion(RemiLangParser.DeclaracionContext ctx) {
        // Tipo declarado
        Tipo t;
        if (ctx.ENTERO_TIPO()!=null) t = Tipo.ENTERO;
        else if (ctx.CADENA_TIPO()!=null) t = Tipo.CADENA;
        else if (ctx.BOOLEANO_TIPO()!=null) t = Tipo.BOOLEANO;
        else if (ctx.ARREGLO_TIPO()!=null) t = Tipo.ARREGLO_DESCONOCIDO;
        else t = Tipo.DESCONOCIDO;

        String id = ctx.IDENTIFICADOR().getText();
        if (declared(id)) {
            // sombreado: permitimos sobrescribir (ya validado por semántica si aplica)
        }
        declare(id, t);

        if (ctx.expr()!=null) {
            String rhs = visit(ctx.expr());

            // Si es ARREGLO_TIPO sin más, intenta refinar con el RHS
            if (t == Tipo.ARREGLO_DESCONOCIDO) {
                Tipo tr = tipoExpr(ctx.expr());
                if (tr == Tipo.ARREGLO_ENTERO || tr == Tipo.ARREGLO_CADENA || tr == Tipo.ARREGLO_BOOLEANO) {
                    t = tr;
                    declare(id, t);
                }
            }

            emitLine(javaType(t) + " " + id + " = " + rhs + ";");
        } else {
            emitLine(javaType(t) + " " + id + ";");
        }
        return null;
    }

    @Override
    public String visitAsignacion(RemiLangParser.AsignacionContext ctx) {
          String id = ctx.IDENTIFICADOR().getText();
          String rhs = visit(ctx.expr());

          if (!declared(id)) {
               // Inferimos tipo del RHS e inmediatamente declaramos
               Tipo tr = tipoExpr(ctx.expr());

               // Salvavidas: si el RHS es un literal entero puro (solo dígitos), fuerza ENTERO
               String rhsText = ctx.expr().getText();
               if (rhsText.matches("\\d+")) {
                    tr = Tipo.ENTERO;
               }

               declare(id, tr);
               emitLine(javaType(tr) + " " + id + " = " + rhs + ";");
          } else {
               emitLine(id + " = " + rhs + ";");
          }
          return null;
     }

    @Override
    public String visitCondicional(RemiLangParser.CondicionalContext ctx) {
        String cond = visit(ctx.expr());
        emitLine("if (" + cond + ") {");
        indent++;
        openScope();
        visit(ctx.bloque(0));
        closeScope();
        indent--;
        ind(); emit("}");
        if (ctx.bloque().size() > 1) {
            emit(" else {"); nl();
            indent++;
            openScope();
            visit(ctx.bloque(1));
            closeScope();
            indent--;
            emitLine("}");
        } else {
            nl();
        }
        return null;
    }

    @Override
    public String visitBucle_mientras(RemiLangParser.Bucle_mientrasContext ctx) {
        String cond = visit(ctx.expr());
        emitLine("while (" + cond + ") {");
        indent++;
        openScope();
        visit(ctx.bloque());
        closeScope();
        indent--;
        emitLine("}");
        return null;
    }

    @Override
    public String visitBloque(RemiLangParser.BloqueContext ctx) {
        for (var s : ctx.sentencia()) visit(s);
        return null;
    }

    /* ====== Expresiones (String) ====== */
    @Override public String visitExpr_o(RemiLangParser.Expr_oContext ctx) {
        String s = visit(ctx.expr_y(0));
        for (int i=1;i<ctx.expr_y().size();i++) {
            s = "(" + s + " || " + visit(ctx.expr_y(i)) + ")";
        }
        return s;
    }

    @Override public String visitExpr_y(RemiLangParser.Expr_yContext ctx) {
        String s = visit(ctx.expr_igualdad(0));
        for (int i=1;i<ctx.expr_igualdad().size();i++) {
            s = "(" + s + " && " + visit(ctx.expr_igualdad(i)) + ")";
        }
        return s;
    }

    @Override public String visitExpr_igualdad(RemiLangParser.Expr_igualdadContext ctx) {
        String s = visit(ctx.expr_comparacion(0));
        for (int i=1;i<ctx.expr_comparacion().size();i++) {
            String op = ctx.getChild(2*i-1).getText(); // == o !=
            s = "(" + s + " " + op + " " + visit(ctx.expr_comparacion(i)) + ")";
        }
        return s;
    }

    @Override public String visitExpr_comparacion(RemiLangParser.Expr_comparacionContext ctx) {
        String s = visit(ctx.expr_suma(0));
        for (int i=1;i<ctx.expr_suma().size();i++) {
            String op = ctx.getChild(2*i-1).getText(); // >,<,>=,<=
            s = "(" + s + " " + op + " " + visit(ctx.expr_suma(i)) + ")";
        }
        return s;
    }

    @Override public String visitExpr_suma(RemiLangParser.Expr_sumaContext ctx) {
        String s = visit(ctx.expr_mult(0));
        for (int i=1;i<ctx.expr_mult().size();i++) {
            String op = ctx.getChild(2*i-1).getText(); // +|-
            s = "(" + s + " " + op + " " + visit(ctx.expr_mult(i)) + ")";
        }
        return s;
    }

    @Override public String visitExpr_mult(RemiLangParser.Expr_multContext ctx) {
        String s = visit(ctx.expr_unaria(0));
        for (int i=1;i<ctx.expr_unaria().size();i++) {
            String op = ctx.getChild(2*i-1).getText(); // *|/|%
            s = "(" + s + " " + op + " " + visit(ctx.expr_unaria(i)) + ")";
        }
        return s;
    }

    @Override public String visitExpr_unaria(RemiLangParser.Expr_unariaContext ctx) {
        if (ctx.expr_unaria()!=null) {
            String op = ctx.getChild(0).getText(); // ! | + | -
            return "(" + op + visit(ctx.expr_unaria()) + ")";
        }
        return visit(ctx.expr_primaria());
    }

    @Override public String visitExpr_primaria(RemiLangParser.Expr_primariaContext ctx) {
        if (ctx.ENTERO()!=null) return ctx.ENTERO().getText();
        if (ctx.CADENA_LITERAL()!=null) return ctx.CADENA_LITERAL().getText();
        if (ctx.BOOLEANO_VERDADERO()!=null) return "true";
        if (ctx.BOOLEANO_FALSO()!=null) return "false";
        if (ctx.IDENTIFICADOR()!=null) return ctx.IDENTIFICADOR().getText();
        if (ctx.PARENTESIS_IZQUIERDO()!=null) return "(" + visit(ctx.expr()) + ")";
        if (ctx.arreglo()!=null) return visit(ctx.arreglo());
        if (ctx.acceso_arreglo()!=null) return visit(ctx.acceso_arreglo());
        return "null";
    }

    @Override public String visitArreglo(RemiLangParser.ArregloContext ctx) {
        // inferir tipo del primer elemento para el constructor
        Tipo elem = Tipo.DESCONOCIDO;
        List<String> items = new ArrayList<>();
        for (int i=0;i<ctx.expr().size();i++) items.add(visit(ctx.expr(i)));
        if (!ctx.expr().isEmpty()) elem = tipoExpr(ctx.expr(0));
        String ctorType = javaType(Tipo.arregloDe(elem)).replace("[]","");
        return "new " + ctorType + "[]{" + String.join(", ", items) + "}";
    }

    @Override public String visitAcceso_arreglo(RemiLangParser.Acceso_arregloContext ctx) {
        return ctx.IDENTIFICADOR().getText() + "[" + visit(ctx.expr()) + "]";
    }

    /* ====== Inferencia simple para codegen ====== */
    private Tipo tipoExpr(RemiLangParser.ExprContext e) {
        return new InferTipos().calcular(e);
    }

    private class InferTipos extends RemiLangBaseVisitor<Tipo> {
        Tipo calcular(ParseTree t) { return visit(t); }

        @Override public Tipo visitExpr_o(RemiLangParser.Expr_oContext ctx) { return Tipo.BOOLEANO; }
        @Override public Tipo visitExpr_y(RemiLangParser.Expr_yContext ctx) { return Tipo.BOOLEANO; }
        @Override public Tipo visitExpr_igualdad(RemiLangParser.Expr_igualdadContext ctx) { return Tipo.BOOLEANO; }
        @Override public Tipo visitExpr_comparacion(RemiLangParser.Expr_comparacionContext ctx) { return Tipo.BOOLEANO; }

        @Override public Tipo visitExpr_suma(RemiLangParser.Expr_sumaContext ctx) {
            boolean anyString = false;
            boolean allInt = true;
            for (var m : ctx.expr_mult()) {
                Tipo t = visit(m);
                if (t == Tipo.CADENA) anyString = true;
                if (t != Tipo.ENTERO && t != Tipo.CADENA) allInt = false;
            }
            if (anyString) return Tipo.CADENA;
            if (allInt) return Tipo.ENTERO;
            return Tipo.ERROR;
        }

        @Override public Tipo visitExpr_mult(RemiLangParser.Expr_multContext ctx) {
            for (var u : ctx.expr_unaria()) {
                if (visit(u) != Tipo.ENTERO) return Tipo.ERROR;
            }
            return Tipo.ENTERO;
        }

        @Override public Tipo visitExpr_unaria(RemiLangParser.Expr_unariaContext ctx) {
            if (ctx.NO()!=null) return Tipo.BOOLEANO;
            if (ctx.RESTAR()!=null || ctx.SUMAR()!=null) return Tipo.ENTERO;
            return visit(ctx.expr_primaria());
        }

        @Override public Tipo visitExpr_primaria(RemiLangParser.Expr_primariaContext ctx) {
            if (ctx.ENTERO()!=null) return Tipo.ENTERO;
            if (ctx.CADENA_LITERAL()!=null) return Tipo.CADENA;
            if (ctx.BOOLEANO_VERDADERO()!=null || ctx.BOOLEANO_FALSO()!=null) return Tipo.BOOLEANO;
            if (ctx.arreglo()!=null) return visit(ctx.arreglo());
            if (ctx.acceso_arreglo()!=null) return Tipo.DESCONOCIDO;
            if (ctx.IDENTIFICADOR()!=null) {
                String id = ctx.IDENTIFICADOR().getText();
                for (var map : scopes) if (map.containsKey(id)) return map.get(id);
                return Tipo.DESCONOCIDO;
            }
            if (ctx.PARENTESIS_IZQUIERDO()!=null) return visit(ctx.expr());
            return Tipo.DESCONOCIDO;
        }

        @Override public Tipo visitArreglo(RemiLangParser.ArregloContext ctx) {
            if (ctx.expr().isEmpty()) return Tipo.ARREGLO_DESCONOCIDO;
            Tipo first = visit(ctx.expr(0));
            for (int i=1;i<ctx.expr().size();i++) {
                if (visit(ctx.expr(i)) != first) return Tipo.ARREGLO_DESCONOCIDO;
            }
            return Tipo.arregloDe(first);
        }
    }
}
