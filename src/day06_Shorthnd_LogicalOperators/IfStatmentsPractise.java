package day06_Shorthnd_LogicalOperators;

public class IfStatmentsPractise {


    public static void main(String[] args) {

         int a = 100;
         int b = 200;

    if(a>b){
    System.out.println( a+" is grater than"+b);
    }

    if (b>a){
        System.out.println(b+" is grater then "+a);
    }


    if(a==b) {
        System.out.println(a+" is equal to "+b);
    }

        System.out.println("===========================================");

        int x = 300;
        int y = 300;
        boolean xGreater = x > y;
        boolean yGreater = y > x;
    if (xGreater){

        System.out.println(x+" is greater than "+y);
    }

        if (yGreater){

            System.out.println(y+" is greater than "+x);
        }

        if (xGreater == false && yGreater == false){

            System.out.println(y+" is equal to "+x);
        }

        if (!xGreater ==  !yGreater){

            System.out.println(y+" is equal to "+x);
        }


    }
}
