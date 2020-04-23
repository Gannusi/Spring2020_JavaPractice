package Office_Hours.Practice_04_22_2020;

public class MethodOverloading {

    public static void main(String[] args) {

      int num1=  method(20);
        System.out.println(num1);


    }



    public static void method() {
        System.out.println("Hey baby");
    }
    public static int method(int a) {
        System.out.println("Hey baby Hanna");
        return 10;
    }

    public static void method(int a, int b) {
        System.out.println("Hey baby girl");
    }
}
