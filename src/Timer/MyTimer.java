package Timer;

import java.util.Scanner;

public class MyTimer {

    public static void main(String[] args) throws Exception {
    Scanner a =  new Scanner(System.in);
        System.out.println("Enter number of minutes");
        int minutes  = a.nextInt();


        for (int i=minutes; i > 0 ;--i) {
            if( i< 0 )
                break;

            for (int z=59; z >0 ; --z) {
                System.out.println((i-1)+" minutes and "+z+" seconds left");
                Thread.sleep(100);
            }
        }


        System.out.println(" \n \t \t********************************************* ");
        System.out.println("  \t \t***                                       *** ");
        System.out.println("   \t \t***            Time is out babies !          *** ");
        System.out.println("    \t \t***                                       *** ");
        System.out.println("     \t \t********************************************* ");

   }
}
