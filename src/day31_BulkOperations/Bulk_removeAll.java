package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_removeAll {

    public static void main(String[] args) {


        ArrayList<Integer> list =new ArrayList<>();

        list.addAll(Arrays.asList(1, 2, 3, 4,5,3, 4, 5, 7, 8, 7,3, 3, 3, 3, 3));

      /*  Integer a =1;
        list.remove(a);
        list.remove(a);


        Integer b =3;
        list.remove(b);
        list.remove(b);

       */

        list.removeAll(Arrays.asList(3,4,7));


        System.out.println(list);


        System.out.println("=========================================");

        String[] colors = {"Red", "Purple", "Gold", "Red", "Red", "Orange","Red",  "White","Red"};

        ArrayList<String> colirsList = new ArrayList<>(Arrays.asList(colors));

        System.out.println(colirsList);

        colirsList.removeAll(Arrays.asList("Red"));
        System.out.println(colirsList);



/*
        String[] names ={"Hanna","Alex","Mari","Myron","Oleksii","Anastasia"};
        list.addAll(Arrays.asList(names));
        ArrayList<String> nonDup = new ArrayList<>();
        for(int i=0; i<list.size(); i++) {
            if (!nonDup.contains(list.get(i))){
                nonDup.add(list.get(i));
            }
 */








    }
}
