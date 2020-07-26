package assignment12;

interface IBankAccount {
	void withDrawDollar(double withdraw);
}

interface Lira {
	double TL = 0.2;

	void withDrawLira(double withdraw);
}

interface Rupee {
	double RUPEE = 0.1;

	void withDrawRupee(double withdraw);
}

interface Euro {
	double EURO = 1.5;

	void withDrawEuro(double withdraw);
}

class BankAccount implements IBankAccount, Lira, Rupee, Euro {
	private double myDollar;
	private double myLira;
	private double myRupee;
	private double myEuro;

	public BankAccount(double myDollar) {
		this.myDollar = myDollar;
		this.myLira = myDollar / TL;
		this.setMyRupee(myDollar / RUPEE);
		this.setMyEuro(myDollar / EURO);
	}

	public void withDrawDollar(double withdraw) {
		myDollar -= withdraw;
		System.out.println("my dollar is " + myDollar);
	}

	public void withDrawLira(double withdraw) {
		myDollar -= withdraw * TL;
		myLira = myDollar / TL;
		System.out.println("my lira is :" + myLira);
		System.out.println("my dollar is :" + myDollar);
	}

	@Override
	public void withDrawEuro(double withdraw) {
		// TODO Auto-generated method stub
		System.out.println("my euro is :" + myEuro);
	}

	@Override
	public void withDrawRupee(double withdraw) {
		// TODO Auto-generated method stub
		System.out.println("my rupee is :" + myRupee);
	}

	public double getMyRupee() {
		return myRupee;
	}

	public void setMyRupee(double myRupee) {
		this.myRupee = myRupee;
	}

	public double getMyEuro() {
		return myEuro;
	}

	public void setMyEuro(double myEuro) {
		this.myEuro = myEuro;
	}
}

