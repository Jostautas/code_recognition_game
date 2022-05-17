// Generated from /home/jostautas/Documents/studijos/2s/OP/laborai/code_recognition_game/src/Gramm.g4 by ANTLR 4.10.1
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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, WS=28, INT=29, STRING=30;
	public static final int
		RULE_prog = 0, RULE_statement = 1, RULE_for = 2, RULE_whileTrue = 3, RULE_whileLess = 4, 
		RULE_whileMore = 5, RULE_ifLess = 6, RULE_ifMore = 7, RULE_ifLessElse = 8, 
		RULE_ifMoreElse = 9, RULE_continue = 10, RULE_doWhileLess = 11, RULE_doWhileMore = 12, 
		RULE_stay = 13, RULE_goLeft = 14, RULE_goRight = 15, RULE_goLeftFast = 16, 
		RULE_goRightFast = 17, RULE_reverse = 18, RULE_goLeftX = 19, RULE_goRightX = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "statement", "for", "whileTrue", "whileLess", "whileMore", "ifLess", 
			"ifMore", "ifLessElse", "ifMoreElse", "continue", "doWhileLess", "doWhileMore", 
			"stay", "goLeft", "goRight", "goLeftFast", "goRightFast", "reverse", 
			"goLeftX", "goRightX"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'for(int i'", "'='", "'0;'", "'i'", "'<'", "';'", "'i++)'", "'{'", 
			"'x'", "'}'", "'while('", "'true'", "')'", "'>'", "'if('", "'else{'", 
			"'continue;'", "'do{'", "'}while('", "'stay'", "'goLeft'", "'goRight'", 
			"'goLeftFast'", "'goRightFast'", "'reverse'", "'goLeftX'", "'goRightX '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "WS", "INT", "STRING"
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
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				statement();
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__10) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0) );
			setState(47);
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
		public WhileTrueContext whileTrue() {
			return getRuleContext(WhileTrueContext.class,0);
		}
		public WhileLessContext whileLess() {
			return getRuleContext(WhileLessContext.class,0);
		}
		public WhileMoreContext whileMore() {
			return getRuleContext(WhileMoreContext.class,0);
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
		public ContinueContext continue_() {
			return getRuleContext(ContinueContext.class,0);
		}
		public DoWhileLessContext doWhileLess() {
			return getRuleContext(DoWhileLessContext.class,0);
		}
		public DoWhileMoreContext doWhileMore() {
			return getRuleContext(DoWhileMoreContext.class,0);
		}
		public StayContext stay() {
			return getRuleContext(StayContext.class,0);
		}
		public GoLeftContext goLeft() {
			return getRuleContext(GoLeftContext.class,0);
		}
		public GoRightContext goRight() {
			return getRuleContext(GoRightContext.class,0);
		}
		public GoLeftFastContext goLeftFast() {
			return getRuleContext(GoLeftFastContext.class,0);
		}
		public GoRightFastContext goRightFast() {
			return getRuleContext(GoRightFastContext.class,0);
		}
		public ReverseContext reverse() {
			return getRuleContext(ReverseContext.class,0);
		}
		public GoLeftXContext goLeftX() {
			return getRuleContext(GoLeftXContext.class,0);
		}
		public GoRightXContext goRightX() {
			return getRuleContext(GoRightXContext.class,0);
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
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				for_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				whileTrue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				whileLess();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				whileMore();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(53);
				ifLess();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(54);
				ifMore();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(55);
				ifLessElse();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(56);
				ifMoreElse();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(57);
				continue_();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(58);
				doWhileLess();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(59);
				doWhileMore();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(60);
				stay();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(61);
				goLeft();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(62);
				goRight();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(63);
				goLeftFast();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(64);
				goRightFast();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(65);
				reverse();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(66);
				goLeftX();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(67);
				goRightX();
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
			setState(70);
			match(T__0);
			setState(71);
			match(T__1);
			setState(72);
			match(T__2);
			setState(73);
			match(T__3);
			setState(74);
			match(T__4);
			setState(75);
			match(INT);
			setState(76);
			match(T__5);
			setState(77);
			match(T__6);
			setState(78);
			match(T__7);
			setState(79);
			match(T__8);
			setState(80);
			match(T__1);
			setState(81);
			match(INT);
			setState(82);
			match(T__5);
			setState(83);
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

	public static class WhileTrueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GrammParser.INT, 0); }
		public WhileTrueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileTrue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammListener ) ((GrammListener)listener).enterWhileTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammListener ) ((GrammListener)listener).exitWhileTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammVisitor ) return ((GrammVisitor<? extends T>)visitor).visitWhileTrue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileTrueContext whileTrue() throws RecognitionException {
		WhileTrueContext _localctx = new WhileTrueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_whileTrue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__10);
			setState(86);
			match(T__11);
			setState(87);
			match(T__12);
			setState(88);
			match(T__7);
			setState(89);
			match(T__8);
			setState(90);
			match(T__1);
			setState(91);
			match(INT);
			setState(92);
			match(T__5);
			setState(93);
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

	public static class WhileLessContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GrammParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GrammParser.INT, i);
		}
		public WhileLessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammListener ) ((GrammListener)listener).enterWhileLess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammListener ) ((GrammListener)listener).exitWhileLess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammVisitor ) return ((GrammVisitor<? extends T>)visitor).visitWhileLess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLessContext whileLess() throws RecognitionException {
		WhileLessContext _localctx = new WhileLessContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_whileLess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__10);
			setState(96);
			match(T__8);
			setState(97);
			match(T__4);
			setState(98);
			match(INT);
			setState(99);
			match(T__12);
			setState(100);
			match(T__7);
			setState(101);
			match(T__8);
			setState(102);
			match(T__1);
			setState(103);
			match(INT);
			setState(104);
			match(T__5);
			setState(105);
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

	public static class WhileMoreContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GrammParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GrammParser.INT, i);
		}
		public WhileMoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileMore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammListener ) ((GrammListener)listener).enterWhileMore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammListener ) ((GrammListener)listener).exitWhileMore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammVisitor ) return ((GrammVisitor<? extends T>)visitor).visitWhileMore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileMoreContext whileMore() throws RecognitionException {
		WhileMoreContext _localctx = new WhileMoreContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_whileMore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__10);
			setState(108);
			match(T__8);
			setState(109);
			match(T__13);
			setState(110);
			match(INT);
			setState(111);
			match(T__12);
			setState(112);
			match(T__7);
			setState(113);
			match(T__8);
			setState(114);
			match(T__1);
			setState(115);
			match(INT);
			setState(116);
			match(T__5);
			setState(117);
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
		enterRule(_localctx, 12, RULE_ifLess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__14);
			setState(120);
			match(T__8);
			setState(121);
			match(T__4);
			setState(122);
			match(INT);
			setState(123);
			match(T__12);
			setState(124);
			match(T__7);
			setState(125);
			match(T__8);
			setState(126);
			match(T__1);
			setState(127);
			match(INT);
			setState(128);
			match(T__5);
			setState(129);
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
		enterRule(_localctx, 14, RULE_ifMore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__14);
			setState(132);
			match(T__8);
			setState(133);
			match(T__13);
			setState(134);
			match(INT);
			setState(135);
			match(T__12);
			setState(136);
			match(T__7);
			setState(137);
			match(T__8);
			setState(138);
			match(T__1);
			setState(139);
			match(INT);
			setState(140);
			match(T__5);
			setState(141);
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
		enterRule(_localctx, 16, RULE_ifLessElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__14);
			setState(144);
			match(T__8);
			setState(145);
			match(T__4);
			setState(146);
			match(INT);
			setState(147);
			match(T__12);
			setState(148);
			match(T__7);
			setState(149);
			match(T__8);
			setState(150);
			match(T__1);
			setState(151);
			match(INT);
			setState(152);
			match(T__5);
			setState(153);
			match(T__9);
			setState(154);
			match(T__15);
			setState(155);
			match(T__8);
			setState(156);
			match(T__1);
			setState(157);
			match(INT);
			setState(158);
			match(T__5);
			setState(159);
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
		enterRule(_localctx, 18, RULE_ifMoreElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(T__14);
			setState(162);
			match(T__8);
			setState(163);
			match(T__13);
			setState(164);
			match(INT);
			setState(165);
			match(T__12);
			setState(166);
			match(T__7);
			setState(167);
			match(T__8);
			setState(168);
			match(T__1);
			setState(169);
			match(INT);
			setState(170);
			match(T__5);
			setState(171);
			match(T__9);
			setState(172);
			match(T__15);
			setState(173);
			match(T__8);
			setState(174);
			match(T__1);
			setState(175);
			match(INT);
			setState(176);
			match(T__5);
			setState(177);
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

	public static class ContinueContext extends ParserRuleContext {
		public ContinueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammListener ) ((GrammListener)listener).enterContinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammListener ) ((GrammListener)listener).exitContinue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammVisitor ) return ((GrammVisitor<? extends T>)visitor).visitContinue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueContext continue_() throws RecognitionException {
		ContinueContext _localctx = new ContinueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_continue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(T__16);
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

	public static class DoWhileLessContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GrammParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GrammParser.INT, i);
		}
		public DoWhileLessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileLess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammListener ) ((GrammListener)listener).enterDoWhileLess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammListener ) ((GrammListener)listener).exitDoWhileLess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammVisitor ) return ((GrammVisitor<? extends T>)visitor).visitDoWhileLess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileLessContext doWhileLess() throws RecognitionException {
		DoWhileLessContext _localctx = new DoWhileLessContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_doWhileLess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__17);
			setState(182);
			match(T__8);
			setState(183);
			match(T__1);
			setState(184);
			match(INT);
			setState(185);
			match(T__5);
			setState(186);
			match(T__18);
			setState(187);
			match(T__8);
			setState(188);
			match(T__4);
			setState(189);
			match(INT);
			setState(190);
			match(T__12);
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

	public static class DoWhileMoreContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GrammParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GrammParser.INT, i);
		}
		public DoWhileMoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileMore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammListener ) ((GrammListener)listener).enterDoWhileMore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammListener ) ((GrammListener)listener).exitDoWhileMore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammVisitor ) return ((GrammVisitor<? extends T>)visitor).visitDoWhileMore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileMoreContext doWhileMore() throws RecognitionException {
		DoWhileMoreContext _localctx = new DoWhileMoreContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_doWhileMore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(T__17);
			setState(193);
			match(T__8);
			setState(194);
			match(T__1);
			setState(195);
			match(INT);
			setState(196);
			match(T__5);
			setState(197);
			match(T__18);
			setState(198);
			match(T__8);
			setState(199);
			match(T__13);
			setState(200);
			match(INT);
			setState(201);
			match(T__12);
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

	public static class StayContext extends ParserRuleContext {
		public StayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stay; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammListener ) ((GrammListener)listener).enterStay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammListener ) ((GrammListener)listener).exitStay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammVisitor ) return ((GrammVisitor<? extends T>)visitor).visitStay(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StayContext stay() throws RecognitionException {
		StayContext _localctx = new StayContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stay);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(T__19);
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

	public static class GoLeftContext extends ParserRuleContext {
		public GoLeftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goLeft; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammListener ) ((GrammListener)listener).enterGoLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammListener ) ((GrammListener)listener).exitGoLeft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammVisitor ) return ((GrammVisitor<? extends T>)visitor).visitGoLeft(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoLeftContext goLeft() throws RecognitionException {
		GoLeftContext _localctx = new GoLeftContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_goLeft);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__20);
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

	public static class GoRightContext extends ParserRuleContext {
		public GoRightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goRight; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammListener ) ((GrammListener)listener).enterGoRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammListener ) ((GrammListener)listener).exitGoRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammVisitor ) return ((GrammVisitor<? extends T>)visitor).visitGoRight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoRightContext goRight() throws RecognitionException {
		GoRightContext _localctx = new GoRightContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_goRight);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(T__21);
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

	public static class GoLeftFastContext extends ParserRuleContext {
		public GoLeftFastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goLeftFast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammListener ) ((GrammListener)listener).enterGoLeftFast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammListener ) ((GrammListener)listener).exitGoLeftFast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammVisitor ) return ((GrammVisitor<? extends T>)visitor).visitGoLeftFast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoLeftFastContext goLeftFast() throws RecognitionException {
		GoLeftFastContext _localctx = new GoLeftFastContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_goLeftFast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(T__22);
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

	public static class GoRightFastContext extends ParserRuleContext {
		public GoRightFastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goRightFast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammListener ) ((GrammListener)listener).enterGoRightFast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammListener ) ((GrammListener)listener).exitGoRightFast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammVisitor ) return ((GrammVisitor<? extends T>)visitor).visitGoRightFast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoRightFastContext goRightFast() throws RecognitionException {
		GoRightFastContext _localctx = new GoRightFastContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_goRightFast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(T__23);
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

	public static class ReverseContext extends ParserRuleContext {
		public ReverseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reverse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammListener ) ((GrammListener)listener).enterReverse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammListener ) ((GrammListener)listener).exitReverse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammVisitor ) return ((GrammVisitor<? extends T>)visitor).visitReverse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReverseContext reverse() throws RecognitionException {
		ReverseContext _localctx = new ReverseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_reverse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(T__24);
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

	public static class GoLeftXContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GrammParser.INT, 0); }
		public GoLeftXContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goLeftX; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammListener ) ((GrammListener)listener).enterGoLeftX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammListener ) ((GrammListener)listener).exitGoLeftX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammVisitor ) return ((GrammVisitor<? extends T>)visitor).visitGoLeftX(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoLeftXContext goLeftX() throws RecognitionException {
		GoLeftXContext _localctx = new GoLeftXContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_goLeftX);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(T__25);
			setState(216);
			match(INT);
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

	public static class GoRightXContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GrammParser.INT, 0); }
		public GoRightXContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goRightX; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammListener ) ((GrammListener)listener).enterGoRightX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammListener ) ((GrammListener)listener).exitGoRightX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammVisitor ) return ((GrammVisitor<? extends T>)visitor).visitGoRightX(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoRightXContext goRightX() throws RecognitionException {
		GoRightXContext _localctx = new GoRightXContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_goRightX);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(T__26);
			setState(219);
			match(INT);
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
		"\u0004\u0001\u001e\u00de\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0004"+
		"\u0000,\b\u0000\u000b\u0000\f\u0000-\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001E\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0000\u0000\u0015"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(\u0000\u0000\u00db\u0000+\u0001\u0000\u0000\u0000\u0002"+
		"D\u0001\u0000\u0000\u0000\u0004F\u0001\u0000\u0000\u0000\u0006U\u0001"+
		"\u0000\u0000\u0000\b_\u0001\u0000\u0000\u0000\nk\u0001\u0000\u0000\u0000"+
		"\fw\u0001\u0000\u0000\u0000\u000e\u0083\u0001\u0000\u0000\u0000\u0010"+
		"\u008f\u0001\u0000\u0000\u0000\u0012\u00a1\u0001\u0000\u0000\u0000\u0014"+
		"\u00b3\u0001\u0000\u0000\u0000\u0016\u00b5\u0001\u0000\u0000\u0000\u0018"+
		"\u00c0\u0001\u0000\u0000\u0000\u001a\u00cb\u0001\u0000\u0000\u0000\u001c"+
		"\u00cd\u0001\u0000\u0000\u0000\u001e\u00cf\u0001\u0000\u0000\u0000 \u00d1"+
		"\u0001\u0000\u0000\u0000\"\u00d3\u0001\u0000\u0000\u0000$\u00d5\u0001"+
		"\u0000\u0000\u0000&\u00d7\u0001\u0000\u0000\u0000(\u00da\u0001\u0000\u0000"+
		"\u0000*,\u0003\u0002\u0001\u0000+*\u0001\u0000\u0000\u0000,-\u0001\u0000"+
		"\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000./\u0001"+
		"\u0000\u0000\u0000/0\u0005\u0000\u0000\u00010\u0001\u0001\u0000\u0000"+
		"\u00001E\u0003\u0004\u0002\u00002E\u0003\u0006\u0003\u00003E\u0003\b\u0004"+
		"\u00004E\u0003\n\u0005\u00005E\u0003\f\u0006\u00006E\u0003\u000e\u0007"+
		"\u00007E\u0003\u0010\b\u00008E\u0003\u0012\t\u00009E\u0003\u0014\n\u0000"+
		":E\u0003\u0016\u000b\u0000;E\u0003\u0018\f\u0000<E\u0003\u001a\r\u0000"+
		"=E\u0003\u001c\u000e\u0000>E\u0003\u001e\u000f\u0000?E\u0003 \u0010\u0000"+
		"@E\u0003\"\u0011\u0000AE\u0003$\u0012\u0000BE\u0003&\u0013\u0000CE\u0003"+
		"(\u0014\u0000D1\u0001\u0000\u0000\u0000D2\u0001\u0000\u0000\u0000D3\u0001"+
		"\u0000\u0000\u0000D4\u0001\u0000\u0000\u0000D5\u0001\u0000\u0000\u0000"+
		"D6\u0001\u0000\u0000\u0000D7\u0001\u0000\u0000\u0000D8\u0001\u0000\u0000"+
		"\u0000D9\u0001\u0000\u0000\u0000D:\u0001\u0000\u0000\u0000D;\u0001\u0000"+
		"\u0000\u0000D<\u0001\u0000\u0000\u0000D=\u0001\u0000\u0000\u0000D>\u0001"+
		"\u0000\u0000\u0000D?\u0001\u0000\u0000\u0000D@\u0001\u0000\u0000\u0000"+
		"DA\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DC\u0001\u0000\u0000"+
		"\u0000E\u0003\u0001\u0000\u0000\u0000FG\u0005\u0001\u0000\u0000GH\u0005"+
		"\u0002\u0000\u0000HI\u0005\u0003\u0000\u0000IJ\u0005\u0004\u0000\u0000"+
		"JK\u0005\u0005\u0000\u0000KL\u0005\u001d\u0000\u0000LM\u0005\u0006\u0000"+
		"\u0000MN\u0005\u0007\u0000\u0000NO\u0005\b\u0000\u0000OP\u0005\t\u0000"+
		"\u0000PQ\u0005\u0002\u0000\u0000QR\u0005\u001d\u0000\u0000RS\u0005\u0006"+
		"\u0000\u0000ST\u0005\n\u0000\u0000T\u0005\u0001\u0000\u0000\u0000UV\u0005"+
		"\u000b\u0000\u0000VW\u0005\f\u0000\u0000WX\u0005\r\u0000\u0000XY\u0005"+
		"\b\u0000\u0000YZ\u0005\t\u0000\u0000Z[\u0005\u0002\u0000\u0000[\\\u0005"+
		"\u001d\u0000\u0000\\]\u0005\u0006\u0000\u0000]^\u0005\n\u0000\u0000^\u0007"+
		"\u0001\u0000\u0000\u0000_`\u0005\u000b\u0000\u0000`a\u0005\t\u0000\u0000"+
		"ab\u0005\u0005\u0000\u0000bc\u0005\u001d\u0000\u0000cd\u0005\r\u0000\u0000"+
		"de\u0005\b\u0000\u0000ef\u0005\t\u0000\u0000fg\u0005\u0002\u0000\u0000"+
		"gh\u0005\u001d\u0000\u0000hi\u0005\u0006\u0000\u0000ij\u0005\n\u0000\u0000"+
		"j\t\u0001\u0000\u0000\u0000kl\u0005\u000b\u0000\u0000lm\u0005\t\u0000"+
		"\u0000mn\u0005\u000e\u0000\u0000no\u0005\u001d\u0000\u0000op\u0005\r\u0000"+
		"\u0000pq\u0005\b\u0000\u0000qr\u0005\t\u0000\u0000rs\u0005\u0002\u0000"+
		"\u0000st\u0005\u001d\u0000\u0000tu\u0005\u0006\u0000\u0000uv\u0005\n\u0000"+
		"\u0000v\u000b\u0001\u0000\u0000\u0000wx\u0005\u000f\u0000\u0000xy\u0005"+
		"\t\u0000\u0000yz\u0005\u0005\u0000\u0000z{\u0005\u001d\u0000\u0000{|\u0005"+
		"\r\u0000\u0000|}\u0005\b\u0000\u0000}~\u0005\t\u0000\u0000~\u007f\u0005"+
		"\u0002\u0000\u0000\u007f\u0080\u0005\u001d\u0000\u0000\u0080\u0081\u0005"+
		"\u0006\u0000\u0000\u0081\u0082\u0005\n\u0000\u0000\u0082\r\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0005\u000f\u0000\u0000\u0084\u0085\u0005\t\u0000"+
		"\u0000\u0085\u0086\u0005\u000e\u0000\u0000\u0086\u0087\u0005\u001d\u0000"+
		"\u0000\u0087\u0088\u0005\r\u0000\u0000\u0088\u0089\u0005\b\u0000\u0000"+
		"\u0089\u008a\u0005\t\u0000\u0000\u008a\u008b\u0005\u0002\u0000\u0000\u008b"+
		"\u008c\u0005\u001d\u0000\u0000\u008c\u008d\u0005\u0006\u0000\u0000\u008d"+
		"\u008e\u0005\n\u0000\u0000\u008e\u000f\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0005\u000f\u0000\u0000\u0090\u0091\u0005\t\u0000\u0000\u0091\u0092\u0005"+
		"\u0005\u0000\u0000\u0092\u0093\u0005\u001d\u0000\u0000\u0093\u0094\u0005"+
		"\r\u0000\u0000\u0094\u0095\u0005\b\u0000\u0000\u0095\u0096\u0005\t\u0000"+
		"\u0000\u0096\u0097\u0005\u0002\u0000\u0000\u0097\u0098\u0005\u001d\u0000"+
		"\u0000\u0098\u0099\u0005\u0006\u0000\u0000\u0099\u009a\u0005\n\u0000\u0000"+
		"\u009a\u009b\u0005\u0010\u0000\u0000\u009b\u009c\u0005\t\u0000\u0000\u009c"+
		"\u009d\u0005\u0002\u0000\u0000\u009d\u009e\u0005\u001d\u0000\u0000\u009e"+
		"\u009f\u0005\u0006\u0000\u0000\u009f\u00a0\u0005\n\u0000\u0000\u00a0\u0011"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005\u000f\u0000\u0000\u00a2\u00a3"+
		"\u0005\t\u0000\u0000\u00a3\u00a4\u0005\u000e\u0000\u0000\u00a4\u00a5\u0005"+
		"\u001d\u0000\u0000\u00a5\u00a6\u0005\r\u0000\u0000\u00a6\u00a7\u0005\b"+
		"\u0000\u0000\u00a7\u00a8\u0005\t\u0000\u0000\u00a8\u00a9\u0005\u0002\u0000"+
		"\u0000\u00a9\u00aa\u0005\u001d\u0000\u0000\u00aa\u00ab\u0005\u0006\u0000"+
		"\u0000\u00ab\u00ac\u0005\n\u0000\u0000\u00ac\u00ad\u0005\u0010\u0000\u0000"+
		"\u00ad\u00ae\u0005\t\u0000\u0000\u00ae\u00af\u0005\u0002\u0000\u0000\u00af"+
		"\u00b0\u0005\u001d\u0000\u0000\u00b0\u00b1\u0005\u0006\u0000\u0000\u00b1"+
		"\u00b2\u0005\n\u0000\u0000\u00b2\u0013\u0001\u0000\u0000\u0000\u00b3\u00b4"+
		"\u0005\u0011\u0000\u0000\u00b4\u0015\u0001\u0000\u0000\u0000\u00b5\u00b6"+
		"\u0005\u0012\u0000\u0000\u00b6\u00b7\u0005\t\u0000\u0000\u00b7\u00b8\u0005"+
		"\u0002\u0000\u0000\u00b8\u00b9\u0005\u001d\u0000\u0000\u00b9\u00ba\u0005"+
		"\u0006\u0000\u0000\u00ba\u00bb\u0005\u0013\u0000\u0000\u00bb\u00bc\u0005"+
		"\t\u0000\u0000\u00bc\u00bd\u0005\u0005\u0000\u0000\u00bd\u00be\u0005\u001d"+
		"\u0000\u0000\u00be\u00bf\u0005\r\u0000\u0000\u00bf\u0017\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0005\u0012\u0000\u0000\u00c1\u00c2\u0005\t\u0000\u0000"+
		"\u00c2\u00c3\u0005\u0002\u0000\u0000\u00c3\u00c4\u0005\u001d\u0000\u0000"+
		"\u00c4\u00c5\u0005\u0006\u0000\u0000\u00c5\u00c6\u0005\u0013\u0000\u0000"+
		"\u00c6\u00c7\u0005\t\u0000\u0000\u00c7\u00c8\u0005\u000e\u0000\u0000\u00c8"+
		"\u00c9\u0005\u001d\u0000\u0000\u00c9\u00ca\u0005\r\u0000\u0000\u00ca\u0019"+
		"\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005\u0014\u0000\u0000\u00cc\u001b"+
		"\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\u0015\u0000\u0000\u00ce\u001d"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005\u0016\u0000\u0000\u00d0\u001f"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005\u0017\u0000\u0000\u00d2!\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d4\u0005\u0018\u0000\u0000\u00d4#\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d6\u0005\u0019\u0000\u0000\u00d6%\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d8\u0005\u001a\u0000\u0000\u00d8\u00d9\u0005\u001d\u0000"+
		"\u0000\u00d9\'\u0001\u0000\u0000\u0000\u00da\u00db\u0005\u001b\u0000\u0000"+
		"\u00db\u00dc\u0005\u001d\u0000\u0000\u00dc)\u0001\u0000\u0000\u0000\u0002"+
		"-D";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}