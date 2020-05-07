package homework.WarmUp_Muhtar.Custom;

public class PizzaObjects {
/*
create a custom class for pizza that should contain the following:
                instance variables:
                        size (either small, medium, large)
                        number of cheese topping
                        number of pepperoni toppings
                instance method:
                        customizeOrder(): allows user to set the size and toppisngs of the pizza
                        calcCost(): returns the total cost as double
                        toString(): a String return method that's containing the pizza' size, quantity of each topping, and the pizza cost as calculated by calcCost()
                Pizza cost is determined by:
                        Small: $10 + $1.5 per pepperoni topping + 1 per cheese topping
                        Medium: $12 + $1.5 per pepperoni topping + 1 per cheese topping
                        Large: $14 + $1.5 per pepperoni topping + 1 per cheese topping

 */

    public static void main(String[] args) {
        Pizza RemboS =new Pizza();

        RemboS.FullPizza("Small",10, 1.5,1);
        System.out.println(RemboS);


        Pizza RemboM =new Pizza();

        RemboM.FullPizza("Medium",12, 1.5,1);
        System.out.println(RemboM);


        Pizza RemboL =new Pizza();

        RemboL.FullPizza("Large",14, 1.5,1);
        System.out.println(RemboL);






    }
}
