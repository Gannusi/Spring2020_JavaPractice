package day43_MethodOverriding;


class Test {
    protected void method(){
        System.out.println("Hey");
    }
}


public class MethodOverriding extends Test {
     @Override
    public void method(){
        System.out.println("Hi");
    }

    public static void main(String[] args) {

        Test obj =new Test();
        obj.method();
        MethodOverriding obj2= new MethodOverriding();
        obj2.method();//Hi

    }

}
