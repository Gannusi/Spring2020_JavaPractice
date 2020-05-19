package Office_Hours.homework.ReplIt;

import java.util.Scanner;

public class forLoop2 {


    public static void main(String[] args) {

        /* #for loop count down to 0
        use a for loop to print numbers from 100 to 0

               example:
                     100
                      99
                      98
                       ...
                       3
                       2
                       1
         */
        int i=1;

        for (i=100;i>=1;i--){

            System.out.println(i);
        }


        System.out.print("");

        /*67
      Write a program that will reverse a string.
      Your program should reverse a string only 5 characters long.
      If word is shorter, display message: "Too short!".
      If word is longer, display message: "Too long!".
      Otherwise, reverse this word and print out result into the console.
         */
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String reverse="";
        int maxIndex=word.length()-1;
        if(word.length()>5){
            reverse="Too long!";
        }else if (word.length()<5){
            reverse = "Too short";

        }else{

            for (int q =maxIndex; q>=0; q-=1){
                reverse+=""+word.charAt(q);
            }
        }

        System.out.println(reverse);
    }
}



