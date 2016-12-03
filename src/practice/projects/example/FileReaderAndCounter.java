package practice.projects.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;

class FileCOunter {
    public static void main(String[] args) throws Exception {

        // TO Take input from KeyBoard in Console
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the complete File-path: ");
        String fileInput = sc.next();

        try {
            // To read the File as character-input stream
            BufferedReader br = new BufferedReader(new FileReader(fileInput));

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

                System.out.println(sLines);

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
//                        System.out.println("words: " + sWrd);
                        iWords++;
                        iChars += sWrd.length();
                    }
                    
                }
                

                if (sLines.trim().length() == 0) {
                    preValue = sLines;
                }
            }

//            System.out.println(alLine);
            System.out.println("Characters: " + iChars);
            System.out.println("Words: " + iWords);
            System.out.println("lines: " + iLines);
            System.out.println("Paragraphs: " + iParas);
            
        } 
        catch (FileNotFoundException ex) {
            System.out.println(" File not found: " + ex);

        }

    }
}
