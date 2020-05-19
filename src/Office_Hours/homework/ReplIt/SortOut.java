package Office_Hours.homework.ReplIt;

import java.util.Scanner;

public class SortOut {
    public static void main(String[] args) {

//71
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();

        //your code here

        String result = "";
        if (a.contains("alejandro") && a.contains("project")) {
            result = "read this mail";
        } else {
            result = "Don't read";
        }
        System.out.println(result);
//70
        a=(a.contains("alejandro")) ? "read this mail":"dont read";
        System.out.println(a);
    }
}