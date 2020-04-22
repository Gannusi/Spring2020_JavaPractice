package day24_Methods;

import javax.imageio.stream.ImageInputStream;

public class ReturnMethod {


    public static void maxNum(int a, int b) {

        if (a>=b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }

    }


    public static void main(String[] args) {



      //int a =  maxNum(10, 20);
       int result = Addition(1000, 2000);
        System.out.println(result);

    }

    public static int  Addition(int a, int b) {

        return a+b;

    }



}
