package day20_ArraysContinue;

import java.util.Arrays;

public class Sort2 {

    public static void main(String[] args) {
        int[] arr = {3,1,4,-1,100, -100, 200, 155};
        int[] arrDesc = new int[arr.length];  //[0, 0, 0, 0, 0, 0, 0, 0]
        // index:0, 1, 2, 3, 4, 5, 6, 7

        Arrays.sort(arr); // [-100, -1, 1, 3, 4, 100, 155, 200]
        // index:   0    1  2  3  4  5     6    7
        int k = 0;
        for(int i = arr.length-1; i >= 0; i-- ){
            arrDesc[k] =  arr[i];
            k++;
        }

        System.out.println(  Arrays.toString(arrDesc)  );




    }
}
