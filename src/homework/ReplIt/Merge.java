package homework.ReplIt;

import javax.print.DocFlavor;
import java.util.Scanner;

public class Merge {


    public static void main(String[] args) {
//    #66
       Scanner s = new Scanner(System.in);
        String word1 = s.next();
        String word2 = s.next();
        String word = s.next();
        //YOUR CODE HERE


        String merge="";
        if(word1.length()==3 && word2.length()==3){
            merge+=""+word1.charAt(0)+word2.charAt(0)
                    +word1.charAt(1)+word2.charAt(1)
                    +word1.charAt(2)+word2.charAt(2);
        }else{
            merge="cannot merge";
        }
        System.out.print(merge);



        ////////////// # 65
        /*
        You have a word, do the following:

          If the word has odd number of characters
          and has 5 or more characters, print the middle three
            characters of the word.

              Otherwise print "invalid".
         */
        int numOfCharacters=word.length();
        String middle="";
        middle=(numOfCharacters%2!=0 && numOfCharacters>=5) ? middle+=word.substring(numOfCharacters/2-1,numOfCharacters/2+2):"invalid";

        System.out.println(middle);





    }
}
