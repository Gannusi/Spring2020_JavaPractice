package Office_Hours.Practice_04_22_2020;

import java.util.Arrays;

public class return_method2 {


    public static void main(String[] args) {

        int[] arr = {100,40, 500, 50, 30, 400, -5 , -100};


        Arrays.sort(arr);

        System.out.println( Arrays.toString(arr));
        int lastIndexNum = arr.length-1;
        int secondLastIndexNum = lastIndexNum - 1; // arr.length -2
        //                        arr.length-1-1 = arr.length -2

        int secondMaximum = arr[secondLastIndexNum];


        System.out.println(secondMaximum);


        int[] arr2 = { 198,294740,93820,18273,982};

        int num2 = secondMax(arr2);

        System.out.println(num2);



    }


    public static int secondMax(int[] arr){
        Arrays.sort(arr);

        System.out.println( Arrays.toString(arr));
        int lastIndexNum = arr.length-1;
        int secondLastIndexNum = lastIndexNum - 1; // arr.length -2
        //                        arr.length-1-1 = arr.length -2

        int secondMaximum = arr[secondLastIndexNum];

        return secondMaximum;

    }

}