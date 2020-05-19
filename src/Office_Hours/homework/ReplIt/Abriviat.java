package Office_Hours.homework.ReplIt;

import java.util.Scanner;

public class Abriviat {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();


        ////////////// # 65
        /*
        You have a word, do the following:

          If the word has odd number of characters
          and has 5 or more characters, print the middle three
            characters of the word.

              Otherwise print "invalid".
         */
        /*int numOfCharacters=word.length();
        String middle="";
        middle=(numOfCharacters%2!=0 && numOfCharacters>=5) ?
                middle+=word.substring(numOfCharacters/2-1,
                        numOfCharacters/2+2):"invalid";

        System.out.println(middle);
*/



        /////////////64
        /*
        You have a word, do the following:

1. When word has odd number of characters and:
            - 3 or more characters, print middle letter
      oak ==> a
      javav ==> v
             - Single character, print that character 3 times
      # ==> ###
      q ==> qqq

2. When word has even number of characters and:
           - 4 or more characters, print middle 2
     java ==> av
     apples ==> pl
     #$%^&* ==> %^
           - 2 characters, print those 2 characters twice
      @@ ==>@@@@
      $$ ==>$$$$
         */
        int numOfCharacters=word.length();
        String middle="";
        if(numOfCharacters%2!=0 && numOfCharacters>=3){
            middle=""+word.charAt(numOfCharacters/2);
            System.out.print(middle);
        }else if(numOfCharacters==1){
            middle=""+word.charAt(0);
            System.out.print(middle+middle+middle);
        }else if(numOfCharacters%2==0 && numOfCharacters>=4){
            middle+=word.substring(numOfCharacters/2-1,numOfCharacters/2+1);
            System.out.print(middle);
        }else if (numOfCharacters==2){
            middle+=word.substring(0,2);
            System.out.print(middle+middle);
        }
    }
}
