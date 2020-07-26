package lab6;

public class BankAccount {

private double balance;
private double interestRate;
private double interest;

public BankAccount(double balance, double interestRate) {
	this.balance = balance;
	this.interestRate = interestRate;
}

public void deposit(double amount) {
	 balance += amount;
}

public void withdraw(double amount) {
	 balance -= amount;
}

public void addInterest() {
	 balance += getInterest();
}

public double getBalance() {
	return balance;
}

public double getInterest() {
	interest = interestRate * balance /100;
	return interest;
}

	
}
