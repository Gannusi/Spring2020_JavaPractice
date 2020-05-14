package Office_Hours.Practice_05_13_2020;

import Office_Hours.Practice_05_06_2020.InstanceVariable;

public class InstanceTest {

    public static void main(String[] args) {

        Instances o1 = new Instances();
        o1.name ="Muhtar";

        Instances o2  = new Instances();
        o2.name="Kuzat";

        System.out.println(o1.name);
        System.out.println(o2.name);


        o1.printName();
        o2.printName();
    }
}
class InstanceBlock{
    public static void main(String[] args) {

        Instances obj = new Instances();
        System.out.println(obj.name);
    }
}


