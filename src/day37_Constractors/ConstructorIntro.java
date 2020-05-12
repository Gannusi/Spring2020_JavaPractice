package day37_Constractors;

import java.util.concurrent.Callable;

public class ConstructorIntro {

    public ConstructorIntro(int a){
        System.out.println("constructor with argument of int");

    }

    public static void main(String[] args) {
       // ConstructorIntro obj = new ConstructorIntro();

       ConstructorIntro obj1=new ConstructorIntro(10);

        ConstructorIntro obj2=new ConstructorIntro(10);
    }
}
