package day30_ArrayList;

import java.util.ArrayList;

public class CombineTwoArrays {


    public static void main(String[] args) {


        String [] arr1 = {"A", "B", "C"};
        String [] arr2 = {"D", "E", "F", "G"};


        ArrayList<String> list = new ArrayList<>();

        for (int i =0; i< arr1.length; i++){

           String eachEl=  arr1[i];
           list.add(eachEl); // arr1[i]

        }
        for ( String eachEl: arr2){

            list.add(eachEl);
        }


        System.out.println(list);




    }
}
