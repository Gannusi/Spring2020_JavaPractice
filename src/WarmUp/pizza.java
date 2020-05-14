package WarmUp;

import java.util.ArrayList;
import java.util.Arrays;

/*
   1. create a custom class for pizza that should contain the following:
               instance variables:
                       size (either small, medium, large)
                       number of cheese topping
                       number of pepperoni toppings
               Add a constructor that can allow user to set the size and toppisngs of the pizza
               instance method:
                       calcCost(): returns the total cost as double
                       toString(): a String return method that's containing the pizza' size, quantity of each topping, and the pizza cost as calculated by calcCost()
               Pizza cost is determined by:
                       Small: $10 + $1.5 per pepperoni topping + 1 per cheese topping
                       Medium: $12 + $1.5 per pepperoni topping + 1 per cheese topping
                       Large: $14 + $1.5 per pepperoni topping + 1 per cheese topping
   create a class called Order
           create five objects of the pizza
           create an arraylist of pizza and add those 5 objects into it
           calculate the total price of the order (use for each loop)

    */
public class pizza {
    String size;
    int cheese;
    int peperoni;

    public pizza(String size, int cheese, int peperoni) {
        this.size = size;
        this.cheese = cheese;
        this.peperoni = peperoni;

    }

    public double calcCost() {
        if (size.equalsIgnoreCase("small")) {
            return 10 + 1.5 * peperoni + 1 * cheese;
        } else if (size.equalsIgnoreCase("medium")) {
            return 12 + 1.5 * peperoni + 1 * cheese;
        } else {
            return 14 + 1.5 * peperoni + 1 * cheese;
        }
    }

    public String toString() {
        // Small: $10 + $1.5 per pepperoni topping + 1 per cheese topping
        return "Pizza " + size + peperoni + " per peperoni topping "
                + cheese + " + per cheese topping" + "\n Total price $" + calcCost();
    }

    static class Order {
//        create a class called Order
//        create five objects of the pizza
//        create an arraylist of pizza and add those 5 objects into it
//        calculate the total price of the order (use for each loop)
        public static void main(String[] args) {

            pizza pizza1 = new pizza("small", 2, 3);
            pizza pizza2 = new pizza("medium", 1, 3);
            pizza pizza3=  new pizza("large", 5,2 );
            pizza pizza4 = new pizza("small", 3, 5);
            pizza pizza5 = new pizza("large", 3, 3);


            ArrayList<pizza> list = new ArrayList<>(Arrays.asList(pizza1,pizza2,pizza3,pizza4,pizza5));

            double total =0;

            for( pizza each: list){

                total+=each.calcCost();

            }
            System.out.println("Order Total price: $"+total);
        }


    }
}

