package homework.ReplIt;

import java.util.Scanner;

public class MethodArray145 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i <= size - 1; i++) {

            arr[i] = inp.nextInt();
        }

        plus_minus(arr);
    }//end main

    public static void plus_minus(int[] arr) {
        int plus = 0;
        int minus = 0;
        int zero = 0;

        for (int each : arr) {
            if (each > 0) {
                plus++;
            } else if (each < 0) {
                minus++;
            } else {
                zero++;
            }
            System.out.println("positives:" + plus + ", negatives:" + minus + ", zeros:" + zero);
        }


    }


}

