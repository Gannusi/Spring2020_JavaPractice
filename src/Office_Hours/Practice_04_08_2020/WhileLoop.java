package Office_Hours.Practice_04_08_2020;

public class WhileLoop {

    public static void main(String[] args) {

        /*
        while (condition){
        statements
        }
        repeated if statements
         */

         int i = 0;
         while(  i< 5){
             i++;
             System.out.println(i);

         }

        System.out.println();

        System.out.println("========================================");


        int q = 0;
        while(q<101){
            q++;

            if(q%15==0 ){
                System.out.print(q+" ");

            }

        }




    }
}
