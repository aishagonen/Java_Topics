package midterm;

public class Question5 {
	
	public static void main(String[] args) {
		
		Question5 charlieBrown = new Question5();
		
		System.out.println(charlieBrown.balance);
		
		charlieBrown.moneyToAdd(2000);
		charlieBrown.moneyToWithdraw(1500);
		
		System.out.println(charlieBrown.balance);
		
	}

	private String accountNumber;
	private double balance;
	private String customerName;
	private String phoneNumber;
	
	public Question5() {
		super();
		this.balance = 0;
	}

	public Question5(double balance) {
		super();
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void moneyToAdd(double amount) {
		balance = this.balance + amount;
		System.out.println(balance);
	}

	public void moneyToWithdraw(double amount) {
		balance = this.balance - amount;
		System.out.println(balance);
	}

}
