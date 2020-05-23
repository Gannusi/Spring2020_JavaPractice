package day43_MethodOverriding.CARS;

import day43_MethodOverriding.CARS.Car;

public class Jeep extends Car {

       public void start(){
           System.out.println("Call Mechanic");
           System.out.println("Oil Change");
           System.out.println("Jump start");
       }
}
