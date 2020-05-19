package Office_Hours.homework.ReplIt.Replit;

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

    }
    // public Pizza(String size, int cheeseToppings){
    //     this(size);
    //     this.cheeseToppings=cheeseToppings;
    // }
    // public Pizza(String size, int cheeseToppings,int pepperoniToppings){
    //     this(size,cheeseToppings);
    //     this.pepperoniToppings= pepperoniToppings;
    // }
    // public Pizza(String size, int cheeseToppings,int pepperoniToppings,int hamToppings){
    //     this(size,cheeseToppings,pepperoniToppings);
    //     this.hamToppings=hamToppings;
    // }


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

    public  double calcCost(){

        if(size.equalsIgnoreCase("Small")) {
            return (cheeseToppings + pepperoniToppings + hamToppings) * 2 + 10;
        }else if(size.equals("Medium")){
            return  (cheeseToppings + pepperoniToppings + hamToppings) * 2 + 12;
        }else{
            return  (cheeseToppings + pepperoniToppings + hamToppings) * 2 + 14;
        }
    }


    public  String getDescription(){
        return size+ " Pizza with "+cheeseToppings+" Cheese toppings, "+pepperoniToppings
                +" Pepperoni toppings, and "+hamToppings+" Ham tppings."+"\nTotal Price: "+calcCost();

    }

}


class fullPizza{
    public static void main(String[] args) {
        Pizza pizza1 =new Pizza("Small",2,2,2);
        System.out.println(pizza1.getDescription());
    }
}
