package homework.ReplIt;

import java.util.Scanner;

public class ReturnNumber090 {

/*
Return the number of times that the string "java" appears anywhere in the given string word.



Example:
input: javaxjava
output: 2

Example:
input: javaxjavaapplepearjavaegg
output: 3
 */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in );
        String word = s.next();
        int count = 0;

        for(int i =0; i<=word.length()-1;i++){

            if (word.contains("java")){
                count++;

                word= word.replaceFirst("java", "");


            }

        }
        System.out.println(count);





    }
}
