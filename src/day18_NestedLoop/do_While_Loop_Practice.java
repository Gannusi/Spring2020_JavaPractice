package day18_NestedLoop;

public class do_While_Loop_Practice {


    public static void main(String[] args) {

        /*
        print all even numbers 0~100 in the same line separated by a space
         */

        int num= 0;

        do{
            if(num %2 !=0){ // for even num ==
                System.out.print(num+" ");
            }


           num++;

        }while(num <=100);


        System.out.println("\n====================================================");


        int i = 1;

        do{

            System.out.println(i);
            i++;

        }while (i<=5);


        System.out.println("====================================================");

        int z =1;
        do{
            System.out.println(z);

            if(z==3){
                break;
            }

            z++;

        }while(z<=5);

        System.out.println("=================================");

        int y =1; //3
        do{

            if(y==3){
               y++;
                //continue;
            }


            System.out.println(y);

            y++;

        }while(y<=5);


        System.out.println("+=====================================================================");


        int t =1;

        do{

            if(t%2 !=0){
                t++;
                continue;

            }

            System.out.print(t+" ");

            t++;

        }while(t<=100);




    }
}
