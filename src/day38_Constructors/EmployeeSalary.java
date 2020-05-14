package day38_Constructors;

public class EmployeeSalary {

    public static void main(String[] args) {
        SalaryCalculator hanna = new SalaryCalculator(50, 40, 0.0825, 0.02);
        System.out.println(hanna.salary());
        System.out.println(hanna);


        System.out.println("============================================");
        SalaryCalculator GiGi= new SalaryCalculator(61,45,8.7/100,0.15);
        System.out.println(GiGi);
        System.out.println(GiGi.salary());


    }
}
