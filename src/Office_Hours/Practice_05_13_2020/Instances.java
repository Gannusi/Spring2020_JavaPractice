package Office_Hours.Practice_05_13_2020;

public class Instances {
    String name ;
//    {
//        name ="Hanna";
//
//    }
public static void main(String[] args) {
    Instances obj = new Instances();
    obj.name ="Hanna";
    System.out.println( obj.name);
}

    public  void printName(){

        System.out.println( "Name is : "+this.name);// this to call specifically instance var
    }

}
