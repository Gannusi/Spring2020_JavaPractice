package day12_JavaRecap;

import java.util.Scanner;

public class Ternaries_Practice2 {


    public static void main(String[] args) {

       /* Scanner scan = new Scanner(System.in);

        System.out.println("Enter a character ");
        String char1 = scan.next();
        */

       char ch1 = 'a';

        String result = (ch1 == 'A') ? "A is selected":
                (ch1 == 'B')? "B is selected" :
                (ch1 == 'C')? "C is selected" :
                (ch1 == 'D')? "D is selected":
                (ch1 == 'E')? "E is selected " : "Invalid number";
        System.out.println(result);







    }
}
