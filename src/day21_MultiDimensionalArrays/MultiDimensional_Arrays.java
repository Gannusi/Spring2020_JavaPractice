package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDimensional_Arrays {

    public static void main(String[] args) {

        int [] arr= {1, 2, 3};

        int [][] arr2D= {  {1, 2, 3}, {10, 20, 30,40}  };
                 //            0            1
        System.out.println(arr2D.length);



       int[ ] arr1D= arr2D[0];

        System.out.println(Arrays.toString(arr1D));


       int num1= arr2D[1][3];
        System.out.println(num1);

        char[] [] ch2D= {  {'a','b', 'c'}, {'A', 'B', 'C'}, {'D', 'E', 'F'}   };
        //           #0       0,1,2      # 1     0,1,2      #3   0,1,2

        char ch1=ch2D[1] [0];
        System.out.println(ch1);

       char[] ch2 =  ch2D[2];
        System.out.println(Arrays.toString(ch2));












    }
}
