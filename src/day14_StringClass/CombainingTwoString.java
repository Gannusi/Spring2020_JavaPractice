package day14_StringClass;

import java.util.Scanner;
/*
Ask user to enter two words. Print the first word, second word, second word, first word
			Input:
				one
				two
			Output:
				onetwotwoone
					DO NOT USE + OPERATOR
 */

public class CombainingTwoString {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter two words");
        String word1 = s.next();
        String word2 = s.next();

      String result= word1.concat(" "+word2).concat(" "+word2).concat(" "+word1);
        System.out.println(result);


        /*
        Ask user to enter two words. Print first word without its first character then print the second word without its first character.
			Input:
				apple
				banana
			Output:
				ppleanana

         */










    }
}
