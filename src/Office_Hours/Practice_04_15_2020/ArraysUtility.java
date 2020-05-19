package Office_Hours.Practice_04_15_2020;

import java.util.Arrays;

public class ArraysUtility {


    public static void main(String[] args) {
        /*
        Arrays.sort();
        Arrays.equal();
        Arrays.toString();

        Arrays.deepToString();

         */
        int [ ] arr= {9, 8, 74, 62, 53, 44, 322, 2};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] saleries ={10000, 2000, 300 , 400, 500, 6758, 1234};
        int length =saleries.length;
        int lastIndex =length-1;
        Arrays.sort(saleries);

        System.out.println(Arrays.toString(saleries));

        System.out.println("Minimum salary "+saleries[0]);
        System.out.println("Maximum salary "+saleries[lastIndex]);

        System.out.println("===================================");


        int[] arr1={1, 2, 3};
        int[] arr2={2, 1, 3};

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.equals(arr1,arr2));




    }
}
