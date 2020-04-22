package homework.ReplIt.Replit;

import java.util.Scanner;

public class AveregeDoubleNumber119 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int k = 0;
        double total = 0;
        double avgTemp = 0;
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };



        for (double EachLoop: temps){
            k++;
            total += EachLoop;
        }
        avgTemp= total/k;
        System.out.println(avgTemp);



        int length = temps.length;
        for(int i = 0; i < length; i++  ){
            double eachNum =  temps[i];
            total +=  eachNum;
        }
        avgTemp = total/length;
        System.out.println(avgTemp);


    }
}
