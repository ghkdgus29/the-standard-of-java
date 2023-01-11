package chapter10;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class test {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        System.out.println(date);

        String format = date.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH mm ss"));
        System.out.println("format = " + format);

        LocalDateTime parse = LocalDateTime.parse(format, DateTimeFormatter.ofPattern("yyyy/MM/dd HH mm ss"));

        System.out.println(parse);

    }
}
