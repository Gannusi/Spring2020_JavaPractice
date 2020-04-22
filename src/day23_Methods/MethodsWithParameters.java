package day23_Methods;

import java.util.Scanner;

public class MethodsWithParameters {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age" );
        int age = s.nextInt();


        EligibleToBuyAlcohol(age); //((byte)22)
    }


    public static void EligibleToBuyAlcohol(int  age) { // byte age

        if( age>=21){
            System.out.println("You are eligible to buy alcohol");
        }else{
            System.out.println("Go get some milk");
        }

    }




}
