package day05_Unary_ShortstandOperation;

import java.io.LineNumberReader;

public class PrimitivesCastings {


    public static void main(String[] args) {

       int a =10;
       long b = a;


       int a1 = 100;
       long b1 = (long) a1; // manually doing the implicit casting
       //int c1 = b1;

        //explicit casting: casting larger primitives to smaller primitives type


        double Dn=5.5;
        float Fn = (float) Dn;
        System.out.println(Fn+1);


        double D1 =10.5;
        long L1 =(int)D1;
        System.out.println(L1);


        float F1 = 60.5f;
        int I1 = (short)F1;
        System.out.println(I1);

        long largeN = 99999999999l;
        int intN = (int) largeN;
        System.out.println(intN);



        char ch1 = 'a';
        short sh1 = (short)ch1;
        System.out.println(sh1);

        char ch2= 23456;

        double db1 = ch2;

        System.out.println(db1);






    }
}
