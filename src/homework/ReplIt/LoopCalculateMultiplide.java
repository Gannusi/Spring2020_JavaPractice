package homework.ReplIt;

import java.util.Scanner;

public class LoopCalculateMultiplide {


    public static void main(String[] args) {

       Scanner s = new Scanner(System.in);
        int n = s.nextInt();



        int sum=0;
        for(int i=0; i<=n;i++){

            sum+=i;
        }
        System.out.print(sum);





    }
}
