package Office_Hours.Practice_04_08_2020;

public class do_Wile_Loop {

    public static void main(String[] args) {



        boolean b = 9<8;

        while(b){

            System.out.print("Hey Hey");
        }
        System.out.println("=================================================");

        do{
            System.out.println("Hello World");

        }while(b);

        System.out.println("==================================================");


        int q= 0 ;


        do{
            if( q%15==0) {
                System.out.print(q + " ");
            }

          q++;

        }while(q<=100);



    }
}
