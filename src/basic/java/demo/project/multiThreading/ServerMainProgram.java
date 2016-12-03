package basic.java.demo.project.multiThreading;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ServerMainProgram {

    private static String host;
    
    public static void main(String[] args) {

        host = "localhost";
        for(int i = 0; i <= 1001; i++ ){
            // Finding the socket open or not takes more time than threads
//            try {
//                Socket socket = new Socket(host, i);
//                System.out.println("Port " + i + " is open");
//            } catch (Exception e) {
//                // TODO Auto-generated catch block
//                System.out.println("Port " + i + " is not open");
//            }
            
            // Threads
            ServerThread serverThread = new ServerThread(host, i);
            Thread t1 = new Thread(serverThread);
            t1.start();
        }
        
    }

}
