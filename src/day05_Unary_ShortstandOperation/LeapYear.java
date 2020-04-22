package day05_Unary_ShortstandOperation;

public class LeapYear {

    /*
    1. create a class called LeapYear, and write a program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false
        Ex:
            year = 2020
        output:
            2020 is leap year: true

     */

    public static void main(String[] args) {
        short year = 2020;
        // leapYear: year%4 == 0
        // if returns true ==> learpYear,  if it returns false ==> not leapYear

        boolean LeapYear = year % 4 == 0;//  if the year can be devided by 4 without any reminder, then it's leap year
        //  System.out.println( year + " is leap year: " + leapYear );

        System.out.println(year + "is Leap year: " + LeapYear);

        String result =  year + " is leap year: " + LeapYear ;
        System.out.println(result);



        byte a = 65;
        boolean evenum1 = a % 2 == 0;
        boolean evenum2 = a % 3 == 0;
        boolean evenum3 = a % 5 == 0;
        System.out.println(a + " is divisible by 2: " + evenum1);
        System.out.println(a + " is divisible by 3: " + evenum2);
        System.out.println(a + " is divisible by 5: " + evenum3);
        System.out.println("\n");
        int b = 80;
        boolean evenum4 = b % 2 == 0;
        boolean evenum5 = b % 3 == 0;
        boolean evenum6 = b % 5 == 0;
        System.out.println(b +  " is divisible by 2: " + evenum4);
        System.out.println(b + " is divisible by 3: " + evenum5);
        System.out.println(b + " is divisible by 5: " + evenum6);



    }

    }
