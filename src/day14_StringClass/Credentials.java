package day14_StringClass;

import java.util.Scanner;
/*

        userName: cybertek
        passWord:cybertekschool
         */

public class Credentials {


    public static void main(String[] args) {

       String validUserName = "cybertek";
       String validPassword = "cybertekschool";

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your username");

        String inputUsername = s.next();

        System.out.println("Enter your password");

        String inputPassword = s.next();

        if(inputUsername.equals(validUserName) &&
                inputPassword.equals(validPassword)){

            System.out.println("Log in successfully");
        }else{
            System.out.println("Invalid credentials ");
        }

    }
}
