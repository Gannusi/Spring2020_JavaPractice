package day42_Inheritance.Task01;
/*
create a subclass of Person called Student
				attributes: name, age, gender, studentID, clazz
				methods: attendClass, code, setStudentInfo, toString
 */
public class Student  extends Person{

    public long studentID;
    public String clazz;
    public  static String schoolName ="Cybertek";

    public void setStudentInfo(String name, int age, char gender, long studentID, String clazz ){
        setPersonInfo(name, age, gender);
        this.studentID = studentID;
        this.clazz = clazz;
    }
    public void attendClass(){
        System.out.println(name+" si attending class "+ clazz);
    }
    public void code() {
        System.out.println(name + " si coding");
    }
    public  String toString(){
        return "Name: "+name+
                ", age: "+age+
                ", Gender: "+gender+
                ", Student ID: "+studentID+
                ", at class: "+clazz+", School name: "+ schoolName;
    }



    }
