package day40_Encapsulation;

public class Person {
    public  String name;

    private  long SSN;
    private long ID;

    public  Person(String  name){   this.name=name;   }

    public long getSSN(){    return SSN;    }
    public  void setSSN(long SSN){    this.SSN= SSN;   }

    public long getID(){    return ID;    }
    public  void setID(long ID){    this.ID= ID;   }


    public  void setSSNansID(long SSN,long ID){
        this.SSN= SSN;
        this.ID=ID;
    }

}
class Person_Object{
    public static void main(String[] args) {
        Person Hanna= new Person("Hanna");
        System.out.println(Hanna.name);
        //System.out.println(Hanna.SSN);

        Hanna.setSSN(12344);
        System.out.println("Hanna's SSN: "+Hanna.getSSN());

        Hanna.setID(11111111);
       System.out.println("Hanna's ID: "+Hanna.getID());
    }

}
