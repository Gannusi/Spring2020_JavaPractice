package day19_Arrays;

public class Uniques_ch {
/*
 write a program that can return the unique characters from a string
		Ex:  "AABCC" ==> "B"

 */

    public static void main(String[] args) {

        String str ="ABACCECCTTTF";

        String result= "";



        for(int q= 0; q<= str.length()-1; q++) {


            int count = 0;
            for (int i = 0; i <= str.length()- 1; i++) {

                if (str.charAt(i) == str.charAt(q)) {
                    count++;
                }
            }
            if (count == 1) { // if unique

                result += str.charAt(q);



            }
        }
        System.out.println(result);






    }
}
