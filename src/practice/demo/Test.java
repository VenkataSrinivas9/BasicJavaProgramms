package practice.demo;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        // All JavaHomes
        String javaHome[] = { "E:\\\\Program Files\\\\Java\\\\j2sdk1.4.2_05",
                "E:\\\\Program Files\\\\Java\\\\jdk1.6.0" };
        String path;
        String line = "";
        String pathFile = "E:\\\\Program Files\\\\Java\\\\jdk1.6.0\\\\bin\\\\JavaOutput";
        String whichJDK = "";
        String decisionMaker = "142";
        if (decisionMaker.equals("142")) {
            whichJDK = javaHome[0];
        }
        else {
            whichJDK = javaHome[1];
        }
        try {
            // try block
            path = whichJDK + "\\\\bin";
            String cmds[] = { "check.bat", pathFile, whichJDK, path };
            Runtime runtime = Runtime.getRuntime();
            Process proc = runtime.exec(cmds);
            proc.getOutputStream().close();
            InputStream inputstream = proc.getInputStream();
            InputStreamReader inputstreamreader = new InputStreamReader(
                    inputstream);
            BufferedReader bufferedreader = new BufferedReader(
                    inputstreamreader);
            while ((line = bufferedreader.readLine()) != null) {
                System.out.println(line);
                System.out.println(line);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}