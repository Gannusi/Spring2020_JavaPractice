package day12_JavaRecap;

import com.sun.tools.javac.code.Attribute;

import java.util.Scanner;

public class Scanner_NextLine {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter some number");
        //String name= input.next();
        int num = input.nextInt();
        System.out.println(num);

        input.nextLine();// used fot taking out the "Enter"

        System.out.println("Enter your name:  ");
        String name = input.nextLine();

        System.out.println(name);








    }
}
