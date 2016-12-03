/*****************************************************************************/
/* SCI */
/* All Rights Reserved. Copyright (C) 2008, Hitachi, Ltd. */
/* Licensed Material of Hitachi, Ltd. */
/* Reproduction, use, modification or disclosure otherwise than */
/* permitted in the License Agreement is strictly prohibited. */
/*****************************************************************************/

package practice.projects.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 */
public class StringSplit {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
//        String str = null;
//        if(str != null || str.contains("Sri")){
//            System.out.println("Success");
//        } else {
//            System.out.println("Failed");
//        }
        
        // TODO Auto-generated method stub
        // String inputUTCTime = "2026/06/10 22:00";
        // String[] utcSplit = inputUTCTime.split("T");
        // String[] splitColon = utcSplit[1].split(":");
        // String utcSimplified = splitColon[0]+":"+splitColon[1];
        // String utcFinal = utcSplit[0]+"T"+utcSimplified;

        String inputUTCTime = "2026/06/10T22:00:00.000+09:00";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd'T'HH:mm");
        Date date = null;
        try {
            date = simpleDateFormat.parse(inputUTCTime);
            System.out.println(date);
        }
        catch (ParseException e) {
            System.out.println("Invalid Format");
        }
    }

}
