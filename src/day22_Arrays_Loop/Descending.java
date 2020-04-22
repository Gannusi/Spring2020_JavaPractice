package day22_Arrays_Loop;

import java.util.Arrays;
import java.util.jar.JarOutputStream;

public class Descending {
/*
 2. write a program that sort the array in descending order
 */
    public static void main(String[] args) {

        int[] arr ={10, 2, -34, 100, 29, 3};
        Arrays.sort(arr);// sort in ascending

        System.out.println(Arrays.toString(arr));

        int[] RevArr = new int[arr.length];



        int j = arr.length-1;

        for (int i= 0; i<arr.length; i++){// -34, 2, 3, 10, 29, 100 (1,2,3,4,5) i++


            RevArr[i]= arr [j];//for this to work declear new int j
            j--;//100, 29, 10, 3, 2, -34 (5,4,3,2,1) j--
        }
        System.out.println(Arrays.toString(RevArr));






    }
}
