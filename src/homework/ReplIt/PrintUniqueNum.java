package homework.ReplIt;

import java.util.Scanner;

public class PrintUniqueNum {
/*
Given an array nums with 7 integers every element
is repeated twice - except one. Find that element and print it to console.

Example:

nums -> [1, 1, 2, 3, 4, 3, 4]
         2

 */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {1, 1, 2, 3, 4, 3, 4};


        int count = 0;

        for (int i = 0; i < nums.length ; i++) {

            for (int j = 0; j < nums.length ; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(nums[i]);
                break;
            }
            count=0;
        }

        System.out.println();

        char[] ch ={'L','A','J', 'A', 'J'};

        char el =0;

        for( char i= 0; i<ch.length; i++){

            for(char q =0; q< ch.length;q++){
                if(ch[i] == ch[q]){
                    el++;
                }

            }
            if(el!=2){
                System.out.println(ch[i]);
            }

            el=0;


        }





    }
}
