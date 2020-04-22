package day22_Arrays_Loop;

import day21_MultiDimensionalArrays.ScrumTeam;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerWithArrays_bannanaBan {

/*
    Task02:
        1. Write a program that will take five Strings and save them into an array called arr.
        2. use for each loop to print out the first three letter of each element of arr, one per line. You can assume that every element of arr is at least 3 letters long.
            Example:
                arr -> ["apple", "banana"]
                prints: app
                        ban

we need ; Array, scanner, foe loop, for each loop, substring
Dabaw
Xaxae
Zazar
Nanat
fafay

 */
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);


        String[] arr= new String[5];

        for(int i = 0; i< arr.length; i++ ){

            arr[i]= s.next();
        }
        System.out.println(Arrays.toString(arr));

        for( String each :arr){

          // String str= each.substring(0,3); //first 3

            String str = each.charAt(0) +""+ each.charAt(each.length()-1);//first and last character
            System.out.println(str);

        }




    }
}
