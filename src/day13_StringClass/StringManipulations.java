package day13_StringClass;

public class StringManipulations  {


    public static void main(String[] args) {

        String str = "Cybertek";
        //index       01234567


        char ch1 = str.charAt(5);
        System.out.println(ch1 == 'A');

        System.out.println(ch1 =='T');

        int totalLenght = str.length();
        System.out.println(totalLenght);

        System.out.println(totalLenght>250);
        String str2 = "Today is a great day, Java is Fun";

        int maxIndexNum= str2.length()-1 ;
        System.out.println(maxIndexNum);

        String s1 = "Cybertek";
        s1.concat("School");


        String s2 = "Java";
        System.out.println(s2.concat(" is programing language"));
        System.out.println(s2);

        s2 = s2.concat(" is programing language");
        System.out.println(s2);

        String r1 = "Java is fun";
             r1=  r1.concat(", and its easy");

        System.out.println(r1);



        String name1 ="CYBERTEK";
        name1=name1.toLowerCase();
        System.out.println(name1);

        String name2= "cybertek school";
        name2 = name2.toUpperCase();
        System.out.println(name2);


        String A1 = "      Today is a great day";
        A1=A1.trim();
        System.out.println(A1);




    }
}
