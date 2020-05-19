package Resources;

import day40_Encapsulation.Encapsulation;

public class Encapsulation_Test {

    public static void main(String[] args) {

       Encapsulation obj = new Encapsulation();
//        obj.SSN=100;
//        Encapsulation_Test obj1= new Encapsulation_Test();
//        obj1.SSN=100;


        System.out.println(obj.getSSN());
        obj.setSSN(123);

        System.out.println(obj.getSSN());



    }
}
