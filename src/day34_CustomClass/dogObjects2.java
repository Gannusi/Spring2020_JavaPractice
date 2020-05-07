package day34_CustomClass;

public class dogObjects2 {
    public static void main(String[] args) {
         String food1 ="Chicken";
         String food2 ="Fish";

         String  drink1 ="Milk";
         String drink2= "Water";

         String play1 ="Palka";
         String play2 ="Piano";

        String subject1 = "Java";
        String subject2 = "Art";



        dog dog1 = new dog();
        dog1.setDogInfo("Alabay", "Extra big", 5, "Brown", "Ajdar");

        dog dog2 = new dog();
        dog2.setDogInfo("Husky", "Small",4, "White", "Ghost");

        dog2.eating(food1 );
        dog1.eating(food2);

        dog2.drinking(drink1);
        dog1.drinking(drink2);

        dog2.playing(play1);
        dog1.playing(play2);


        dog dog3 = new dog();
        dog3.setDogInfo("Poodle","Miniature",2,"White","Lucy");


        dog dog4=new dog();
        dog4.setDogInfo("Kangal","Huge",5,"White","Comar");


        System.out.println("===================================================");

        dog[] dogPark = {dog1, dog2, dog3, dog4};
        for( int i =0; i<dogPark.length; i++){
            dogPark[i].eating("Chicken");

        }

        for(dog each: dogPark){
            each.drinking("water");
        }

        for (int i =0; i< dogPark.length; i++){
            dogPark[i].playing("football");
        }
        for(dog each  : dogPark ){
            each.studying(subject1);
        }



    }



}
