package basic.java.demo.project.timeZoneConverter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
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

        dateConverter.setTimeZone(TimeZone.getTimeZone("MST"));
        // getting GMT timezone, you can get any timezone e.g. UTC
//        converter.setTimeZone(TimeZone.getTimeZone("UTC"));

        System.out.println("local time and time zone: " + localDateConverter.format(localTime));
        System.out.println("time in GMT : " + dateConverter.format(localTime));
//        final String[] timeZoneIds = TimeZone.getAvailableIDs();
//        for (final String id : timeZoneIds) {
//             System.out.println(TimeZone.getTimeZone(id).getID());
//        }        
//        String[] locales = Locale.getISOCountries();
//        for (String countryCode : locales) {
//
//            Locale obj = new Locale("", countryCode);
//
//            System.out.println("Country Code = " + obj.getCountry() 
//                + ", Country Name = " + obj.getDisplayCountry());
//
//        }

    }

}
