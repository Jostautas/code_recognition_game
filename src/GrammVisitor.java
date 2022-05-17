// Generated from /home/jostautas/Documents/studijos/2s/OP/laborai/lab4/src/Gramm.g4 by ANTLR 4.10.1
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
	 * Visit a parse tree produced by {@link GrammParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(GrammParser.WhileContext ctx);
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
}