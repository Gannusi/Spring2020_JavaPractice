package homework.ReplIt;


import java.util.Scanner;

public class ArraysFirstLast {

    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        String[] words = {"hello", "why", "by", "apple" , "note"};


        //TODO: Write your code below

        for (int i=0; i<5; i++){
            System.out.println(words[i].charAt(0)+""+words[i].charAt(words[i].length()-1));
        }



        System.out.println("=============================================");

        int[ ] nums = {1, 5, 9, 1, 1};


        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==5 && nums[i+1]==5){
                System.out.println("true");
                System.exit(0);
            }
        }
        System.out.println("false");



    }
}
