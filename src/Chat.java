import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.*;

public class Chat extends JFrame{
    private JPanel chatPanel;
    private JTextArea chatText;
    private JTextField newText;
    private JButton enterB;

    public static JTextArea chatTextS;
    public static JTextField newTextS;

    public Chat(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(chatPanel);
        this.pack();

        //chatTextS.setText("New user joined");


        enterB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newTextS = newText;
                chatTextS = chatText;

                try{
                    FileWriter output = new FileWriter("output.txt");
                    output.write(newTextS.getText());
                }catch(IOException ex){
                    ex.printStackTrace();
                }
            }
        });
    }


}
