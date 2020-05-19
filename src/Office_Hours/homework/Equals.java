package Office_Hours.homework;

import java.util.Scanner;

public class Equals {

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);


        String in = s.next();

        //your code here

        float price=10.0f;
        float soda=2.0f;
        if(in.equals("burger")|| in.equals("chicken")){
            System.out.println(price);}
        if(in.equals("soda")){
            System.out.println(soda);
        }



        String txt = s.next();
        //your code here

        char fif = txt.charAt(5);
        System.out.print(fif);

        char six = txt.charAt(6);
        System.out.print(six);



    }
}



