package day10_Siwtch_Scanner.WarmUp;

public class Days {
/*
write a program that can display the days based on the numbers 1 ~ 7
			MUST USE NESTED IF
 */

    public static void main(String[] args) {

        int num = 9;
        String result1 = "";



        if(num > 0  && num < 8 ){

            if(num ==1 ){
                result1 = "Monday";
            }else if(num == 2){
                result1 = "Tuesday";
            }else if(num == 3){
                result1 = "Wednesday";
            }else if(num ==4){
                result1 = "Thursday";
            }else if(num == 5){
                result1 = "Friday";
            }else if(num == 6){
                result1 = "Saturday";
            }else{
                result1 = "Sunday";
            }

        }else{
            result1 = "Invalid";

        }
        System.out.println(result1);






        int day = 0;
        String result = "";
        if(day>=1 && day<=7){

            result = (day ==1) ? "Monday" : (day == 2) ? "Tuesday" :
              (day == 3) ? "Wednesday" : ( day ==4) ? "Thursday" :
               (day == 5)? "Friday" :  (day == 6) ? "Saturday" : "Sunday";

        } else{
        result = "Invalid";

    }

        System.out.println(result);





    }
}
