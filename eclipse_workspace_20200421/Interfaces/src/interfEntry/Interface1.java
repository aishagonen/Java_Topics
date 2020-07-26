package interfEntry;

interface Interface1 {

	public void f1();	
}

interface Interface2 extends Interface1 {
	
	public void f2();	
}

class A implements Interface2 {
	
	public void f1() {
		System.out.println("Contents of Interface1");
	}
	public void f2() {
		System.out.println("Contents of Interface2");
	}
	public void f3() {
		System.out.println("Contents of Class A");		
	}	
}

class ExtendingInterface {
	
	public static void main(String[] args) {
		
		Interface2 v2; // Interface classlardan obje olusturulmaz. Referance variable yapilabilir. 
		v2 = new A(); // v2 objesini A classina assign ediyoruz. 
		
		v2.f1();
		v2.f2();
		
		A  x1 = new A();
		
		x1.f3();

	}
}