package basic.java.demo.project.timeZoneConverter;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * 
 */
public class DateAndTime {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
//        calendar.set(2015, 11, 24, 9, 45);
//        calendar.setTimeZone(TimeZone.getTimeZone("IST"));
//        SimpleDateFormat local_formatter = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz");
        SimpleDateFormat local_formatter = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz");
        local_formatter.format(calendar.getTime());
        local_formatter.setTimeZone(calendar.getTimeZone());
        Date date = calendar.getTime();
        System.out.println(local_formatter.format(calendar.getTime()));
        TimeZone timeZone = calendar.getTimeZone();
        String[] str = TimeZone.getAvailableIDs();
        TimeZone zone = TimeZone.getTimeZone(str[99].toString());

        SimpleDateFormat lv_formatter = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz");
        lv_formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        lv_formatter.format(date);

        System.out.println(timeZone.getID());
        System.out.println(zone.getID());
        System.out.println(lv_formatter.format(date));

    }
//    Calendar calendar = Calendar.getInstance();
//    Date date = new Date();
//    calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE), 22, 0);
//    SimpleDateFormat local_formatter = new SimpleDateFormat("HH:mm");
//    System.out.println(local_formatter.format(calendar.getTime()));
}
