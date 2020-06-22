package day52_Collection;

import day14_StringClass.StartEndWords;
import day48_Abstraction.Interface_Intro;

import java.util.ArrayList;

public class null_keyword {

    static  String str = new String("Cybertek");

    public static void main(String[] args) {

        System.out.println(str.charAt(0));

        String str2 = null;
        Integer i1 =null;

        ArrayList<String> list1= new ArrayList<>();
        list1.add(null);

        System.out.println(list1);

        System.out.println("=========================================");

        String number ="123";

        int num1 = Integer.parseInt(number);
        System.out.println(num1);

        System.out.println("=========================================");

        String[] arr = {null, "Cybertek", "ABC"};
        arr[2].toUpperCase();

        String name1 ="cybertek".toUpperCase();
               name1 =null;
             //  name1 =name1.toLowerCase();
        System.out.println(name1);


    }


}
