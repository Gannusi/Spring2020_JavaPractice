package day29_Wrapper_ArrayList;

import java.util.Arrays;

public class ValueOfMethods {

    public static void main(String[] args) {

        String str  = "123";
        Integer a = Integer.valueOf(str);

        System.out.println(a);

       double b = Integer.valueOf(str);

        System.out.println(b);


        String str2 ="15.5";

        double d1= Double.parseDouble(str2);

        double d2= Double.valueOf(str2);


        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d1==d2);



        int z = 2000;
        //Long l1 = z;  does not except any other primitives that long


        Short sh1 =3000;
        int z2 =sh1;



        String b1="TRue";
        boolean b3=Boolean.parseBoolean(b1);
        System.out.println(b3);
        String b2="FalSe";
        boolean b4=Boolean.valueOf(b2);
        System.out.println(b4);
        String f1="1000000000.5";
        float f2=Float.valueOf(f1);
        System.out.println(f2);
        String sh="12345";
        short sh2=Short.valueOf(sh);
        System.out.println(sh2);


        String  r1= "true";
        Boolean t1= Boolean.valueOf(r1);

        boolean t2 =Boolean.valueOf(r1);

        System.out.println(t1);
        System.out.println(t2);

        System.out.println("============================");
        int maxNum = Integer.MAX_VALUE;
        System.out.println( maxNum);

        double maxNum2 =Double.MAX_VALUE;
        System.out.println(maxNum2);

        int minNum = Integer.MIN_VALUE;
        System.out.println(minNum);

        byte maxNum3 = Byte.MAX_VALUE;
        System.out.println(maxNum3);

        byte minNum2 = Byte.MIN_VALUE;
        System.out.println(minNum2);

     System.out.println("====================================");

     boolean [] arr = new boolean[3];
     System.out.println(Arrays.toString(arr));


     //Character[] arr2 = new Character[3];
    Integer[] arr2 = new Integer[3];
     System.out.println(Arrays.toString(arr2));








    }
}
