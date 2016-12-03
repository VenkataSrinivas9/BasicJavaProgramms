//
///*****************************************************************************/
///*      SCI                                                                  */
///*      All Rights Reserved. Copyright (C) 2008, Hitachi, Ltd.               */
///*      Licensed Material of Hitachi, Ltd.                                   */
///*      Reproduction, use, modification or disclosure otherwise than         */
///*      permitted in the License Agreement is strictly prohibited.           */
///*****************************************************************************/ 
//
//package practice.demo;
//
//import java.sql.Date;
//import java.text.SimpleDateFormat;
//import java.util.TimeZone;
//
//
//
///**
// * 
// */
//public class DateAndTime {
//
//    /**
//     * @param args
//     */
//    public static void main(String[] args) {
//
//    }
//
//    /**
//     * Test method for {@link com.scratch.datetime.DateTimeUtil#convertLocalTimeToUTC(java.lang.String, java.lang.String)}.
//     */
//    public final void testConvertLocalTimeToUTC() {
//    try {
//    assertEquals("testConvertLocalTimeToUTC:LON ", "03-11-2008 11:00:00 UTC(+0000)" ,DateTimeUtil.convertLocalTimeToUTC("LON", "03-11-2008 11:00:00"));
//    assertEquals("testConvertLocalTimeToUTC:NBI ", "03-11-2008 08:00:00 UTC(+0000)" ,DateTimeUtil.convertLocalTimeToUTC("NBI", "03-11-2008 11:00:00"));
//    assertEquals("testConvertLocalTimeToUTC:BRS ", "03-11-2008 10:00:00 UTC(+0000)" ,DateTimeUtil.convertLocalTimeToUTC("BRS", "03-11-2008 11:00:00"));
//    assertEquals("testConvertLocalTimeToUTC:MNT ", "03-11-2008 16:00:00 UTC(+0000)" ,DateTimeUtil.convertLocalTimeToUTC("MNT", "03-11-2008 11:00:00"));
//    assertEquals("testConvertLocalTimeToUTC:LAS ", "03-11-2008 19:00:00 UTC(+0000)" ,DateTimeUtil.convertLocalTimeToUTC("LAS", "03-11-2008 11:00:00"));
//    } catch (Exception e) {
//    e.printStackTrace();
//    fail("testConvertLocalTimeToUTC: Exception :" + e); 
//    }
//    }
//      
//    /**
//     * Test method for {@link com.scratch.datetime.DateTimeUtil#convertUTCtoLocalTime(java.lang.String, java.lang.String)}.
//     */
//    public final void testConvertUTCtoLocalTime() {
//    try {
//    assertEquals("testConvertLocalTimeToUTC:LON ", "03-11-2008 11:00:00 GMT(+0000)" ,DateTimeUtil.convertUTCtoLocalTime("LON", "03-11-2008 11:00:00"));
//    assertEquals("testConvertLocalTimeToUTC:NBI ", "03-11-2008 14:00:00 EAT(+0300)" ,DateTimeUtil.convertUTCtoLocalTime("NBI", "03-11-2008 11:00:00"));
//    assertEquals("testConvertLocalTimeToUTC:BRS ", "03-11-2008 12:00:00 CET(+0100)" ,DateTimeUtil.convertUTCtoLocalTime("BRS", "03-11-2008 11:00:00"));
//    assertEquals("testConvertLocalTimeToUTC:MNT ", "03-11-2008 06:00:00 EST(-0500)" ,DateTimeUtil.convertUTCtoLocalTime("MNT", "03-11-2008 11:00:00"));
//    assertEquals("testConvertLocalTimeToUTC:LAS ", "03-11-2008 03:00:00 PST(-0800)" ,DateTimeUtil.convertUTCtoLocalTime("LAS", "03-11-2008 11:00:00"));
//    } catch (Exception e) {
//    e.printStackTrace();
//    fail("convertUTCtoLocalTime: Exception :" + e); 
//    }
//    }
//    
//    public static String convertUTCtoLocalTime(String p_city, String p_UTCDateTime) throws Exception{
//        
//        String lv_dateFormateInLocalTimeZone="";//Will hold the final converted date
//        Date lv_localDate = null;
//        String lv_localTimeZone ="";
//        SimpleDateFormat lv_formatter;
//        SimpleDateFormat lv_parser;
//          
//        //Temp for testing(mapping of cities and timezones will eventually be in a properties file
//        if(p_city.equals("LON")){
//        lv_localTimeZone="Europe/London";
//        }else if(p_city.equals("NBI")){
//        lv_localTimeZone="EAT";
//        }else if(p_city.equals("BRS")){
//        lv_localTimeZone="Europe/Brussels";
//        }else if(p_city.equals("MNT")){
//        lv_localTimeZone="America/Montreal";
//        }else if(p_city.equals("LAS")){
//        lv_localTimeZone="PST";}
//         
//        //create a new Date object using the UTC timezone
//        lv_parser = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
//        lv_parser.setTimeZone(TimeZone.getTimeZone("UTC"));
//        lv_localDate = (Date) lv_parser.parse(p_UTCDateTime);
//         
//        //Set output format - // prints "2007/10/25  18:35:07 EDT(-0400)"
//        lv_formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss z'('Z')'");
//        System.out.println("convertUTCtoLocalTime "+p_city+": "+ "The Date in the UTC time zone(UTC) " + lv_formatter.format(lv_localDate));
//         
//        //Convert the UTC date to Local timezone
//        lv_formatter.setTimeZone(TimeZone.getTimeZone(lv_localTimeZone));
//        lv_dateFormateInLocalTimeZone = lv_formatter.format(lv_localDate);
//        System.out.println("convertUTCtoLocalTime: "+p_city+": "+"The Date in the LocalTime Zone time zone " + lv_formatter.format(lv_localDate));
//         
//        return lv_dateFormateInLocalTimeZone;
//        }
//    
//    public static String convertLocalTimeToUTC(String p_city, String p_localDateTime) throws Exception{
//        
//        String lv_dateFormateInUTC="";//Will hold the final converted date
//        Date lv_localDate = null;
//        String lv_localTimeZone ="";
//        SimpleDateFormat lv_formatter;
//        SimpleDateFormat lv_parser;
//          
//        //Temp for testing(mapping of cities and timezones will eventually be in a properties file
//        if(p_city.equals("LON")){
//        lv_localTimeZone="Europe/London";
//        }else if(p_city.equals("NBI")){
//        lv_localTimeZone="EAT";
//        }else if(p_city.equals("BRS")){
//        lv_localTimeZone="Europe/Brussels";
//        }else if(p_city.equals("MNT")){
//        lv_localTimeZone="America/Montreal";
//        }else if(p_city.equals("LAS")){
//        lv_localTimeZone="PST";
//        }
//         
//        //create a new Date object using the timezone of the specified city
//        lv_parser = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
//        lv_parser.setTimeZone(TimeZone.getTimeZone(lv_localTimeZone));
//        lv_localDate = (Date) lv_parser.parse(p_localDateTime);
//         
//        //Set output format prints "2007/10/25  18:35:07 EDT(-0400)"
//        lv_formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss z'('Z')'");
//        lv_formatter.setTimeZone(TimeZone.getTimeZone(lv_localTimeZone));
//         
//        System.out.println("convertLocalTimeToUTC: "+p_city+": "+" The Date in the local time zone " + lv_formatter.format(lv_localDate));
//         
//        //Convert the date from the local timezone to UTC timezone
//        lv_formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
//        lv_dateFormateInUTC = lv_formatter.format(lv_localDate);
//        System.out.println("convertLocalTimeToUTC: "+p_city+": "+" The Date in the UTC time zone " + lv_dateFormateInUTC);
//         
//         
//        return lv_dateFormateInUTC;
//        }
//    
//}
//
