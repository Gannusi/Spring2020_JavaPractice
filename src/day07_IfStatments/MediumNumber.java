package day07_IfStatments;

public class MediumNumber {

    /*
    write a java program that accepts three numbers and
                return the medium number
           (assume that none of them are equal)

     */

    public static void main(String[] args) {

        double a = 12;
        double b = 38;
        double c = 25;
        boolean AMedium = a>c && a<b || a>b && a<c;
        boolean BMedium = b>c && b<a || b<c && b>a;
        boolean CMedium = c>b && c<a || c<b && c>a;
        if(AMedium){
            System.out.println(a+ "is the medium number");
        }
        if(BMedium){
            System.out.println(b+ "is the medium number");
        }
        if(CMedium){
            System.out.println(c+ "is the medium number");
        }
    }
}
