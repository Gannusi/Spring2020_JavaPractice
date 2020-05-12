package day37_Constractors;

public class CarObjects {


    public static void main(String[] args) {

        Car car1 = new Car("Mercedes","C300", 2018, 45000.00);
        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.price);
        System.out.println( car1 );

        Car car2 = new Car ("Audi", "Q7", 2015, 35000.00);
        System.out.println(car2);


    }
}
