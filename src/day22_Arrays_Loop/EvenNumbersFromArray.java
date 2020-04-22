package day22_Arrays_Loop;

import java.util.Arrays;

/*
Task01:
        1. create an int array called numbers that has length of 100
        2. assign 1~100 to the array' each indexes
        3. use for each loop to rpint out all the even numbers.
                MUst use continue statement

 */
public class EvenNumbersFromArray {

    public static void main(String[] args) {


        int [] num = new int[100]; // index:0~99,
        System.out.println(Arrays.toString(num));// [0,0,0,0,0,0,0,0,0,0....]


     /*   num[0]=1;
        num[1]=2;
        //this step is gonna continue till 99

      */

           for(int i=0; i< 100; i++){

               num[i]= i+1;

           }
        System.out.println(Arrays.toString(num));


           for( int each : num ){

               if(each%2 !=0 ) {
                   continue;

               }

                   System.out.print(each + " ");



           }











    }
}
