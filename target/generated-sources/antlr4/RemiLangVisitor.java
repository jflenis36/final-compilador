// Generated from RemiLang.g4 by ANTLR 4.13.1
package com.remilang;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RemiLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RemiLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RemiLangParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(RemiLangParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link RemiLangParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(RemiLangParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link RemiLangParser#imprimir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimir(RemiLangParser.ImprimirContext ctx);
	/**
	 * Visit a parse tree produced by {@link RemiLangParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(RemiLangParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RemiLangParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(RemiLangParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RemiLangParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(RemiLangParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link RemiLangParser#bucle_mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucle_mientras(RemiLangParser.Bucle_mientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link RemiLangParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(RemiLangParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link RemiLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(RemiLangParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link RemiLangParser#expr_o}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_o(RemiLangParser.Expr_oContext ctx);
	/**
	 * Visit a parse tree produced by {@link RemiLangParser#expr_y}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_y(RemiLangParser.Expr_yContext ctx);
	/**
	 * Visit a parse tree produced by {@link RemiLangParser#expr_igualdad}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_igualdad(RemiLangParser.Expr_igualdadContext ctx);
	/**
	 * Visit a parse tree produced by {@link RemiLangParser#expr_comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_comparacion(RemiLangParser.Expr_comparacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RemiLangParser#expr_suma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_suma(RemiLangParser.Expr_sumaContext ctx);
	/**
	 * Visit a parse tree produced by {@link RemiLangParser#expr_mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_mult(RemiLangParser.Expr_multContext ctx);
	/**
	 * Visit a parse tree produced by {@link RemiLangParser#expr_unaria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_unaria(RemiLangParser.Expr_unariaContext ctx);
	/**
	 * Visit a parse tree produced by {@link RemiLangParser#expr_primaria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_primaria(RemiLangParser.Expr_primariaContext ctx);
	/**
	 * Visit a parse tree produced by {@link RemiLangParser#arreglo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArreglo(RemiLangParser.ArregloContext ctx);
	/**
	 * Visit a parse tree produced by {@link RemiLangParser#acceso_arreglo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcceso_arreglo(RemiLangParser.Acceso_arregloContext ctx);
}