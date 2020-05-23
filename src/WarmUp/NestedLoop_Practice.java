package WarmUp;

public class NestedLoop_Practice {

    public static void main(String[] args) {

        int z= 1;
        while (z<=4){


            for (int i = 10; i <= 50; i += 10) {
                System.out.print(i +" ");
            }
            System.out.println();

            z++;
        }


        System.out.println("=====================================================");

        for(int l=1; l<=5; l++){


            int q= 1;
            while (q<=6){

                System.out.print("* ");

                q++;

            }
            System.out.println();

        }
          System.out.println("+===========================================================");


        for (int t = 1; t<=7; t++) {


            for (int k = 1; k <= t; k++) {

                System.out.print("* ");
            }
            System.out.println();
        }












    }
}
