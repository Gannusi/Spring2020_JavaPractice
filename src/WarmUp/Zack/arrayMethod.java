package WarmUp.Zack;

import java.util.Arrays;

public class arrayMethod {

    public static void main(String[] args) {
        int[] arr = {4,8,58,4,6,3};
        System.out.println(Arrays.toString( reversArrays(arr) ));
        int[] newArrayForRevers =   reversArrays(arr);
        System.out.println(Arrays.toString(newArrayForRevers));
        System.out.println("==============================");
        String[] arr1 = {"Anya", "learning", "Java"};
        System.out.println( Arrays.toString(  reversArrays( arr1  )   ) );
    }




    public static int[]    reversArrays(int[] arr){
        int[] reversResult = new int[arr.length];
        int a=0;
        for (int i = arr.length-1; i>=0; i-- ){
            reversResult[a]=arr[i];
            a++;
        }// for loop
        return reversResult;
       }  //method
    public static String[] reversArrays(String[] arr){
        return arr;
    }
}
