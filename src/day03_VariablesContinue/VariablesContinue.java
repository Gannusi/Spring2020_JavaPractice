package day03_VariablesContinue;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;

public class VariablesContinue {
    public static void main(String[] args) {


        System.out.println();


        boolean result1 = true ;
        boolean result2 = false;

        boolean result3= 10>9; // true
        System.out.println(result3);


         /*       >: greater
                >=: greater or equal
                <: less
                <=: less or equal
                == : equal
                != : not equal
        */

        System.out.println( true == false );
        System.out.println("Hanna"== "Good girl");

        System.out.println("Hanna" != "Good girl");


        boolean r1 = true != true;
        System.out.println(r1);


        boolean r2= "Batch 17" == "Batch 18";
        System.out.println(r2);


        System.out.println("===============================================");


        char ch1 = 'A';
        System.out.println(ch1);

        char ch2 = 45000;
        System.out.println(ch2);

        char ch3 = 25000;
        System.out.println(ch3);


        char ch4 = 100;
        System.out.println(ch4); //d

        char ch5 = 'D';
        System.out.println(ch5);


        int num1= 'D';
        System.out.println(num1);
        char ch6 = 'z';
        System.out.println(ch6);

      //  short s1= ch6;//char is larger than short

        int i1= ch6 ; //int is larger than chart



    }

}
