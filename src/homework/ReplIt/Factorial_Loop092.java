package homework.ReplIt;

import java.util.Scanner;

public class Factorial_Loop092 {

/*
In mathematics, the factorial of a positive integer n, denoted by n!, is the product of all positive integers less than or equal to n.  Calculate factorial and output result to the console.

Example:
input: 5
output: 120



 */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();//3
        int result = 1;


        for(int i=n; i>0; i--){
           result *=i;   //54321| 1*5=5. 5*4=20. 20*3=60. 60*2=120. 120*1=120

        }

        System.out.println(result);


       /* for (int i = 0; i < 5; ++i ) {
        for(int q = n ; q <=5; ++q){
           result*=q;

        }
        System.out.println(result);


        */


    }
}
