package w6;

public class BankAccount {

	private String name;
	private double balance;
	private static int transaction;
	private static int customer;

	public BankAccount(String name) {
		this.name = name;
		customer ++;
	}

	public static void main(String[] args) {

		BankAccount object1 = new BankAccount("Ahmet"), object2 = new BankAccount("John"), object3 = new BankAccount("Ethan"); 
		object1.deposit(9000); object1.deposit(2000);object1.deposit(5000);object2.deposit(500);object3.deposit(7000);
		
		System.out.println(transaction); 
		System.out.println(customer);
	}

	static void method(double amount) {
		// balance += amount;   -->> compiler error.
	// We can't use non-static field or variable inside of static methods.
	}
	void withDraw(double amount) {
		balance -= amount;
		transaction++;
	}
	void deposit(double amount) {
		balance += amount;
		transaction++;

	}	
}
