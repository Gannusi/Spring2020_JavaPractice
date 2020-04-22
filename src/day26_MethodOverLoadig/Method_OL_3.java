package day26_MethodOverLoadig;

public class Method_OL_3 {

    public static void main(String[] args) {

        sum(10,10);
        double num1 = sum(19.5,10.5);

        System.out.println(num1);

        double num2 = sum(25L,30L);


        sum(5, 4);
    }


    public static void sum(int a , int b ) {
        System.out.println(a+b);


    }

/*
    public static void sum( double a, double b) {
        System.out.println(a+b);


    }

 */

    public static double sum (double a, double b) {
        return a+b;

    }




}
