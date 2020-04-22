package day20_ArraysContinue;
import java.util.Scanner;

public class StringToArrays {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] strArr = new String[100];
        for (int i = 0; str.length()!=0; i++) {
            if (str.contains("$")){
                strArr[i] = str.substring(0, str.indexOf('$'));
                str = str.substring(str.indexOf('$') + 1);
            }else{
                strArr[i] = str;
                str = str.substring(0,0);
            }
        }
        System.out.println(strArr[3]);
    }
}