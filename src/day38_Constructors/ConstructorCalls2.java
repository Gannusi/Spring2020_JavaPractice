package day38_Constructors;

public  class ConstructorCalls2{

    public  ConstructorCalls2(){

        System.out.println("default constructor");
    }
    public  ConstructorCalls2(int a){
        this();//default constructor
        System.out.println("constructor with int argument ");
    }
    public  ConstructorCalls2(String str){

        this(10);
        System.out.println("Constructor with String argument ");
    }

    public static void main(String[] args) {
        ConstructorCalls2 obj = new ConstructorCalls2("Hello");

    }

    public  void method1(){
        // ConstructorCalls2();

    }



}