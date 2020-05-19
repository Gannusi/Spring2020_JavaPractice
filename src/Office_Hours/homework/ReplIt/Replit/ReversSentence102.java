package Office_Hours.homework.ReplIt.Replit;

import java.util.Scanner;

public class ReversSentence102 {


    public static void main(String[] args) {



        // revers , use for each loop
        String sentence = "I like Java";

        String[]  words = sentence.split(" "); // [ I, like, Java]

        for (String eachWord: words){ // 0 ~2
            System.out.println(eachWord);
        }
        System.out.println("=====================================");

        for(int i = words.length-1; i>=0; i--){
            System.out.println(words[i]);


        }

        Scanner input = new Scanner(System.in);
        String sentence2 = input.nextLine();

        String reversed = "";
        //TODO: start your code here
        String[] word= sentence2.split(" ");
        for(int i = word.length-1; i>=0; i--){

            reversed+=word[i]+" ";
        }
        reversed=reversed.substring(0,reversed.length()-1);



        //End your code here. do not modify below statement
        System.out.println(reversed);

    }
}
