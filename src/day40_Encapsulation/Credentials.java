package day40_Encapsulation;


public class Credentials {

    private  String UserName;
    private  String Password;

    public  String getUserName(){
        return UserName;
    }
    public  void setUserName(String UserName){
        this.UserName= UserName;
    }
    public  String getPassword(){
        return Password;
    }
    public  void setPassword(String Password){
        this.Password= Password;
    }

}
class Credentials_Objects{
    public static void main(String[] args) {
        Credentials facebook = new Credentials();

        facebook.setUserName("megahannabananna@gmail.com");
        facebook.setPassword("Hannabanannaba1");
        System.out.println(facebook.getUserName());
        System.out.println(facebook.getPassword());


    }
}
