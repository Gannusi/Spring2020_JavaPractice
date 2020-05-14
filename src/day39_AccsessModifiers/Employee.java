package day39_AccsessModifiers;

public class Employee {
    String name;
    String jobTitle;
    long id;
    double salary;
    char gender;
    static String companyName = "Gucci";

    public Employee(String name){
        this.name=name;
    }

    public Employee(String name, String jobTitle){
      this(name);
      this.jobTitle=jobTitle;
    }

    public Employee(String name, String jobTitle,long id){
        this(name,jobTitle);
        this.id=id;
    }
    public Employee(String name, String jobTitle,long id,double salary){
        this(name,jobTitle, id);
        this.salary=salary;
    }
    public Employee(String name, String jobTitle,long id,double salary,char gender){
        this(name,jobTitle, id,salary);
        this.gender=gender;
    }

    public String toString(){
        return  "Name: "+name+" id: "+id+" jobTitle: "+jobTitle+
                " salary: "+salary+" gender: "+gender+". Company name: "+companyName;
    }

}


class EmployeeObjects{
    public static void main(String[] args) {

       Employee employee1 = new Employee("Tama");
        System.out.println(employee1);
        Employee employee2 = new Employee("Alex","Super");
        System.out.println(employee2);
        Employee employee3 = new Employee("Paul","Tester",109283);
        System.out.println(employee3);
        Employee employee4 = new Employee("Sarah","SDET",13579,130000.0);
        System.out.println(employee4);
        Employee employee5 = new Employee("Hanna","Actress", 1111111,500000.0,'F');
        System.out.println(employee5);
    }
}
