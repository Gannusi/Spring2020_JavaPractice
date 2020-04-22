package day23_Methods;

public class ReverseString {


    public static void main(String[] args) {
        String names="Hanna";
        ReverseString(names);

        System.out.println();

        String  name1= "Karnaval";
        ReverseString(name1);

    }





    public static void ReverseString(String str){
        for( int i =str.length()-1; i>=0; i--){

            System.out.print(str.charAt(i));
        }

    }
}
