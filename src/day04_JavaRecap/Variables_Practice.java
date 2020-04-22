package day04_JavaRecap;

public class Variables_Practice {

    public static void main(String[] args) {



        // DataType variableName =Data;

        byte num1 = 127;
        short num2 = num1 ;
        int num4 = num2;// int is prefered by compiler
        long num5 = 9999999999l;

        float num6 =100L;
        System.out.println(num6);

        float num7 = 0.5f;
        System.out.println(num7);

        double num8 = 0.5f;
        double num9 = 99999999l;
        double num10 = 100.5;

        System.out.println(num10);

        char ch1 = '$'; // every single character has a corresponding number
        System.out.println(ch1);

        char ch2 = 199;

        System.out.println(ch2);

        int a1 = '8';
        System.out.println(a1); //56

        double d1 = 'z'+ '8'; //178.0
        System.out.println(d1);



        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(9>10); //false

        System.out.println(9>=9);
        System.out.println(9!=10);
        System.out.println('a'=='b');

        System.out.println('a'== 'b' - 1);




    }

}
