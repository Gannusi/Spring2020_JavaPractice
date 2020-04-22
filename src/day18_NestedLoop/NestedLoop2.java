package day18_NestedLoop;

public class NestedLoop2 {


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
         * * * * * * * * *
         */

        for(int j= 1; j <= 9; j++){

            for(int i =1; i <= j; i++){
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println("=======================================================");

        /*
         * * * * * * * * *
         * * * * * * * *
         * * * * * * *
         * * * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
         */
        for (int i=9; i >=0; i--){
            for (int j =1; j <=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("=======================================================");

        /*
        a
        a b
        a b c
        a b c d
        a b c d e
         */


        for (char zh = 'a'; zh<='r'; zh++ ) {


            for (char ch = 'a'; ch <= zh; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();


        }


    }
}
