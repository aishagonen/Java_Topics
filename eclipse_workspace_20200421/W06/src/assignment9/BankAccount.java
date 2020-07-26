package assignment9;

public class BankAccount {
	
	private String accountNumber;
	private String accountName;
	private double balance;

	public BankAccount(String accountNumber, String accountName) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
	}
	public String getAccountNumber() {
		return this.accountNumber;
	}
	public String getAccountName() {
		return this.accountName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public boolean deposit(double deposit) {
		balance += deposit;
		return true;
	}
	
	public boolean withdraw(double withdraw) {
		balance -= withdraw;
		return true;	
	}	
	
}	