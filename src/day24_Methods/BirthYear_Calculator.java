package day24_Methods;

import org.omg.CORBA.DynAnyPackage.Invalid;

import java.util.Scanner;

public class BirthYear_Calculator {


    public static void Age(int birthYear) {
        Scanner s = new Scanner(System.in );
        System.out.println("Enter the current year");
        int currentYear = s.nextInt();


        int age = currentYear-birthYear;


        if(age >0 && birthYear > 1900){
            System.out.println(age);
        }else{
            System.out.println("Invalid ");
        }
    }

    public static void main(String[] args) {
        //int a=2002;
        Age(2000);// or Age(2002);
        printHelloCybertek();
    }

    public static void printHello() {
        System.out.println("Hello");

    }

    public static void printCybertek() {
        System.out.println("Cybertek");

    }

    public static void printHelloCybertek() {
        printHello();// Hello
        printCybertek();//Cybertek
    }


}
