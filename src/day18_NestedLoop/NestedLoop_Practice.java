package day18_NestedLoop;

public class NestedLoop_Practice {


    public static void main(String[] args) {


        for (int q= 0; q<5; q++) {


            for (int i = 1; i <= 5; i++) {
                System.out.print(i);
            }
            System.out.println();


        }
        System.out.println("=============================================================");
        /*

         *******
         *******
         *******
         *******
         *******
         *******
         *******

         */


        for (int i = 0; i < 7; i++) {

            int a = 1;
            while (a <= 7) {
                System.out.print("*");
                a++;
            }
            System.out.println();
        }





    }
}
