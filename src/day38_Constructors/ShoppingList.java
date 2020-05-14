package day38_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {

    public static void main(String[] args) {

        Item item1= new Item("Apple", 1.3, 5);

//        System.out.println(item1.calcCost());
//        System.out.println(item1);

        Item item2= new Item("Milk", 4.8, 2);
        Item item3= new Item("Yogurt", 1.2, 6);
        Item item4= new Item("Caviar", 33.5, 2);
        Item item5= new Item("Cookies", 3.3, 4);

        ArrayList<Item> shoppingList = new ArrayList<>();
        shoppingList.addAll(  Arrays.asList(item1,item2, item3, item4,item5)  );

        double totalCost =0;
//        for(Item each: shoppingList){
//            totalCost+=each.calcCost();
//        }
        for(int i=0; i< shoppingList.size(); i++){
           totalCost += shoppingList.get(i).calcCost();

        }

        System.out.println("Total is: "+totalCost);


    }
}
