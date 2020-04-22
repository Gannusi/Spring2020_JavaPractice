package day24_Methods;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class returnMethods_Practice {


    public static void main(String[] args) {
        int [ ] arr = {10, 232, 1, 344, 67, 3, 10};

        int max = maxNumber(arr);
        System.out.println(max);


        int min = minNumber(arr);
        System.out.println(min);

    }



    public static int maxNumber(int[ ] arr) {
        Arrays.sort(arr);

        return arr[arr.length-1];


    }

    public static int minNumber (int[] arr) {

        Arrays.sort(arr);

        return arr[0];

    }



}
