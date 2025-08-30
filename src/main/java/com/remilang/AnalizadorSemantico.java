package com.remilang;

import org.antlr.v4.runtime.Token;
import java.util.*;
import java.nio.file.*;
import java.io.*;

public class AnalizadorSemantico extends RemiLangBaseVisitor<Tipo> {

    private final Deque<TablaSimbolos> pila = new ArrayDeque<>();
    private final List<String> errores = new ArrayList<>();
    private final List<String> avisos  = new ArrayList<>();

    public AnalizadorSemantico() { pila.push(new TablaSimbolos(null)); }

    public List<String> getErrores() { return errores; }
    public List<String> getAvisos()  { return avisos;  }

    private TablaSimbolos ambito() { return pila.peek(); }
    private void abrirAmbito() { pila.push(new TablaSimbolos(ambito())); }
    private void cerrarAmbito() { pila.pop(); }

    private void error(Token t, String msg) {
        errores.add(String.format("L%d:C%d: %s", t.getLine(), t.getCharPositionInLine(), msg));
    }
    private void aviso(Token t, String msg) {
        avisos.add(String.format("L%d:C%d: %s", t.getLine(), t.getCharPositionInLine(), msg));
    }

    /* Programa / Bloques */
    @Override public Tipo visitPrograma(RemiLangParser.ProgramaContext ctx) {
        for (var s : ctx.sentencia()) visit(s);
        return null;
    }
    @Override public Tipo visitBloque(RemiLangParser.BloqueContext ctx) {
        abrirAmbito();
        for (var s : ctx.sentencia()) visit(s);
        cerrarAmbito();
        return null;
    }

    /* Sentencias */
    @Override public Tipo visitImprimir(RemiLangParser.ImprimirContext ctx) {
        visit(ctx.expr());
        return null;
    }

    @Override public Tipo visitAsignacion(RemiLangParser.AsignacionContext ctx) {
        String nombre = ctx.IDENTIFICADOR().getText();
        Tipo rhs = visit(ctx.expr());
        Simbolo s = ambito().resolver(nombre);
        if (s == null) {
            ambito().declarar(nombre, rhs);
            aviso(ctx.getStart(), "Variable '" + nombre + "' no declarada; se infiere tipo " + rhs);
        } else {
            if (!compatiblesAsignacion(s.tipo, rhs)) {
                error(ctx.getStart(), "Asignación incompatible: '" + nombre + "' es " + s.tipo + " y RHS es " + rhs);
            }
        }
        return null;
    }

    @Override public Tipo visitDeclaracion(RemiLangParser.DeclaracionContext ctx) {
        Tipo t = tipoDesdeDeclaracion(ctx);
        String nombre = ctx.IDENTIFICADOR().getText();
        boolean ok = ambito().declarar(nombre, t);
        if (!ok) error(ctx.getStart(), "Redeclaración de variable '" + nombre + "'");
        if (ctx.expr() != null) {
            Tipo rhs = visit(ctx.expr());
            if (!compatiblesAsignacion(t, rhs)) {
                error(ctx.getStart(), "Inicialización incompatible: '" + nombre + "' es " + t + " y RHS es " + rhs);
            }
        }
        return null;
    }

    @Override public Tipo visitCondicional(RemiLangParser.CondicionalContext ctx) {
        Tipo cond = visit(ctx.expr());
        if (cond != Tipo.BOOLEANO) error(ctx.getStart(), "La condición del 'SI' debe ser booleana; es " + cond);
        visit(ctx.bloque(0));
        if (ctx.bloque().size() > 1) visit(ctx.bloque(1));
        return null;
    }

    @Override public Tipo visitBucle_mientras(RemiLangParser.Bucle_mientrasContext ctx) {
        Tipo cond = visit(ctx.expr());
        if (cond != Tipo.BOOLEANO) error(ctx.getStart(), "La condición de 'MIENTRAS' debe ser booleana; es " + cond);
        visit(ctx.bloque());
        return null;
    }

    /* Expresiones (precedencia) */
    @Override public Tipo visitExpr_o(RemiLangParser.Expr_oContext ctx) {
        Tipo t = visit(ctx.expr_y(0));
        for (int i = 1; i < ctx.expr_y().size(); i++) {
            Tipo r = visit(ctx.expr_y(i));
            if (t != Tipo.BOOLEANO || r != Tipo.BOOLEANO) {
                error(ctx.getStart(), "Operador '||' requiere booleanos (" + t + " || " + r + ")");
            }
            t = Tipo.BOOLEANO;
        }
        return t;
    }
    @Override public Tipo visitExpr_y(RemiLangParser.Expr_yContext ctx) {
        Tipo t = visit(ctx.expr_igualdad(0));
        for (int i = 1; i < ctx.expr_igualdad().size(); i++) {
            Tipo r = visit(ctx.expr_igualdad(i));
            if (t != Tipo.BOOLEANO || r != Tipo.BOOLEANO) {
                error(ctx.getStart(), "Operador '&&' requiere booleanos (" + t + " && " + r + ")");
            }
            t = Tipo.BOOLEANO;
        }
        return t;
    }
    @Override public Tipo visitExpr_igualdad(RemiLangParser.Expr_igualdadContext ctx) {
        Tipo t = visit(ctx.expr_comparacion(0));
        for (int i = 1; i < ctx.expr_comparacion().size(); i++) {
            Tipo r = visit(ctx.expr_comparacion(i));
            if (t == Tipo.ERROR || r == Tipo.ERROR) { t = Tipo.ERROR; continue; }
            if (t != r) error(ctx.getStart(), "==/!= entre tipos distintos (" + t + " y " + r + ")");
            t = Tipo.BOOLEANO;
        }
        return t;
    }
    @Override public Tipo visitExpr_comparacion(RemiLangParser.Expr_comparacionContext ctx) {
        Tipo t = visit(ctx.expr_suma(0));
        for (int i = 1; i < ctx.expr_suma().size(); i++) {
            Tipo r = visit(ctx.expr_suma(i));
            if (t != Tipo.ENTERO || r != Tipo.ENTERO)
                error(ctx.getStart(), ">,<,>=,<= requieren enteros (" + t + " ? " + r + ")");
            t = Tipo.BOOLEANO;
        }
        return t;
    }
    @Override public Tipo visitExpr_suma(RemiLangParser.Expr_sumaContext ctx) {
        Tipo t = visit(ctx.expr_mult(0));
        for (int i = 1; i < ctx.expr_mult().size(); i++) {
            Tipo r = visit(ctx.expr_mult(i));
            if (t == Tipo.ENTERO && r == Tipo.ENTERO) t = Tipo.ENTERO;
            else if (t == Tipo.CADENA && r == Tipo.CADENA) t = Tipo.CADENA; // concatenación de cadenas
            else { error(ctx.getStart(), "+/- incompatibles (" + t + " y " + r + ")"); t = Tipo.ERROR; }
        }
        return t;
    }
    @Override public Tipo visitExpr_mult(RemiLangParser.Expr_multContext ctx) {
        Tipo t = visit(ctx.expr_unaria(0));
        for (int i = 1; i < ctx.expr_unaria().size(); i++) {
            Tipo r = visit(ctx.expr_unaria(i));
            if (t != Tipo.ENTERO || r != Tipo.ENTERO) { error(ctx.getStart(), "*,/,% requieren enteros"); t = Tipo.ERROR; }
            else t = Tipo.ENTERO;
        }
        return t;
    }
    @Override public Tipo visitExpr_unaria(RemiLangParser.Expr_unariaContext ctx) {
        if (ctx.expr_unaria() != null) {
            Tipo sub = visit(ctx.expr_unaria());
            if (ctx.NO() != null) {
                if (sub != Tipo.BOOLEANO) error(ctx.getStart(), "'!' requiere booleano; es " + sub);
                return Tipo.BOOLEANO;
            } else {
                if (sub != Tipo.ENTERO) error(ctx.getStart(), "unario +/- requiere entero; es " + sub);
                return Tipo.ENTERO;
            }
        }
        return visit(ctx.expr_primaria());
    }

    @Override public Tipo visitExpr_primaria(RemiLangParser.Expr_primariaContext ctx) {
        if (ctx.ENTERO() != null) return Tipo.ENTERO;
        if (ctx.CADENA_LITERAL() != null) return Tipo.CADENA;
        if (ctx.BOOLEANO_VERDADERO() != null || ctx.BOOLEANO_FALSO() != null) return Tipo.BOOLEANO;

        if (ctx.IDENTIFICADOR() != null) {
            String nombre = ctx.IDENTIFICADOR().getText();
            Simbolo s = ambito().resolver(nombre);
            if (s == null) { error(ctx.getStart(), "Variable no declarada: '" + nombre + "'"); return Tipo.ERROR; }
            return s.tipo;
        }

        if (ctx.acceso_arreglo() != null) return visit(ctx.acceso_arreglo());
        if (ctx.arreglo() != null) return visit(ctx.arreglo());
        if (ctx.PARENTESIS_IZQUIERDO() != null) return visit(ctx.expr());

        return Tipo.DESCONOCIDO;
    }

    @Override public Tipo visitAcceso_arreglo(RemiLangParser.Acceso_arregloContext ctx) {
        String nombre = ctx.IDENTIFICADOR().getText();
        Simbolo s = ambito().resolver(nombre);
        if (s == null || !s.tipo.esArreglo()) {
            error(ctx.getStart(), "Acceso de índice sobre no-arreglo: '" + nombre + "'");
            return Tipo.ERROR;
        }
        Tipo idx = visit(ctx.expr());
        if (idx != Tipo.ENTERO) error(ctx.getStart(), "Índice debe ser ENTERO; es " + idx);
        return Tipo.elementoDe(s.tipo);
    }

    @Override public Tipo visitArreglo(RemiLangParser.ArregloContext ctx) {
        if (ctx.expr().isEmpty()) return Tipo.ARREGLO_DESCONOCIDO;
        Tipo primero = visit(ctx.expr(0));
        for (int i = 1; i < ctx.expr().size(); i++) {
            Tipo t = visit(ctx.expr(i));
            if (t != primero) {
                error(ctx.getStart(), "Arreglo heterogéneo: " + primero + " y " + t);
                return Tipo.ARREGLO_DESCONOCIDO;
            }
        }
        return Tipo.arregloDe(primero);
    }

    /* Utilidades */
    private boolean compatiblesAsignacion(Tipo l, Tipo r) {
        if (l == r) return true;
        if (l.esArreglo() && r.esArreglo())
            return l == r || l == Tipo.ARREGLO_DESCONOCIDO || r == Tipo.ARREGLO_DESCONOCIDO;
        return false;
    }

    private Tipo tipoDesdeDeclaracion(RemiLangParser.DeclaracionContext ctx) {
        if (ctx.ENTERO_TIPO() != null)   return Tipo.ENTERO;
        if (ctx.CADENA_TIPO() != null)   return Tipo.CADENA;
        if (ctx.BOOLEANO_TIPO() != null) return Tipo.BOOLEANO;
        if (ctx.ARREGLO_TIPO() != null)  return Tipo.ARREGLO_DESCONOCIDO;
        return Tipo.DESCONOCIDO;
    }

    public void reportarSalida() throws IOException {
        Path out = Paths.get("target/semantics_report.txt");
        Files.createDirectories(out.getParent());
        StringBuilder sb = new StringBuilder();
        if (errores.isEmpty()) sb.append("✅ Sin errores semánticos.\n");
        else {
            sb.append("❌ Errores semánticos:\n");
            for (String e : errores) sb.append(" - ").append(e).append('\n');
        }
        if (!avisos.isEmpty()) {
            sb.append("\n⚠️ Avisos:\n");
            for (String a : avisos) sb.append(" - ").append(a).append('\n');
        }
        Files.write(out, sb.toString().getBytes());
        System.out.println(sb.toString());
        System.out.println(">> Reporte guardado en: " + out.toAbsolutePath());
    }
}