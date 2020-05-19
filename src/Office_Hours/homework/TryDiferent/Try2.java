package Office_Hours.homework.TryDiferent;

public class Try2 {


    public static void main(String[] args) {

        int grades[]={100, 93, 55, 73, 22, 432 };
        int num[]= new int[10];
        int i;


        for (i=0; i<=5; i++){
            System.out.println(i+" "+grades[i]);
        }

        for(i=0;i<=9;i++){
            num[i]= i+10;

        }
        for(i=0; i<=9;i++){
            System.out.println(num[i]);
        }




    }
}
