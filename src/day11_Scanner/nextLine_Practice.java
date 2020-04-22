package day11_Scanner;

import java.util.Scanner;

public class nextLine_Practice {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter your age: ");
        byte age = scan.nextByte();


        System.out.println("Your age is: "+age);

        scan.nextLine();


        System.out.println("Enter your  name: ");
        String fullName = scan.nextLine();

        System.out.println("Your full name is: "+fullName);



    }
}
