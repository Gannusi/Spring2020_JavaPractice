package day41_Inheritance.task_1;

public class EmployeeObject {

    public static void main(String[] args) {
        Developer dev1 = new Developer(120000.00, "Hanna", 11111, "Star", 'F');

        dev1.fixingBug();
        System.out.println(dev1);


         Tester t1= new Tester("Eugine",125000.00,123,"STED",'M');
          t1.reporting();
        System.out.println(t1);


        BA b1 = new BA ("Gannusia", 150000.00, 1111,"BA", 'F' );

        b1.gathering();
        b1.whiteRq();
        System.out.println(b1);

    }

}
