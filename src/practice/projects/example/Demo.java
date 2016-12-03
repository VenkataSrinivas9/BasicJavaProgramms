/*****************************************************************************/
/*      SCI                                                                  */
/*      All Rights Reserved. Copyright (C) 2016, Hitachi, Ltd.               */
/*      Licensed Material of Hitachi, Ltd.                                   */
/*      Reproduction, use, modification or disclosure otherwise than         */
/*      permitted in the License Agreement is strictly prohibited.           */
/*****************************************************************************/

package practice.projects.example;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;
import java.util.TimeZone;

/**
 * 
 */
public class Demo {
    
    static int x;

    /**
     * @param args
     * @throws ParseException 
     */
    public static void main(String[] args) throws ParseException {
        // TODO Auto-generated method stub
        
//        String dateTime = "2016-06-27T12:00:00.000+0530";
//        SimpleDateFormat local_formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
//        Date date = local_formatter.parse(dateTime);
//        System.out.println(local_formatter.format(date));
//        
//        SimpleDateFormat local_formatter12 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
//        local_formatter.setTimeZone(TimeZone.getTimeZone("IST"));
//        String dateTime12 = local_formatter.format(date).toString();
//        System.out.println(dateTime12);
        
        Calendar calendar = Calendar.getInstance();
        Date d = calendar.getTime();
        long m = d.getTimezoneOffset();
        System.out.println(m);
//        Date date12 = local_formatter12.parse();
//        System.out.println(local_formatter12.format(date12));
        
//      SimpleDateFormat lv_formatter = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz");
//      lv_formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
//      lv_formatter.format(date);

//      System.out.println(lv_formatter.format(date));
        
//        String scheduledDateTime = "2016/06/08 1:5";
//        String dateTimePattern = "yyyy/MM/dd";
//        long MILLIS_IN_INTERVAL = 1000 * 60 * 60 * 24 * 15;
//        SimpleDateFormat dateTimeFormat = new SimpleDateFormat(dateTimePattern);
//        Date scheduledDate = dateTimeFormat.parse(scheduledDateTime);
////        System.out.println(scheduledDate);
//        long scheduledDateInMilliSec = scheduledDate.getTime();
//        String currentDate = dateTimeFormat.format(Calendar.getInstance().getTimeInMillis() + MILLIS_IN_INTERVAL);
////        long executionTime = scheduledDateInMilliSec + MILLIS_IN_INTERVAL;
//        System.out.println(currentDate);
//        
//        Calendar calender = Calendar.getInstance();
//        calender.setTimeInMillis(scheduledDateInMilliSec);
//        System.out.println(dateTimeFormat.format(calender.getTime()));
//        long currentDateInMiiliSec = System.currentTimeMillis();
//        System.out.println(dateTimeFormat.format(currentDateInMiiliSec));
//        String dateString = dateTimeFormat.format(currentDateInMiiliSec).toString();
//        String[] dateArray = dateString.split(" ");
//        System.out.println(dateArray[0]);
//        String[] timeArray = dateArray[1].split(":");
//        System.out.println(timeArray[0]);
//        System.out.println(timeArray[1]);
//        String someDate ="3";
//        SimpleDateFormat sdf = new SimpleDateFormat("HH");
//        Date date = sdf.parse(someDate);System.out.println(date.getTime());
//        
//        String datePattern = "yyyy/MM/dd";
//        long MILLIS_IN_INTERVAL = 1000 * 60 * 60 * 24;
//        SimpleDateFormat dateFormat = new SimpleDateFormat();
//        String currentDate = dateFormat.format(Calendar.getInstance().getTimeInMillis() + MILLIS_IN_INTERVAL);
//        System.out.println(currentDate);
//        
//        String hourPattern = "HH";
//        SimpleDateFormat hourFormat = new SimpleDateFormat(hourPattern);
//        String currentHour = hourFormat.format(Calendar.getInstance().getTimeInMillis());
//        System.out.println(currentHour);
//        
//        String minutesPattern = "mm";
//        SimpleDateFormat minutesFormat = new SimpleDateFormat(minutesPattern);
//        String currentMinutes = minutesFormat.format(Calendar.getInstance().getTimeInMillis());
//        System.out.println(currentMinutes);
    }

}

