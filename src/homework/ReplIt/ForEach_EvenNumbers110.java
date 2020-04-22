package homework.ReplIt;

public class ForEach_EvenNumbers110 {
/*
Given an array nums, calculate count of even numbers in nums (not their values!) and print out to console.
Note: MUST USE For Each Loop

nums → [2, 1, 2, 3, 4]) → 3
nums → [2, 2, 0, 3, 5]) → 3
nums → [1, 3, 5, 7, 9]) → 0
 */
    public static void main(String[] args) {

        int[] nums = {2, 1, 2, 3, 3};


        int count =0;
        for ( int eachN : nums ){
            if (eachN%2==0){

                count++;
            }
           // System.out.println(count);

        }
        System.out.println(count);






    }
}
