package Office_Hours2;

import Office_Hours.Practice_04_29_2020.Arraylist_Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class ReversElements {

    public static void main(String[] args) {

         /*
    3) Create a method that will accept an int array and
     reverse the order of elements. Return the reversed array.
    */

        int a[] = {1, 74, 6, 4};
        System.out.println(Arrays.toString(revers(a)));


        ArrayList<String> list = new ArrayList<>(Arrays.asList("Hanna", "Gannusia", "Best", "Girl"));
        System.out.println(LongestWord(list));

        System.out.println(reverseEachWord("Gannusia the best girl"));



    }

    public static int[] revers(int[] arr) {
        // 1, 3, 2, 4-> 4, 2, 3, 1
        //4, 2, 3, 1

        for (int i = 0; i < arr.length / 2; i++) {

            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        return arr;

    }


    public static ArrayList<Integer> revers(ArrayList<Integer> list) {
        ArrayList<Integer> rev = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {

            rev.add(list.get(i));

        }
        return rev;

    }

    public static String LongestWord(ArrayList<String> list) {


        String  biggest = "";
        for(String word:list){
            if(word.length()>biggest.length()){
                biggest=word;
            }
        }

        return biggest;

        /*
        String LongestWord = list.get(0);

        for (int i = 0; i < list.size(); i++) {

            if (LongestWord.length() < list.get(i).length()) {
                LongestWord = list.get(i);
            }
        }
        return LongestWord;

      */
    }

    public  static  String reverseEachWord(String str){

        String [] words = str.split(" ");
        System.out.println(Arrays.toString(words));
        String finalWord = "";

        for(String word: words) {

            finalWord += reverse(word)+ " ";

        }

        return finalWord;

    }

    // helper method

    public static String reverse (String word) {
        String rev = "";
        for(int i = word.length()-1; i >= 0; i--) {
            rev += word.charAt(i);
        }
        return rev;
    }

}
