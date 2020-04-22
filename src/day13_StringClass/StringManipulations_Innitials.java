package day13_StringClass;

import java.util.Scanner;
/*
Assignment:
            write me a program that asks the user first and last names, then prints the initials.
            ex: input:
                    cybertek
                    school
                output:
                    CS
 */
public class StringManipulations_Innitials {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name ");
        String firstName = scan.nextLine();
        firstName= firstName.substring(0,1).toUpperCase();

        System.out.println("Enter your last name ");
        String lastName = scan.nextLine();
        lastName=lastName.substring(0,1).toUpperCase();

        System.out.println("Your Initials are: "+
                firstName + lastName);



        System.out.println("Enter your full name ");
        String fullName = scan.nextLine();
        String firstName1= fullName.substring(0,1).toUpperCase();
        String lastName1 = fullName.substring(fullName.indexOf(" ")+1, fullName.indexOf(" ")+2).toUpperCase();
        System.out.println("Your initials are: "+firstName+lastName);





        Scanner s = new Scanner(System.in);
        System.out.println("Enter two words");
        String word1 = s.next();
        String word2 = s.next();
        String result = word1.substring(1).concat(word2.substring(1));
        System.out.println(result);
    }
}


