package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopPractice {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        while (true) {
            System.out.println("Enter two numbers");

            int num1 = s.nextInt();
            int num2 = s.nextInt();

            System.out.println("Addition of two numbers: " + (num1 + num2));

            System.out.println("Do you wanna continue?");
            String answer = s.next();
            if(! (answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("No"))){
                System.out.println("Invalid entry, please re enter two numbers");
            }

            if (answer.equalsIgnoreCase("No")){
                System.out.println("Thank you for using calculator");
                break;
            }


              /*
    Assignment:
    write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
                should ask which bedroom do you wanna reserve
                    if user provided invalid entry => please re-enter
                    calculate the total price
                do you want to reserve another room:
                            if yes ==> repeat the previous steps
                            if no ==> your total price is: $$$
                            if answer either yes or no ==> please re-enter
     */


        }



    }
}
