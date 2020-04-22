package day09_NestedIf_Ternary;

public class ageGroups_NestedIf {


    public static void main(String[] args) {


       int age =27;
       String ageGroup = "";

       if (age<150 && age > 0){

           if (age<21){
               ageGroup = "Teenager";
           }else if (age< 55){
               ageGroup = "Adult";
           }else if(age>=55){
               ageGroup="Senior";
           }


       }else{
           ageGroup = "Invalid Entry";

       }
        System.out.println(ageGroup);


        System.out.println("=======================================================");

        int age2 =45;
        String ageGroup2 ="";

        if(age2 < 150 && age2 > 0 ){

            ageGroup2 = (age2 < 21) ? "Teenager" :(age2<55)? "Adults" : "Senior";

        }else{
            ageGroup2 = "Invalid Entry";
        }

        System.out.println(ageGroup2); // Adult










    }
}
