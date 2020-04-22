package day16_ForLoop;

public class Alphabets {


    public static void main(String[] args) {

        String upperCase = "";
        String lowerCase = "";


        for ( char ch ='A'; ch <= 'Z'; ch++){
            upperCase += ch;

        }
        System.out.println(upperCase);

        for(char ch = 'a'; ch <= 'z'; ch++ ){
            lowerCase += ch;

        }
        System.out.println(lowerCase);



        //Aa Bb Cc Dd.........Zz
        String result ="";

        for(int i = 0; i <= upperCase.length()-1 ; i++){
            result += upperCase.charAt(i)+""+ lowerCase.charAt(i)+" ";
        }
        System.out.print(result);


        System.out.println();
        // second solution
        int a = 97;
        int A= 65;


        String result2="";

        for (int i = 0; i<26 ; i++){
            char ch = ( char) (A + i);
            //                 65
            char ch2= (char ) (a+i);

            result2 +=ch +""+ ch2+" ";



        }
        System.out.println(result2);


        char alphabet;
        for(alphabet='a'; alphabet<='z'; ++alphabet){
            System.out.print(alphabet+" ");
        }


        for(char alphabet3 = 'a'; alphabet3 < 'z'; alphabet3++){
            System.out.print(alphabet3);
        }
        System.out.println();
        for(char alphabet1= 'Z'; alphabet1 > 'A'; alphabet1--){
            System.out.print(alphabet1);
        }


    }
}
