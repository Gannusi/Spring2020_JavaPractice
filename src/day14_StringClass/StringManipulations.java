package day14_StringClass;

public class StringManipulations {


    public static void main(String[] args) {

        //indexOf(Value)
        String str = "I like to J learn Java. I like to watch Jumanji movie";

        int a1 = str.indexOf("J");// returns the index num of first matching one

        System.out.println(a1);

        int a2= str.indexOf("Jum");
        System.out.println(a2);

        int a3 = str.indexOf(" I")+ 1;
        System.out.println(a3);

        String s = "I like Java, and I like reading";

        int b1 = s.lastIndexOf("I");
        System.out.println(b1);

        int b2 = s.lastIndexOf("l");
        System.out.println(b2);

        String z = "I like C#, C# is cool";

        int c1 = z.lastIndexOf("C");
        System.out.println(c1);

        String x = "I like Java, Java is fun, Java programing is fun";

        int d1 = x.indexOf("Java is");
        System.out.println(d1);

        int d2 = x.indexOf(", J")+2;
        System.out.println(d2);

        int d3 = x.lastIndexOf("J");
        System.out.println(d3);

        int d4 = x.indexOf("Java p");
        System.out.println(d4);

        char ch1= x.charAt(26);
        System.out.println(ch1);


        System.out.println("===========================================");
        String q = "I like C#, C# is cool";

        int w1 = z.lastIndexOf("C");

        System.out.println(w1);

        String e = "I like Java, Java is fun, Java programming is fun";

        int r1 = x.indexOf("Java is");  // second J' index num
        System.out.println(r1);

        int r2 = x.indexOf(", J")+2;   // second J' index num
        System.out.println(r2);

        int r3 = x.lastIndexOf("J"); // last J' index number
        System.out.println(r3);

        int r4 = x.indexOf("Java p"); // last J' index number
        System.out.println(r4);


        char char1 =    x.charAt(26);

        System.out.println(char1);





    }
}
