package chapter10;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Ex7 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2016, 12, 1);

        LocalDate fourthTuesdayDate = date.with(TemporalAdjusters.dayOfWeekInMonth(4, DayOfWeek.TUESDAY));

        System.out.println(fourthTuesdayDate);
    }
}
