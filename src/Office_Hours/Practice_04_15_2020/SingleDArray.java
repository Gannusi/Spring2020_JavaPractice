package Office_Hours.Practice_04_15_2020;

import day18_NestedLoop.StringReverse;

import java.util.Arrays;

public class SingleDArray {


    public static void main(String[] args) {

        int a= 100;
        int[] arr={100, 200, 300};

        System.out.println(arr[1]);

        for(int i=0;i<=2; i++){

           int num =arr[i];

            System.out.println(num);
        }


        System.out.println("===========================");
        int j= 0;
        while(j<=2){

            int num=arr[j];
            System.out.println(num);
            j++;

        }
        System.out.println("===========================");
        String[] names ={"Hanna", "Aron", "Luoise", "Muhtar"};

        //int length = names.length;
        String[] reverseName= new String[names.length];// {null, null, null}
/*                IIII       KKKK
       reverseName[0]= names[2];
        reverseName[1]= names[1];
        reverseName[2]= names[0];
        System.out.println(Arrays.toString(reverseName));

 */

         /*  int k = names.length-1;
        for(int i =0; i < names.length; i++){
            reverseName[i]= names[k];

            k--;
        }
        System.out.println(Arrays.toString(reverseName));

          */

         int i=0;
         int k =names.length-1;
         while (i<names.length){


             reverseName[i] = names[k];
             i++;
             k--;
         }

        System.out.println(Arrays.toString(reverseName));




    }
}
