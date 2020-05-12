package Office_Hours2;

public class BestBuy {

    String location;
    int numberOfEmployees;
    String phoneNumber;
    static  int numberOfComputers;


    void close(){
        System.out.println("This BestBuy is closed");

    }
    public static  void  closeAll(){
        System.out.println("All are closing");
    }

}
