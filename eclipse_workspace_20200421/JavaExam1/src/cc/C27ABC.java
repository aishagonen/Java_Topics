package cc;
//SQ:103
class A {
	
	
	public A() {
		System.out.println("A ");
	}
}

class B extends A {
	
	public B() {				// line n1
		System.out.println("B ");
	}
}

public class C27ABC extends B {

	public C27ABC() {				// line n2
		System.out.println("C ");
	}
	
	public static void main(String[] args) {
		
		C27ABC c = new C27ABC();

//		B b = new C27ABC();
//		A a = new C27ABC();
//
//		B d = new B(); 
//		A q = new B();
		
	}

}


/*
 	Answ: A B C 


	Constructor'lardaki super();'lari unutma!

*/