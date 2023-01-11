package chapter10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex1 {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd은 2번째 일요일입니다.");

        for (int i = 0; i < 12; i++) {
            calendar.set(2010, i, 1);

            int dayOfWeekInMonth = calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH);
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

            while (!(dayOfWeekInMonth == 2 && dayOfWeek == 1)) {
                calendar.add(Calendar.DATE, 1);
                dayOfWeekInMonth = calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH);
                dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            }
            Date date = calendar.getTime();

            System.out.println(sdf.format(date));
        }
    }
}
