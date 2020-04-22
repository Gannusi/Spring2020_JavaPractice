package day13_StringClass;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class StringLiterals {
    public static void main(String[] args) {


        String str1 = "Cat";
        String str2 = new String("Cat");

        System.out.println(str1+" : "+str2);
        System.out.println(str1 == str2);

        String str3 = "Cat";

        System.out.println(str1 == str3);

        String str4 = new String("Cat");
        System.out.println(str2 == str4);

        String s1 = "Java"; // String pool , immutable we cannot modify it
        s1 = "JavaScript";
        //s1 = "Java";
        System.out.println(s1);

        String s2 = "Java";
        System.out.println(s2);

        System.out.println(s1 == s2);






    }
}
