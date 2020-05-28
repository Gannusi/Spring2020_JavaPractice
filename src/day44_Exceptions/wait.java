package day44_Exceptions;

public class wait {

    public void wait(double seconds) {


       try{
           Thread.sleep(1000);
       }catch (Exception e){

           System.out.println("Go to sleep");
       }

    }

    public static void main(String[] args) {
        wait obj = new wait();

        obj.wait(10.5);
    }
}
