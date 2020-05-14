package day38_Constructors;

public class ConstructorCalls {

    public  ConstructorCalls(){
        method2();
        method1();

    }
    public  ConstructorCalls(int a){
        this();


    }
    public static  void method1(){

       //  method2(); cant call

    }
    public   void method2(){

       // ConstructorCalls(); cant call

       method1();
    }



}
