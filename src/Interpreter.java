import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interpreter extends JFrame{
    private JPanel InterpP;
    private JTextArea textArea;
    private JButton EnterB;

    public Interpreter(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(InterpP);
        this.pack();


        EnterB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = textArea.getText();

                Listener listener = new Listener();
                GrammLexer lexer = new GrammLexer(new ANTLRInputStream(input));
                GrammParser parser = new GrammParser(new CommonTokenStream(lexer));
                ParseTreeWalker walker = new ParseTreeWalker();
                ParseTree tree = parser.prog();
                walker.walk(listener, tree);
            }
        });
    }
}
