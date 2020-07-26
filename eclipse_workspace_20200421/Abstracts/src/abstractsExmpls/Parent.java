package abstractsExmpls;

public abstract class Parent {
	
	public static void main(String[] args) {
		
		Child1 c = new Child1();
		System.out.println("Sum is: " + c.sum(10, 20));
	}

	abstract int sum(int a, int b);
}

abstract class Child extends Parent {	
}

class Child1 extends Child {
	
	int sum (int a, int b) {
		return a + b;
	}
}
