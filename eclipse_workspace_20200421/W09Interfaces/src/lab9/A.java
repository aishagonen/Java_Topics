package lab9;

interface A {
	
	void myClassMethod();
	void myMethod();
	
}

class B1 {
	
	public void myMethod() {
		System.out.println("My Method B1");
	}
}

class C extends B1 implements A { // Class C extends to Class B and implements interface A.
	
	public void myMethod() {
		System.out.println("My Method in Class C");  // eger buradaki methodu override etmeseydik B'deki methodu cagirirdi. 
	}
	
	public void myClassMethod() {
		System.out.println("Hi form myClassMethod C ");
	}
}

//public class AMain {
//
//	public static void main(String[] args) {
//
//		A a = new C();
//		a.myMethod();
//		
//	}
//
//}
