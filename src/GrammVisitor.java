// Generated from /home/jostautas/Documents/studijos/2s/OP/laborai/code_recognition_game/src/Gramm.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(GrammParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GrammParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(GrammParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammParser#whileTrue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileTrue(GrammParser.WhileTrueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammParser#whileLess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLess(GrammParser.WhileLessContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammParser#whileMore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileMore(GrammParser.WhileMoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammParser#ifLess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfLess(GrammParser.IfLessContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammParser#ifMore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfMore(GrammParser.IfMoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammParser#ifLessElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfLessElse(GrammParser.IfLessElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammParser#ifMoreElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfMoreElse(GrammParser.IfMoreElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammParser#continue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue(GrammParser.ContinueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammParser#doWhileLess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileLess(GrammParser.DoWhileLessContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammParser#doWhileMore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileMore(GrammParser.DoWhileMoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammParser#stay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStay(GrammParser.StayContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammParser#goLeft}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoLeft(GrammParser.GoLeftContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammParser#goRight}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoRight(GrammParser.GoRightContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammParser#goLeftFast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoLeftFast(GrammParser.GoLeftFastContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammParser#goRightFast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoRightFast(GrammParser.GoRightFastContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammParser#reverse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReverse(GrammParser.ReverseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammParser#goLeftX}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoLeftX(GrammParser.GoLeftXContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammParser#goRightX}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoRightX(GrammParser.GoRightXContext ctx);
}