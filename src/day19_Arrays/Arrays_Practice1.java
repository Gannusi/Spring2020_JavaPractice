package day19_Arrays;

public class Arrays_Practice1 {


    public static void main(String[] args) {


            String[] myClassmates = {"Hanna", "Paul", "Samar", "Anastasia", "Zuura"};
/*
            String name1 = myClassmates[4];

            System.out.println(name1);
        System.out.println(myClassmates[0]);

*/


            for(int i = 0; i <= 4; i++){
                 String name = myClassmates[i];
                 System.out.println(name);
             }

        System.out.println();



             String[] emails= {"cybertek@yahoo.com", "cybertek@gmail.com", "cybertek@hotmail.com", "cybertek@outlook.com" };

             //print out all the users who registreted with their gmail
            // max 4

        for (int q=0; q<=3; q++){

           String email= emails[q];


           if(email.endsWith("@gmail.com")){
               System.out.println(email);
           }
        }





    }
}
