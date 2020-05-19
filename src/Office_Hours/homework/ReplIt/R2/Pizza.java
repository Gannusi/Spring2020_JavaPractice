package Office_Hours.homework.ReplIt.R2;
/*
Create a class named Pizza that stores information about a single pizza.
It should contain the following:
Private instance variables to store the size of the pizza (either small, medium, or large),
 the number of cheese toppings, the number of pepperoni toppings, and the number of ham toppings.
    Constructor(s) that set all of the instance variables.
Public methods to get and set the instance variables.
A public method named calcCost( ) that returns a double that is the cost of the pizza.
Pizza cost is determined by:
Small: $10 + $2 per topping
Medium: $12 + $2 per topping
Large: $14 + $2 per topping
A public method named getDescription() that returns a String containing
 the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost().

getDescription() example:
large Pizza with 0 Cheese toppings, 0 Pepperoni toppings, and 2 Ham toppings.
Total Price: 18.0
 */
public class Pizza {
   private String size;
    private int cheeseToppings;
    private int pepperoniToppings;
    private int hamToppings;


    public Pizza(String size,int cheeseToppings, int pepperoniToppings, int hamToppings){
        this.size=size;
        this.cheeseToppings=cheeseToppings;
        this.pepperoniToppings=pepperoniToppings;
       this.hamToppings=hamToppings;
       // int cheeseToppings, int pepperoniToppings, int hamToppings
    }
//    public Pizza(String size, int cheeseToppings){
//        this(size);
//        this.cheeseToppings=cheeseToppings;
//    }
//    public Pizza(String size, int cheeseToppings,int pepperoniToppings){
//        this(size,cheeseToppings);
//        this.pepperoniToppings= pepperoniToppings;
//    }
//    public Pizza(String size, int cheeseToppings,int pepperoniToppings,int hamToppings){
//        this(size,cheeseToppings,pepperoniToppings);
//        this.hamToppings=hamToppings;
//    }


    public void setSize(String size){
        this.size = size;
    }
    public void setCheeseToppings(int cheeseToppings){
        this.cheeseToppings=cheeseToppings;
    }
    public void setPepperoniToppings(int pepperoniToppings){
        this.pepperoniToppings=pepperoniToppings;
    }
    public void setHamToppings(int hamToppings){
        this.hamToppings=hamToppings;
    }


    public String getSize(){
        return size;
    }
    public int  getCheeseToppings(){
        return cheeseToppings;
    }
    public int  getPepperoniToppings(){
        return pepperoniToppings;
    }
    public int  getHamToppings(){
        return hamToppings;
    }
    /*
    A public method named calcCost( ) that
     returns a double that is the cost of the pizza.
Pizza cost is determined by:
Small: $10 + $2 per topping
Medium: $12 + $2 per topping
Large: $14 + $2 per topping
     */
    public  double calcCost(){

        if(size.equals("Small")) {
            return (cheeseToppings + pepperoniToppings + hamToppings) * 2 + 10;
        }else if(size.equals("Medium")){
            return  (cheeseToppings + pepperoniToppings + hamToppings) * 2 + 12;
        }else{
            return  (cheeseToppings + pepperoniToppings + hamToppings) * 2 + 14;
        }
    }
    /*
    A public method named getDescription() that returns a String containing
the pizza size, quantity of each topping, and the pizza cost as calculated
 by calcCost().

     */

    public  String toString(){
        return "Pizza size: "+size+
                "\nCheese topping: "+ cheeseToppings+
                "\nPeperoni topping: "+ pepperoniToppings+
                "\nHam toppings: "+hamToppings+
                "\nTotal cost: "+calcCost();


    }

}

class fullPizza{
    public static void main(String[] args) {
        Pizza pizza1 =new Pizza("Small",2,3,4);
        System.out.println(pizza1);
    }
}
