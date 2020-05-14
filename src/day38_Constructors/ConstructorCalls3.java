package day38_Constructors;

public class ConstructorCalls3 {

    public  ConstructorCalls3(){
        this(9);//int argument
        System.out.println("default");

    }
    public  ConstructorCalls3(int a){
        //this();

        System.out.println( "Int argument ");

    }
    public  ConstructorCalls3(String str){
        //his( "Hello");

    }

    public void method1(){
        //this();
        }
}
