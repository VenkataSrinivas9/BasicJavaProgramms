package basic.java.demo.project.FileReader;

import java.io.File;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;

public class ExecuteDOSCommand {
    private static String MY_FILE = "D:\\VenkataMedapati\\BasicJava_Demos\\src\\basic\\java\\demo\\project\\FileReader\\abc.txt";

    public static void main(String[] args) throws InterruptedException {

        File file = new File(MY_FILE);

        try {
            System.out.println("Is Writable: " + file.canWrite());
            // ATTRIB [+R | -R] [+A | -A ] [+S | -S] [+H | -H]
            // [drive:][path][filename] [/S [/D]] + Sets an attribute. - Clears
            // an attribute. R Read-only file attribute. A Archive file
            // attribute. S System file attribute. H Hidden file attribute.
            // [drive:][path][filename] Specifies a file or files for attrib to
            // process. /S Processes matching files in the current folder and
            // all subfolders. /D Processes folders as well.
            
            String dosCommand = "";
            if (file.canWrite()) {
                dosCommand = "ATTRIB +R";
            }
            else {
                dosCommand = "ATTRIB -R";
            }

            Process process = Runtime.getRuntime().exec(
                    dosCommand + " " + MY_FILE);
            process.waitFor();
            System.out.println("Is Writable: " + file.canWrite());
//            process.destroy();
//            Thread.sleep(2000);
//            file.renameTo(new File("D://abcde.txt"));
//            Run run = new Run();
//            Thread thread = new Thread(run);
//            thread.start();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}