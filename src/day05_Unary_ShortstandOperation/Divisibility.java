package day05_Unary_ShortstandOperation;

public class Divisibility {
/*
2. write a program that can check if a number is evenly divisible by 2, 3, 5,
            Ex:
                number = 65;
                number = 65;  ==> int
            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true

 */
    public static void main(String[] args) {

        int num = 65;
        boolean evenum1 = num % 2 == 0;
        boolean evenum2 = num % 3 == 0;
        boolean evenum3 = num % 5 == 0;

        String result1 = num +" is devisible by 2:"+ evenum1;
        System.out.println(result1);

        String result2 = num +" is devisible by 3:"+ evenum2;
        System.out.println(result2);

        String result3 = num +" is devisible by 5:"+ evenum3;
        System.out.println(result3);

        System.out.println("\n");

        System.out.println(result1+"\n"+result2 + "\n" +result3);



    }
}
