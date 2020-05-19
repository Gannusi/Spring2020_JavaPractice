package Office_Hours.homework.ReplIt;

import java.util.Scanner;

public class WhileLoop_ShopingList {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;

     do {
    System.out.println("Enter Item" + count + " and its price:");
    item = scan.next();
    price = scan.nextDouble();

    System.out.println("Add one more item?");
    countinue = scan.next();
    shoppingListReport += " Item " + count + ":" + item +
            " Price: " + price + ", ";
    totalPrice+=price;
    count++;



     }while( (countinue.equalsIgnoreCase("yes")));

        System.out.println(shoppingListReport.substring(0,shoppingListReport.length()-2));
        System.out.println("Total price: "+totalPrice);










    }
}
