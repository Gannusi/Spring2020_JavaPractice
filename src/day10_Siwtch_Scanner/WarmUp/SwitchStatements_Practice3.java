package day10_Siwtch_Scanner.WarmUp;

public class SwitchStatements_Practice3 {


    public static void main(String[] args) {


        char ch = 'a';
        String result = "A";

        switch (ch){

            case 'A':
                //System.out.println("A");
                result = "A";
                break;

            case 'B':
                //System.out.println("B");
                result = "B";
                break;

            case  'C':
                //System.out.println("C");
                result = "C";
                break;

            case 'D':
                //System.out.println("D");
                result = "D";
                break;

            default :
                //System.out.println("Invalid");
                result = "Invalid";

        }

        System.out.println(result);

    }
}
