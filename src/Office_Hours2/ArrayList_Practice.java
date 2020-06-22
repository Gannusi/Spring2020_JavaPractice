package Office_Hours2;

import java.util.ArrayList;
import java.util.Arrays;
/*
1) Create a method that will accept an int array and return
the sum of all the numbers in the given array
2) Overload the method to accept an ArrayList of integers
 and return the sum of all the numbers in the given ArrayList
 */
public class ArrayList_Practice {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int arr[]={1,2,3,4,5};
        int test= SumOf(arr);
        System.out.println(test);
    }
    public static int SumOf(int []arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static int SumOf(ArrayList<Integer> list){
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
        return sum;
    }

}

