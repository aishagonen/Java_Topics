package iMoneyShapeDad;

interface Lira {

	double tl = 0.2;

	void withDrawLira(double amount);

}

interface Euro {

	double eu = 1.5;

	void withDrawEuro(double amount);
}

interface Rupee {

	double rup = 0.1;

	void withDrawRupee(double amount);
}

class BankAcc implements Euro, Lira, Rupee {

	double myDollar = 100;
	double myLira = myDollar / tl;
	double myEuro = myDollar / eu;
	double myRupee = myDollar / rup;

	public void withDrawLira(double amount) {

		myDollar -= amount * tl;
		myLira = myDollar / tl;

		System.out.println("My lira is: " + myLira);
		System.out.println("My dollar is: " + myDollar);

	}

	public void withDrawEuro(double amount) {

		myDollar -= amount * eu;
		myEuro = myDollar / eu;

		System.out.println("My euro is: " + myEuro);
		System.out.println("My dollar is: " + myDollar);

	}

	public void withDrawRupee(double amount) {

		myDollar -= amount * rup;
		myRupee = myDollar / rup;

		System.out.println("My rupee is: " + myRupee);
		System.out.println("My dollar is: " + myDollar);

	}

}
