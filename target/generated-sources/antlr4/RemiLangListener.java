// Generated from RemiLang.g4 by ANTLR 4.13.1
package com.remilang;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RemiLangParser}.
 */
public interface RemiLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RemiLangParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(RemiLangParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RemiLangParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(RemiLangParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RemiLangParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(RemiLangParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RemiLangParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(RemiLangParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RemiLangParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void enterImprimir(RemiLangParser.ImprimirContext ctx);
	/**
	 * Exit a parse tree produced by {@link RemiLangParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void exitImprimir(RemiLangParser.ImprimirContext ctx);
	/**
	 * Enter a parse tree produced by {@link RemiLangParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(RemiLangParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RemiLangParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(RemiLangParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RemiLangParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(RemiLangParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RemiLangParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(RemiLangParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RemiLangParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(RemiLangParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link RemiLangParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(RemiLangParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link RemiLangParser#bucle_mientras}.
	 * @param ctx the parse tree
	 */
	void enterBucle_mientras(RemiLangParser.Bucle_mientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link RemiLangParser#bucle_mientras}.
	 * @param ctx the parse tree
	 */
	void exitBucle_mientras(RemiLangParser.Bucle_mientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link RemiLangParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(RemiLangParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RemiLangParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(RemiLangParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link RemiLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(RemiLangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RemiLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(RemiLangParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RemiLangParser#expr_o}.
	 * @param ctx the parse tree
	 */
	void enterExpr_o(RemiLangParser.Expr_oContext ctx);
	/**
	 * Exit a parse tree produced by {@link RemiLangParser#expr_o}.
	 * @param ctx the parse tree
	 */
	void exitExpr_o(RemiLangParser.Expr_oContext ctx);
	/**
	 * Enter a parse tree produced by {@link RemiLangParser#expr_y}.
	 * @param ctx the parse tree
	 */
	void enterExpr_y(RemiLangParser.Expr_yContext ctx);
	/**
	 * Exit a parse tree produced by {@link RemiLangParser#expr_y}.
	 * @param ctx the parse tree
	 */
	void exitExpr_y(RemiLangParser.Expr_yContext ctx);
	/**
	 * Enter a parse tree produced by {@link RemiLangParser#expr_igualdad}.
	 * @param ctx the parse tree
	 */
	void enterExpr_igualdad(RemiLangParser.Expr_igualdadContext ctx);
	/**
	 * Exit a parse tree produced by {@link RemiLangParser#expr_igualdad}.
	 * @param ctx the parse tree
	 */
	void exitExpr_igualdad(RemiLangParser.Expr_igualdadContext ctx);
	/**
	 * Enter a parse tree produced by {@link RemiLangParser#expr_comparacion}.
	 * @param ctx the parse tree
	 */
	void enterExpr_comparacion(RemiLangParser.Expr_comparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RemiLangParser#expr_comparacion}.
	 * @param ctx the parse tree
	 */
	void exitExpr_comparacion(RemiLangParser.Expr_comparacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RemiLangParser#expr_suma}.
	 * @param ctx the parse tree
	 */
	void enterExpr_suma(RemiLangParser.Expr_sumaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RemiLangParser#expr_suma}.
	 * @param ctx the parse tree
	 */
	void exitExpr_suma(RemiLangParser.Expr_sumaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RemiLangParser#expr_mult}.
	 * @param ctx the parse tree
	 */
	void enterExpr_mult(RemiLangParser.Expr_multContext ctx);
	/**
	 * Exit a parse tree produced by {@link RemiLangParser#expr_mult}.
	 * @param ctx the parse tree
	 */
	void exitExpr_mult(RemiLangParser.Expr_multContext ctx);
	/**
	 * Enter a parse tree produced by {@link RemiLangParser#expr_unaria}.
	 * @param ctx the parse tree
	 */
	void enterExpr_unaria(RemiLangParser.Expr_unariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RemiLangParser#expr_unaria}.
	 * @param ctx the parse tree
	 */
	void exitExpr_unaria(RemiLangParser.Expr_unariaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RemiLangParser#expr_primaria}.
	 * @param ctx the parse tree
	 */
	void enterExpr_primaria(RemiLangParser.Expr_primariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RemiLangParser#expr_primaria}.
	 * @param ctx the parse tree
	 */
	void exitExpr_primaria(RemiLangParser.Expr_primariaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RemiLangParser#arreglo}.
	 * @param ctx the parse tree
	 */
	void enterArreglo(RemiLangParser.ArregloContext ctx);
	/**
	 * Exit a parse tree produced by {@link RemiLangParser#arreglo}.
	 * @param ctx the parse tree
	 */
	void exitArreglo(RemiLangParser.ArregloContext ctx);
	/**
	 * Enter a parse tree produced by {@link RemiLangParser#acceso_arreglo}.
	 * @param ctx the parse tree
	 */
	void enterAcceso_arreglo(RemiLangParser.Acceso_arregloContext ctx);
	/**
	 * Exit a parse tree produced by {@link RemiLangParser#acceso_arreglo}.
	 * @param ctx the parse tree
	 */
	void exitAcceso_arreglo(RemiLangParser.Acceso_arregloContext ctx);
}