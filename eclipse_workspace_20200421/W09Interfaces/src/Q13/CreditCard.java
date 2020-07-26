package Q13;

public class CreditCard {

	public static void main(String[] args) {
		
		BankAccount ahmet = new BankAccount(100);
		ahmet.withDrawEuro(10);
		ahmet.withDrawLira(10);
		ahmet.withDrawRupee(10);
	}

}
