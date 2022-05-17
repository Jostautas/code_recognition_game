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
    public void enterWhileTrue(GrammParser.WhileTrueContext ctx) {
        super.enterWhileTrue(ctx);
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

    @Override
    public void enterWhileLess(GrammParser.WhileLessContext ctx) {
        super.enterWhileLess(ctx);

        n = Integer.parseInt(ctx.INT().get(0).getText());   // x less than n
        newVal = Integer.parseInt(ctx.INT().get(1).getText());

        MainClass.funcNr = 7;
    }

    @Override
    public void enterWhileMore(GrammParser.WhileMoreContext ctx) {
        super.enterWhileMore(ctx);

        n = Integer.parseInt(ctx.INT().get(0).getText());   // x less than n
        newVal = Integer.parseInt(ctx.INT().get(1).getText());

        MainClass.funcNr = 8;
    }

    @Override
    public void enterDoWhileLess(GrammParser.DoWhileLessContext ctx) {
        super.enterDoWhileLess(ctx);

        newVal = Integer.parseInt(ctx.INT().get(0).getText());
        n = Integer.parseInt(ctx.INT().get(1).getText());

        MainClass.funcNr = 9;
    }

    @Override
    public void enterDoWhileMore(GrammParser.DoWhileMoreContext ctx) {
        super.enterDoWhileMore(ctx);

        newVal = Integer.parseInt(ctx.INT().get(0).getText());
        n = Integer.parseInt(ctx.INT().get(1).getText());

        MainClass.funcNr = 10;
    }

    @Override
    public void enterStay(GrammParser.StayContext ctx) {
        super.enterStay(ctx);
        MainClass.funcNr = 11;
    }

    @Override
    public void enterGoLeft(GrammParser.GoLeftContext ctx) {
        super.enterGoLeft(ctx);
        newVal = -2;
        MainClass.funcNr = 2; // loop while(true)
    }

    @Override
    public void enterGoRight(GrammParser.GoRightContext ctx) {
        super.enterGoRight(ctx);
        newVal = 2;
        MainClass.funcNr = 2; // loop while(true)
    }

    @Override
    public void enterGoLeftFast(GrammParser.GoLeftFastContext ctx) {
        super.enterGoLeftFast(ctx);
        newVal = -20;
        MainClass.funcNr = 2; // loop while(true)
    }

    @Override
    public void enterGoRightFast(GrammParser.GoRightFastContext ctx) {
        super.enterGoRightFast(ctx);
        newVal = 20;
        MainClass.funcNr = 2; // loop while(true)
    }

    @Override
    public void enterReverse(GrammParser.ReverseContext ctx) {
        super.enterReverse(ctx);

        MainClass.funcNr = 12;
    }

    @Override
    public void enterGoLeftX(GrammParser.GoLeftXContext ctx) {
        super.enterGoLeftX(ctx);
        newVal = Integer.parseInt(ctx.INT().getText());
        MainClass.funcNr = 13;
    }

    @Override
    public void enterGoRightX(GrammParser.GoRightXContext ctx) {
        super.enterGoRightX(ctx);
        newVal = Integer.parseInt(ctx.INT().getText());
        MainClass.funcNr = 14;
    }
}
