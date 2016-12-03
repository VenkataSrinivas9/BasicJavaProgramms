package basic.java.demo.project.timeZoneConverter;

import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class TimeZoneList {

//    public static void main(String[] args) {
//
//        String[] ids = TimeZone.getAvailableIDs();
//        for (String id : ids) {
//            System.out.println(displayTimeZone(TimeZone.getTimeZone(id)));
//        }
//
//        System.out.println("\nTotal TimeZone ID " + ids.length);
//
//    }
    private static String[] ids = null;
    private static ArrayList<String> timeZones = null;
    
    public static ArrayList<String> getTimeZones() {
        return timeZones;
    }

    public static void setTimeZones(ArrayList<String> timeZones) {
        TimeZoneList.timeZones = timeZones;
    }

    public static String[] getIds() {
        return ids;
    }

    public static void setIds(String[] ids) {
        TimeZoneList.ids = ids;
    }

    public static int TimeZoneIDList() {
        ids = TimeZone.getAvailableIDs();
      return ids.length;
    }
    
public static ArrayList<String> TimeZoneList() {
      ids = TimeZone.getAvailableIDs();
      timeZones = new ArrayList<String>(); 
      for (String id : ids) {
          timeZones.add(displayTimeZone(TimeZone.getTimeZone(id)));
      }
    return timeZones;
  }

    private static String displayTimeZone(TimeZone tz) {

        long hours = TimeUnit.MILLISECONDS.toHours(tz.getRawOffset());
        long minutes = TimeUnit.MILLISECONDS.toMinutes(tz.getRawOffset()) - TimeUnit.HOURS.toMinutes(hours);
        // avoid -4:-30 issue
        minutes = Math.abs(minutes);

        String result = "";
        if (hours > 0) {
            result = String.format("(GMT+%d:%02d) %s", hours, minutes, tz.getID());
        } else {
            result = String.format("(GMT%d:%02d) %s", hours, minutes, tz.getID());
        }

        return result;

    }

}