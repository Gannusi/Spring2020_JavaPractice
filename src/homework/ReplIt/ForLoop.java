package homework.ReplIt;

import java.util.Scanner;

public class ForLoop {


    public static void main(String[] args) {

        //#112

        int k = 1;
        //WRITE YOUR CODE HERE

        for (k = 1; k <= 97; k++) {
            String result = "*";
            System.out.print(result);
        }



        /* #110
        Given an int variable n that has already been declared
         and initialized to a positive value, and another int
         variable j that has already been declared, use a for
         loop to print a single line consisting of n asterisks.
         Thus if n contains 5, five asterisks will be printed.
          Use no variables other than n and j.


         */
        int j = 0;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();


        for (j = 0; j < n; j++) {

            String result = "*";

            System.out.print(result);
        }

        System.out.println();


        /*     #82
        Write for and while loops so that they print those numbers
         between 1 and 20 and divisible by 3.
          Expected Output:  3 6 9 12 15 18
         */
        for (int i = 1; i <= 20; i++) {
            if (i % 3 != 0) {
                continue;
            }
            System.out.print(i+" ");


            System.out.print("");



        }
    }
}

