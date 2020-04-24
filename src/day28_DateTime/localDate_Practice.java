package day28_DateTime;

import java.time.LocalDate;

public class localDate_Practice {

    public static void main(String[] args) {
        String[] friends = {"Jonh", "Aaron", "Daniel"};

        LocalDate JBirthday = LocalDate.of(2020,3,5);
        LocalDate ABirthday = LocalDate.of(2000,10,12);
        LocalDate DBirthday = LocalDate.of(2010,5,6);

        LocalDate [] birthdays = {JBirthday, ABirthday, DBirthday};


       for(int i =0; i <friends.length;i++){

          String name =  friends[i];
          LocalDate bd = birthdays[i];
           System.out.println(name+"'s birthday is " +bd);


       };


    }
}
