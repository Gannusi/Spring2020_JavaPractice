package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_retainAll {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 4, 3, 2, 1, 1, 1, 1, 3, 2, 4));

        list.retainAll(Arrays.asList(1, 2, 3));

        System.out.println(list);






    }
}
