package day26_MethodOverLoadig;

public class MethodOL_sum {
    /*
first method: can find the sum of two int numbers
second method: can find the sum of two double numbers
*/
    public static void main(String[] args) {
        sum(10,5);//15
        sum(10.0,5.0);//15.0
        sum(20,10,5);
    }

    public static void sum(int a, int b){
        System.out.println(a+b);
    }
    public static void sum(double a, double b){
        System.out.println(a+b);
    }
    public static void sum(int a, int b, int c){
        System.out.println(a-b-c);
    }


}
