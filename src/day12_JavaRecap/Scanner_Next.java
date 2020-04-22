package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_Next {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in );
       // String str = scan.next();
        //System.out.println(str);

        String fullAddress = " ";

        System.out.println("Enter number of the building:");
            short Bnum = scan.nextShort();
               fullAddress += Bnum +" ";


        System.out.println("Enter the Street name: ");
        String streetName = scan.next();

        fullAddress += streetName+" ";

        System.out.println("Enter the type of the road");
        String roadType = scan.next();

        fullAddress+= roadType+", ";

        System.out.println("Enter city name, state, zipcode");
        String cityName = scan.next();
        fullAddress += cityName+" ";

        String state = scan.next();
        fullAddress += state+", ";

        int zipCode = scan.nextInt();
        fullAddress+= zipCode;

        System.out.println("Address is: " + fullAddress);





        String ullAddress = "";

        System.out.println("Enter the number of the building: ");
        short Bnumber =  scan.nextShort();
        fullAddress += Bnumber+" ";  // fullAddress = fullAddress+Bnumber+" "

        System.out.println("Enter the Street Name: ");
        String treetName = scan.next();
        fullAddress += streetName+" ";

        System.out.println("Enter the type of the road");
        String oadType = scan.next();
        fullAddress += roadType+", ";

        System.out.println("Enter city name, state, zipcode");
        String ityName = scan.next();
        fullAddress += cityName+" ";

        String tate = scan.next();
        fullAddress += state+", ";

        int ipCode = scan.nextInt();
        fullAddress += zipCode;

        System.out.println("Address is: " + fullAddress);






    }
}
