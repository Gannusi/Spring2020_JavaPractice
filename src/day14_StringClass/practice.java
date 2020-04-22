package day14_StringClass;

public class practice {


    public static void main(String[] args) {

        String gmail = "cybertekschool@gmail.com";

        String userinputGmail = "CybertekSchool@gmail.com";

        boolean result = gmail.equalsIgnoreCase(userinputGmail);

        if(result){
            System.out.println("Logged in");

        }

        System.out.println("======================================================");

//CONTAINS()
        String password = "abcd1234";

        if (password.contains(" ")){
            System.out.println("Password cannot contain space in it");

        }else{
            System.out.println("Valid password");


        }
//STARTSWITH() && ENDSWITH()

        String s3 = "United States";
        System.out.println(s3.startsWith("U"));


        System.out.println("======================================================");

        String webAddress = "Www.amazon.com";
        webAddress=webAddress.toLowerCase();

        if(webAddress.startsWith("www.")){

            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }


        System.out.println("======================================================");

        String s4 = "Cybertel School";
        System.out.println( s4.endsWith("l") );  // true
        System.out.println( s4.endsWith("School") ); // true

        System.out.println(s4.endsWith("Cybertek")); // false


        System.out.println("======================================================");


      String email="CybertekSchool@gmail.com";
      if (email.endsWith("@gmail.com")){
          System.out.println("Valid Gmail");

      }else{
          System.out.println("Invalid");
      }



    }
}
