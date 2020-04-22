package Office_Hours.Practice_03_11_2020;

public class UnaryOperators_practice {

    public static void main(String[] args) {

        int a=20;
        System.out.println(a++);
        System.out.println(a);

        int b = 30;
        int c = b--;
        System.out.println(b);

        int d = 40;
        int e = d++;
        System.out.println(e);
        System.out.println(d);



        int x = 200;
        System.out.println(--x);
        System.out.println(x);


        int z =100;
        z = z++ + --z - z-- + ++z;
      //z = 100 +100 - 100 + 100
        System.out.println(z);

        int u = 900;
        int r = - ++u + ++u + -u++;
        // r = -901  +  902 + - 902
        //r = 1 + -902 =901
        System.out.println(r);
        System.out.println(u);


       ;







    }
}
