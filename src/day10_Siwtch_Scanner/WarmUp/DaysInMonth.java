package day10_Siwtch_Scanner.WarmUp;

import com.sun.xml.internal.ws.server.ServerRtException;

public class DaysInMonth {

    /*
    write a program that can find the number of days in a month
	 	(Assume that Feb has 28 days)
		 		28 days: 2
		 		30 days: 4,6, 9, 11
		 		31 days: 1,3,5,7,8,10,12
	 		MUST USE NESTED IF
     */

    public static void main(String[] args) {

        int n = 17;

        boolean days28= n==2;
        boolean days30= n == 4 || n==6 || n==9 || n==11;

        String result = "";

        if(n > 0 && n<13){

            result = (days28)? "Has 28 days" : (days30)? "Has 30 days" :
                    "Has 31 day";

        }else{
            result = "Invalid";

        }

        System.out.println(result);





    }
}
