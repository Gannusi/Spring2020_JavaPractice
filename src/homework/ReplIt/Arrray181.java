package homework.ReplIt;

import java.util.*;

public class Arrray181 {


    public static void main(String[] args) {

        String[] r1 = {"f", "o", "o"};

        String[] r2 = {"b", "a", "r"};

        String result = "";


        ArrayList<String> list1 = new ArrayList<>();

        for (int i = 0; i < r1.length; i++) {
            list1.add(r1[i]);

        }
        ArrayList<String> list2 = new ArrayList<>();

        for (int i = 0; i < r2.length; i++) {
            list2.add(r2[i]);

        }

        for(int i =0; i< list2.size(); i++){

           result+=list1.get(i);
        }




    }
}


