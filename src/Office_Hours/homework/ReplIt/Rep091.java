package Office_Hours.homework.ReplIt;

import java.util.Scanner;

public class Rep091 {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();



        int count= 0;

        for(int i =0; i<=str.length()-1;i++){


            if(str.charAt(i)=='h' && str.charAt(i+1)=='i'){

                count++;
            }

        }
        System.out.println(count);

/*
 int count= 0;

    for(int i = 0; i<str.length()-1;i++){

    if(str.charAt(i)=='h' && str.charAt(i+1)=='i'){

    count++;
 */




        }
}
