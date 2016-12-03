package basic.java.demo.project.multiThreadingChatApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SendThread implements Runnable {
    Socket sendSocket;
    BufferedReader br;
    PrintWriter pw;
    
    public SendThread(Socket sendSocket) {
        this.sendSocket = sendSocket;
    }

    @Override
    public void run() {
        try {
            
            
            String outptMessage;
            while(true){
                br = new BufferedReader(new InputStreamReader(System.in));
                outptMessage = br.readLine();
                    if(outptMessage.equals("exit")){
                        break;
                    }
                    pw.println(outptMessage);
                    pw.flush();
                this.sendSocket.close();
            }
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    

}
