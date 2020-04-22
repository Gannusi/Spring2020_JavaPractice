package day07_IfStatments;

public class If_Else_Statements {


    public static void main(String[] args) {

     int number =0;
     if(number>=0){
         System.out.println(number+" is positive");
     }
        if(number<0){
            System.out.println(number+" is negative");
        }

        if(number >=0){
            System.out.println(number+" is positive");
        } else {
            System.out.println(number+" is negative");
        }




        int nu =50;
        if(nu % 2 ==0){
            System.out.println(nu +" is even number");
        } else {
            System.out.println(nu +" is odd number");
        }


        int age = 20;
        if (age >= 21) {

            System.out.println("here is your Vodka");
        } else {
            System.out.println("get out of here ");
        }

        boolean testedPositiveForCorona =false;
       if(testedPositiveForCorona){
           System.out.println("wear mask, stay home ");
       } else {
           System.out.println("do more coding");
       }




    }
}
