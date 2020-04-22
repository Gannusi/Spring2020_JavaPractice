package day17_WhileLoops;

import java.util.Scanner;

public class ForLoop_MaxAndMin {

/*
1. write a program that can ask the user "enter a number"
five times and return the maximum number
hint: you will nedd for loop and if statement

2. write a program that can ask the user "enter a number"
 five times and return the minimum number
hint: you will nedd for loop and if statement

 */
    public static void main(String[] args) {

        Scanner s = new Scanner( System.in);

        int MaxNum= -1999999999;
        int MinNum = 1999999999;


        for (int i = 1; i<=10;i++){
            System.out.println("Enter a number");
            int num = s.nextInt();


            if(num>MaxNum){
                MaxNum=num;

            }

            if (num< MinNum){
                MinNum= num;
            }

        }
        System.out.println("Max number is "+MaxNum);
        System.out.println("Minimum number is "+MinNum);





    }
}
