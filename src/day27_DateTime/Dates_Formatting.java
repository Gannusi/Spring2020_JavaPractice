package day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formatting {

    public static void main(String[] args) {
        DateTimeFormatter dtf =DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDate date1 = LocalDate.now();
        System.out.println( date1.format((dtf)));
    }





}
