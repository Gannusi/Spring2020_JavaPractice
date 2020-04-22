package day06_Shorthnd_LogicalOperators;

public class warmUp {

    public static void main(String[] args) {

/*
 1. write a java program that converts gallons to liters
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    2. write a java program that converts litters to gallons
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    3. manually calculate the following code fragments:
                1. int a = 200;
                    int b = -a++ + - --a * a-- % 2
                    b = ?
                2. int x = 300;
                   int y = 400;
                   int z = x + y - x * y +x / y;
 */


        double gallon =5;
        double galToliter = gallon * 3.785;
        String result = gallon +"gallon equal to:" + galToliter+ "liters";
        System.out.println(result);


        // liter to gallon
        double numberOfLiters = 100;
        double litersToGalons =  numberOfLiters / 3.785;
        String result2 = numberOfLiters+" liters equal to "+litersToGalons+" galons";
        System.out.println(result2);



        int a = 200;
        int b = -a++ + - --a * a-- % 2;
        //  b=  -200 + -200* 200%2
        // -200 + -40000 % 2
        //  -200 + 0
        //b =-200
        System.out.println(b);
        System.out.println(a);


        int x = 300;
        int y = 400;
        int z = x + y - x * y + x / y;
        // 300 + 400 - 300 * 400 + 300/400
        // 300 + 400 - 120000 + 0
        //700 -120000
        // -119300
        System.out.println(z);


    }
}
