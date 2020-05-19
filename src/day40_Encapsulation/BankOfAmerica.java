package day40_Encapsulation;

public class BankOfAmerica {

    public static void main(String[] args) {

        EmployeeInfo Rama = new EmployeeInfo();

        Rama.setSalary(12000.00);
        Rama.setAddress("Sovpa 23/12");
        System.out.println( Rama.getAddress());
        System.out.println(Rama.companyName);
        System.out.println(Rama.getSalary());
    }
}
