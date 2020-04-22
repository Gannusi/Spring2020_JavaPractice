package day15_ForLoop;

import java.util.Scanner;

public class Initials {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your first and last name");
        String full = s.nextLine();


        String firstName1= full.substring(0,1).toUpperCase();
        String lastName1 = full.substring(full.indexOf(" ")+1, full.indexOf(" ")+2).toUpperCase();
        System.out.println("Your initials are: "+firstName1+lastName1);



        System.out.println("================================#2===============================");



        System.out.println("Enter your first name ");
        String firstName = s.next();
        firstName= firstName.substring(0,1).toUpperCase();

        System.out.println("Enter your last name ");
        String lastName = s.next();
        lastName=lastName.substring(0,1).toUpperCase();

        System.out.println("Your Initials are: "+
                firstName + lastName);

        System.out.println("==========================#3============================");


        String initials =""+ firstName.charAt(0)+ lastName.charAt(0);
        initials= initials.toUpperCase();
        System.out.println("Your Initials are: "+initials);





    }
}
