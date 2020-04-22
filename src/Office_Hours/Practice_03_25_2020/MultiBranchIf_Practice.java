package Office_Hours.Practice_03_25_2020;

import java.util.function.DoubleToIntFunction;

public class MultiBranchIf_Practice {


    public static void main(String[] args) {

        int num=0;

        if (num > 0) {

            System.out.println("Its positive number ");
        } else if (num < 0) {

            System.out.println("Its positive number ");
        }else{
            System.out.println("Its zero ");
        }

        int n1 =100;
        int n2= 200;

        if (n1>n2){
            System.out.println(n1+" is greater than "+n2);
        }else if(n1<n2){
            System.out.println(n2+" is greater than "+n1);
        }else{
            System.out.println(n1+" is equal to  "+n2);
        }

        System.out.println("==================================================");

        String browserNae = "Chrome";
        if (browserNae=="Firefox"){
            System.out.println("Firefox browser is opening");
        }else if(browserNae=="Chrome"){
            System.out.println("Chrome browser is opening");
        }else if (browserNae== "Internet Explore"){
            System.out.println("Internet Explore browser is opening");
        }else if (browserNae== "Safari"){
            System.out.println("Safari browser is opening");
        }else{
            System.out.println("Invalid Browser Name");
        }


    }

}
