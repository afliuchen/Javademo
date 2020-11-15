package Data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class format {
    public static void main(String[] args) {
        LocalDate date=LocalDate.of(2020,12,8);
        String s1=date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2=date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s2);
        System.out.println(s1);
        DateTimeFormatter italan=DateTimeFormatter.ofPattern("d.MMMM yyyy", Locale.ITALIAN);
        LocalDate localDate1=LocalDate.of(2014,3,18);
        String s3= date.format(italan);
        LocalDate date3=LocalDate.parse(s3,italan);
        System.out.println(date3);
    }
}
