package day41_Inheritance;
/*
create costum class called BankAccount for Bank of America' bank accounts:
			public variables:  bankName, firstName, lastName
	 		private variables: accountHolder, accountNumber, balance
	 		encapsulate all the private data
	 				(DO NOT USE SHORTCUT)
	 		create a constructor that can initialize firstName and fullName
	 				(DO NOT USE SHORTCUT)
	 		action:
	 				depositing
	 				withdrawing
	 				availablebalance
	 				toString: returns the full name and balance
 */
public class BankAccount {
    public static  String bankName ="Bank of America";
    public String  firstName;
    public  String lastName;

    private  String accountHolder;
    private  long accountNumber;
    private  double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public BankAccount(String firstName, String lastName){

        this.firstName=firstName;
        this.lastName=lastName;
        this.accountHolder= firstName+" "+lastName;
    }
    public  String getAccountHolder(){
        return  accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public  void depositing(int amount){
        //balance+=amount;
        setBalance(balance+amount);
    }
    public  void withdrawing(int amount){
        setBalance(balance-amount);
    }
    public  void checkBalance(){
        //System.out.println("Available balance: "+balance);
        System.out.println("Available balance: "+getBalance());
    }
    public String toString(){
        return  "Full name: "+ getAccountHolder()+", Balance: "+getBalance();
    }
}

class BAO{
    public static void main(String[] args) {
      BankAccount Hanna = new BankAccount("Hanna", "Datsko");
        System.out.println(Hanna.getAccountHolder());
        System.out.println(Hanna.getBalance());

        Hanna.checkBalance();
        Hanna.depositing(120);
        Hanna.checkBalance();
        Hanna.withdrawing(30);
        Hanna.checkBalance();
        System.out.println(Hanna);

    }



}










