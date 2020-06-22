package day49_Polymorphism;

interface Animal{


}
class Dog implements Animal{


}
class Cat implements  Animal{

}
class Robot{

}


public class Polymorphism_Intro {

    public static void main(String[] args) {

        //Animal obj = new Animal();
        Animal obj2 =new Dog();
        Animal obj3 =new Cat();

        Dog obj4 = new Dog();
        Cat obj5 = new Cat();

        Animal[] animalShow ={obj2, obj3, obj4, obj5};

        Robot obj7 = new Robot();

    }

}
