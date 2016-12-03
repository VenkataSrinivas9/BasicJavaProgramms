package basic.java.demo.project.multiThreadingChatApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class RecieveThread implements Runnable{
    Socket receiveSocket;
    BufferedReader br;
    
    public RecieveThread(Socket receiveSocket) {
        this.receiveSocket = receiveSocket;
    }

    @Override
    public void run() {
        try {
            br = new BufferedReader(new InputStreamReader(this.receiveSocket.getInputStream()));
            
            String inputMessage;
            while(true){
                while((inputMessage = br.readLine()) != null){
                    if(inputMessage.equals("exit")){
                        break;
                    }
                    System.out.println(inputMessage);
                }
                this.receiveSocket.close();
            }
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
