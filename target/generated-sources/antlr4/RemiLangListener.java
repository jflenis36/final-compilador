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
	 * Enter a parse tree produced by {@link RemiLangParser#expresion_cadena}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_cadena(RemiLangParser.Expresion_cadenaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RemiLangParser#expresion_cadena}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_cadena(RemiLangParser.Expresion_cadenaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RemiLangParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(RemiLangParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link RemiLangParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(RemiLangParser.LiteralContext ctx);
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
}