
/*****************************************************************************/
/*      SCI                                                                  */
/*      All Rights Reserved. Copyright (C) 2008, Hitachi, Ltd.               */
/*      Licensed Material of Hitachi, Ltd.                                   */
/*      Reproduction, use, modification or disclosure otherwise than         */
/*      permitted in the License Agreement is strictly prohibited.           */
/*****************************************************************************/ 

package basic.java.demo.project.FileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 
 */
public class FileReadWrite {

    /**
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws Exception {

        BufferedReader br = null;
        FileOutputStream fOut = null;

        try {
            String source = "This line is newly added.";
            ArrayList<String> alLine = new ArrayList<String>();
//            char buffer[] = new char[source.length()];
//            source.getChars(0, source.length(), buffer, 0);

            String file = "D:\\VenkataMedapati\\BasicJava_Demos\\src\\basic\\java\\demo\\project\\FileReader\\abc.txt";
            br = new BufferedReader(new FileReader(file));
            String strLine = "";
            StringBuffer contentToWrite = new StringBuffer();
            while ((strLine = br.readLine()) != null) {
                alLine.add(strLine);
            }
            for (String sLines : alLine) {
                
                String sWords[] = sLines.split(" ");
                for (String sWrd : sWords) {
                    if (sWrd.equals("venkata")) {
//                        contentToWrite.append(source + " ");
                        contentToWrite.append("Srinivas ");
                    } else {
                        contentToWrite.append(sWrd + " ");
                    }
                }
               contentToWrite.append("\r");
            }

            fOut = new FileOutputStream(new File(file));
            fOut.write(contentToWrite.toString().getBytes());
        }
        catch (Exception e) {
            System.out.println("Exception: " + e);
        }
        finally {
            br.close();
            fOut.close();
        }

    }
}
