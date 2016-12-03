package basic.java.demo.project.multiThreadingChatApplication;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    
    private static final String HOST = "localhost";
    private static final int PORT = 125;
    
    public static void main(String[] args) {
        
        Socket socket;
        try {
            socket = new Socket(HOST, PORT);
            
            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            String msgin = "", msgout = "";
            while (!msgin.equals("exit")) {
                msgout = br.readLine();
                outputStream.writeUTF(msgout);
                outputStream.flush(); // sending client message to Server
                
                msgin = inputStream.readUTF();
                System.out.println("From Sever: " + msgin); // printing message message
            }
            socket.close();
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
       

    }

}
