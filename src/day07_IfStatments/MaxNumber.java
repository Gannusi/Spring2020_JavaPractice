package day07_IfStatments;

public class MaxNumber {
    /*
            2. write a java program that accepts three
                numbers and return the maximum number
				(assume that none of them are equal)
         */


    public static void main(String[] args) {

        double a = 100.5;
        double b = 200.5;
        double c = 300.5;

        boolean aGrater = a>b && a>c ;
        boolean bGrater = b>a && b>c ;
        boolean cGrater = c>a && c>b ;

        if(aGrater){
            System.out.println(a+" is maximum number");
        }
        if(bGrater){
            System.out.println(b+" is maximum number");
        }
        if(cGrater){
            System.out.println(c+" is maximum number");
        }

    }
}
