package day26_MethodOverLoadig;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class MethodOverloading2 {

    public static void main(String[] args) {
        //10,5
        sum2Numbers(10, 20);

        sum3Numbers(10, 15, 15);

        sum4Numbers(10, 20, 30, 5);

        System.out.println("=======================================");
        sum(10, 5);

        sum(10, 5, 10);

        sum(10, 10, 20, 5);


        int[] arr1 = {1, 2, 3};

        char[] arr2 = {'z', 'a', 's'};

        double[] arr3 = {9.1, 2.4, 5.6};


    }


    public static void sum2Numbers(int a, int b) {
        System.out.println(a + b);


    }

    public static void sum3Numbers(int a, int b, int c) {
        System.out.println(a + b + c);


    }

    public static void sum4Numbers(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);

    }
    //================================================================

    public static void sum(int a, int b) {
        System.out.println(a + b);

    }

    public static void sum(int a, int b, int c) {
        System.out.println(a + b + c);


    }

    public static void sum(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);


    }
}
