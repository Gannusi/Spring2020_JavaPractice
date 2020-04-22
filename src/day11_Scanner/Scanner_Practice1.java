package day11_Scanner;

import java.util.Scanner;

public class Scanner_Practice1 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = scan.next();

        System.out.println("Enter your last name: ");
        String lastName = scan.next();

        String fullName = firstName +" "+ lastName;

        System.out.println("Are you employee ?");
        boolean employeeStatus= scan.nextBoolean();
        double salary = 0;

        if(employeeStatus== true){
            System.out.println("Enter your salary: ");
            salary = scan.nextDouble();
        }




        System.out.println("Full name is: "+ fullName);
        System.out.println("Employed: "+employeeStatus);
        System.out.println("Salary: "+salary);








    }
}
