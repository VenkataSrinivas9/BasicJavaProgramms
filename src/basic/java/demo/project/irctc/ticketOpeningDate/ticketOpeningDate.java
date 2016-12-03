package basic.java.demo.project.irctc.ticketOpeningDate;

import java.util.Calendar;
import java.util.Date;

public class ticketOpeningDate {
    
    public static final int IRCTC_TICKET_OPENING_DAYS = 120;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        getIRCTCTicketOpeningDate();
    }
    
    private static void getIRCTCTicketOpeningDate(){
        Calendar calendar = Calendar.getInstance();
        Date currentDate = calendar.getTime();
        System.out.println(currentDate);
        calendar.add(Calendar.DAY_OF_MONTH, 120);
        Date date = calendar.getTime();
        System.out.println(date);
        System.out.println("==================");
//        long currentDateLong = calendar.getTime().getTime();
//        Date currentDateFormat = new Date(currentDateLong);
//        System.out.println(currentDateFormat);
//        System.out.println(currentDateLong);
//        long daysInMilli = 120 * 24 * 60 * 60 * 100;
//        long date1 = currentDateLong + daysInMilli;
//        Date outDate = new Date(date1);
//        System.out.println(outDate);
        
    }

}
