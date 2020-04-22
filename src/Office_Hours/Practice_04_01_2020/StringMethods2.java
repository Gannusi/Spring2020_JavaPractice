package Office_Hours.Practice_04_01_2020;

import java.sql.SQLOutput;

public class StringMethods2 {


    public static void main(String[] args) {
        //is empty
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!isEmpty()!!!!!!!!!!!!!!!!!!!!!!!");

        String str1 = " " ;


        boolean r1 = str1.isEmpty();
        System.out.println(r1);

        boolean r2 =!str1.isEmpty();
        System.out.println(r2);


        System.out.println("!!!!!!!!!!!!!!!!!!!!!!equals()!!!!!!!!!!!!!!!!!!!!!!!");

        String r3 = "cat";
        String r4 = new String("cat");
        String r5 = "Cat";


        System.out.println(r3==r4);
        System.out.println(r3.equals(r4));
        System.out.println(r5.equals(r3));
        System.out.println(r5.equalsIgnoreCase(r3));



        System.out.println("!!!!!!!!!!!!!!!!!!!!!!contains()!!!!!!!!!!!!!!!!!!!!!!!");
        // checks than str is included in the string, returns boolean

        String sentence = "I like to learn Java";
        System.out.println(sentence.contains("Java"));

        String sentence1 = "Top 3 Viruses: 1. Corona, 2. Hounta, 3. Ebola";
        System.out.println(sentence1.contains("Java"));


        System.out.println("!!!!!!!!!!!!!!!!!!!!!!startsWith() && endsWith() !!!!!!!!!!!!!!!!!!!!!!!");

        String web ="www.amazon.com";
        System.out.println(web.startsWith("www."));
        System.out.println(web.endsWith(".com"));





    }
}
