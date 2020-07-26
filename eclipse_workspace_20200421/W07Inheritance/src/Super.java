
public class Super {

	public static void main(String[] args) {


	}

}
class A {
	int a;
	int b;
	
	public A (int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
}
class B extends A {
	int c;
	int d;
	
	public B (int a, int b, int c, int d) {
		 super(a, b);
		 this.c = c;
		 this.d = d;
	 }
}
class C extends B {
//	public C (int a, int b) {
//		super(a, b);
//	}   // bu constructor gives error, cunku A classindan a ve b'yi alir. B classindan c ve d'yi alir. kendinde de e var onu ekler. 
	
	int e;

	public C (int a, int b, int c, int d, int e) {
		super(a, b, c, d);
		this.e = e;
}
	
}