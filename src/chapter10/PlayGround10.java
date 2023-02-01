package chapter10;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class PlayGround10 {
    public static void main(String[] args) throws ParseException {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime of = LocalDateTime.of(1997, 4, 29, 0, 0, 1);

//        System.out.println(now);
//        System.out.println(of);

        int minute = now.getMinute();
        LocalDateTime nowPlusDay = now.plusDays(1);         // now 에 하루 더해진다.
        LocalDateTime localDateTime = now.withDayOfMonth(31);       // now 에서 일만 31로 변경한다.
        LocalDate parse = LocalDate.parse("1997-04-29");

        LocalDateTime date1 = LocalDateTime.of(2023, 1, 29, 12, 30, 30);
        LocalDateTime date2 = LocalDateTime.of(2023, 1, 30, 0, 0, 0);

        boolean b1 = date1.isAfter(date2);      // date1 이 date2 보다 이후날짜면 true
        boolean b2 = date1.isBefore(date2);     // date1 이 date2 보다 이전날짜면 true
        boolean equal = date1.isEqual(date2);   // date1 과 date2 날짜가 같으면 true

        LocalDate d1 = date1.toLocalDate();
        LocalDate d2 = date2.toLocalDate();

        long dayDiff = d1.toEpochDay() - d2.toEpochDay();

        LocalTime t1 = date1.toLocalTime();
        LocalTime t2 = date2.toLocalTime();
        long timdDiff = t1.toSecondOfDay() - t2.toSecondOfDay();

        long hour = timdDiff / 3600;
        long min = timdDiff % 3600 / 60;
        long sec = timdDiff % 60;


        LocalDate today = LocalDate.now();                     // 오늘

        today.with(TemporalAdjusters.firstDayOfMonth());     // 이번달의 첫번째 날

        today.with(TemporalAdjusters.firstDayOfNextMonth()); // 다음달의 첫번째 날

        today.with(TemporalAdjusters.lastDayOfMonth());      // 이번달의 마지막 날

        today.with(TemporalAdjusters.firstInMonth(DayOfWeek.TUESDAY));   // 이 달의 첫번째 화요일

        today.with(TemporalAdjusters.lastInMonth(DayOfWeek.TUESDAY));    // 이 달의 마지막 화요일

        today.with(TemporalAdjusters.previous(DayOfWeek.TUESDAY));       // 지난 화요일

        today.with(TemporalAdjusters.previousOrSame(DayOfWeek.TUESDAY)); // 지난 화요일 (오늘 포함)

        today.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));           // 다음 화요일

        today.with(TemporalAdjusters.nextOrSame(DayOfWeek.TUESDAY));     // 다음 화요일 (오늘 포함)

        today.with(TemporalAdjusters.dayOfWeekInMonth(4, DayOfWeek.TUESDAY));    // 이 달의 4번째 화요일

        double number = 1234567.89;

        DecimalFormat df1 = new DecimalFormat("0.000");
        String format1 = df1.format(number);     // format1 = 1234567.890

        DecimalFormat df2 = new DecimalFormat("#.###");
        String format2 = df2.format(number);     // format2 = 1234567.89

        DecimalFormat df3 = new DecimalFormat("#.#");
        String format3 = df3.format(number);     // format3 = 1234567.9

        DecimalFormat df4 = new DecimalFormat("#,###");
        String format4 = df4.format(number);     // format4 = 1,234,568
        Number parse4 = df4.parse(format4);      // parse4 = 1234568 (Number 타입)

        LocalDateTime date = LocalDateTime.of(2020, 12, 24, 10, 30, 15); // 2020-12-24T10:30:15
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String form1 = date.format(formatter1);     // 2020-12-24 10:30:15

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("이 날은 이 달의 W번째 E요일입니다.");
        String form2 = date.format(formatter2);     // 이 날은 이 달의 4번째 목요일입니다.

        LocalDateTime parsedDate = LocalDateTime.parse("2020-12-24 10:30:15", formatter1); // 2020-12-24T10:30:15


    }

    private static void p(Object o) {
        System.out.println(o);
    }
}
