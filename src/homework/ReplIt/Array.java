package homework.ReplIt;

import java.util.Scanner;
import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {"hello", "why", "by", "apple" , "note"};

        for (int i=0; i<words.length; i++){
            System.out.println(words[i].charAt(0)+""+ words[i].charAt(words[i].length()-1));
        }

        for (int i = 0; i <= words.length -1; i++) {
            words[i] = words[i].charAt(0) + "" +
                    words[i].charAt(words[i].length() - 1);
        }
        System.out.print(Arrays.toString(words));
    }
}
