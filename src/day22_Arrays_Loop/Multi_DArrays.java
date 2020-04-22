package day22_Arrays_Loop;

import java.util.Arrays;

public class Multi_DArrays {


    public static void main(String[] args) {

        int[] arr= {1, 2, 3};
                //  0  1  2

        //n dimensional array contains (n-1) dimensional  arrays
        //  2D arrays : [index num of 1D array ] [ index num of element]

                     ////    0  1  2
        int [][] arr2D = {  {1, 2, 3}, {4,5,6}  };
                    /////       0

       int[] arr1D =  arr2D[0];

        System.out.println(Arrays.toString(arr1D));
        System.out.println(Arrays.toString(arr2D[0]));//single dimension

        System.out.println(arr2D[0][2]);// single element
        System.out.println(Arrays.deepToString(arr2D));

        System.out.println(Arrays.toString(arr2D[1]));


        for ( int eachElement : arr2D[0]){
            System.out.println(eachElement);
        }
        for(int i=0; i<arr2D[0].length;i++){
           int num= arr2D[0][i];

            System.out.println(num);
        }




    }
}
