import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.beans.Expression;
import java.io.*;


public class Listener extends GrammBaseListener{
    public static int n;
    public static int newVal;
    public static int newValElse;


    @Override
    public void enterFor(GrammParser.ForContext ctx) {
        super.enterFor(ctx);

        n = Integer.parseInt(ctx.INT().get(0).getText());
        newVal = Integer.parseInt(ctx.INT().get(1).getText());

        MainClass.funcNr = 1;
    }

    @Override
    public void enterWhile(GrammParser.WhileContext ctx) {
        super.enterWhile(ctx);
        newVal = Integer.parseInt(ctx.INT().getText());
        MainClass.funcNr = 2;
    }

    @Override
    public void enterIfLess(GrammParser.IfLessContext ctx) {
        super.enterIfLess(ctx);

        n = Integer.parseInt(ctx.INT().get(0).getText()); // x less than n
        newVal = Integer.parseInt(ctx.INT().get(1).getText());

        MainClass.funcNr = 3;
    }

    @Override
    public void enterIfMore(GrammParser.IfMoreContext ctx) {
        super.enterIfMore(ctx);

        n = Integer.parseInt(ctx.INT().get(0).getText()); // x less than n
        newVal = Integer.parseInt(ctx.INT().get(1).getText());

        MainClass.funcNr = 4;
    }

    @Override
    public void enterIfLessElse(GrammParser.IfLessElseContext ctx) {
        super.enterIfLessElse(ctx);

        n = Integer.parseInt(ctx.INT().get(0).getText()); // x less than n
        newVal = Integer.parseInt(ctx.INT().get(1).getText());
        newValElse = Integer.parseInt(ctx.INT().get(2).getText());

        MainClass.funcNr = 5;

    }

    @Override
    public void enterIfMoreElse(GrammParser.IfMoreElseContext ctx) {
        super.enterIfMoreElse(ctx);

        n = Integer.parseInt(ctx.INT().get(0).getText()); // x less than n
        newVal = Integer.parseInt(ctx.INT().get(1).getText());
        newValElse = Integer.parseInt(ctx.INT().get(2).getText());

        MainClass.funcNr = 6;

    }
}
