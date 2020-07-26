package Q13;

public class BankAccount implements IBankAccount, Lira, Rupee, Euro {
	private double myDollar;
	private double myLira;
	private double myRupee;
	private double myEuro;

	public BankAccount(double myDollar) {
		this.myDollar = myDollar;
		this.myLira = myDollar / TL;
		this.myRupee = myDollar / RUPEE;
		this.myEuro = myDollar / EURO;
	}

	public void withDrawDollar(double withdraw) {
		myDollar -= withdraw;
		System.out.println("my dollar is: " + myDollar);
	}

	public void withDrawLira(double withdraw) {
		myDollar -= withdraw * TL;
		myLira = myDollar / TL;
		System.out.println("my lira is: " + myLira);
		System.out.println("my dollar is: " + myDollar);
	}

	@Override
	public void withDrawEuro(double withdraw) {
		myDollar -= withdraw * EURO;
		myEuro = myDollar / EURO;
		System.out.println("my euro is: " + myEuro);
		System.out.println("my dollar is: " + myDollar);		
	}

	@Override
	public void withDrawRupee(double withdraw) {
		myDollar -= withdraw * RUPEE;
		myLira = myDollar / RUPEE;
		System.out.println("my rupee is: " + myRupee);
		System.out.println("my dollar is: " + myDollar);		
	}

}
