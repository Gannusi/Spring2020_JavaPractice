package day48_Abstraction;

public interface Interface2 {


    int a = 100;

    public static void main(String[] args) {
        System.out.println(a);   //static by default
       // a =200; final by default

        System.out.println(Interface2.a);

    }
    public static  void  method4(){ }


    void method5();

    public  default  void method6(){

    }


}
