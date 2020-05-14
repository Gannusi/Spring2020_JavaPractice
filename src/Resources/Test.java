package Resources;
import day39_AccsessModifiers.AccessModifiers;

public class Test {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
       // System.out.println(obj.defaultAccess);//default only accessible in same package
        System.out.println(obj.publicAccess);//open to the world

       // System.out.println(obj.SSN);//privet only accessible in the same class


    }
}
