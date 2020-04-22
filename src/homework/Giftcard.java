package homework;

import java.util.Scanner;

public class Giftcard {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Start your shopping.\nEnter your items: ");
        String item = scan.nextLine();

        //WRITE YOUR CODE HERE


        int giftCard =100;



        if(item.contains("Charger")){

            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(giftCard-15)+"$");

        }else  if(item.contains("USB cable")){

            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(giftCard-10)+"$");

        }else  if(item.contains("Headphones")){

            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(giftCard-30)+"$");

        }else  if(item.contains("Pants")){

            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(giftCard-50)+"$");

        }else  if(item.contains("Hat")){

            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(giftCard-25)+"$");

        }else  if(item.contains("Socks")){

            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(giftCard-5)+"$");

        }else if(item.contains("Blanket")) {

            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (giftCard - 60)+ "$");

        } else if(item.contains("Socks")) {

            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (giftCard - 40)+ "$");

        }else if(item.contains("Laptop") || item.contains("Smartphone")){

            System.out.println(" Sorry, not enough funds on your gift card!");

        }else{
            System.out.println("Invalid item");

        }







    }
}
