import javax.swing.*;
import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Server extends JFrame {
    public Server(){
        final ServerSocket serverSocket;
        final Socket clientSocket;
        final BufferedReader in;
        final PrintWriter out;
        final Scanner sc;
        //final Scanner sc = new Scanner(System.in);
        try{
            File f = new File("output.txt");
            Scanner sc = new Scanner(f);
        }catch(IOException ex){
            ex.printStackTrace();
        }


        try{
            serverSocket = new ServerSocket(5000);
            clientSocket = serverSocket.accept();
            System.out.println("AAAAAAAAA");
            out = new PrintWriter(clientSocket.getOutputStream());

            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            Thread sender = new Thread(new Runnable() {
                String msg; //variable that will contain the data written by the user
                @Override
                public void run() {
                    while(true){
                        Chat.chatTextS.append("Server");
                        System.out.println("Server");
                        System.out.println(chatTextS);
                        msg = sc.nextLine();    // reads input from keyboard
                        ///msg = newText.getText();

                        out.println(msg);   // write data stored in msg in the clientSocket
                        //if(msg != null){
                            ///chatText.append(msg);
                        //}
                        out.flush();    // forces the sending of the data
                    }
                }
            });
            sender.start();

            Thread receive = new Thread(new Runnable(){
                String msg;

                @Override
                public void run() {
                    try{
                        msg = in.readLine();
                        ///msg = chatText.getText();

                        while(msg != null){
                            System.out.println("Server : " + msg);
                            ///chatText.append("Server : " + msg);
                            msg = in.readLine();
                            ///msg = chatText.getText();
                        }

                        // if msg == null:
                        System.out.println("Client disconnected");
                        ///chatText.append("Client disconnected");
                        out.close();
                        clientSocket.close();
                        serverSocket.close();
                    } catch(IOException e){
                        e.printStackTrace();
                    }
                }
            });
            receive.start();
        } catch(IOException e){
            e.printStackTrace();
        }


    }
}
