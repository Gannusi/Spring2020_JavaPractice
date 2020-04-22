package Office_Hours.Practice_04_01_2020;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import com.sun.xml.internal.ws.server.ServerRtException;
import sun.jvm.hotspot.memory.PlaceholderEntry;
import sun.jvm.hotspot.ui.tree.CStringTreeNodeAdapter;
import sun.text.normalizer.UCharacter;

import java.util.Scanner;

public class StringMethods {


    public static void main(String[] args) {
       /* Scanner s = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String str = s.next();
        int IndexNum  = str.length();
        System.out.println(IndexNum);
*/

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!charAt()!!!!!!!!!!!!!!!!!!!!!!!");

        String str1 = "Java ";
        //             01234

        char ch1 = str1.charAt(1);
        System.out.println(ch1);
       // char ch2 = str1.charAt(4); Out of range , we don't have 4
       // System.out.println(ch2);

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!length()!!!!!!!!!!!!!!!!!!!!!!!");

        //1----->2345
        String str2 ="Cybertek school";
        int total = str2.length();
        System.out.println(total);

        int maxIndex = str2.length()-1;
        System.out.println(maxIndex);

        char lastCharacter = str2.charAt(maxIndex);
        System.out.println(lastCharacter);

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!concat()!!!!!!!!!!!!!!!!!!!!!!!");

        String str3 = "Cybertek";
             str3=  str3.concat(" School");

        System.out.println(str3);

        String str4 = "Java";
         str4= str4.concat(" is fun");

        System.out.println(str4);



        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!toLowerCase() && toUpperCase()!!!!!!!!!!!!!!!!!!!!!!!");

        String str5 = "CYBERTEK SCHOOL";
        str5 = str5.toLowerCase();
        System.out.println(str5);

        String str6 = "cybertek school";
        str6 = str6.toUpperCase();
        System.out.println(str6);


        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!trim()!!!!!!!!!!!!!!!!!!!!!!!");

        // trim() : removes unused space from the string

        String str7 ="    Cybertek";
               str7=str7.trim();


        System.out.println(str7);
        System.out.println(str7.length());


        String str8 = "    ";
        str8= str8.trim();
        System.out.println(str8.length());



        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!substring()!!!!!!!!!!!!!!!!!!!!!!!");

        String sent1 = "I like Java";
        //              0123456789..
        String word1= sent1.substring(7, sent1.length());
        String word2 = sent1.substring(2,6);

        String word3 = sent1.substring(2, 6)+sent1.substring(7);

        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);


        //beginning index
        String sent2 = "I like to learn Java";
        //              01234567890123456789
       String r1= sent2.substring(10);
        System.out.println(r1);

        String r2 ="Java";//JaVa
        //          0123

        String r3 = r2.substring(0,2);
        String r4 = r2.substring(2,3);
             r4= r4.toUpperCase();

        String r5 = r2.substring(3);

        String result = r3+r4+r5;
        System.out.println(result);


        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!replace()!!!!!!!!!!!!!!!!!!!!!!!");
        //replace - matching ones
        //replaceFirst first matching

        String str = "I like C#, C# is cool";
        str = str.replace("C#","Java");
        System.out.println(str);

        String t1 = "Java is fun, Java is good";
        t1 = t1.replaceFirst("Java", "C#");
        System.out.println(t1);


        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!lastIndexOf() && indexOf()!!!!!!!!!!!!!!!!!!!!!!!");

        String y1 = "Today W is Wednesday";
        int a1= y1.indexOf("W");
        int a2 = y1.indexOf("Wednesday");


        System.out.println(a1);
        System.out.println(a2);

        //lastIndexOf
        String y2 = "Cybertek School, School ";
        int a3 = y2.lastIndexOf("S");
        System.out.println(a3);

        String d = "Hello World";
        d.trim();
        int z = d.indexOf(" ");
        System.out.println(z);


        String f = "Batch 18";
        int Z = f.trim().length();
        System.out.println(Z);









    }
}
