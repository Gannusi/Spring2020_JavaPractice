package Office_Hours.Practice_04_08_2020;


import java.util.Scanner;

public class find_Max_and_Min {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int max= -2147483648;//0

        int i = 1;
        while(i<=3){

            System.out.println("Enter a number ");
            int num = s.nextInt();

            if( num> max){
                max=num;
            }

            i++;
        }
        System.out.println("Max number is "+max);


        System.out.println();

        System.out.println("==================================================================");


        int min = 214748368;

        int q = 1;
        while(q <=3){
            System.out.println("Enter a number ");
            int num = s.nextInt();

            if( num<min ){
                min =num;

            }
            q++;


        }
        System.out.println("Minimum number is "+min);

    }
}
