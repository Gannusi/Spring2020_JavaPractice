package day13_StringClass;

import com.sun.xml.internal.xsom.XSUnionSimpleType;

public class StringManipulations2 {


    public static void main(String[] args) {
        String str = "Cybertek School is the best";
        String schoolName = str.substring(0,str.length());
        System.out.println(schoolName);


        String fullName = "Kuzzat Altay";

        String firstName = fullName.substring(0,6);
        String lastName = fullName.substring(6,12);
        System.out.println(firstName+lastName);

        String Hanna = "Hanna Datsko";

        String firstname = Hanna.substring(0,5+1);
        System.out.println(firstname);

        String lastname = Hanna.substring(6,12);
        System.out.println(lastname);

        //String gmail = lastname.concat("_").concat(firstname).concat("@gmail.com");

        String gmail= lastname+"_"+firstname+"@gmail.com";
        System.out.println(gmail);


        String s1 = "I love Java Programing language ";

        String className = s1.substring(7);

        System.out.println(className);

        String s2 ="I like C# Programming C# C#";
        s2=s2.replace("C#","Java");
        System.out.println(s2);


        String name = "COVID 18";
        name = name.replace("18","19");
        System.out.println(name);

        String r1 = "I like C#, C# is fun, C# is cool";
        r1= r1.replace("C#", "Java");
        System.out.println(r1);

        String r2 = "Tomorrow is Monday, Tomorrow is Tuesday";
        r2 = r2.replace("Tomorrow","Today");

        System.out.println(r2);





    }
}
