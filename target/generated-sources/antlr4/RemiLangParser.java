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
		RULE_programa = 0, RULE_sentencia = 1, RULE_imprimir = 2, RULE_asignacion = 3, 
		RULE_condicional = 4, RULE_bucle_mientras = 5, RULE_bloque = 6, RULE_expr = 7, 
		RULE_expresion_cadena = 8, RULE_literal = 9, RULE_arreglo = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "sentencia", "imprimir", "asignacion", "condicional", "bucle_mientras", 
			"bloque", "expr", "expresion_cadena", "literal", "arreglo"
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
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17184L) != 0)) {
				{
				{
				setState(22);
				sentencia();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28);
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
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentencia);
		int _la;
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPRIMIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				imprimir();
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTO_Y_COMA) {
					{
					setState(31);
					match(PUNTO_Y_COMA);
					}
				}

				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				asignacion();
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTO_Y_COMA) {
					{
					setState(35);
					match(PUNTO_Y_COMA);
					}
				}

				}
				break;
			case SI:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				condicional();
				}
				break;
			case MIENTRAS:
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
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
		public Expresion_cadenaContext expresion_cadena() {
			return getRuleContext(Expresion_cadenaContext.class,0);
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
	}

	public final ImprimirContext imprimir() throws RecognitionException {
		ImprimirContext _localctx = new ImprimirContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_imprimir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(IMPRIMIR);
			setState(43);
			expresion_cadena();
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
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(IDENTIFICADOR);
			setState(46);
			match(ASIGNAR);
			setState(47);
			expr(0);
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
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(SI);
			setState(50);
			expr(0);
			setState(51);
			bloque();
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINO) {
				{
				setState(52);
				match(SINO);
				setState(53);
				bloque();
				}
			}

			setState(56);
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
	}

	public final Bucle_mientrasContext bucle_mientras() throws RecognitionException {
		Bucle_mientrasContext _localctx = new Bucle_mientrasContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bucle_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(MIENTRAS);
			setState(59);
			expr(0);
			setState(60);
			bloque();
			setState(61);
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
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17184L) != 0)) {
				{
				{
				setState(63);
				sentencia();
				}
				}
				setState(68);
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
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(RemiLangParser.IDENTIFICADOR, 0); }
		public TerminalNode PARENTESIS_IZQUIERDO() { return getToken(RemiLangParser.PARENTESIS_IZQUIERDO, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PARENTESIS_DERECHO() { return getToken(RemiLangParser.PARENTESIS_DERECHO, 0); }
		public TerminalNode NO() { return getToken(RemiLangParser.NO, 0); }
		public TerminalNode SUMAR() { return getToken(RemiLangParser.SUMAR, 0); }
		public TerminalNode RESTAR() { return getToken(RemiLangParser.RESTAR, 0); }
		public TerminalNode MULTIPLICAR() { return getToken(RemiLangParser.MULTIPLICAR, 0); }
		public TerminalNode DIVIDIR() { return getToken(RemiLangParser.DIVIDIR, 0); }
		public TerminalNode MODULO() { return getToken(RemiLangParser.MODULO, 0); }
		public TerminalNode MAYOR_QUE() { return getToken(RemiLangParser.MAYOR_QUE, 0); }
		public TerminalNode MENOR_QUE() { return getToken(RemiLangParser.MENOR_QUE, 0); }
		public TerminalNode MAYOR_O_IGUAL_QUE() { return getToken(RemiLangParser.MAYOR_O_IGUAL_QUE, 0); }
		public TerminalNode MENOR_O_IGUAL_QUE() { return getToken(RemiLangParser.MENOR_O_IGUAL_QUE, 0); }
		public TerminalNode IGUAL_QUE() { return getToken(RemiLangParser.IGUAL_QUE, 0); }
		public TerminalNode DIFERENTE_QUE() { return getToken(RemiLangParser.DIFERENTE_QUE, 0); }
		public TerminalNode Y() { return getToken(RemiLangParser.Y, 0); }
		public TerminalNode O() { return getToken(RemiLangParser.O, 0); }
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
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEANO_VERDADERO:
			case BOOLEANO_FALSO:
			case ENTERO:
			case CADENA_LITERAL:
			case CORCHETE_IZQUIERDO:
				{
				setState(70);
				literal();
				}
				break;
			case IDENTIFICADOR:
				{
				setState(71);
				match(IDENTIFICADOR);
				}
				break;
			case PARENTESIS_IZQUIERDO:
				{
				setState(72);
				match(PARENTESIS_IZQUIERDO);
				setState(73);
				expr(0);
				setState(74);
				match(PARENTESIS_DERECHO);
				}
				break;
			case NO:
				{
				setState(76);
				match(NO);
				setState(77);
				expr(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(89);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(80);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(81);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1015808L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(82);
						expr(5);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(83);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(84);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 66060288L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(85);
						expr(4);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(86);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(87);
						_la = _input.LA(1);
						if ( !(_la==Y || _la==O) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(88);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expresion_cadenaContext extends ParserRuleContext {
		public TerminalNode CADENA_LITERAL() { return getToken(RemiLangParser.CADENA_LITERAL, 0); }
		public Expresion_cadenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_cadena; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RemiLangListener ) ((RemiLangListener)listener).enterExpresion_cadena(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RemiLangListener ) ((RemiLangListener)listener).exitExpresion_cadena(this);
		}
	}

	public final Expresion_cadenaContext expresion_cadena() throws RecognitionException {
		Expresion_cadenaContext _localctx = new Expresion_cadenaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expresion_cadena);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(CADENA_LITERAL);
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(RemiLangParser.ENTERO, 0); }
		public TerminalNode BOOLEANO_VERDADERO() { return getToken(RemiLangParser.BOOLEANO_VERDADERO, 0); }
		public TerminalNode BOOLEANO_FALSO() { return getToken(RemiLangParser.BOOLEANO_FALSO, 0); }
		public TerminalNode CADENA_LITERAL() { return getToken(RemiLangParser.CADENA_LITERAL, 0); }
		public ArregloContext arreglo() {
			return getRuleContext(ArregloContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RemiLangListener ) ((RemiLangListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RemiLangListener ) ((RemiLangListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_literal);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(ENTERO);
				}
				break;
			case BOOLEANO_VERDADERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(BOOLEANO_VERDADERO);
				}
				break;
			case BOOLEANO_FALSO:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				match(BOOLEANO_FALSO);
				}
				break;
			case CADENA_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				match(CADENA_LITERAL);
				}
				break;
			case CORCHETE_IZQUIERDO:
				enterOuterAlt(_localctx, 5);
				{
				setState(100);
				arreglo();
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
	}

	public final ArregloContext arreglo() throws RecognitionException {
		ArregloContext _localctx = new ArregloContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arreglo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(CORCHETE_IZQUIERDO);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 584384019456L) != 0)) {
				{
				setState(104);
				expr(0);
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(105);
					match(COMA);
					setState(106);
					expr(0);
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(114);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001-u\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0005\u0000\u0018\b\u0000"+
		"\n\u0000\f\u0000\u001b\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0003\u0001!\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001%\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001)\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u00047\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0005\u0006A\b\u0006\n\u0006\f\u0006D\t\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007O\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007Z\b\u0007\n\u0007\f\u0007]\t\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tf\b\t"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0005\nl\b\n\n\n\f\no\t\n\u0003\nq\b"+
		"\n\u0001\n\u0001\n\u0001\n\u0000\u0001\u000e\u000b\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0000\u0003\u0001\u0000\u000f\u0013\u0001"+
		"\u0000\u0014\u0019\u0001\u0000\u001a\u001b}\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0002(\u0001\u0000\u0000\u0000\u0004*\u0001\u0000\u0000\u0000\u0006"+
		"-\u0001\u0000\u0000\u0000\b1\u0001\u0000\u0000\u0000\n:\u0001\u0000\u0000"+
		"\u0000\fB\u0001\u0000\u0000\u0000\u000eN\u0001\u0000\u0000\u0000\u0010"+
		"^\u0001\u0000\u0000\u0000\u0012e\u0001\u0000\u0000\u0000\u0014g\u0001"+
		"\u0000\u0000\u0000\u0016\u0018\u0003\u0002\u0001\u0000\u0017\u0016\u0001"+
		"\u0000\u0000\u0000\u0018\u001b\u0001\u0000\u0000\u0000\u0019\u0017\u0001"+
		"\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u001c\u0001"+
		"\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001c\u001d\u0005"+
		"\u0000\u0000\u0001\u001d\u0001\u0001\u0000\u0000\u0000\u001e \u0003\u0004"+
		"\u0002\u0000\u001f!\u0005*\u0000\u0000 \u001f\u0001\u0000\u0000\u0000"+
		" !\u0001\u0000\u0000\u0000!)\u0001\u0000\u0000\u0000\"$\u0003\u0006\u0003"+
		"\u0000#%\u0005*\u0000\u0000$#\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000"+
		"\u0000%)\u0001\u0000\u0000\u0000&)\u0003\b\u0004\u0000\')\u0003\n\u0005"+
		"\u0000(\u001e\u0001\u0000\u0000\u0000(\"\u0001\u0000\u0000\u0000(&\u0001"+
		"\u0000\u0000\u0000(\'\u0001\u0000\u0000\u0000)\u0003\u0001\u0000\u0000"+
		"\u0000*+\u0005\t\u0000\u0000+,\u0003\u0010\b\u0000,\u0005\u0001\u0000"+
		"\u0000\u0000-.\u0005\u000e\u0000\u0000./\u0005\u001d\u0000\u0000/0\u0003"+
		"\u000e\u0007\u00000\u0007\u0001\u0000\u0000\u000012\u0005\u0005\u0000"+
		"\u000023\u0003\u000e\u0007\u000036\u0003\f\u0006\u000045\u0005\u0006\u0000"+
		"\u000057\u0003\f\u0006\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000"+
		"\u000078\u0001\u0000\u0000\u000089\u0005\u0007\u0000\u00009\t\u0001\u0000"+
		"\u0000\u0000:;\u0005\b\u0000\u0000;<\u0003\u000e\u0007\u0000<=\u0003\f"+
		"\u0006\u0000=>\u0005\u0007\u0000\u0000>\u000b\u0001\u0000\u0000\u0000"+
		"?A\u0003\u0002\u0001\u0000@?\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000"+
		"\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000C\r\u0001\u0000"+
		"\u0000\u0000DB\u0001\u0000\u0000\u0000EF\u0006\u0007\uffff\uffff\u0000"+
		"FO\u0003\u0012\t\u0000GO\u0005\u000e\u0000\u0000HI\u0005#\u0000\u0000"+
		"IJ\u0003\u000e\u0007\u0000JK\u0005$\u0000\u0000KO\u0001\u0000\u0000\u0000"+
		"LM\u0005\u001c\u0000\u0000MO\u0003\u000e\u0007\u0001NE\u0001\u0000\u0000"+
		"\u0000NG\u0001\u0000\u0000\u0000NH\u0001\u0000\u0000\u0000NL\u0001\u0000"+
		"\u0000\u0000O[\u0001\u0000\u0000\u0000PQ\n\u0004\u0000\u0000QR\u0007\u0000"+
		"\u0000\u0000RZ\u0003\u000e\u0007\u0005ST\n\u0003\u0000\u0000TU\u0007\u0001"+
		"\u0000\u0000UZ\u0003\u000e\u0007\u0004VW\n\u0002\u0000\u0000WX\u0007\u0002"+
		"\u0000\u0000XZ\u0003\u000e\u0007\u0003YP\u0001\u0000\u0000\u0000YS\u0001"+
		"\u0000\u0000\u0000YV\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000"+
		"[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\\u000f\u0001\u0000"+
		"\u0000\u0000][\u0001\u0000\u0000\u0000^_\u0005\r\u0000\u0000_\u0011\u0001"+
		"\u0000\u0000\u0000`f\u0005\f\u0000\u0000af\u0005\n\u0000\u0000bf\u0005"+
		"\u000b\u0000\u0000cf\u0005\r\u0000\u0000df\u0003\u0014\n\u0000e`\u0001"+
		"\u0000\u0000\u0000ea\u0001\u0000\u0000\u0000eb\u0001\u0000\u0000\u0000"+
		"ec\u0001\u0000\u0000\u0000ed\u0001\u0000\u0000\u0000f\u0013\u0001\u0000"+
		"\u0000\u0000gp\u0005\'\u0000\u0000hm\u0003\u000e\u0007\u0000ij\u0005)"+
		"\u0000\u0000jl\u0003\u000e\u0007\u0000ki\u0001\u0000\u0000\u0000lo\u0001"+
		"\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000"+
		"nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000ph\u0001\u0000\u0000"+
		"\u0000pq\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0005(\u0000"+
		"\u0000s\u0015\u0001\u0000\u0000\u0000\f\u0019 $(6BNY[emp";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}