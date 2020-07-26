package abstractsExmpls;

abstract class Base1 {
	
	abstract void get(int a, int b);
	abstract void add();
	abstract void display();
}

class SubClass extends Base1 {
	
	int x,y,z;
	
	void get(int a, int b) {
		x = a;
		y = b;
	}
	void add() {
		z = x + y;
	}
	void display() {
		System.out.println("The addition is " + z);
	}
}
