package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class catObjects {

    public static void main(String[] args) {
        Cat cat1 = new Cat();

        cat1.setCatInfo("British","Gray", 3, "AkunaMatata" );
        System.out.println(cat1);

        Cat cat2= new Cat();
        cat2.setCatInfo("Sibirien", "White", 1,"Maroz");
        System.out.println( cat2);


        Cat cat3= new Cat();
        cat3.setCatInfo("Calico", "tiger", 7,"Cleopatra");
        System.out.println( cat3);


        ArrayList<Cat> catList = new ArrayList<>();

        catList.addAll(Arrays.asList(cat1,cat2, cat3));

        for (int i=0; i<catList.size();i++){
            System.out.println(catList.get(i));

        }
        System.out.println("==========================================");

        cat1.sleep();
        cat2.sleep();
        cat3.sleep();

        System.out.println("===============================================");

        cat1.eat("Fish");
        cat2.eat("Mouse ");
        cat3.eat("Zguschenka");

        System.out.println("===============================================");

        cat1.drink("Kagor");
        cat2.drink("Whiskey");
        cat3.drink("Prosecco");

    }
}
