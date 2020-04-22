package day19_Arrays;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Arrays_Practice2 {

    public static void main(String[] args) {


        int[] arr = {10, 20, 30};
        System.out.println(arr.length);

        int[] arr2= new int[5];

        System.out.println(arr2[0]);
        System.out.println(arr2[1]);


        System.out.println();


        String [] testers = new String[3];   //{"Reem", "Madina", "Hanna", };

        testers[1]="Madina";
        testers[2]= "Hanna";
        testers[0]= "Reem";

        System.out.println(testers[1]);
        System.out.println(testers[2]);
        System.out.println(testers[0]);


        System.out.println(testers.length);
        System.out.println("=======================================================");

        String[] students = new String[10];

        // write a program that asks "enter a name" 10 times, and store each of the names in the array students


        Scanner scan=new Scanner(System.in);
        String[]names=new String[10];
        for(int i=0;i<=names.length-1;i++){
            System.out.println("Please enter a name");
            names[i]=scan.next();
        }




    }
}
