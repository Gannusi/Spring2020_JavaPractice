package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_AddAll {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
       /* list.add(30);
        list.add(20);
        list.add(35);
        list.add(40);
        list.add(50);
        list.add(45);
        list.add(200);

        */

       Integer[] arr1 ={20, 30, 40, 50, 45, 35, 25};
       list.addAll(Arrays.asList(arr1));

        System.out.println(list);


        System.out.println("==================================================");


        String[] colors ={"Blue", "Yellow", "Red", "Purple", "Black"} ;

       // colors[5]= "Green";

        System.out.println(Arrays.toString(colors));

        ArrayList<String > colorList = new ArrayList<>();
        colorList.addAll(Arrays.asList(colors));

        colorList.add("Green");
        colorList.remove("Black");


        System.out.println(colorList);

        System.out.println("==================================================");


        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(nums));

        System.out.println(numList);




    }
}
