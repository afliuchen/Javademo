package Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;

public class datademo {
    public static void main(String[] args) {
        LocalDate date=LocalDate.of(2020,11,5);
        System.out.println(date);
        int year=date.getYear();
        System.out.println(year);
        int len=date.lengthOfMonth();
        System.out.println(len);
        LocalDate today=LocalDate.now();
        System.out.println(today);
        int year1=date.get(ChronoField.YEAR);
        System.out.println(year1);
        LocalTime time=LocalTime.of(12,56,52);
        System.out.println(time);
        LocalDateTime dateTime=LocalDateTime.of(2019, Month.SEPTEMBER,21,13,45,20);
        System.out.println(dateTime);
    }
}
