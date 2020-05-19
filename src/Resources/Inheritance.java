package Resources;

import day42_Inheritance.AccsessModifiers;

import java.lang.reflect.InvocationHandler;

public class Inheritance extends AccsessModifiers {
    //           sub               super
    public static void main(String[] args) {
        System.out.println(Inheritance.publicVariable);
        System.out.println(Inheritance.protectedVariable);
       // System.out.println(Inheritance.deufaultVariable);

        Inheritance.publicMethod();
        Inheritance.protectedMethod();
    }

}
