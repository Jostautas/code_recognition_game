// Generated from /home/jostautas/Documents/studijos/2s/OP/laborai/code_recognition_game/src/Gramm.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammParser}.
 */
public interface GrammListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(GrammParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(GrammParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GrammParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GrammParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(GrammParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(GrammParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammParser#whileTrue}.
	 * @param ctx the parse tree
	 */
	void enterWhileTrue(GrammParser.WhileTrueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammParser#whileTrue}.
	 * @param ctx the parse tree
	 */
	void exitWhileTrue(GrammParser.WhileTrueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammParser#whileLess}.
	 * @param ctx the parse tree
	 */
	void enterWhileLess(GrammParser.WhileLessContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammParser#whileLess}.
	 * @param ctx the parse tree
	 */
	void exitWhileLess(GrammParser.WhileLessContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammParser#whileMore}.
	 * @param ctx the parse tree
	 */
	void enterWhileMore(GrammParser.WhileMoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammParser#whileMore}.
	 * @param ctx the parse tree
	 */
	void exitWhileMore(GrammParser.WhileMoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammParser#ifLess}.
	 * @param ctx the parse tree
	 */
	void enterIfLess(GrammParser.IfLessContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammParser#ifLess}.
	 * @param ctx the parse tree
	 */
	void exitIfLess(GrammParser.IfLessContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammParser#ifMore}.
	 * @param ctx the parse tree
	 */
	void enterIfMore(GrammParser.IfMoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammParser#ifMore}.
	 * @param ctx the parse tree
	 */
	void exitIfMore(GrammParser.IfMoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammParser#ifLessElse}.
	 * @param ctx the parse tree
	 */
	void enterIfLessElse(GrammParser.IfLessElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammParser#ifLessElse}.
	 * @param ctx the parse tree
	 */
	void exitIfLessElse(GrammParser.IfLessElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammParser#ifMoreElse}.
	 * @param ctx the parse tree
	 */
	void enterIfMoreElse(GrammParser.IfMoreElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammParser#ifMoreElse}.
	 * @param ctx the parse tree
	 */
	void exitIfMoreElse(GrammParser.IfMoreElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammParser#continue}.
	 * @param ctx the parse tree
	 */
	void enterContinue(GrammParser.ContinueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammParser#continue}.
	 * @param ctx the parse tree
	 */
	void exitContinue(GrammParser.ContinueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammParser#doWhileLess}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileLess(GrammParser.DoWhileLessContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammParser#doWhileLess}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileLess(GrammParser.DoWhileLessContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammParser#doWhileMore}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileMore(GrammParser.DoWhileMoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammParser#doWhileMore}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileMore(GrammParser.DoWhileMoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammParser#stay}.
	 * @param ctx the parse tree
	 */
	void enterStay(GrammParser.StayContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammParser#stay}.
	 * @param ctx the parse tree
	 */
	void exitStay(GrammParser.StayContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammParser#goLeft}.
	 * @param ctx the parse tree
	 */
	void enterGoLeft(GrammParser.GoLeftContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammParser#goLeft}.
	 * @param ctx the parse tree
	 */
	void exitGoLeft(GrammParser.GoLeftContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammParser#goRight}.
	 * @param ctx the parse tree
	 */
	void enterGoRight(GrammParser.GoRightContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammParser#goRight}.
	 * @param ctx the parse tree
	 */
	void exitGoRight(GrammParser.GoRightContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammParser#goLeftFast}.
	 * @param ctx the parse tree
	 */
	void enterGoLeftFast(GrammParser.GoLeftFastContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammParser#goLeftFast}.
	 * @param ctx the parse tree
	 */
	void exitGoLeftFast(GrammParser.GoLeftFastContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammParser#goRightFast}.
	 * @param ctx the parse tree
	 */
	void enterGoRightFast(GrammParser.GoRightFastContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammParser#goRightFast}.
	 * @param ctx the parse tree
	 */
	void exitGoRightFast(GrammParser.GoRightFastContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammParser#reverse}.
	 * @param ctx the parse tree
	 */
	void enterReverse(GrammParser.ReverseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammParser#reverse}.
	 * @param ctx the parse tree
	 */
	void exitReverse(GrammParser.ReverseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammParser#goLeftX}.
	 * @param ctx the parse tree
	 */
	void enterGoLeftX(GrammParser.GoLeftXContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammParser#goLeftX}.
	 * @param ctx the parse tree
	 */
	void exitGoLeftX(GrammParser.GoLeftXContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammParser#goRightX}.
	 * @param ctx the parse tree
	 */
	void enterGoRightX(GrammParser.GoRightXContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammParser#goRightX}.
	 * @param ctx the parse tree
	 */
	void exitGoRightX(GrammParser.GoRightXContext ctx);
}