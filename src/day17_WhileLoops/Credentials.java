package day17_WhileLoops;

import java.util.Scanner;

public class Credentials {
/*
username: cybertek
password: cybertek123
 */

    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);

        System.out.println("Enter username");
        String username = s.next();

        System.out.println("Enter password ");
        String password = s.next();

        int count =1;

        while (!(username.equals("cybertek")&& password.equals("cybertek12"))){

            System.out.println("Re-enter your credentials");
            System.out.println("Enter username");
            username= s.next();

            System.out.println("Enter password");
            password= s.next();


            }

            System.out.println("Logged in");
        }




    }
