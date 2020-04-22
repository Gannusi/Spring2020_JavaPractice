package day06_Shorthnd_LogicalOperators;

public class singleIfStatment {


    public static void main(String[] args) {

     boolean coldWeather = true;
     if(coldWeather){
         System.out.println("Wear your hat");
         System.out.println("Wear your jacket");
     }

      boolean coronaDetected = true;
     if (coronaDetected){
         System.out.println("Buy more sanitizer");
         System.out.println("Buy more water");
         System.out.println("Stay home ");
     }

        System.out.println("==========================================");
     int a = 200;
     boolean evenN = a % 2 == 0;
     boolean oddN = a% 2 != 0;

     if (evenN) {

         System.out.println( a +" is even number");
     }
      if (oddN){
          System.out.println(a+" is odd number");
      }




    }
}
