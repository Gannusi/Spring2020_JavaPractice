package homework.ReplIt;

import java.util.Scanner;

public class SenderMessageNumber {


    public static void main(String[] args) {
/*   #76

 */
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();

        String path = "";
        if (start.equalsIgnoreCase("A"))
            path += end.equalsIgnoreCase("A") ? "" : end.equalsIgnoreCase("B") ? "right: "
                    : end.equalsIgnoreCase("C") ? "right > down: " : "right > down > left: ";
        if (start.equalsIgnoreCase("B"))
            path += end.equalsIgnoreCase("B") ? "" : end.equalsIgnoreCase("C") ? "down: "
                    : end.equalsIgnoreCase("D") ? "down > left: " : "down > left > up: ";
        if (start.equalsIgnoreCase("C"))
            path += end.equalsIgnoreCase("C") ? "" : end.equalsIgnoreCase("D") ? "left: "
                    : end.equalsIgnoreCase("A") ? "left > up: " : "left > up > right: ";
        if (start.equalsIgnoreCase("D"))
            path += end.equalsIgnoreCase("D") ? "" : end.equalsIgnoreCase("A") ? "up: "
                    : end.equalsIgnoreCase("B") ? "up > right: " : "up > right > down: ";
        System.out.println(path + end + " found");


        System.out.print("");
        //FROM 1 TO 100

        // Way 1
        for (int i=2; i<=100; i+=2 ){
            System.out.print(i+",");
        }
         // Way 2
        for (int i=1; i<=100; i+=1 ){
            if (i%2!=0){
                continue;
            }
            System.out.print(i+",");
        }







    }
}
