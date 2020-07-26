package abstractsExmpls;

abstract class Base {
	
	Base() {

		System.out.println("Base Constructor Called");
	}

	abstract void fun();
	
}

class Derived extends Base {

	Derived() {
		System.out.println("Derived Constructor Called");
	}

	@Override
	void fun() {
		System.out.println("Abstract Method");

	}
	
}
