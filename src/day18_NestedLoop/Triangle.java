package day18_NestedLoop;

public class Triangle {


    public static void main(String[] args) {

        /*
              *
              * *
              * * *
              * * * *
              * * * * *
              * * * * * *
              * * * * * * *
              * * * * * * * *
         */


        int z = 1 ;
        while(z<=7){



            int i = 1;
            while (i <= z) {

                System.out.print("* ");

                i++;
            }

            System.out.println();


            z++;
        }

        System.out.println("=======================================================");


        int q = 7 ;
        while(q>=1){



            int i = 1;
            while (i <= q) {

                System.out.print("* ");

                i++;
            }

            System.out.println();


            q--;
        }





    }
}
