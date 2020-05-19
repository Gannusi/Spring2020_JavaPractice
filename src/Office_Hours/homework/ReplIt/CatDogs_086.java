package Office_Hours.homework.ReplIt;

import java.util.Scanner;

public class CatDogs_086 {
/*
Print true if the string "cat" and "dog" appear
the same number of times in the given string word.

Example:
input: catdog
output: true

Example:
input: catcat
output: false

Example:
input: cat-cheetah-dog-cat
output: false
 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();

       /* if(word.contains("catdog") || word.contains("dogcat")){
            System.out.println(true);

        }else{
            System.out.println(false);
        }


        */

       while(word.contains("cat") || word.contains("dog")) {
           if (word.contains("cat")) {
               word = word.replace("cat", "");
               countOfCats++;


           } else if (word.contains("dog")) {
               word = word.replace("dog", "");
               countOfDogs++;

           }
       }

       if (countOfCats==countOfDogs){
           System.out.println(true);

       }else{
           System.out.println(false);
       }












    }
}
