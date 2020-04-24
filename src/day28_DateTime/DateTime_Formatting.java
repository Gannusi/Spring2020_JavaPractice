package day28_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTime_Formatting {

    public static void main(String[] args) {

        LocalDateTime datetime1 = LocalDateTime.of(2015,12,25,11,30,45);

        System.out.println( datetime1);

        //tue 12/25/2015 11:30

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a, EEEE");
        System.out.println(datetime1.format(dtf));






    }
}
