package day05_Unary_ShortstandOperation;

public class PostPre_practice {


    public static void main(String[] args) {

        int a =50;
        a = --a + a++ + a-- + a++;
            //49 +49  +  50 + 49

        System.out.println(a);

        int h = 1;
        h = -h-- + h++ / -h-- * --h;
        //   -1  +   0 /  -1  *  -1
        System.out.println(h);





    }
}
