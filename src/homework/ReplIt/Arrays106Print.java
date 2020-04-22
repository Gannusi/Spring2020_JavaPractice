package homework.ReplIt;
;
public class Arrays106Print {


    public static void main(String[] args) {
       /* Given a String variable sentence, write code to type each word in separate lines.

        Example:
        sentence -> "Java is fun"
        Print
                Java
        is
                fun

        */

        String sentence = "I like Java";

        String[]  words = sentence.split(" "); // [ I, like, Java]


        for (String eachWord: words){ // 0 ~2
            System.out.println(eachWord);
        }



    }
}
