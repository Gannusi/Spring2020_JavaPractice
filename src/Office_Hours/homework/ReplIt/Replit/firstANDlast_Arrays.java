package Office_Hours.homework.ReplIt.Replit;

public class firstANDlast_Arrays {

/*
Given a String array words, iterate through each word and print first and last letter of each element in separate lines.

Example:

words → ["hello", "why", "by", "apple" , "note"]
print:
       ho
       wy
       by
       ae
       ne

 */
    public static void main(String[] args) {

        String[] words = {"hello", "why", "by", "apple" , "note"};



        for(int i =0;  i <words.length; i++ ){
           String ch=  words[i].charAt(0)+""+words[i].charAt(words[i].length()-1);
           System.out.print(ch+" ");

        }










    }
}
