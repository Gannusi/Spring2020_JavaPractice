package day21_MultiDimensionalArrays;

import homework.ReplIt.Array;

import java.util.Arrays;

public class StringMethods {


    public static void main(String[] args) {

        String name = "java";// 'j' 'a' 'v' 'a'

        char[] chars = name.toCharArray();

        System.out.println(chars[0]);
        System.out.println(chars[3]);


        //Split

        String str= "I like Java";
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));

        /*
        revers sentence: great day is today
         */

        String sentence = "Today is great day";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        String result="";

        for (int i = words.length-1; i>=0; i--){

            String eachWord = words[i];

            //System.out.print(eachWord+" ");
            result+=eachWord+" ";

        }
        System.out.println(result);





    }
}
