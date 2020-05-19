package day41_Inheritance.task_1;

public class BA extends Employee {

    public BA(String name,double salary, long id, String jobTitle,char gender){
        this.name=name;
        this.salary=salary;
        this.id=id;
        this.jobTitle=jobTitle;
        this.gender=gender;
    }

    public void whiteRq(){
        System.out.println(name+" is writing requirements");
    }
    public  void gathering(){
        System.out.println( name+" is gathering requirements");
    }

}
