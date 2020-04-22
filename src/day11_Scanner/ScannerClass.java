package day11_Scanner;

import java.util.Scanner;

public class ScannerClass {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a long number");
        long a  = scan.nextLong();
        System.out.println("You have entered: "+a);


        System.out.println("Enter a desimal: ");
        long b = (long)scan.nextFloat();

        System.out.println("You have entered: "+b);


        System.out.println("enter a decimal number: ");
        double f = scan.nextDouble();

        System.out.println("You have entered: "+f);

        System.out.println("Enter true or false: ");
        boolean bool = scan.nextBoolean();

        System.out.println(bool);

        System.out.println("Enter your sentence: ");

        String str =  scan.next();

        System.out.println("You have entered: "+str);






    }
}
