package homework.ReplIt;

import java.util.*;

public class ArrayList_Methods187 {

    public static void main(String[] args) {




    }

    public static ArrayList combineAL(ArrayList<String> wordList1, ArrayList<String> wordList2 ){

        ArrayList<String> arr1 = new ArrayList<>();

        for(int i = 0; i< wordList1.size(); i++){

            arr1.add(wordList1.get(i));

        }
        for(int i = 0; i< wordList2.size(); i++){

            arr1.add(wordList2.get(i));

        }
        return arr1;




    }
}

