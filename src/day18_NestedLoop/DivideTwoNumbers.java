package day18_NestedLoop;

public class DivideTwoNumbers {


    public static void main(String[] args) {

        /*
         write a program that can divide two numbers.
			NOTE: DO NOT USE division, multiplication, or module operators

         */

        int a =20;
        int b = 10;

        if (b == 0) {
            System.out.println("Divisor cannot be ero");
            System.exit(0);
        }

        int count= 0;//count execution fo the loop

        while (a >= b ){
            a-= b;
            count++;

        }
        if(a==0) {
            System.out.println("The result is " + count);
        }else{
            System.out.println("Result is "+ count+" with a remainder of "+a);
        }




    }
}
