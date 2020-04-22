package day17_WhileLoops;

import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        for (int i=0; i==0;) {

            System.out.println("Enter first number ");
            int num1 = s.nextInt();

            System.out.println("Enter second number ");
            int num2 = s.nextInt();

            System.out.println("Math operator: ");
            //char operator = s.next().charAt(0);// +, -, *, /, *.
            String operator = s.next();

            if (operator.equals("+")) {
                System.out.println("Audition is: " + (num1 + num2));

            } else if (operator.equals("-")) {
                System.out.println("Subtraction is: " + (num1 - num2));

            } else if (operator.equals("*")) {
                System.out.println("Multiplication is: " + (num1 * num2));

            } else if (operator.equals("/")) {
                System.out.println("Division is: " + (num1 / num2));

            } else if (operator.equals("%")) {
                System.out.println("Remainder is: " + (num1 % num2));

            } else {
                System.out.println(" Invalid Operator");
            }



            System.out.println("Do you wanna continue?");
            String answer = s.next();

            if (answer.equalsIgnoreCase("no")){
                System.out.println("Thank you for using the calculator!");
                break;
            }

        }



    }
}
