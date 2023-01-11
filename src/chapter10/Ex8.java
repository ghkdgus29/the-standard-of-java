package chapter10;

import java.time.*;
import java.time.temporal.ChronoField;

public class Ex8 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        ZoneId zid = ZoneId.of("Asia/Seoul");
        ZonedDateTime seoulZdt = ZonedDateTime.of(now, zid);
        ZoneOffset seoulOffset = seoulZdt.getOffset();
        OffsetDateTime seoulOdt = OffsetDateTime.of(now, seoulOffset);

        zid = ZoneId.of("America/New_York");
        ZonedDateTime newYorkZdt = ZonedDateTime.of(now, zid);
        ZoneOffset newYorkOffset = newYorkZdt.getOffset();
        OffsetDateTime newYorkOdt = OffsetDateTime.of(now, newYorkOffset);

        System.out.println(seoulOdt);
        System.out.println(newYorkOdt);
        System.out.println("sec1=" + seoulOffset.get(ChronoField.OFFSET_SECONDS));
        System.out.println("sec2=" + newYorkOffset.get(ChronoField.OFFSET_SECONDS));

        int diffHours = Math.abs(seoulOffset.get(ChronoField.OFFSET_SECONDS) - newYorkOffset.get(ChronoField.OFFSET_SECONDS)) / (60 * 60);

        System.out.println("diff=" + diffHours + " hrs");
    }
}
