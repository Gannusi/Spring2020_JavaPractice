package Office_Hours.Practice_03_25_2020;

public class NestedIf_Practise2 {


    public static void main(String[] args) {

        int salary = 51000;
        int creditscore = 750;
        byte jobHistory = 1;
        if (salary>50000){
            if(creditscore>650){
                if (jobHistory>=2 ) {
                    System.out.println("You are qualified");
                }else{
                    System.out.println("You do not have enough job history , come back later");
                }



            }else{
                System.out.println("You do not have good credit score");
            }


        }else {
            System.out.println("You need to have a job that pays $50000");
        }








    }
}
