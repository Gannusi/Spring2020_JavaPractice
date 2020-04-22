package day09_NestedIf_Ternary;

public class Ternary2 {


    public static void main(String[] args) {

        int age = 80;


        boolean eligibility = (age>=21 )? true: false ;


       /* if (age >= 21){
           eligibility = true;
        }else {
            eligibility =false;
        }

        */
        System.out.println(eligibility);

        System.out.println("==================================================");


        int ageOfPerson = 10;
        String  eligibleToVote = "";
        if (ageOfPerson >= 18){
            eligibleToVote = "YES";

        }else {
            eligibleToVote= "NO";

        }

        String eligibleToVote2 = (ageOfPerson >= 18) ?  "YES":"NO";


        System.out.println(eligibleToVote);
        System.out.println(eligibleToVote2);





    }
}
