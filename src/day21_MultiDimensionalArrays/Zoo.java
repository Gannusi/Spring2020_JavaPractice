package day21_MultiDimensionalArrays;

public class Zoo {


    public static void main(String[] args) {
        String[] wildAnimals = {"Tiger", "Lions", "Monkey", "Turtle", "Crocodile"};
        String[] birds = {"Eagle", "Ducks", "Peacock", "Chicken"};

        String[] [] zoo= {wildAnimals, birds};
        String kfc= zoo[1][3];
        System.out.println(kfc);


        System.out.println("==================================");


        for( String eachBirds: zoo[1] ){
            if(eachBirds.equalsIgnoreCase("chicken")){
                continue;
            }
            System.out.println(eachBirds);
        }

        System.out.println();

        for(String eachWild :zoo[0]){
            if(eachWild.equalsIgnoreCase("Turtle")){
                continue;
            }
            System.out.println(eachWild);
        }






    }
}
