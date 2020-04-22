package day12_JavaRecap;

import java.util.Scanner;

public class SalaryCalculator {


    public static void main(String[] args) {

/*
        ask the user enter salaray
        ask the user enter full name
        ask the user to enter company name
        ask the user to enter SSN
        ask the user to enter JobTitle
     */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        double salary = input.nextDouble();

        input.nextLine();

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();



        System.out.println("Enter company name: ");
        String companyName= input.nextLine();



        System.out.println("Enter your SSN: ");
        long ssn = input.nextLong();

        input.nextLine();


        System.out.println("Enter your JobTitle: ");
        String jobTitle= input.nextLine();

        String result= "Full name is: "+fullName+"\nJob title: "+jobTitle+"\nCompany name: "+companyName+"\nSSN: "+ssn+"\nSalary is: $"+salary;

        System.out.println(result);







    }
}
