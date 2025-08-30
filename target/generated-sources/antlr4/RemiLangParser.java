// Generated from RemiLang.g4 by ANTLR 4.13.1
package com.remilang;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class RemiLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ENTERO_TIPO=1, CADENA_TIPO=2, BOOLEANO_TIPO=3, ARREGLO_TIPO=4, SI=5, SINO=6, 
		FIN=7, MIENTRAS=8, IMPRIMIR=9, BOOLEANO_VERDADERO=10, BOOLEANO_FALSO=11, 
		ENTERO=12, CADENA_LITERAL=13, IDENTIFICADOR=14, SUMAR=15, RESTAR=16, MULTIPLICAR=17, 
		DIVIDIR=18, MODULO=19, MAYOR_O_IGUAL_QUE=20, MENOR_O_IGUAL_QUE=21, IGUAL_QUE=22, 
		DIFERENTE_QUE=23, MAYOR_QUE=24, MENOR_QUE=25, Y=26, O=27, NO=28, ASIGNAR=29, 
		SUMAR_ASIGNAR=30, RESTAR_ASIGNAR=31, MULTIPLICAR_ASIGNAR=32, DIVIDIR_ASIGNAR=33, 
		MODULO_ASIGNAR=34, PARENTESIS_IZQUIERDO=35, PARENTESIS_DERECHO=36, LLAVE_IZQUIERDA=37, 
		LLAVE_DERECHA=38, CORCHETE_IZQUIERDO=39, CORCHETE_DERECHO=40, COMA=41, 
		PUNTO_Y_COMA=42, COMENTARIO_LINEA=43, COMENTARIO_BLOQUE=44, WS=45;
	public static final int
		RULE_programa = 0, RULE_sentencia = 1, RULE_imprimir = 2, RULE_declaracion = 3, 
		RULE_asignacion = 4, RULE_condicional = 5, RULE_bucle_mientras = 6, RULE_bloque = 7, 
		RULE_expr = 8, RULE_expr_o = 9, RULE_expr_y = 10, RULE_expr_igualdad = 11, 
		RULE_expr_comparacion = 12, RULE_expr_suma = 13, RULE_expr_mult = 14, 
		RULE_expr_unaria = 15, RULE_expr_primaria = 16, RULE_arreglo = 17, RULE_acceso_arreglo = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "sentencia", "imprimir", "declaracion", "asignacion", "condicional", 
			"bucle_mientras", "bloque", "expr", "expr_o", "expr_y", "expr_igualdad", 
			"expr_comparacion", "expr_suma", "expr_mult", "expr_unaria", "expr_primaria", 
			"arreglo", "acceso_arreglo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ENTERO'", "'CADENA'", "'BOOLEANO'", "'ARREGLO'", "'SI'", "'SINO'", 
			"'FIN'", "'MIENTRAS'", "'IMPRIMIR'", null, null, null, null, null, "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'>='", "'<='", "'=='", "'!='", "'>'", "'<'", 
			"'&&'", "'||'", "'!'", "'='", "'+='", "'-='", "'*='", "'/='", "'%='", 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ENTERO_TIPO", "CADENA_TIPO", "BOOLEANO_TIPO", "ARREGLO_TIPO", 
			"SI", "SINO", "FIN", "MIENTRAS", "IMPRIMIR", "BOOLEANO_VERDADERO", "BOOLEANO_FALSO", 
			"ENTERO", "CADENA_LITERAL", "IDENTIFICADOR", "SUMAR", "RESTAR", "MULTIPLICAR", 
			"DIVIDIR", "MODULO", "MAYOR_O_IGUAL_QUE", "MENOR_O_IGUAL_QUE", "IGUAL_QUE", 
			"DIFERENTE_QUE", "MAYOR_QUE", "MENOR_QUE", "Y", "O", "NO", "ASIGNAR", 
			"SUMAR_ASIGNAR", "RESTAR_ASIGNAR", "MULTIPLICAR_ASIGNAR", "DIVIDIR_ASIGNAR", 
			"MODULO_ASIGNAR", "PARENTESIS_IZQUIERDO", "PARENTESIS_DERECHO", "LLAVE_IZQUIERDA", 
			"LLAVE_DERECHA", "CORCHETE_IZQUIERDO", "CORCHETE_DERECHO", "COMA", "PUNTO_Y_COMA", 
			"COMENTARIO_LINEA", "COMENTARIO_BLOQUE", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "RemiLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RemiLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(RemiLangParser.EOF, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RemiLangListener ) ((RemiLangListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RemiLangListener ) ((RemiLangListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RemiLangVisitor ) return ((RemiLangVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17214L) != 0)) {
				{
				{
				setState(38);
				sentencia();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaContext extends ParserRuleContext {
		public ImprimirContext imprimir() {
			return getRuleContext(ImprimirContext.class,0);
		}
		public TerminalNode PUNTO_Y_COMA() { return getToken(RemiLangParser.PUNTO_Y_COMA, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public Bucle_mientrasContext bucle_mientras() {
			return getRuleContext(Bucle_mientrasContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RemiLangListener ) ((RemiLangListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RemiLangListener ) ((RemiLangListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RemiLangVisitor ) return ((RemiLangVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentencia);
		int _la;
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPRIMIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				imprimir();
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTO_Y_COMA) {
					{
					setState(47);
					match(PUNTO_Y_COMA);
					}
				}

				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				asignacion();
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTO_Y_COMA) {
					{
					setState(51);
					match(PUNTO_Y_COMA);
					}
				}

				}
				break;
			case ENTERO_TIPO:
			case CADENA_TIPO:
			case BOOLEANO_TIPO:
			case ARREGLO_TIPO:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				declaracion();
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTO_Y_COMA) {
					{
					setState(55);
					match(PUNTO_Y_COMA);
					}
				}

				}
				break;
			case SI:
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				condicional();
				}
				break;
			case MIENTRAS:
				enterOuterAlt(_localctx, 5);
				{
				setState(59);
				bucle_mientras();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImprimirContext extends ParserRuleContext {
		public TerminalNode IMPRIMIR() { return getToken(RemiLangParser.IMPRIMIR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RemiLangListener ) ((RemiLangListener)listener).enterImprimir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RemiLangListener ) ((RemiLangListener)listener).exitImprimir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RemiLangVisitor ) return ((RemiLangVisitor<? extends T>)visitor).visitImprimir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimirContext imprimir() throws RecognitionException {
		ImprimirContext _localctx = new ImprimirContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_imprimir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(IMPRIMIR);
			setState(63);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(RemiLangParser.IDENTIFICADOR, 0); }
		public TerminalNode ENTERO_TIPO() { return getToken(RemiLangParser.ENTERO_TIPO, 0); }
		public TerminalNode CADENA_TIPO() { return getToken(RemiLangParser.CADENA_TIPO, 0); }
		public TerminalNode BOOLEANO_TIPO() { return getToken(RemiLangParser.BOOLEANO_TIPO, 0); }
		public TerminalNode ARREGLO_TIPO() { return getToken(RemiLangParser.ARREGLO_TIPO, 0); }
		public TerminalNode ASIGNAR() { return getToken(RemiLangParser.ASIGNAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RemiLangListener ) ((RemiLangListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RemiLangListener ) ((RemiLangListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RemiLangVisitor ) return ((RemiLangVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(66);
			match(IDENTIFICADOR);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASIGNAR) {
				{
				setState(67);
				match(ASIGNAR);
				setState(68);
				expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(RemiLangParser.IDENTIFICADOR, 0); }
		public TerminalNode ASIGNAR() { return getToken(RemiLangParser.ASIGNAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SUMAR_ASIGNAR() { return getToken(RemiLangParser.SUMAR_ASIGNAR, 0); }
		public TerminalNode RESTAR_ASIGNAR() { return getToken(RemiLangParser.RESTAR_ASIGNAR, 0); }
		public TerminalNode MULTIPLICAR_ASIGNAR() { return getToken(RemiLangParser.MULTIPLICAR_ASIGNAR, 0); }
		public TerminalNode DIVIDIR_ASIGNAR() { return getToken(RemiLangParser.DIVIDIR_ASIGNAR, 0); }
		public TerminalNode MODULO_ASIGNAR() { return getToken(RemiLangParser.MODULO_ASIGNAR, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RemiLangListener ) ((RemiLangListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RemiLangListener ) ((RemiLangListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RemiLangVisitor ) return ((RemiLangVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_asignacion);
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(IDENTIFICADOR);
				setState(72);
				match(ASIGNAR);
				setState(73);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(IDENTIFICADOR);
				setState(75);
				match(SUMAR_ASIGNAR);
				setState(76);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				match(IDENTIFICADOR);
				setState(78);
				match(RESTAR_ASIGNAR);
				setState(79);
				expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				match(IDENTIFICADOR);
				setState(81);
				match(MULTIPLICAR_ASIGNAR);
				setState(82);
				expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(83);
				match(IDENTIFICADOR);
				setState(84);
				match(DIVIDIR_ASIGNAR);
				setState(85);
				expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(86);
				match(IDENTIFICADOR);
				setState(87);
				match(MODULO_ASIGNAR);
				setState(88);
				expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(RemiLangParser.SI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public TerminalNode FIN() { return getToken(RemiLangParser.FIN, 0); }
		public TerminalNode SINO() { return getToken(RemiLangParser.SINO, 0); }
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RemiLangListener ) ((RemiLangListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RemiLangListener ) ((RemiLangListener)listener).exitCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RemiLangVisitor ) return ((RemiLangVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(SI);
			setState(92);
			expr();
			setState(93);
			bloque();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINO) {
				{
				setState(94);
				match(SINO);
				setState(95);
				bloque();
				}
			}

			setState(98);
			match(FIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bucle_mientrasContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(RemiLangParser.MIENTRAS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode FIN() { return getToken(RemiLangParser.FIN, 0); }
		public Bucle_mientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucle_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RemiLangListener ) ((RemiLangListener)listener).enterBucle_mientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RemiLangListener ) ((RemiLangListener)listener).exitBucle_mientras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RemiLangVisitor ) return ((RemiLangVisitor<? extends T>)visitor).visitBucle_mientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bucle_mientrasContext bucle_mientras() throws RecognitionException {
		Bucle_mientrasContext _localctx = new Bucle_mientrasContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bucle_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(MIENTRAS);
			setState(101);
			expr();
			setState(102);
			bloque();
			setState(103);
			match(FIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BloqueContext extends ParserRuleContext {
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RemiLangListener ) ((RemiLangListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RemiLangListener ) ((RemiLangListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RemiLangVisitor ) return ((RemiLangVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17214L) != 0)) {
				{
				{
				setState(105);
				sentencia();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public Expr_oContext expr_o() {
			return getRuleContext(Expr_oContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RemiLangListener ) ((RemiLangListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RemiLangListener ) ((RemiLangListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RemiLangVisitor ) return ((RemiLangVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			expr_o();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_oContext extends ParserRuleContext {
		public List<Expr_yContext> expr_y() {
			return getRuleContexts(Expr_yContext.class);
		}
		public Expr_yContext expr_y(int i) {
			return getRuleContext(Expr_yContext.class,i);
		}
		public List<TerminalNode> O() { return getTokens(RemiLangParser.O); }
		public TerminalNode O(int i) {
			return getToken(RemiLangParser.O, i);
		}
		public Expr_oContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_o; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RemiLangListener ) ((RemiLangListener)listener).enterExpr_o(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RemiLangListener ) ((RemiLangListener)listener).exitExpr_o(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RemiLangVisitor ) return ((RemiLangVisitor<? extends T>)visitor).visitExpr_o(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_oContext expr_o() throws RecognitionException {
		Expr_oContext _localctx = new Expr_oContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr_o);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			expr_y();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==O) {
				{
				{
				setState(114);
				match(O);
				setState(115);
				expr_y();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_yContext extends ParserRuleContext {
		public List<Expr_igualdadContext> expr_igualdad() {
			return getRuleContexts(Expr_igualdadContext.class);
		}
		public Expr_igualdadContext expr_igualdad(int i) {
			return getRuleContext(Expr_igualdadContext.class,i);
		}
		public List<TerminalNode> Y() { return getTokens(RemiLangParser.Y); }
		public TerminalNode Y(int i) {
			return getToken(RemiLangParser.Y, i);
		}
		public Expr_yContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_y; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RemiLangListener ) ((RemiLangListener)listener).enterExpr_y(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RemiLangListener ) ((RemiLangListener)listener).exitExpr_y(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RemiLangVisitor ) return ((RemiLangVisitor<? extends T>)visitor).visitExpr_y(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_yContext expr_y() throws RecognitionException {
		Expr_yContext _localctx = new Expr_yContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr_y);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			expr_igualdad();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Y) {
				{
				{
				setState(122);
				match(Y);
				setState(123);
				expr_igualdad();
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_igualdadContext extends ParserRuleContext {
		public List<Expr_comparacionContext> expr_comparacion() {
			return getRuleContexts(Expr_comparacionContext.class);
		}
		public Expr_comparacionContext expr_comparacion(int i) {
			return getRuleContext(Expr_comparacionContext.class,i);
		}
		public List<TerminalNode> IGUAL_QUE() { return getTokens(RemiLangParser.IGUAL_QUE); }
		public TerminalNode IGUAL_QUE(int i) {
			return getToken(RemiLangParser.IGUAL_QUE, i);
		}
		public List<TerminalNode> DIFERENTE_QUE() { return getTokens(RemiLangParser.DIFERENTE_QUE); }
		public TerminalNode DIFERENTE_QUE(int i) {
			return getToken(RemiLangParser.DIFERENTE_QUE, i);
		}
		public Expr_igualdadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_igualdad; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RemiLangListener ) ((RemiLangListener)listener).enterExpr_igualdad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RemiLangListener ) ((RemiLangListener)listener).exitExpr_igualdad(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RemiLangVisitor ) return ((RemiLangVisitor<? extends T>)visitor).visitExpr_igualdad(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_igualdadContext expr_igualdad() throws RecognitionException {
		Expr_igualdadContext _localctx = new Expr_igualdadContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr_igualdad);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			expr_comparacion();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IGUAL_QUE || _la==DIFERENTE_QUE) {
				{
				{
				setState(130);
				_la = _input.LA(1);
				if ( !(_la==IGUAL_QUE || _la==DIFERENTE_QUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(131);
				expr_comparacion();
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_comparacionContext extends ParserRuleContext {
		public List<Expr_sumaContext> expr_suma() {
			return getRuleContexts(Expr_sumaContext.class);
		}
		public Expr_sumaContext expr_suma(int i) {
			return getRuleContext(Expr_sumaContext.class,i);
		}
		public List<TerminalNode> MAYOR_QUE() { return getTokens(RemiLangParser.MAYOR_QUE); }
		public TerminalNode MAYOR_QUE(int i) {
			return getToken(RemiLangParser.MAYOR_QUE, i);
		}
		public List<TerminalNode> MENOR_QUE() { return getTokens(RemiLangParser.MENOR_QUE); }
		public TerminalNode MENOR_QUE(int i) {
			return getToken(RemiLangParser.MENOR_QUE, i);
		}
		public List<TerminalNode> MAYOR_O_IGUAL_QUE() { return getTokens(RemiLangParser.MAYOR_O_IGUAL_QUE); }
		public TerminalNode MAYOR_O_IGUAL_QUE(int i) {
			return getToken(RemiLangParser.MAYOR_O_IGUAL_QUE, i);
		}
		public List<TerminalNode> MENOR_O_IGUAL_QUE() { return getTokens(RemiLangParser.MENOR_O_IGUAL_QUE); }
		public TerminalNode MENOR_O_IGUAL_QUE(int i) {
			return getToken(RemiLangParser.MENOR_O_IGUAL_QUE, i);
		}
		public Expr_comparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_comparacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RemiLangListener ) ((RemiLangListener)listener).enterExpr_comparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RemiLangListener ) ((RemiLangListener)listener).exitExpr_comparacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RemiLangVisitor ) return ((RemiLangVisitor<? extends T>)visitor).visitExpr_comparacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_comparacionContext expr_comparacion() throws RecognitionException {
		Expr_comparacionContext _localctx = new Expr_comparacionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expr_comparacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			expr_suma();
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 53477376L) != 0)) {
				{
				{
				setState(138);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 53477376L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(139);
				expr_suma();
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_sumaContext extends ParserRuleContext {
		public List<Expr_multContext> expr_mult() {
			return getRuleContexts(Expr_multContext.class);
		}
		public Expr_multContext expr_mult(int i) {
			return getRuleContext(Expr_multContext.class,i);
		}
		public List<TerminalNode> SUMAR() { return getTokens(RemiLangParser.SUMAR); }
		public TerminalNode SUMAR(int i) {
			return getToken(RemiLangParser.SUMAR, i);
		}
		public List<TerminalNode> RESTAR() { return getTokens(RemiLangParser.RESTAR); }
		public TerminalNode RESTAR(int i) {
			return getToken(RemiLangParser.RESTAR, i);
		}
		public Expr_sumaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_suma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RemiLangListener ) ((RemiLangListener)listener).enterExpr_suma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RemiLangListener ) ((RemiLangListener)listener).exitExpr_suma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RemiLangVisitor ) return ((RemiLangVisitor<? extends T>)visitor).visitExpr_suma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_sumaContext expr_suma() throws RecognitionException {
		Expr_sumaContext _localctx = new Expr_sumaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr_suma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			expr_mult();
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUMAR || _la==RESTAR) {
				{
				{
				setState(146);
				_la = _input.LA(1);
				if ( !(_la==SUMAR || _la==RESTAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(147);
				expr_mult();
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_multContext extends ParserRuleContext {
		public List<Expr_unariaContext> expr_unaria() {
			return getRuleContexts(Expr_unariaContext.class);
		}
		public Expr_unariaContext expr_unaria(int i) {
			return getRuleContext(Expr_unariaContext.class,i);
		}
		public List<TerminalNode> MULTIPLICAR() { return getTokens(RemiLangParser.MULTIPLICAR); }
		public TerminalNode MULTIPLICAR(int i) {
			return getToken(RemiLangParser.MULTIPLICAR, i);
		}
		public List<TerminalNode> DIVIDIR() { return getTokens(RemiLangParser.DIVIDIR); }
		public TerminalNode DIVIDIR(int i) {
			return getToken(RemiLangParser.DIVIDIR, i);
		}
		public List<TerminalNode> MODULO() { return getTokens(RemiLangParser.MODULO); }
		public TerminalNode MODULO(int i) {
			return getToken(RemiLangParser.MODULO, i);
		}
		public Expr_multContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RemiLangListener ) ((RemiLangListener)listener).enterExpr_mult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RemiLangListener ) ((RemiLangListener)listener).exitExpr_mult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RemiLangVisitor ) return ((RemiLangVisitor<? extends T>)visitor).visitExpr_mult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_multContext expr_mult() throws RecognitionException {
		Expr_multContext _localctx = new Expr_multContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expr_mult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			expr_unaria();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 917504L) != 0)) {
				{
				{
				setState(154);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 917504L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(155);
				expr_unaria();
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_unariaContext extends ParserRuleContext {
		public Expr_unariaContext expr_unaria() {
			return getRuleContext(Expr_unariaContext.class,0);
		}
		public TerminalNode NO() { return getToken(RemiLangParser.NO, 0); }
		public TerminalNode RESTAR() { return getToken(RemiLangParser.RESTAR, 0); }
		public TerminalNode SUMAR() { return getToken(RemiLangParser.SUMAR, 0); }
		public Expr_primariaContext expr_primaria() {
			return getRuleContext(Expr_primariaContext.class,0);
		}
		public Expr_unariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_unaria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RemiLangListener ) ((RemiLangListener)listener).enterExpr_unaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RemiLangListener ) ((RemiLangListener)listener).exitExpr_unaria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RemiLangVisitor ) return ((RemiLangVisitor<? extends T>)visitor).visitExpr_unaria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_unariaContext expr_unaria() throws RecognitionException {
		Expr_unariaContext _localctx = new Expr_unariaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expr_unaria);
		int _la;
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUMAR:
			case RESTAR:
			case NO:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 268533760L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(162);
				expr_unaria();
				}
				break;
			case BOOLEANO_VERDADERO:
			case BOOLEANO_FALSO:
			case ENTERO:
			case CADENA_LITERAL:
			case IDENTIFICADOR:
			case PARENTESIS_IZQUIERDO:
			case CORCHETE_IZQUIERDO:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				expr_primaria();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_primariaContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(RemiLangParser.ENTERO, 0); }
		public TerminalNode CADENA_LITERAL() { return getToken(RemiLangParser.CADENA_LITERAL, 0); }
		public TerminalNode BOOLEANO_VERDADERO() { return getToken(RemiLangParser.BOOLEANO_VERDADERO, 0); }
		public TerminalNode BOOLEANO_FALSO() { return getToken(RemiLangParser.BOOLEANO_FALSO, 0); }
		public ArregloContext arreglo() {
			return getRuleContext(ArregloContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(RemiLangParser.IDENTIFICADOR, 0); }
		public Acceso_arregloContext acceso_arreglo() {
			return getRuleContext(Acceso_arregloContext.class,0);
		}
		public TerminalNode PARENTESIS_IZQUIERDO() { return getToken(RemiLangParser.PARENTESIS_IZQUIERDO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARENTESIS_DERECHO() { return getToken(RemiLangParser.PARENTESIS_DERECHO, 0); }
		public Expr_primariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_primaria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RemiLangListener ) ((RemiLangListener)listener).enterExpr_primaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RemiLangListener ) ((RemiLangListener)listener).exitExpr_primaria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RemiLangVisitor ) return ((RemiLangVisitor<? extends T>)visitor).visitExpr_primaria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_primariaContext expr_primaria() throws RecognitionException {
		Expr_primariaContext _localctx = new Expr_primariaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expr_primaria);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(ENTERO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(CADENA_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				match(BOOLEANO_VERDADERO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				match(BOOLEANO_FALSO);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(170);
				arreglo();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(171);
				match(IDENTIFICADOR);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(172);
				acceso_arreglo();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(173);
				match(PARENTESIS_IZQUIERDO);
				setState(174);
				expr();
				setState(175);
				match(PARENTESIS_DERECHO);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArregloContext extends ParserRuleContext {
		public TerminalNode CORCHETE_IZQUIERDO() { return getToken(RemiLangParser.CORCHETE_IZQUIERDO, 0); }
		public TerminalNode CORCHETE_DERECHO() { return getToken(RemiLangParser.CORCHETE_DERECHO, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(RemiLangParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(RemiLangParser.COMA, i);
		}
		public ArregloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arreglo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RemiLangListener ) ((RemiLangListener)listener).enterArreglo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RemiLangListener ) ((RemiLangListener)listener).exitArreglo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RemiLangVisitor ) return ((RemiLangVisitor<? extends T>)visitor).visitArreglo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArregloContext arreglo() throws RecognitionException {
		ArregloContext _localctx = new ArregloContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arreglo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(CORCHETE_IZQUIERDO);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 584384117760L) != 0)) {
				{
				setState(180);
				expr();
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(181);
					match(COMA);
					setState(182);
					expr();
					}
					}
					setState(187);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(190);
			match(CORCHETE_DERECHO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Acceso_arregloContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(RemiLangParser.IDENTIFICADOR, 0); }
		public TerminalNode CORCHETE_IZQUIERDO() { return getToken(RemiLangParser.CORCHETE_IZQUIERDO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CORCHETE_DERECHO() { return getToken(RemiLangParser.CORCHETE_DERECHO, 0); }
		public Acceso_arregloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acceso_arreglo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RemiLangListener ) ((RemiLangListener)listener).enterAcceso_arreglo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RemiLangListener ) ((RemiLangListener)listener).exitAcceso_arreglo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RemiLangVisitor ) return ((RemiLangVisitor<? extends T>)visitor).visitAcceso_arreglo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Acceso_arregloContext acceso_arreglo() throws RecognitionException {
		Acceso_arregloContext _localctx = new Acceso_arregloContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_acceso_arreglo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(IDENTIFICADOR);
			setState(193);
			match(CORCHETE_IZQUIERDO);
			setState(194);
			expr();
			setState(195);
			match(CORCHETE_DERECHO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001-\u00c6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0005\u0000(\b\u0000\n\u0000\f\u0000+\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u00011\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u00015\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"9\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001=\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003F\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004Z\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005a\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0005\u0007k\b\u0007\n\u0007\f\u0007n\t\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0005\tu\b\t\n\t\f\tx\t\t\u0001\n\u0001\n\u0001\n\u0005"+
		"\n}\b\n\n\n\f\n\u0080\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u0085\b\u000b\n\u000b\f\u000b\u0088\t\u000b\u0001\f\u0001\f\u0001\f\u0005"+
		"\f\u008d\b\f\n\f\f\f\u0090\t\f\u0001\r\u0001\r\u0001\r\u0005\r\u0095\b"+
		"\r\n\r\f\r\u0098\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u009d"+
		"\b\u000e\n\u000e\f\u000e\u00a0\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u00a5\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u00b2\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u00b8\b\u0011\n\u0011\f\u0011\u00bb\t\u0011\u0003"+
		"\u0011\u00bd\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0000\u0000\u0013\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$\u0000\u0006\u0001\u0000\u0001\u0004\u0001\u0000\u0016\u0017\u0002"+
		"\u0000\u0014\u0015\u0018\u0019\u0001\u0000\u000f\u0010\u0001\u0000\u0011"+
		"\u0013\u0002\u0000\u000f\u0010\u001c\u001c\u00d2\u0000)\u0001\u0000\u0000"+
		"\u0000\u0002<\u0001\u0000\u0000\u0000\u0004>\u0001\u0000\u0000\u0000\u0006"+
		"A\u0001\u0000\u0000\u0000\bY\u0001\u0000\u0000\u0000\n[\u0001\u0000\u0000"+
		"\u0000\fd\u0001\u0000\u0000\u0000\u000el\u0001\u0000\u0000\u0000\u0010"+
		"o\u0001\u0000\u0000\u0000\u0012q\u0001\u0000\u0000\u0000\u0014y\u0001"+
		"\u0000\u0000\u0000\u0016\u0081\u0001\u0000\u0000\u0000\u0018\u0089\u0001"+
		"\u0000\u0000\u0000\u001a\u0091\u0001\u0000\u0000\u0000\u001c\u0099\u0001"+
		"\u0000\u0000\u0000\u001e\u00a4\u0001\u0000\u0000\u0000 \u00b1\u0001\u0000"+
		"\u0000\u0000\"\u00b3\u0001\u0000\u0000\u0000$\u00c0\u0001\u0000\u0000"+
		"\u0000&(\u0003\u0002\u0001\u0000\'&\u0001\u0000\u0000\u0000(+\u0001\u0000"+
		"\u0000\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*,\u0001"+
		"\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000,-\u0005\u0000\u0000\u0001"+
		"-\u0001\u0001\u0000\u0000\u0000.0\u0003\u0004\u0002\u0000/1\u0005*\u0000"+
		"\u00000/\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u00001=\u0001\u0000"+
		"\u0000\u000024\u0003\b\u0004\u000035\u0005*\u0000\u000043\u0001\u0000"+
		"\u0000\u000045\u0001\u0000\u0000\u00005=\u0001\u0000\u0000\u000068\u0003"+
		"\u0006\u0003\u000079\u0005*\u0000\u000087\u0001\u0000\u0000\u000089\u0001"+
		"\u0000\u0000\u00009=\u0001\u0000\u0000\u0000:=\u0003\n\u0005\u0000;=\u0003"+
		"\f\u0006\u0000<.\u0001\u0000\u0000\u0000<2\u0001\u0000\u0000\u0000<6\u0001"+
		"\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<;\u0001\u0000\u0000\u0000"+
		"=\u0003\u0001\u0000\u0000\u0000>?\u0005\t\u0000\u0000?@\u0003\u0010\b"+
		"\u0000@\u0005\u0001\u0000\u0000\u0000AB\u0007\u0000\u0000\u0000BE\u0005"+
		"\u000e\u0000\u0000CD\u0005\u001d\u0000\u0000DF\u0003\u0010\b\u0000EC\u0001"+
		"\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000F\u0007\u0001\u0000\u0000"+
		"\u0000GH\u0005\u000e\u0000\u0000HI\u0005\u001d\u0000\u0000IZ\u0003\u0010"+
		"\b\u0000JK\u0005\u000e\u0000\u0000KL\u0005\u001e\u0000\u0000LZ\u0003\u0010"+
		"\b\u0000MN\u0005\u000e\u0000\u0000NO\u0005\u001f\u0000\u0000OZ\u0003\u0010"+
		"\b\u0000PQ\u0005\u000e\u0000\u0000QR\u0005 \u0000\u0000RZ\u0003\u0010"+
		"\b\u0000ST\u0005\u000e\u0000\u0000TU\u0005!\u0000\u0000UZ\u0003\u0010"+
		"\b\u0000VW\u0005\u000e\u0000\u0000WX\u0005\"\u0000\u0000XZ\u0003\u0010"+
		"\b\u0000YG\u0001\u0000\u0000\u0000YJ\u0001\u0000\u0000\u0000YM\u0001\u0000"+
		"\u0000\u0000YP\u0001\u0000\u0000\u0000YS\u0001\u0000\u0000\u0000YV\u0001"+
		"\u0000\u0000\u0000Z\t\u0001\u0000\u0000\u0000[\\\u0005\u0005\u0000\u0000"+
		"\\]\u0003\u0010\b\u0000]`\u0003\u000e\u0007\u0000^_\u0005\u0006\u0000"+
		"\u0000_a\u0003\u000e\u0007\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000"+
		"\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0005\u0007\u0000\u0000c\u000b"+
		"\u0001\u0000\u0000\u0000de\u0005\b\u0000\u0000ef\u0003\u0010\b\u0000f"+
		"g\u0003\u000e\u0007\u0000gh\u0005\u0007\u0000\u0000h\r\u0001\u0000\u0000"+
		"\u0000ik\u0003\u0002\u0001\u0000ji\u0001\u0000\u0000\u0000kn\u0001\u0000"+
		"\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000m\u000f"+
		"\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000op\u0003\u0012\t\u0000"+
		"p\u0011\u0001\u0000\u0000\u0000qv\u0003\u0014\n\u0000rs\u0005\u001b\u0000"+
		"\u0000su\u0003\u0014\n\u0000tr\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000"+
		"\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000w\u0013\u0001"+
		"\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000y~\u0003\u0016\u000b\u0000"+
		"z{\u0005\u001a\u0000\u0000{}\u0003\u0016\u000b\u0000|z\u0001\u0000\u0000"+
		"\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f"+
		"\u0001\u0000\u0000\u0000\u007f\u0015\u0001\u0000\u0000\u0000\u0080~\u0001"+
		"\u0000\u0000\u0000\u0081\u0086\u0003\u0018\f\u0000\u0082\u0083\u0007\u0001"+
		"\u0000\u0000\u0083\u0085\u0003\u0018\f\u0000\u0084\u0082\u0001\u0000\u0000"+
		"\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0017\u0001\u0000\u0000"+
		"\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u008e\u0003\u001a\r\u0000"+
		"\u008a\u008b\u0007\u0002\u0000\u0000\u008b\u008d\u0003\u001a\r\u0000\u008c"+
		"\u008a\u0001\u0000\u0000\u0000\u008d\u0090\u0001\u0000\u0000\u0000\u008e"+
		"\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f"+
		"\u0019\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091"+
		"\u0096\u0003\u001c\u000e\u0000\u0092\u0093\u0007\u0003\u0000\u0000\u0093"+
		"\u0095\u0003\u001c\u000e\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095"+
		"\u0098\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\u0001\u0000\u0000\u0000\u0097\u001b\u0001\u0000\u0000\u0000\u0098"+
		"\u0096\u0001\u0000\u0000\u0000\u0099\u009e\u0003\u001e\u000f\u0000\u009a"+
		"\u009b\u0007\u0004\u0000\u0000\u009b\u009d\u0003\u001e\u000f\u0000\u009c"+
		"\u009a\u0001\u0000\u0000\u0000\u009d\u00a0\u0001\u0000\u0000\u0000\u009e"+
		"\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f"+
		"\u001d\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0007\u0005\u0000\u0000\u00a2\u00a5\u0003\u001e\u000f\u0000\u00a3"+
		"\u00a5\u0003 \u0010\u0000\u00a4\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a5\u001f\u0001\u0000\u0000\u0000\u00a6\u00b2"+
		"\u0005\f\u0000\u0000\u00a7\u00b2\u0005\r\u0000\u0000\u00a8\u00b2\u0005"+
		"\n\u0000\u0000\u00a9\u00b2\u0005\u000b\u0000\u0000\u00aa\u00b2\u0003\""+
		"\u0011\u0000\u00ab\u00b2\u0005\u000e\u0000\u0000\u00ac\u00b2\u0003$\u0012"+
		"\u0000\u00ad\u00ae\u0005#\u0000\u0000\u00ae\u00af\u0003\u0010\b\u0000"+
		"\u00af\u00b0\u0005$\u0000\u0000\u00b0\u00b2\u0001\u0000\u0000\u0000\u00b1"+
		"\u00a6\u0001\u0000\u0000\u0000\u00b1\u00a7\u0001\u0000\u0000\u0000\u00b1"+
		"\u00a8\u0001\u0000\u0000\u0000\u00b1\u00a9\u0001\u0000\u0000\u0000\u00b1"+
		"\u00aa\u0001\u0000\u0000\u0000\u00b1\u00ab\u0001\u0000\u0000\u0000\u00b1"+
		"\u00ac\u0001\u0000\u0000\u0000\u00b1\u00ad\u0001\u0000\u0000\u0000\u00b2"+
		"!\u0001\u0000\u0000\u0000\u00b3\u00bc\u0005\'\u0000\u0000\u00b4\u00b9"+
		"\u0003\u0010\b\u0000\u00b5\u00b6\u0005)\u0000\u0000\u00b6\u00b8\u0003"+
		"\u0010\b\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8\u00bb\u0001\u0000"+
		"\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bd\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000"+
		"\u0000\u0000\u00bc\u00b4\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00bf\u0005(\u0000"+
		"\u0000\u00bf#\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005\u000e\u0000\u0000"+
		"\u00c1\u00c2\u0005\'\u0000\u0000\u00c2\u00c3\u0003\u0010\b\u0000\u00c3"+
		"\u00c4\u0005(\u0000\u0000\u00c4%\u0001\u0000\u0000\u0000\u0013)048<EY"+
		"`lv~\u0086\u008e\u0096\u009e\u00a4\u00b1\u00b9\u00bc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}