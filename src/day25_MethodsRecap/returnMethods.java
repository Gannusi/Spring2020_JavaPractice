package day25_MethodsRecap;

import com.sun.xml.internal.org.jvnet.fastinfoset.EncodingAlgorithmIndexes;

public class returnMethods {


    public static void main(String[] args) {
        System.out.println( max(10, 9));
        System.out.println( max1(10, 9));
    }



    public static int max(int a , int b ) {

        int max = 0;
        if ( a >= b ){
            max=a;

        }else{
            max=b;

        }

        return max;
    }

    public static int max1 ( int a , int b) {
        if(a>=b){
            return a;
        }else {
            return b;
        }

    }

}
