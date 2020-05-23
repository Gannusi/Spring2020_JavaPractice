package day42_Inheritance;

class  B{
    public B(int a ){
        System.out.println("int");
    }
    public B(double a){
        System.out.println("double");
    }
    public B(long a){
        System.out.println("long");
    }
}
public class InheritanceReveiw extends  B{
    public  InheritanceReveiw(String a){
        super(19l);
        System.out.println("String");
    }

    public static void main(String[] args) {
        InheritanceReveiw obj =new InheritanceReveiw("Hello");
    }

}
