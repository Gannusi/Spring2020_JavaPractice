package Office_Hours.Practice_05_13_2020;

public class Student {

     static String schoolName = "Cybertek";
     String name;
     long ID;

    public String toString() {
        return "Name: "+name+", id: "+ID+", School name: "+schoolName;

    }
    public void printSchoolName(){
        System.out.println(schoolName+" School");
    }
}


class studentObjects{
        public static void main(String[] args) {

            Student st1= new Student();
            st1.name= "Gannysia";
            st1.ID =12345;

            Student st2 = new Student();
            st2.name ="Alex";
            st2.ID =13579;

            st1.schoolName ="Harvard";


            System.out.println( st1);
            System.out.println( st2);



        }
    }


