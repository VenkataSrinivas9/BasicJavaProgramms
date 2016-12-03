package basic.java.demo.project.multiThreadingChatApplication;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private static final int PORT = 125;
    
    public static void main(String[] args) {
        
        try {  
            ServerSocket serverSocket = new ServerSocket(PORT);
            Socket socket = serverSocket.accept();
            
            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            String msgin = "", msgout="";
            while (!msgin.equals("exit")) {
                msgin = inputStream.readUTF();
                System.out.println("From Client: " + msgin);  // printing message message
                msgout = br.readLine();
                outputStream.writeUTF(msgout);
                outputStream.flush();  // sending client message to Server
            }
            socket.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
