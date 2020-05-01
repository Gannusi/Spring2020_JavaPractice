package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZero {
/*
	Write a program that can move all the zeros to  last indexes of ArrayList
		Ex:
			list:  {1,0,2,0,3,0,4,0};
			output: [1, 2, 3, 4, 0, 0, 0, 0]
			DO NOT USE SORT method, DO NOT declear  any extra lists
	write a program that can return the duplicated values from an ArrayList of String
		Ex:
			list: {"A", "B", "A", "C", "D"};
			output: ["A"]
			list: {"A", "B", "B", "C", "D", "D"};
			output: ["A", "C"]
 */
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0,0,0,0,0,0));

        System.out.println(list);

       int  count =0;
        for ( Integer each : list){

            if( each ==0){
                count++;
            }
        }
        System.out.println(count);

        list.removeAll(Arrays.asList(0));
      //  list.addAll(Arrays.asList(0,0,0,0,0,0,0));

        for(int i =0; i< count; i++){
            list.add(0);
        }
        System.out.println(list);



    }
}
