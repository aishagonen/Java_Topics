package jj;
//SQ:107

class J96A {
	
	public void test() {
		System.out.println("A");
	}
}

class J96B extends J96A {
	
	public void test() {
		System.out.println("B");
	}
}

public class J96C extends J96A {

	public void test() {
		System.out.println("C");
	}
	
	public static void main(String[] args) {
		
		J96A b1 = new J96A();
		J96A b2 = new J96C();
		
		b1 = (J96A) b2;
		
		J96A b3 = (J96B) b2;		// line n1
		J96A b3 = (J96B) b2;		// line n2
		
		b1.test();
		b3.test();
		
		

	}

}



/*
	What is the result?
	A. AB
	B. AC
	C. CC
	D. A ClassCastException is thrown only at line n1.
	E. A ClassCastException is thrown only at line n2.


*/
