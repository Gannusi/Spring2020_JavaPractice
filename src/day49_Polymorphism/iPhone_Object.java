package day49_Polymorphism;

public class iPhone_Object {


    public static void main(String[] args) {
        Iphone phone1 =new Iphone("XS Max",1000.00,"12 inches");

        System.out.println(phone1);
        phone1.faceTiming(1293818487);
        phone1.calling(929271668);

    }
}
