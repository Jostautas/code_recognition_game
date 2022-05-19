import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.*;
import java.io.*;

public class Server extends JFrame{
    private ServerSocket serverSocket;
    private Socket socket;
    private ObjectInputStream in;
    private ObjectOutputStream out;
    private int port = 5000;

    private JPanel ServerPanel;
    private JTextArea textArea;
    private JTextField newText;
    private JButton enterB;

    public Server(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(ServerPanel);
        this.setVisible(true);
        this.setTitle("Server");
        this.pack();


        enterB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String msg = newText.getText();
                if(msg == null){
                    msg = " ";
                }
                newText.setText("");

                textArea.append("\n Server: " + msg);
                try{
                    out.writeObject(msg);
                    out.flush();
                }catch(IOException ex){
                    ex.printStackTrace();
                }
            }
        });
    }

    public void startRunning() {

        Thread serverThread = new Thread(new Runnable(){
            public void run(){
                try{
                    serverSocket = new ServerSocket(port);
                    while(true){
                        try{
                            socket = serverSocket.accept();
                            out = new ObjectOutputStream(socket.getOutputStream());
                            out.flush();
                            in = new ObjectInputStream(socket.getInputStream());

                            whileChatting();

                        }catch(EOFException eofE){
                            eofE.printStackTrace();
                        }
                    }
                }catch(IOException ioE){
                    ioE.printStackTrace();
                }
            }
        });
        serverThread.start();

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
        }while(!msg.equals("Client - END"));
    }

}
