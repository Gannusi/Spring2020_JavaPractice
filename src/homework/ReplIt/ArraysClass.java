package homework.ReplIt;
import java.util.Arrays;
public class ArraysClass {

    public static void main(String[] args) {


        String word ="I like java";
        char [] chArrays = word.toCharArray();
        // We convert word to characters and assign it to char [] chArrays


        System.out.println(word);
        // This one prints original word -> I like java


        System.out.println(Arrays.toString(chArrays));
        // This one prints characters


        String wo =" I like java";
        char [] cArrays = wo.toCharArray(); // We convert word to characters and assign it to char [] chArrays
        System.out.println(wo);   // This one prints original word -> I like java
        System.out.println(Arrays.toString(cArrays)); // This one prints characters


        String j= "My name is Hanna";
        System.out.println(j);

        char[ ] letterArrays =j.toCharArray();
        System.out.println(Arrays.toString(letterArrays));
    }
}
