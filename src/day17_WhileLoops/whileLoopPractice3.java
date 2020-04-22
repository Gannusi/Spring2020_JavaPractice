package day17_WhileLoops;

public class whileLoopPractice3 {


    public static void main(String[] args) {

        /*
        for (int i= 1; i<=100;i++ ){

            System.out.print("*");
        }
        */
        int i = 1;
        while(i<=100){
            System.out.print("*");
            i++;
        }

        System.out.println();


        int num =0;
        /*

        ***
        * *
        * *
        * *
        ***

         */
        System.out.println("*******");
        while (num<3){
            System.out.println("*     *");
            num++;

        }

        System.out.println("*******");




    }
}
