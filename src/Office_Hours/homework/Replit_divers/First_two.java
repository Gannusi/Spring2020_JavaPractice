package Office_Hours.homework.Replit_divers;


import java.util.Arrays;

public class First_two {
/*
Given an int array of any length, print a new array of its first 2 elements.
If the array is smaller than length 2, use whatever elements are present.

Example:
input 1, 2, 3
output: [1, 2]

Example:
input 1,
output: [1]
 */
public static void main(String[] args) {

    int [] num={1,2,3};
    int [] num1 = new int[2];//0,0

     String u = "";


       if(num.length>=2 ){
        num1[0]=num[0];//0 =  1 get
        num1[1]= num[1];
        u+=num1[0]+" "+num1[1]; //1 2
        System.out.println(Arrays.toString(num1)); //[1,2]

    }else{
         u+=num[0]; //1
        System.out.println(Arrays.toString(num));//1
    }
  // System.out.println(u);







}

}
