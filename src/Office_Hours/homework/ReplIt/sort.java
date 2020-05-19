package Office_Hours.homework.ReplIt;

import java.util.Arrays;

public class sort {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5,3};

        isSort(arr);
    }

    public static boolean isSort(int[] nums) {
        int[] copy = new int [nums.length];
        for(int i = 0; i < nums.length; i++){
            copy [i] = nums [i];
        }
        Arrays.sort(nums);
        boolean result = Arrays.equals(nums, copy);
        System.out.println(result);
        return result;
    }
}
