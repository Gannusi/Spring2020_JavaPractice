package day45_Exceptions;

public class PushUp {

    public static void main(String[] args) {
        int pushUp =  0;

        while (pushUp<20){
            System.out.println("PushUp "+(pushUp+1));

            try {
                Thread.sleep(300);
            }catch(Exception e){ }

            pushUp++;
        }


    }
}
