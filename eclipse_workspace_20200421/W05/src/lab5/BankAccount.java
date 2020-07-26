package lab5;

public class BankAccount {

	private String accountNumber;
	private double balance;
	private String customerName;
	private String phoneNumber;
	
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


	public void depositMoney(double amount) {
		balance = this.balance + amount;
		System.out.println(balance);
	}
	
	public void withdrawMoney(double amount) {
		balance = this.balance - amount;
		System.out.println(balance);
	}
	

	
}
