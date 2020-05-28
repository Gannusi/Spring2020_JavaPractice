package day44_Exceptions;

public class ExceptioHandling {

    public static void main(String[] args) {

        String str ="Cybertek";
        try{
            System.out.println(str.charAt(200));
        }catch (RuntimeException e ){

          String dis = e.getMessage();
            System.out.println(dis);
        }
        System.out.println("============================================");
        try{

            System.out.println(100/0);

        }catch (ArithmeticException e){
           String description = e.getMessage();
            System.out.println(description);
        }

        System.out.println("Completed");


    }
}
