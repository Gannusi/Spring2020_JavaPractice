package day20_ArraysContinue;

import java.util.Arrays;

public class ArraySorting {


    public static void main(String[] args) {

        int[ ] arr1 ={98, 811, 42, 622, 765, 42, 334, 2567, 177};

        Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1));

        System.out.println("First min number is: "+arr1[0]);
        System.out.println("Second min number is: "+arr1[1]);

        System.out.println("First max num is: "+arr1[arr1.length-1]);
        System.out.println("Second max num is: "+arr1[arr1.length-2]);

        char[] ch ={'Z', 'D', 'W', 'Y','A', 'B','E', 'D'};
        Arrays.sort(ch);

        System.out.println(Arrays.toString(ch));

        String [] names = {"Hanna", "Paul", "Love", "Sasha","Attractive"};

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        System.out.println("=================================================================");


        int[] arr= {122, 23, 311, 400, -500, 68, 7};

        Arrays.sort(arr);

        int[] arrDesc =new int[arr.length];

        System.out.println(Arrays.toString(arr));

        int j = 0;

        for(int i = arr.length -1;  i >= 0; i--){
            // System.out.print( arr[i] +" ");
            arrDesc[j]  = arr[i];

            j++;
        }


        System.out.println(Arrays.toString(arrDesc));



    }
}
