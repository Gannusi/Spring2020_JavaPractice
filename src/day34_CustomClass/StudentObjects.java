package day34_CustomClass;

import com.sun.codemodel.internal.JArray;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1= new Student();
        student1.setStudentInfo("Hanna", "Ukrainian", 22, 3.5, 'F',false);


        Student student2 = new Student();
        student2.setStudentInfo("Adam", "England", 30, 3.0, 'M', true);

        Student student3 = new Student();
        student3.setStudentInfo("Johnny Guitar", "US",40,4,'M',false );

        Student studen4 = new Student();
        studen4.setStudentInfo("Zoie","Chinese",18,2.4,'F',false);



        Student[] students ={student1, student2, student3, studen4};

        ArrayList<Student> canGraduate =new ArrayList<>(Arrays.asList(students));

        canGraduate.removeIf( p-> p.gpa <=3.0);

        System.out.println( canGraduate.size());

        for( int i =0; i< canGraduate.size(); i++){

            Student each = canGraduate.get(i);
            System.out.println(each.name+" can graduate");
        }

        System.out.println("===============================================");

        ArrayList<Student> cannotGraduate = new ArrayList<>(Arrays.asList(students));

        cannotGraduate.removeIf(p->p.gpa>3.0);

        System.out.println(cannotGraduate.size());

        for (Student each : cannotGraduate){
            System.out.println(each.name+" cannot graduate");


        }








    }
}
