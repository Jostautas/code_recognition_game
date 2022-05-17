import javax.swing.*;

public class Chat extends JFrame{
    private JPanel ChatPanel;

    public Chat(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(ChatPanel);
        this.pack();
    }
}
