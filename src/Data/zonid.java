package Data;

import java.time.*;
import java.time.chrono.JapaneseDate;

public class zonid {
    public static void main(String[] args) {
        ZoneId zoneId=ZoneId.of("Europe/Rome");
        LocalDate date=LocalDate.of(2020,11,6);
        JapaneseDate japaneseDate=JapaneseDate.from(date);
        System.out.println(japaneseDate);
        ZonedDateTime zdt1=date.atStartOfDay(zoneId);
        System.out.println("zdt1:  "+zdt1);
        LocalDateTime dateTime = LocalDateTime.of(2014, Month.MARCH, 18,12,30);
        ZonedDateTime zdt2=dateTime.atZone(zoneId);
        System.out.println("zdt2:  "+zdt2);
        Instant instant=Instant.now();
        ZonedDateTime zdt3=instant.atZone(zoneId);
        System.out.println("zdt3:  "+zdt3);
    }
}
