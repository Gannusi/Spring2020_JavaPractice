package day22_Arrays_Loop;

import java.util.Arrays;

public class Nested_ForEach_Practice {


    public static void main(String[] args) {

        int[][] numbers = {
                {1,2,3},
                {4,5,6,7,8,9},
                {10,11,12,13,14},
                {15,16,17,18,19,20,21}
        };
        // 1. print all even numbers ina same line
        // 2. count odd numbers ==> return the total odd number


        int countOdd=0;
        int sumOdd=0;
        int sumEven=0;



        for( int[] eachIndex : numbers){
            //System.out.println(Arrays.toString(eachIndex));//[1, 2, 3][4, 5, 6, 7, 8, 9][10, 11, 12, 13, 14][15, 16, 17, 18, 19, 20, 21]

          for (int eachElements : eachIndex){
             // System.out.print(eachElements);//123456789101112131415161718192021

              if (eachElements%2==0){
                  System.out.print(eachElements+" ");
                  sumEven+=eachElements;

              }else{
                  sumOdd+= eachElements;

               countOdd++;

              }
          }

        }

        System.out.println();
        System.out.println(countOdd);
        System.out.println("sum of even "+sumEven);
        System.out.println("sum of odd "+sumOdd);





    }
}
