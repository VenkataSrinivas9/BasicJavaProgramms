/*****************************************************************************/
/* SCI */
/* All Rights Reserved. Copyright (C) 2008, Hitachi, Ltd. */
/* Licensed Material of Hitachi, Ltd. */
/* Reproduction, use, modification or disclosure otherwise than */
/* permitted in the License Agreement is strictly prohibited. */
/*****************************************************************************/

package basic.java.demo.project.starmgrlogger;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * 
 */
public class starMgrLogger {

    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws IOException,
            InterruptedException {

        System.out.println("Write into the file: ");
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
                "D:\\VenkataMedapati\\BasicJava_Demos\\src\\basic\\java\\demo\\project\\starmgrlogger\\test.txt", true)));
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        GregorianCalendar cd = new GregorianCalendar();

        out.print(cd.get(Calendar.YEAR) + "/" + cd.get(Calendar.MONTH) + "/"
                + cd.get(Calendar.DATE) + " " + cd.get(Calendar.HOUR_OF_DAY)
                + ":" + cd.get(Calendar.MINUTE) + ":" + cd.get(Calendar.SECOND)
                + ":" + cd.get(Calendar.MILLISECOND) + "  ");
        out.print(str + " ");
        out.println();
        System.out.println();
        System.out.println("Notepad is created/modified");
        System.out.println();

        out.close();

        String s;
        BufferedReader br = new BufferedReader(new FileReader(
                "D:\\VenkataMedapati\\BasicJava_Demos\\src\\basic\\java\\demo\\project\\starmgrlogger\\test.txt"));
        while ((s = br.readLine()) != null) {

            System.out.println(s);
        }

        br.close();

        Runtime rs = Runtime.getRuntime();
        Process p = rs.exec("notepad D:\\VenkataMedapati\\BasicJava_Demos\\src\\basic\\java\\demo\\project\\starmgrlogger\\test.txt");
        Thread.sleep(3000);
        p.destroy();

    }
}
