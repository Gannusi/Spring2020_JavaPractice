package day24_Methods;

import javax.imageio.stream.ImageInputStream;

public class ReturnMethod {


    public static int maxNum(int a, int b) {

        if (a>=b){
           return a;
        }else{
            return b;
        }

    }


    public static void main(String[] args) {

      int w =maxNum(10,20);
        System.out.println(w);

      //int a =  maxNum(10, 20);
       int result = Addition(1000, 2000);
        System.out.println(result);

    }

    public static int  Addition(int a, int b) {

        return a+b;

    }



}
