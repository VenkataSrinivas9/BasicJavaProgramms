package practice.demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Simple Java program to convert local time into GMT or any other TimeZone in
 * Java SimpleDateFormat in Java can be used to convert Date from one timezone
 * to other
 * 
 * @author Javin
 */
public class TimeZoneConverter {

    public static void main(String args[]) {

        Calendar cal = Calendar.getInstance();
        // Date will return local time in Java
        Date localTime = cal.getTime();
        TimeZone localTimeZone = cal.getTimeZone();
        DateFormat localDateConverter = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z");
        localDateConverter.setTimeZone(TimeZone.getTimeZone(localTimeZone.getID()));

        // creating DateFormat for converting time from local timezone to GMT
//        DateFormat converter = new SimpleDateFormat("dd/MM/yyyy:HH:mm:ss");
        DateFormat dateConverter = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z");

//        dateConverter.setTimeZone(TimeZone.getTimeZone("MST"));
        // getting GMT timezone, you can get any timezone e.g. UTC
        dateConverter.setTimeZone(TimeZone.getTimeZone("UTC"));

        System.out.println("local time and time zone: " + localDateConverter.format(localTime));
        ;
        System.out.println("time in GMT : " + dateConverter.format(localTime));

    }

}
