package Office_Hours.Practice_05_13_2020;

public class Constructor {

    public Constructor(){
        System.out.println("default constructor");

    }



    public static void main(String[] args) {

         Constructor o = new Constructor();

        System.out.println("++++++++=========+++++++++++++++++===========+++++++++");
        Employee e1= new Employee( "Gigi",1234, 342000.0);
        System.out.println(e1.name);
        System.out.println(e1.id);
        System.out.println(e1.salary);
        System.out.println(e1);

    }
}

class Employee{

    String name;
    long id;
    double salary;

    public Employee(String name,long id, double salary){//long id, double salary
        this.name=name;
        this.id=id;
        this.salary=salary;


    }
}
