package a2;

class A2 {

	public A2() {
		System.out.println("Class A Constructor");
	}
}

class B extends A2 {
	public B() {
		System.out.println("Class B Constructor");
	}
}

class C extends B {
	
	public C() {
		System.out.println("Class C Constructor");
	}

}
