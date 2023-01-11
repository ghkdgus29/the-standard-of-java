package chapter10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex5 {
    static int getDayDiff(String yyyymmdd1, String yyyymmdd2) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

        Calendar from = Calendar.getInstance();
        Calendar to = Calendar.getInstance();
        try {
            from.setTime(sdf.parse(yyyymmdd1));
            to.setTime(sdf.parse(yyyymmdd2));
        } catch (ParseException e) {
            return 0;
        }
        int dayDiff = (int) (from.getTimeInMillis() - to.getTimeInMillis()) / (1000 * 60 * 60 * 24);

        return dayDiff;
    }

    public static void main(String[] args) {
        System.out.println(getDayDiff("20010103", "20010101"));
        System.out.println(getDayDiff("20010103", "20010103"));
        System.out.println(getDayDiff("20010103", "200103"));
    }
}
