package day10_Siwtch_Scanner.WarmUp;


import java.util.Scanner;

public class RateCalculator {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        int salary = scan.nextInt();

        System.out.println("Enter hours you work weekly: ");
        byte weeklyHours = scan.nextByte();

        System.out.println("How many weeks do you work in a year ?");
       byte numberofWeeks = scan.nextByte();

       int hourlyRate= (salary/ numberofWeeks)/ weeklyHours;
        System.out.println("Your hourly rate is: "+ hourlyRate);



    }
}
