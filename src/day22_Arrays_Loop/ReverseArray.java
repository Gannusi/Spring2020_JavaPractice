package day22_Arrays_Loop;

import java.util.Arrays;

public class ReverseArray {

/*
1. write a program that can reverse the array
    2. write a program that sort the array in descending order
    3. write a program that can return the number of appearances of "java" and "python" anywhere in the sentence
                (it's similar to the task 97 in repl.it, But this time you MUST use arrays and for each loop)
    4. write a program that can count the even and odd number from an array of integers
                        MUST use for each loop
 */
    public static void main(String[] args) {

        int [] num ={1, 2, 3, 4, 5};//54321

       /* System.out.println(num[4]);
          System.out.println(num[3]);
          ...
         */

       for (int i = num.length-1;i>=0; i--){
           int Eachnum=num[i];
           System.out.println(Eachnum);
       }

        System.out.println("=======================================");

       int [] RevArr = new int [num.length];// [0,0,0,0,0]

        //   i++         j--
      /*  RevArr[0] =  num [4];
        RevArr[1] =  num [3];
        RevArr[2] =  num [2];
        RevArr[3] =  num [1];
        RevArr[4] =  num [0];

       */

        int j = num.length-1;
        for (int i= 0; i<num.length; i++){


            RevArr[i]= num [j];//for this to work declear new int j
            j--;
        }

        System.out.println(Arrays.toString(RevArr));











    }
}
