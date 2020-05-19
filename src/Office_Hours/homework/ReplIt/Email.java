package Office_Hours.homework.ReplIt;

import java.util.Scanner;

public class Email {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        if (email.contains("_")) {
            String firstname = "" + email.substring(email.indexOf("_") + 1, email.indexOf("@"));
            String lastname = "" + email.substring(0, email.indexOf("_"));
            System.out.println(firstname + "_" + lastname + "@gmail.com");
        } else {
            System.out.println(email);
        }

    }
}


