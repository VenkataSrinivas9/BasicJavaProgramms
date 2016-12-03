
/*****************************************************************************/
/*      SCI                                                                  */
/*      All Rights Reserved. Copyright (C) 2008, Hitachi, Ltd.               */
/*      Licensed Material of Hitachi, Ltd.                                   */
/*      Reproduction, use, modification or disclosure otherwise than         */
/*      permitted in the License Agreement is strictly prohibited.           */
/*****************************************************************************/ 

package basic.java.demo.project.FileReader;

import java.io.File;

/**
 * 
 */
public class Run implements Runnable {
    private static String MY_FILE = "D://abcde.txt";
    public void run() {
        File file = new File(MY_FILE);
        for (int i = 0; i < 10; i++) {
            System.out.println("Is Writable: " + file.canWrite());
        }
    }

}

