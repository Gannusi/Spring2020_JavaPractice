package Resources;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {

     // Sort
    public static int[] sortDescending(int[] arr){
        Arrays.sort(arr);  // {1,2,3,4};  ==> {4,3,2,1};
        int[] RevArr = new int[arr.length] ;

        int j = arr.length-1;
        for(int i =0; i < arr.length; i++ ){
            RevArr[i] = arr[j];
            j--;
        }

        return RevArr;

    }

    //reverse

    public static String Reverse(String str){  // can reverse a string and returns string
        String Reverse = "";

        for(int i = str.length()-1; i >= 0; i-- ){
            Reverse  += str.charAt(i);
        }

        return  Reverse;
    }


    // remove duplicates from string

    public static String RemoveDuplicates(String str){
        String result =  "";      //AB

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i); //B
            if( !result.contains(""+ch) ){
                result += ch;
            }

        }

        return result;
    }



    // int Frequency
    public  static  int Frequency(String str1, String str2){

        int count = 0;
        while(str1.contains(str2)){
            count++;
            str1=str1.replaceFirst(str2, "");
        }

        return count;

    }


       //FrequencyOfChars
    public static String FrequencyOfChars (String str){

        String NonDup =   Library.RemoveDuplicates(str);

        String result = "";

        for (int i =0; i<NonDup.length();i++) {
            String ch = "" + NonDup.charAt(i);
            int num = Library.Frequency(str, ch);
            result+=ch+num;
        }
        return result;
    }



    public static int max(ArrayList<Integer> list){//returns max number from ArrayList
        int max = list.get(0);
        for( int i =0; i< list.size(); i++){

            if(list.get(i)>max){

                max= list.get(i);

            }
        }
        return max;


    }
    // Frequency of string

    // merge two array and return third one

    // max number from array

    // min number from array





}
