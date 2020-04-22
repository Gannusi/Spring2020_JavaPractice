package Office_Hours.Practice_03_25_2020;

public class IfElse_Practice {


    public static void main(String[] args) {

        int n = 201;
        if (201%2==0){
            System.out.println(n +" is even number ");
        }else {
            System.out.println(n +" is odd number ");
        }
        /*if (201%2 !=0){
            System.out.println(n +" is odd number");
        }
        */

        int age=20;
        if(age>=21){
            System.out.println("you are eligible to by alcohol");
        }else{
            System.out.println("you are not eligible to by alcohol");
        }

        boolean genderM = !true;

        if(genderM){
            System.out.println("Gender is Male");
        }else{
            System.out.println("Gender is Female");
        }

        boolean usCit =true;
        int ageOfPerson= 30;

        if (usCit == true && ageOfPerson >= 18) {

            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }




    }
}
