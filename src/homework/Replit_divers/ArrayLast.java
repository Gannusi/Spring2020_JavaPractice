package homework.Replit_divers;

import java.util.Arrays;

public class ArrayLast {
/*
Given an int array, print a new array with double the length where
 its last element is the same as the original array,
 and all the other elements are 0. The original array will be length 1 or more.
 Note: by default, a new int array contains all 0's.

Example:
input: 4 5 6
output: [0, 0, 0, 0, 0, 6]

Example:
input: 0
output: [0, 0]

Example:
input: 1 2 3 4
output: [0, 0, 0, 0, 0, 0, 0, 4]
 */
    public static void main(String[] args) {
         int [] nums ={4,5,6};

         int[] num1 =new int[nums.length*2];//0,0,0,0,0,0

       // System.out.println(Arrays.toString(num1));
        num1[num1.length-1]=nums[nums.length-1];
        System.out.println(Arrays.toString(num1));

    }

}
