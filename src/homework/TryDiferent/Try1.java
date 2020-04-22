package homework.TryDiferent;

import java.util.Arrays;

public class Try1 {

    public static void main(String[] args) {
        //combine numbers from 2 arrays

            int[] arr1 = {1, 2, 3};
            int[] arr2 = {4, 5, 6, 7};
            int[] arr3 = new int[arr1.length + arr2.length];
            for (int i=0; i <= arr1.length || i <= arr2.length; i++ ){
                if(i <= arr1.length-1) {
                    arr3[i] = arr1[i];
                }
                if (i <= arr2.length-1){
                    arr3 [arr2.length-1+i] = arr2[i];
                }
            }
            String arr = Arrays.toString(arr3);
            System.out.println(arr);
    }
}
