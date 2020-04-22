package day15_ForLoop;

public class ForLoop_Practice {


    public static void main(String[] args) {

        /*
        odd numbers from 1->100 separated by the space
         */

        String result = "";

        for(int number = 1; number<101; number += 2){
           // System.out.print(number+" ");
            ///////OR//////

            result += number+" ";

        }
        System.out.println(result);




        String resultEven = "";
        for(int number = 0;  number <= 100; number += 2 ){
            resultEven += number+" ";
        }

        System.out.println(resultEven);




        for(int i = 0; i<=100; i++){
            System.out.println(i);
        }




    }
}
