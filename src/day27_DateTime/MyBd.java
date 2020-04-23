package day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MyBd {
    public static void main(String[] args) {
        LocalDate myBd = LocalDate.of(1997,12,29);
        DateTimeFormatter day = DateTimeFormatter.ofPattern("MMM/dd/yy");
        System.out.println(myBd.format(day));


        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EE MMM/dd/yy");

        LocalDate date2 = LocalDate.of(1993,07,14);
        String str1 = date2.format(dtf2);

        System.out.println(str1);

        LocalDate date3 = LocalDate.now();
        System.out.println(date3.format(dtf2));






    }
}
