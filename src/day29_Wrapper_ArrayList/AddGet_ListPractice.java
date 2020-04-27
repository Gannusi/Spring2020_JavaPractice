package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class AddGet_ListPractice {

    public static void main(String[] args) {

        ArrayList<String> shoppingList = new ArrayList<>();

        shoppingList.add("milk") ; // size 1
        shoppingList.add("coffee"); // size 2
        shoppingList.add("bread"); // size 3
        shoppingList.add("caviar"); // size 4
        shoppingList.add("roses"); // size 5



        System.out.println(shoppingList);

        for(int i=0;i<4; i++ ){
            System.out.println(shoppingList.get(i));
        }

        System.out.println("===============================");

        for( String each : shoppingList){

            System.out.println(each);
        }


        int size =shoppingList.size();
        System.out.println(size);

        int lastIndex = shoppingList.size()-1;
        System.out.println(lastIndex);

    }
}
