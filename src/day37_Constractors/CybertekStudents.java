package day37_Constractors;

public class CybertekStudents {

    static  String schoolName;
   String studentName;
   int groupNumber;
   String batch;


   public  CybertekStudents(String studentName, int groupNumber, String batch){
       schoolName= "Cybertek";
       this.studentName = studentName;
       this.groupNumber = groupNumber;
       this.batch = batch;
   }

   public  String toString (){
       return "Name: "+ studentName+", Batch: "+batch+", in group: "+groupNumber+", School name: "+ schoolName;

   }

}

class CObjects{

    public static void main(String[] args) {
        CybertekStudents student1 = new CybertekStudents("Hanna", 17, "B 18");
       student1.schoolName="MIT";
        System.out.println( student1);

        CybertekStudents student2 = new CybertekStudents("Sarah", 2, "B 18");
        System.out.println( student2);

        }

}
