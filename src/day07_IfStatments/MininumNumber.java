package day07_IfStatments;

public class MininumNumber {

/*
          write a java program that accepts three numbers
                  and return the minimum number
				(assume that none of them are equal)
 */


    public static void main(String[] args) {

        double a = 102.6;
        double b = 60.5;
        double c = 200.5;

        boolean aMin = a<b && a<c;
        boolean bMin = b<a && b<c;
        boolean cMin = c<a && c<b;

        if(aMin){
            System.out.println(a+" is minimum number");
        }

        if(bMin){
            System.out.println(b+" is minimum number");
        }

        if(cMin){
            System.out.println(c+" is minimum number");
        }



    }
}
