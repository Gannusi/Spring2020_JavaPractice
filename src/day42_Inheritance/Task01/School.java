package day42_Inheritance.Task01;

import java.util.ArrayList;
import java.util.Arrays;

/*
create a class called school:
					create 3 objects of student and set thier info
					create a an ArrayList of students to store all student objects
					use for each loop to print out each students' name and studentID

 */
public class School {

    public static void main(String[] args) {

        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();

        st1.setStudentInfo("Hanna", 24,'F', 213454, "testing");
        st2.setStudentInfo("Madina",22,'F',12345,"java");
        st3.setStudentInfo("Jack", 26, 'M', 12354,"Java");


        ArrayList<Student> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(st1,st2,st3));

        for( Student each: list1){
            System.out.println(each);
            System.out.println("name: "+each.name+", ID: "+each.studentID);
        }


    }
}
