package day41_Inheritance.task_1;

import day41_Inheritance.task_1.Employee;

/*
	create subclass of employee name it developer:
	     variables: salary, name, id, jobTitle, gender
	     action: fixingBug, coding
	     creata a constructor that can initialize all the attributes of developer
 */

public class Developer extends Employee {

    /*
    name(inherited)
    salary (inherited)
    id(inherited)
    jobtitle(inherited)
    gender(inherited)
    fixingBug()
    coding()
    toString() (inherited)
     */


    public Developer(double salary, String name, long id, String jobTitle, char gender){
        this.salary = salary;
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.gender = gender;
    }

    public void fixingBug(){ System.out.println(name +" is fixing the bug"); }
    public void coding (){ System.out.println(name+" is coding"); }

}
