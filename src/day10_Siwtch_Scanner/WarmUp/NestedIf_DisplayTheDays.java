package day10_Siwtch_Scanner.WarmUp;

public class NestedIf_DisplayTheDays {


    public static void main(String[] args) {

        int day=1;
        if(day<=7 && day>=1) {
            String result = (day == 1) ? "Monday" : (day == 2) ? "Tuesday" : (day == 3) ? "Wednesday" :
                    (day == 4) ? "Thursday" : (day == 5) ? "Friday" : (day == 6) ? "Wednesday" : "Sunday";
            System.out.println(result);
        }
        else{
            System.out.println("invalid entry");
        }


        System.out.println("=================================================================");


        byte num= 6;
        String word=(num==1)? "One" : (num==2)? "Two" : (num==3)? "Three" :
            (num==4)? "Four" : (num==5)? "Five" : (num==6)? "Six" :
             (num==7)? "Seven" : (num==8)? "Eight" : (num==9)? "Nine" : "Invalid Entry";
        System.out.println(word);


        System.out.println("===================================================================");


        byte month = 11;
        String result3 = "";
        if(month >=1 && month <= 12){
            result3=(month==2)? "28 days" : (month==4||month==6||month==9||month==11) ? "30 days" : "31 days";
        }else{
            result3="Invalid Month";
        }
        System.out.println(result3);




    }
}
