package day10_Siwtch_Scanner.WarmUp;


import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

        Scanner strawberry = new Scanner(System.in);

        System.out.println("Enter a byte number: ");

        byte num1 = strawberry.nextByte();

        System.out.println("You have entered "+ num1);

        if(num1 %2==0 ){
            System.out.println(num1 +" is even number");
        }else {
            System.out.println(num1 +" is odd number");
        }





    }


}
