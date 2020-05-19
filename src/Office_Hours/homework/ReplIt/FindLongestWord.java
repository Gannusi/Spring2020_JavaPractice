package Office_Hours.homework.ReplIt;

public class FindLongestWord {
/*
Given the array words, it will print the word
with the largest length. Assume that there are no 2 words
with longest length

Example:
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
prints jaaaaavvaaaaaaaaaa
 */
    public static void main(String[] args) {
                  //        0       1           2          3              4
        String [] words ={"aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"};

        int MaxLenghtString = words[0].length();

        String LongestWord = "";




            for (int k= 1; k <=words.length-1; k++) {

                if (words[k].length() > MaxLenghtString ) {
                    MaxLenghtString= words[k].length();
                    LongestWord= words[k] ;

                }
            }
        System.out.println(LongestWord);


        //System.out.println(LongestWord);







    }
}
