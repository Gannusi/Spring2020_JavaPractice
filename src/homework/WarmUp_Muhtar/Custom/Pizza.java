package homework.WarmUp_Muhtar.Custom;
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
public class Pizza {
    String size;
    int price;
    double pepperoniTop;
    int cheeseTop;




    public void FullPizza(String sizeP,int priceOfPizza,double pepperoniTop1, int cheeseTop1){
        size=sizeP;
        price= priceOfPizza;
        cheeseTop= cheeseTop1;
        pepperoniTop= pepperoniTop1;

    }

    public String toString(){

        return size+": $"+price+" + "+pepperoniTop+" per peperoni topping + "+cheeseTop+" per cheese topping";

    }

}
