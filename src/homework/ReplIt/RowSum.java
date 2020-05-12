package homework.ReplIt;

import java.util.Arrays;

public class RowSum {

    public static void main(String[] args)
    {
        int[][] a = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };
        int[] sums = rowSums(a);

        int[][] arr1 = {  {1,1,2}, {3,1,2}, {3,5,3}, {0,1,2} };
//  index==>                 0         1        2        3


      for(int sum : sums);
      System.out.println(sums);
        //this should print 4 6 11 3
    }
    public static int[] rowSums(int[][] nums)
    {
        int sum2 =0;
        int[] arr = new int[nums.length];
        for (int i=0; i<nums.length;i++){
            arr[i]= findSum(nums[i]);
        }
        return arr;

    }

    //-------------

    public static int findSum(int[] arr){ //
        int sum =0;
        for (int i=0; i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }


    //---------------




}
