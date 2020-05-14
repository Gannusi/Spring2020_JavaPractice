package day39_AccsessModifiers;

public class CarObjects {
    public static void main(String[] args) {

        Car car1= new Car("Mazda");
        System.out.println(car1.brand);
        System.out.println(car1);

        Car car2= new Car("Opel","Santra");
        System.out.println(car2);

        Car car3= new Car("Mercedes","C300",2017);
        System.out.println(car3);

        Car car4= new Car("BMW","X7",2020,100000.0);
        System.out.println(car4);

    }
}
