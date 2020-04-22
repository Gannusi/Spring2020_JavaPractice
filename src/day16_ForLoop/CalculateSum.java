package day16_ForLoop;


import java.util.Scanner;

/*
write a program that can calculate the sum of all numbers between 1 to any given number
		ex:
			input: 100
			output: 5050
			input: 50
			output: 1275
			input : 200
			output : 20100
 */
public class CalculateSum {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number");

        int  num = s.nextInt();//100

        int sum =0;



        for(int q = 1; q<= num; q++){
            sum+=q;

        }
        System.out.println(sum);






    }
}
