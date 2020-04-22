package homework;
import java.util.*;
public class Slice {


        public static void main(String[] args) {
            //DO NOT CHANGE
            int num, digit, digit1, digit2, digit3, digit4, digit5;
            //WRITE YOUR CODE HERE
            Scanner hanna =new Scanner(System.in);
            System.out.println("Enter your number:");

            num=hanna.nextInt();

            digit =num/100000;
            digit1=(num%100000)/10000;
            digit2=(num%10000)/1000;
            digit3=(num%1000)/100;
            digit4=(num%100)/10;
            digit5=num%10;


            System.out.println(digit1);
            System.out.println(digit2);
            System.out.println(digit3);
            System.out.println(digit4);
            System.out.println(digit5);


        }

    public static class bbbbbbb {

        public static void main(String[] args) {

            boolean X = true;
            boolean Y = !X == false;
            boolean Z = Y;
            if (X) {
                System.out.println("Hello.....");
            }
            if (Y) {
                System.out.println("Today...");
                if (Z) {
                    System.out.println("WE are ...");
                }
            }


            boolean A = true, B = !A;
            if (A) {
                if (B) {
                    System.out.println("Mon");
                }else {
                    System.out.println("Tues");
                }
                } else {
                if (A) {
                    System.out.println("Thursday");
                } else {
                    System.out.println("Friday");
                }


            }
        }
    }
}

