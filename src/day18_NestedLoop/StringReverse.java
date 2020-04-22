package day18_NestedLoop;

public class StringReverse {


    public static void main(String[] args) {

        String str ="po po po po po ";

        String rev = "";

        int lastIndex = str.length()-1;
        System.out.println(lastIndex);

        do{

            rev += str.charAt(lastIndex);


           lastIndex--;


        }while (lastIndex >= 0 );

        System.out.println(rev);






    }
}
