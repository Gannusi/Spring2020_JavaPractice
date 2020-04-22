package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_NextLine_Practice {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your building number: ");
        int BuildN= input.nextInt();

       // System.out.println("Building number is: "+BuildN);

        input.nextLine();

        System.out.println("Enter the street : " );
        String street = input.nextLine();

       // System.out.println("Street Is: "+street);

        System.out.println("Enter the zip code: ");
        int zip = input.nextInt();


        input.nextLine();

        System.out.println("Enter your city name and state separated by come and space: ");
        String cityState = input.nextLine();
        String fullAddress = BuildN+" "+street+", \n"+cityState+" "+zip;

        System.out.println(fullAddress);








    }
}
