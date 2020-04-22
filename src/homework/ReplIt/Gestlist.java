package homework.ReplIt;

import java.util.Scanner;

public class Gestlist {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter guest name:");

        String name=input.next();

        String result =name+", ";


        System.out.println("Do you want to enter new guest name:");
        String answer = input.next();

        while ((answer.equalsIgnoreCase("yes"))) {
            System.out.println("Please enter guest name:");
            name=input.next();

            System.out.println("Do you want to enter new guest name:");
            answer=input.next();
            result += name + ", ";
        }
        if (answer.equalsIgnoreCase("no")) {
            result=result.substring(0,result.length()-2);

        }

        System.out.println("Guest's list: " + result);

    }
}



