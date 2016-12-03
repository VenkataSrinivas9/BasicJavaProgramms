/*****************************************************************************/
/* SCI */
/* All Rights Reserved. Copyright (C) 2008, Hitachi, Ltd. */
/* Licensed Material of Hitachi, Ltd. */
/* Reproduction, use, modification or disclosure otherwise than */
/* permitted in the License Agreement is strictly prohibited. */
/*****************************************************************************/

package basic.java.demo.project.sessiontime;

import java.io.IOException;

/**
 * 
 */
public class SessionTime {
    /**
     * @param args
     * @throws IOException
     * @throws InterruptedException
     */
    public static void main(String[] args) throws IOException,
            InterruptedException {

        String file = "D:\\VenkataMedapati\\BasicJava_Demos\\src\\basic\\java\\demo\\project\\sessiontime\\test.txt";
        Runtime rt = Runtime.getRuntime();
        Process p = rt.exec("notepad " + file);
        Thread.sleep(5000);
        p.destroy();
    }

    

}
