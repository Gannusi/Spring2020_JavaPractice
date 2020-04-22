package day10_Siwtch_Scanner.WarmUp;

public class SwitchStatement {


    public static void main(String[] args) {

        switch (4){
            default:
                System.out.println("Invalid case");
                break;


            case 1:
               System.out.println("One");
                  break;
            case 2 :
                System.out.println("Two");
                  break;
            case 3:
                System.out.println("Three");
                break;
            case 4 :
                System.out.println("Four");
                break;


        }





        byte a =4;

        float a1 = 4.5f;
        long a2 = 10l;
        double a3 = 2.5d;
        boolean a4 = true;

        switch( a ) {

            case 1:
                System.out.println("One");
                break;

            case 2:
                System.out.println("Two");
                break;

            default:
                System.out.println("Invalid case");
                break;

            case 3:
                System.out.println("Three");
                break;

            case 4:
                System.out.println("Four");
                break;
        }










        }
}
