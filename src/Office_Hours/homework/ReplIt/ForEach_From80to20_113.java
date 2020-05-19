package Office_Hours.homework.ReplIt;

public class ForEach_From80to20_113 {
    /*
    Write a for loop that prints all the even
    integers from 80 through 20 inclusive, separated by spaces.

    MUST USE FOR EACH LOOP
     */
    public static void main(String[] args) {


         String  result= "";

        for(int i=80; i >=20   ;i--){
           if (i %2 ==0) {
               /*  System.out.print(i+" ");

           }}

           */
               result +=i+" ";


           }

        }
        //System.out.println(result); //good too

       String[] outputN = result.split(" ");

        //System.out.println(Arrays.toString(outputN));//[80, 78, 76, 74, 72, 70, 68, 66, 64, 62, 60, 58, 56, 54, 52...

        for ( String each : outputN){
            System.out.print(each+" ");
        }



    }
}
