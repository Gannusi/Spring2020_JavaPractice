package Office_Hours.Practice_04_15_2020;

import homework.ReplIt.Array;

public class NestedLoops {


    public static void main(String[] args) {
//                           arr2D[0][i]    arr2D[1][i]      arr2D[2][i]
        char [][]  arr2D = {  {'A','B' } , {'C', 'D', 'E' } , {'F', 'J', 'H'}  };


        for ( int q= 0; q< arr2D.length; q++) {


            for (int i = 0; i < arr2D[q].length; i++) {

                System.out.println(arr2D[q][i]);
            }
            System.out.println();

        }


        System.out.println("===========================================");
        //char [][]  arr2D = {  {'A','B' } , {'C', 'D', 'E' } , {'F', 'J', 'H'}  };

        for ( char[] each1DArray: arr2D){

            for (char eachElement :each1DArray){

                System.out.println(eachElement);
            }
            System.out.println();
        }




    }
}
