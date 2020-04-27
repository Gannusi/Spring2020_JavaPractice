package day29_Wrapper_ArrayList;

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




    }
}
