package assignment9;

public class BankAccountTest {

	public static void main(String[] args) {

	BankAccount bankAccount = new BankAccount("011301031","Charlie Brown");
	
	bankAccount.deposit(5000);
	bankAccount.deposit(4000);
	
	System.out.println("Account number: " + bankAccount.getAccountNumber() + "\nAccount name: " + bankAccount.getAccountName());
	System.out.println("Balance is: " + bankAccount.getBalance());
	
	bankAccount.deposit(2000);
	bankAccount.withdraw(1500);
	bankAccount.withdraw(200);
	
	System.out.println("Last balance is: " + bankAccount.getBalance());
			
	}
}