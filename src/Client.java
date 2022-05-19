import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.*;
import java.io.*;

public class Client extends JFrame {
    private Socket socket;
    private ObjectInputStream in;
    private ObjectOutputStream out;
    private int port = 5000;

    private JPanel ClientPanel;
    private JTextArea textArea;
    private JTextField newText;
    private JButton enterB;

    public Client(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(ClientPanel);
        this.setTitle("Client");
        this.setVisible(true);
        this.pack();


        enterB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String msg = newText.getText();
                newText.setText("");

                textArea.append("\n Client: " + msg);
                try{
                    out.writeObject(msg);
                    out.flush();
                }catch(IOException ex){
                    ex.printStackTrace();
                    textArea.append("\n Unable to send message");
                }
            }
        });
    }

    public void startRunning(){
        Thread clientThread = new Thread(new Runnable() {
            public void run(){
                try{
                    try{
                        socket = new Socket("0.0.0.0", port);

                    }catch(IOException ioE1){
                        ioE1.printStackTrace();
                    }
                    out= new ObjectOutputStream(socket.getOutputStream());
                    out.flush();
                    in = new ObjectInputStream(socket.getInputStream());

                    whileChatting();
                }catch(IOException ioE2){
                    ioE2.printStackTrace();
                }
            }
        });
        clientThread.start();

    }

    private void whileChatting() throws IOException{
        String msg = "";
        newText.setEditable(true);
        do{
            try{
                msg = (String) in.readObject();
                textArea.append("\n" + msg);
            }catch(ClassNotFoundException classNotFoundException){

            }
        }while(!msg.equals("Client: END"));
    }

}
