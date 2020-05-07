package Office_Hours.Practice_05_06_2020;

public class Developer {

    String name;
    String jobTitle;
    double salary;
    long employeeId;

    public void setInfo(String name, String jobTitle, double salary, long employeeId){
        this.name =  name;  // user given argument name is assigned to instance variable name
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.employeeId = employeeId;

    }

    public String toString(){

        return "Name: "+name+", job title: "+jobTitle
                +", salary: $"+salary+", ID: "+employeeId;
    }


    public  void Coding(){
        System.out.println(name+" is coding");
    }

    public  void Fix(){
        System.out.println(name+" is fixing bugs");
    }

}
