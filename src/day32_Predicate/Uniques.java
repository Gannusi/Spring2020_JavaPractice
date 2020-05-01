package day32_Predicate;


import homework.ReplIt.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Uniques {


    public static void main(String[] args) {

        Character[] chars ={'A','A','B','C','A','D','A',};
        ArrayList<Character> charList =new ArrayList<>(Arrays.asList(chars));

        System.out.println(charList);

        ArrayList<Character> result =new ArrayList<>();

/*
        for(int i =0; i<charList.size(); i++){


        int count =   Collections.frequency(charList, charList.get(i));
        if(count ==1){
            result.add(charList.get(i));

        }
      }

 */

        for (Character each: charList){
            int count =   Collections.frequency(charList, each);
            if(count ==1){
                result.add(each);

            }
        }
        System.out.println(result);


    }
}
