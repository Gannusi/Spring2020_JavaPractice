package day25_MethodsRecap;

public class Return_statement {

    public static void main(String[] args) {

     /*   if(10>9){
            return;// exits the current methods only
        }
        System.out.println("Hello");

      */
     method1();
        System.out.println("hello");

     method2();
        System.out.println("World");

    }

    public  static void  method1(){
        if(10>9){
            return;
        }
    }

    public  static void  method2(){
        if(10>9){
            System.exit(0);
        }
        System.out.println("Hello Cybertek");
    }
}
