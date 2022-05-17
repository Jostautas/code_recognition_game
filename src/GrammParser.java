// Generated from /home/jostautas/Documents/studijos/2s/OP/laborai/lab4/src/Gramm.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, WS=17, 
		INT=18;
	public static final int
		RULE_prog = 0, RULE_statement = 1, RULE_for = 2, RULE_while = 3, RULE_ifLess = 4, 
		RULE_ifMore = 5, RULE_ifLessElse = 6, RULE_ifMoreElse = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "statement", "for", "while", "ifLess", "ifMore", "ifLessElse", 
			"ifMoreElse"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'for(int i'", "'='", "'0;'", "'i'", "'<'", "';'", "'i++)'", "'{'", 
			"'x'", "'}'", "'while('", "'true'", "')'", "'if('", "'>'", "'else{'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "WS", "INT"
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
	public String getGrammarFileName() { return "Gramm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GrammParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammListener ) ((GrammListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammListener ) ((GrammListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammVisitor ) return ((GrammVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				statement();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__10) | (1L << T__13))) != 0) );
			setState(21);
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

	public static class StatementContext extends ParserRuleContext {
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public IfLessContext ifLess() {
			return getRuleContext(IfLessContext.class,0);
		}
		public IfMoreContext ifMore() {
			return getRuleContext(IfMoreContext.class,0);
		}
		public IfLessElseContext ifLessElse() {
			return getRuleContext(IfLessElseContext.class,0);
		}
		public IfMoreElseContext ifMoreElse() {
			return getRuleContext(IfMoreElseContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammListener ) ((GrammListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammListener ) ((GrammListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammVisitor ) return ((GrammVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(29);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				for_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				while_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
				ifLess();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(26);
				ifMore();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(27);
				ifLessElse();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(28);
				ifMoreElse();
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

	public static class ForContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GrammParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GrammParser.INT, i);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammListener ) ((GrammListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammListener ) ((GrammListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammVisitor ) return ((GrammVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(T__0);
			setState(32);
			match(T__1);
			setState(33);
			match(T__2);
			setState(34);
			match(T__3);
			setState(35);
			match(T__4);
			setState(36);
			match(INT);
			setState(37);
			match(T__5);
			setState(38);
			match(T__6);
			setState(39);
			match(T__7);
			setState(40);
			match(T__8);
			setState(41);
			match(T__1);
			setState(42);
			match(INT);
			setState(43);
			match(T__5);
			setState(44);
			match(T__9);
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

	public static class WhileContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GrammParser.INT, 0); }
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammListener ) ((GrammListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammListener ) ((GrammListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammVisitor ) return ((GrammVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__10);
			setState(47);
			match(T__11);
			setState(48);
			match(T__12);
			setState(49);
			match(T__7);
			setState(50);
			match(T__8);
			setState(51);
			match(T__1);
			setState(52);
			match(INT);
			setState(53);
			match(T__5);
			setState(54);
			match(T__9);
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

	public static class IfLessContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GrammParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GrammParser.INT, i);
		}
		public IfLessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifLess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammListener ) ((GrammListener)listener).enterIfLess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammListener ) ((GrammListener)listener).exitIfLess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammVisitor ) return ((GrammVisitor<? extends T>)visitor).visitIfLess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfLessContext ifLess() throws RecognitionException {
		IfLessContext _localctx = new IfLessContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifLess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__13);
			setState(57);
			match(T__8);
			setState(58);
			match(T__4);
			setState(59);
			match(INT);
			setState(60);
			match(T__12);
			setState(61);
			match(T__7);
			setState(62);
			match(T__8);
			setState(63);
			match(T__1);
			setState(64);
			match(INT);
			setState(65);
			match(T__5);
			setState(66);
			match(T__9);
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

	public static class IfMoreContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GrammParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GrammParser.INT, i);
		}
		public IfMoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifMore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammListener ) ((GrammListener)listener).enterIfMore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammListener ) ((GrammListener)listener).exitIfMore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammVisitor ) return ((GrammVisitor<? extends T>)visitor).visitIfMore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfMoreContext ifMore() throws RecognitionException {
		IfMoreContext _localctx = new IfMoreContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifMore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__13);
			setState(69);
			match(T__8);
			setState(70);
			match(T__14);
			setState(71);
			match(INT);
			setState(72);
			match(T__12);
			setState(73);
			match(T__7);
			setState(74);
			match(T__8);
			setState(75);
			match(T__1);
			setState(76);
			match(INT);
			setState(77);
			match(T__5);
			setState(78);
			match(T__9);
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

	public static class IfLessElseContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GrammParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GrammParser.INT, i);
		}
		public IfLessElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifLessElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammListener ) ((GrammListener)listener).enterIfLessElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammListener ) ((GrammListener)listener).exitIfLessElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammVisitor ) return ((GrammVisitor<? extends T>)visitor).visitIfLessElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfLessElseContext ifLessElse() throws RecognitionException {
		IfLessElseContext _localctx = new IfLessElseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifLessElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__13);
			setState(81);
			match(T__8);
			setState(82);
			match(T__4);
			setState(83);
			match(INT);
			setState(84);
			match(T__12);
			setState(85);
			match(T__7);
			setState(86);
			match(T__8);
			setState(87);
			match(T__1);
			setState(88);
			match(INT);
			setState(89);
			match(T__5);
			setState(90);
			match(T__9);
			setState(91);
			match(T__15);
			setState(92);
			match(T__8);
			setState(93);
			match(T__1);
			setState(94);
			match(INT);
			setState(95);
			match(T__5);
			setState(96);
			match(T__9);
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

	public static class IfMoreElseContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GrammParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GrammParser.INT, i);
		}
		public IfMoreElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifMoreElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammListener ) ((GrammListener)listener).enterIfMoreElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammListener ) ((GrammListener)listener).exitIfMoreElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammVisitor ) return ((GrammVisitor<? extends T>)visitor).visitIfMoreElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfMoreElseContext ifMoreElse() throws RecognitionException {
		IfMoreElseContext _localctx = new IfMoreElseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifMoreElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__13);
			setState(99);
			match(T__8);
			setState(100);
			match(T__14);
			setState(101);
			match(INT);
			setState(102);
			match(T__12);
			setState(103);
			match(T__7);
			setState(104);
			match(T__8);
			setState(105);
			match(T__1);
			setState(106);
			match(INT);
			setState(107);
			match(T__5);
			setState(108);
			match(T__9);
			setState(109);
			match(T__15);
			setState(110);
			match(T__8);
			setState(111);
			match(T__1);
			setState(112);
			match(INT);
			setState(113);
			match(T__5);
			setState(114);
			match(T__9);
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
		"\u0004\u0001\u0012u\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0004\u0000\u0012\b\u0000\u000b\u0000\f\u0000\u0013\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u001e\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0000\u0000"+
		"\b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0000\u0000r\u0000\u0011\u0001"+
		"\u0000\u0000\u0000\u0002\u001d\u0001\u0000\u0000\u0000\u0004\u001f\u0001"+
		"\u0000\u0000\u0000\u0006.\u0001\u0000\u0000\u0000\b8\u0001\u0000\u0000"+
		"\u0000\nD\u0001\u0000\u0000\u0000\fP\u0001\u0000\u0000\u0000\u000eb\u0001"+
		"\u0000\u0000\u0000\u0010\u0012\u0003\u0002\u0001\u0000\u0011\u0010\u0001"+
		"\u0000\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000\u0013\u0011\u0001"+
		"\u0000\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014\u0015\u0001"+
		"\u0000\u0000\u0000\u0015\u0016\u0005\u0000\u0000\u0001\u0016\u0001\u0001"+
		"\u0000\u0000\u0000\u0017\u001e\u0003\u0004\u0002\u0000\u0018\u001e\u0003"+
		"\u0006\u0003\u0000\u0019\u001e\u0003\b\u0004\u0000\u001a\u001e\u0003\n"+
		"\u0005\u0000\u001b\u001e\u0003\f\u0006\u0000\u001c\u001e\u0003\u000e\u0007"+
		"\u0000\u001d\u0017\u0001\u0000\u0000\u0000\u001d\u0018\u0001\u0000\u0000"+
		"\u0000\u001d\u0019\u0001\u0000\u0000\u0000\u001d\u001a\u0001\u0000\u0000"+
		"\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001c\u0001\u0000\u0000"+
		"\u0000\u001e\u0003\u0001\u0000\u0000\u0000\u001f \u0005\u0001\u0000\u0000"+
		" !\u0005\u0002\u0000\u0000!\"\u0005\u0003\u0000\u0000\"#\u0005\u0004\u0000"+
		"\u0000#$\u0005\u0005\u0000\u0000$%\u0005\u0012\u0000\u0000%&\u0005\u0006"+
		"\u0000\u0000&\'\u0005\u0007\u0000\u0000\'(\u0005\b\u0000\u0000()\u0005"+
		"\t\u0000\u0000)*\u0005\u0002\u0000\u0000*+\u0005\u0012\u0000\u0000+,\u0005"+
		"\u0006\u0000\u0000,-\u0005\n\u0000\u0000-\u0005\u0001\u0000\u0000\u0000"+
		"./\u0005\u000b\u0000\u0000/0\u0005\f\u0000\u000001\u0005\r\u0000\u0000"+
		"12\u0005\b\u0000\u000023\u0005\t\u0000\u000034\u0005\u0002\u0000\u0000"+
		"45\u0005\u0012\u0000\u000056\u0005\u0006\u0000\u000067\u0005\n\u0000\u0000"+
		"7\u0007\u0001\u0000\u0000\u000089\u0005\u000e\u0000\u00009:\u0005\t\u0000"+
		"\u0000:;\u0005\u0005\u0000\u0000;<\u0005\u0012\u0000\u0000<=\u0005\r\u0000"+
		"\u0000=>\u0005\b\u0000\u0000>?\u0005\t\u0000\u0000?@\u0005\u0002\u0000"+
		"\u0000@A\u0005\u0012\u0000\u0000AB\u0005\u0006\u0000\u0000BC\u0005\n\u0000"+
		"\u0000C\t\u0001\u0000\u0000\u0000DE\u0005\u000e\u0000\u0000EF\u0005\t"+
		"\u0000\u0000FG\u0005\u000f\u0000\u0000GH\u0005\u0012\u0000\u0000HI\u0005"+
		"\r\u0000\u0000IJ\u0005\b\u0000\u0000JK\u0005\t\u0000\u0000KL\u0005\u0002"+
		"\u0000\u0000LM\u0005\u0012\u0000\u0000MN\u0005\u0006\u0000\u0000NO\u0005"+
		"\n\u0000\u0000O\u000b\u0001\u0000\u0000\u0000PQ\u0005\u000e\u0000\u0000"+
		"QR\u0005\t\u0000\u0000RS\u0005\u0005\u0000\u0000ST\u0005\u0012\u0000\u0000"+
		"TU\u0005\r\u0000\u0000UV\u0005\b\u0000\u0000VW\u0005\t\u0000\u0000WX\u0005"+
		"\u0002\u0000\u0000XY\u0005\u0012\u0000\u0000YZ\u0005\u0006\u0000\u0000"+
		"Z[\u0005\n\u0000\u0000[\\\u0005\u0010\u0000\u0000\\]\u0005\t\u0000\u0000"+
		"]^\u0005\u0002\u0000\u0000^_\u0005\u0012\u0000\u0000_`\u0005\u0006\u0000"+
		"\u0000`a\u0005\n\u0000\u0000a\r\u0001\u0000\u0000\u0000bc\u0005\u000e"+
		"\u0000\u0000cd\u0005\t\u0000\u0000de\u0005\u000f\u0000\u0000ef\u0005\u0012"+
		"\u0000\u0000fg\u0005\r\u0000\u0000gh\u0005\b\u0000\u0000hi\u0005\t\u0000"+
		"\u0000ij\u0005\u0002\u0000\u0000jk\u0005\u0012\u0000\u0000kl\u0005\u0006"+
		"\u0000\u0000lm\u0005\n\u0000\u0000mn\u0005\u0010\u0000\u0000no\u0005\t"+
		"\u0000\u0000op\u0005\u0002\u0000\u0000pq\u0005\u0012\u0000\u0000qr\u0005"+
		"\u0006\u0000\u0000rs\u0005\n\u0000\u0000s\u000f\u0001\u0000\u0000\u0000"+
		"\u0002\u0013\u001d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}