package day03_VariablesContinue;

public class SalaryCalculator {
   /*
    Create a class called salary calculator, write a program that can calculate the taxt, and salary after tax based on the hourly rate & tax rates
    ex:
            if:
    rate = 55;
    stateTax = 0.04;
    federalTax =0.22;
    weeklyHours = 40;

   */

    public static void main(String[] args) {

//DataType variableName =Data;

        double hourlyRate = 55;
        double stateTaxRate =0.04;
        double federalTaxRate =0.22;
        byte weeklyHours =40;
        byte totalWeeks = 52;

        // Salary=hourlyRate * weeklyHour * 52;

        double salary = hourlyRate * weeklyHours * 52;
        // salary before tax


        //stateTax= salary * stateTaxRate
        double stateTax = salary * stateTaxRate;

        //federalTax=salary*federalTaxRate
        double federalTax = salary * federalTaxRate;

        //totalTax = stateTax - federalTax
        double totalTax = stateTax - federalTax;

        //salaryAfterTax= salary - stateTax -federalTax;
        double salaryAfterTax = salary - (stateTax - federalTax) ;



        System.out.println("Your Salary is: $" + salary );  // concatenation
        System.out.println("State Tax is: $" + stateTax );  // concatenation
        System.out.println("Federal Tax is: $"+ federalTax);
        System.out.println("Total Tax is: $" +  totalTax  );
        System.out.println("Salary After Tax is: $"+ salaryAfterTax );

        /*
        System.out.println("9"+3 );//93
        System.out.println(9+"3"); //93
        System.out.println(9+3);//12 addition

 */

    }
}
