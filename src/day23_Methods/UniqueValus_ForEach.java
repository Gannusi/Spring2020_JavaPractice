package day23_Methods;

import java.util.Arrays;

public class UniqueValus_ForEach {

/*
1.  Write a program that can print out the unique values from a String Array
			Ex:
				if arr -> {"A", "A", "B", "C", "C"}
				output: B
				if arr -> {"A", "B", "B", "C"}
				output:  A
						 C
			MUST use for each loop
 */
    public static void main(String[] args) {


        String [] arr= {"F", "A", "A", "B", "C", "C", "D"};

        Arrays.sort(arr);

        //for (String each: arr) {

        for (int k=0; k< arr.length;k++){
            int count1 = 0;
            for (int i = 0; i <= arr.length - 1; i++) {
                if (arr[i].equals(arr[k])) {  //each
                    count1++;

                }
            }
            if (count1 == 1) {
                System.out.println(arr[k]);//each
            }
        }


        System.out.println("================================================");
        for (String each2 : arr) {


            int count=0;
            for (String eachArr : arr) {

                if (eachArr.equals(each2)) {
                    count++;
                }
            }

            if (count == 1) {

                System.out.println(each2);
            }

        }



    }
}
