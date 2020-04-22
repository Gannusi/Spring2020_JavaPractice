package day03_VariablesContinue;

public class arithmetic0perators {


    public static void main(String[] args) {

        System.out.println(5+3); //8
        System.out.println(10-2);//8
        System.out.println(10*3);//30


        System.out.println(10/2);//5
       // System.out.println(30/0); denominator cannot be zero

//reminder formula : nominator - (denominator * result of wholenumber )
        // 10 - (4 * 2) = 2
        int result1 = 10 % 3;
        System.out.println(result1);
        int res2 = 11%3;
        System.out.println(res2);
        int c1 = 10/4;
        System.out.println(c1);
        System.out.println(10.0/4);
        System.out.println(10/4.0);

        double d1 = 10/4;
        System.out.println(d1);

        double d2 = 10/4.0f;
        System.out.println(d2);



    }


}
