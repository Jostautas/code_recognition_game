// Generated from /home/jostautas/Documents/studijos/2s/OP/laborai/lab4/src/Gramm.g4 by ANTLR 4.10.1
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
	 * Enter a parse tree produced by {@link GrammParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(GrammParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(GrammParser.WhileContext ctx);
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
}