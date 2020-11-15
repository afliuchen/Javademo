package Data;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class datademo2 {
    public static void main(String[] args) {
        Duration duration=Duration.ofMinutes(3);
        System.out.println(duration);
        Duration duration1=Duration.of(3, ChronoUnit.MINUTES);
        System.out.println(duration1);
        LocalDate date=LocalDate.of(2020,3,5);
        LocalDate date1=date.withYear(2019);
        System.out.println(date1);

        LocalDate date2=LocalDate.of(2014,3,18);
        date2=date2.with(ChronoField.MONTH_OF_YEAR,9);
        date2=date2.plusYears(2);


        System.out.println(date2);

    }
}
