package day41_Inheritance.task_2;

public class AccountObject {

    public static void main(String[] args) {

        CheckingAccount obj = new CheckingAccount();
        obj.accountHolder = "Saban";

        obj.showBalance();
        System.out.println(obj);

        obj.deposit(25000);
        obj.showBalance();

        obj.withdraw(10000);
        obj.showBalance();

        System.out.println(obj);

        System.out.println("==========================================================");
        SavingAccount saving = new SavingAccount();
        saving.accountHolder="GiGi";
        saving.deposit(3000);
        saving.showBalance();

        System.out.println(saving);


    }

}
