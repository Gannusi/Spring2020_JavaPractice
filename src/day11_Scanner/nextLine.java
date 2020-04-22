package day11_Scanner;

import java.util.Scanner;

public class nextLine {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();

        System.out.println("Your full name is: "+fullName);

        System.out.println("Enter your sentence: ");
        String sentence = scan.nextLine();

        System.out.println("You entered: "+sentence);









    }
}
