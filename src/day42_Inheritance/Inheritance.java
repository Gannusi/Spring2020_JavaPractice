package day42_Inheritance;

import day42_Inheritance.Data;
public class Inheritance extends Data{
//              sub              super

    public static void main(String[] args) {
        System.out.println(Inheritance.publicData);
        System.out.println(Inheritance.protectedData);
        System.out.println(Inheritance.defaultData);// cant compile in any other package
       // System.out.println(Inheritance.privateData);

    }

}
