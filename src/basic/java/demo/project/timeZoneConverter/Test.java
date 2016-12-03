package basic.java.demo.project.timeZoneConverter;

import java.text.ParseException;
import java.util.Calendar;
import java.util.TimeZone;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

public class Test {

    public static void main(String[] args) throws ParseException {
        // TODO Auto-generated method stub
        DateTime dt = new DateTime(DateTimeZone.forTimeZone(TimeZone.getTimeZone("IST"))).withDate(2013, 12, 24).withTime(2, 0, 0, 00);
        System.out.println(dt.toString());
         
        DateTime systemDate = dt.withZone(DateTimeZone.forTimeZone(Calendar.getInstance().getTimeZone()));
        System.out.println(systemDate.toString());
//        String timeZone = TimeZone.getTimeZone("IST").getID();
//        TimeZoneList myTimeZone = new TimeZoneList();
//        for (String zone : myTimeZone.TimeZoneList()) {
//            if(zone.contains(timeZone)){
//              System.out.println(zone); 
//          }
//        }
//        System.out.println(timeZone); 
//        for(int i = 0; i < myTimeZone.TimeZoneList().size(); i++) {
//            if(myTimeZone.TimeZoneList().contains(timeZone)){
//                System.out.println(myTimeZone.TimeZoneList().get(i)); 
//            }
//        }
    }

}
