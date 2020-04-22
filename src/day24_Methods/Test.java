package day24_Methods;

import java.util.Arrays;
import Resources.Library;

public class Test {
    public static void main(String[] args) {
         String str ="Cybertek";

         String  Revstr = Library.Reverse(str);
        System.out.println(str.equalsIgnoreCase(Revstr));

        System.out.println(Revstr);


        int [] arr = {2, 3, 4,54, 6, 1};

        arr= Library.sortDesending(arr);
        System.out.println(Arrays.toString(arr));


    }
}
