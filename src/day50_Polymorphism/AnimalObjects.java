package day50_Polymorphism;

import java.util.jar.Manifest;

public class AnimalObjects {


    public static void main(String[] args) {
        Dog puppy2 = new Dog("Sweetie","female", 1);
        System.out.println(puppy2.dogName);
        puppy2.bark();

        Animal puppy1 = new Dog("Keto", "male",6);
       // System.out.println(puppy1.dogName);
        puppy1.eat();
        puppy1.methodA();


        Animal an1 = new Cat ("A", "F", 1);

        boolean isCat = an1 instanceof Cat;
        System.out.println(isCat);

        Dog d1 = new Dog("a", "girl", 2);

       // boolean r1 = d1 instanceof Cat;

        Animal an2 = new Cat ("D", "f", 1);
        boolean r2 = an2 instanceof Dog;
        System.out.println(r2);




    }
}
