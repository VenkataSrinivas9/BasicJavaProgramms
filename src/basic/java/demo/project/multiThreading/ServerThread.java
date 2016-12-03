package basic.java.demo.project.multiThreading;

import java.net.Socket;

public class ServerThread implements Runnable{
    
    private String host;
    private int port;

    ServerThread(String host, int port){
        this.host = host;
        this.port = port;
    }
    
    @Override
    public void run() {
        // TODO Auto-generated method stub
        try {
            Socket socket = new Socket(host, port);
            System.out.println("Port " + port + " is open");
            socket.close();
            return;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("Port " + port + " is not open");
        }
    }

}
