package lab5;

public class BankAccountRunner {

	public static void main(String[] args) {

		BankAccount charlieBrown = new BankAccount();
	
		charlieBrown.setAccountNumber("012934567687776");
		charlieBrown.getAccountNumber();
		charlieBrown.setBalance(30000);
		charlieBrown.getBalance();
		charlieBrown.setCustomerName("Charlie Brown");
		charlieBrown.getCustomerName();
		charlieBrown.setPhoneNumber("1775438900");
		charlieBrown.getPhoneNumber();
		
		charlieBrown.depositMoney(2000);
		charlieBrown.withdrawMoney(1500);
		
		
		
	}

}
