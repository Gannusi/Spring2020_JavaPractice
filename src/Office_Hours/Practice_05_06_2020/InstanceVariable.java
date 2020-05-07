package Office_Hours.Practice_05_06_2020;

public class InstanceVariable {

 int a =100;//instance

    public static void main(String[] args) {
        int a=100;//local

        InstanceVariable obj1 = new InstanceVariable();
        obj1.a =300;

        System.out.println(300);


        InstanceVariable obj2 =new InstanceVariable();
        System.out.println(obj2.a);

    }
}
