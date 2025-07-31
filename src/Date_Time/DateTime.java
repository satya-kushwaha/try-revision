package Date_Time;

import java.lang.ref.Cleaner;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class DateTime {

    public static void main(String[] args) {
//        System.out.println(System.currentTimeMillis());
        Date date  = new Date();
/*//        System.out.println("DATE");
        System.out.println(date);
        System.out.println("CALENDER");
        Calendar caledner =  Calendar.getInstance();
        System.out.println(caledner.getTime());
        System.out.println(caledner.getTimeZone().getID());*/

//        LocalTime localTime = LocalTime.now();
//        System.out.println(localTime);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        System.out.println("Simple Time Formate");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date1 = new Date();
        System.out.println(simpleDateFormat.format(date1));
    }
}
