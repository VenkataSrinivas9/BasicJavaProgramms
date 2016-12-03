/*****************************************************************************/
/* SCI */
/* All Rights Reserved. Copyright (C) 2008, Hitachi, Ltd. */
/* Licensed Material of Hitachi, Ltd. */
/* Reproduction, use, modification or disclosure otherwise than */
/* permitted in the License Agreement is strictly prohibited. */
/*****************************************************************************/

package basic.java.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */
public class ExceptionHandler {

    public static void main(String[] args) throws Exception {
        System.out.println("Enter the complete File-path: ");
        Scanner sc = new Scanner(System.in);
        String fileInput = sc.next();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(fileInput));
            String strLine = "";
            String preValue = " ";
            long iChars = 0;
            long iWords = 0;
            int iLines = 0;
            int iParas = 0;

            ArrayList<String> alLine = new ArrayList<String>();

            while ((strLine = br.readLine()) != null) {
                alLine.add(strLine);
            }

            for (String sLines : alLine) {

                iLines++;

                if (sLines.trim().length() != 0) {
                    if (preValue.trim().length() == 0) {
                        iParas++;
                        preValue = sLines;
                    }
                }

                String sWords[] = sLines.split(" ");
                for (String sWrd : sWords) {
                    if (sWrd.trim().length() != 0) {
                        // System.out.println("words: " + sWrd);
                        iWords++;
                        iChars += sWrd.length();
                    }

                }

                if (sLines.trim().length() == 0) {
                    preValue = sLines;
                }
            }

            // System.out.println(alLine);
            System.out.println("Characters: " + iChars);
            System.out.println("Words: " + iWords);
            System.out.println("lines: " + iLines);
            System.out.println("Paragraphs: " + iParas);

        }
        catch (FileNotFoundException ex) {
            System.out.println("Error: File not found");
        }
        catch (IOException ex) {
            // TODO: handle exception
            System.out.println("Error: IO Exception");
        }
        finally {
            if (br != null) {
                System.out.println("Closing BufferedReader.");
                br.close();
                Thread.sleep(2000);
                System.out.println("BufferedReader is closed.");
            }
            else {
                System.out.println("BufferedReader not open.");
            }
        }

    }
}
