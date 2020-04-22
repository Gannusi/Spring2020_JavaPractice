package day17_WhileLoops;

public class PalindromTest {


    public static void main(String[] args) {
        String str = "Level";
        String reversStr ="";

       int index= str.length()-1; // last index number

        while (index >=0){
           reversStr += str.charAt(index);

            index--;

        }

        boolean palindrome = reversStr.equalsIgnoreCase(str);

        System.out.println(palindrome);







    }
}
