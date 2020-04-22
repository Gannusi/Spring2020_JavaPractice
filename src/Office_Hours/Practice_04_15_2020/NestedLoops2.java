package Office_Hours.Practice_04_15_2020;

import java.util.Arrays;

public class NestedLoops2 {


    public static void main(String[] args) {

        int[][]  numbers = {
                {5,4,3,2,1},
                {10,11,12,13,14,15},
                {16,17,18,19,20},
        };


        for (int q =0; q < numbers.length; q++){


            for (int i =0; i< numbers[q].length; i++){

                if(numbers[q][i]% 2 !=0){
                    continue;
                }


                System.out.println(numbers[q][i]);
            }


        }


        System.out.println("===========================================");


        for (int[] eachNum1DArray : numbers){

           // System.out.println(Arrays.toString(eachNum1DArray));
            // to print[5, 4, 3, 2, 1]
            //[10, 11, 12, 13, 14, 15]
            //[16, 17, 18, 19, 20]
            for (int eachElement : eachNum1DArray){

                //System.out.println(eachElement);// to print every single element 1, 2, 3, 4, 5,6, 7, 8 ....
                if(eachElement % 2 != 0){
                    continue;


                }
                System.out.println(eachElement);//to print all the even (eachElement % 2 == 0) --odd num
            }

        }








    }
}
