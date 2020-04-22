package day23_Methods;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Methods {

    /*
            step1: Hello Cybertek
            step2: Hello World 5 times
            step3: Hello Btach 18
            step4: Hello World 5 times
            step5: Helle Saim
            step6: Hello World 5 times
            */
    public static void main(String [] args){
        System.out.println("Hello Cybertek");
        printHelloWorld5Times();
        System.out.println("Hello Btach 18");
        printHelloWorld5Times();
        System.out.println("Hello Saim");
        printHelloWorld5Times();
        evenNumbers1_100();
        oddNumbers1_100();

    }



    public static void printHelloWorld5Times(){
        for (int i =0; i<5; i++) {
            System.out.println("Hello World");
        }
    }

    public static void evenNumbers1_100(){
        for (int q = 1; q< 101;q++){
            if (q%2==0){
                System.out.print(q+" ");
            }
        }
        System.out.println();
    }
    public static void oddNumbers1_100(){

        for (int w= 1; w<101; w++){
            if (w%2 !=0){
                System.out.print(w+" ");
            }
        }
    }



}
