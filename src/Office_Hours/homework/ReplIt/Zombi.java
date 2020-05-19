package Office_Hours.homework.ReplIt;

import java.util.Scanner;

public class Zombi {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();

        int count = 0 ;
        int result = 0;
        String days= "";

        for(int i=inhabitants; i>=0; i--){

            result=inhabitants;

            inhabitants=inhabitants/2;

            days ="Day "+count;

            count++;


            if(result==0){
                break;

            }
            System.out.println(days+"["+result+"]");

        }

        System.out.println("---- EXTINCT ----");
        /* Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int count=0;
        int result=0;
        String day="";
        for (int i=inhabitants; i>=0; i--){
            result=inhabitants;
            inhabitants=inhabitants/2;
            day="Day "+count;
            count++;
            if (result==0){
                break;
            }
            System.out.println(day+" ["+result+"]");
        }
        System.out.println("---- EXTINCT ----");

*/


    }
}
