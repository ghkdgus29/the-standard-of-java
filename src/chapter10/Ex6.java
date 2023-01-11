package chapter10;

import java.util.Calendar;

public class Ex6 {
    public static void main(String[] args) {
        Calendar birthDay = Calendar.getInstance();
        birthDay.set(1997, Calendar.APRIL, 29);

        Calendar now = Calendar.getInstance();

        long dayDiff = (now.getTimeInMillis() - birthDay.getTimeInMillis()) / (1000 * 60 * 60 * 24);

        System.out.println(dayDiff + " days");
    }
}
