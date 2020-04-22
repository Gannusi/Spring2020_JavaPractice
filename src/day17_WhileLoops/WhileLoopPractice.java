package day17_WhileLoops;

import java.util.Scanner;

public class WhileLoopPractice {


    public static void main(String[] args) {

        /*
         ask the user to enter yes or no

         if the user enter something else , repeat the previous question
         */

        Scanner s = new Scanner(System.in);

        System.out.println("Enter Yes or No");

        String word = s.next();



        boolean valid =word.equalsIgnoreCase("yes ")|| word.equalsIgnoreCase("no");

        while (!valid){
            System.out.println("please re-enter");
            word = s.next();

            if(word.equalsIgnoreCase("yes ")|| word.equalsIgnoreCase("No")){
                break;
            }

        }


        if( word.equalsIgnoreCase("yes")){
            System.out.println("Entered Yes");

        }

        if(word.equalsIgnoreCase("No")){

            System.out.println("Entered No");
        }







    }
}
