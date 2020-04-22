package day14_StringClass;



/*Ask user to enter two words. Print first word without its first character then print the second word without its first character.
        Input:
        apple
        banana
        Output:
        ppleanana

 */

import java.util.Scanner;

public class CombineTwoString2 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter two words");
        String word1 = s.next();
        String word2 = s.next();

        word1=word1.substring(1, word1.length());

        word2=word2.substring(1, word2.length());

        String result = word1.concat(word2);
        System.out.println(result);



    }
}
