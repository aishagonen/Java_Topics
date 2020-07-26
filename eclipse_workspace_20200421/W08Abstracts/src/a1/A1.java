package a1;

class A1 {

		String s = "Class A1";
}
class B extends A1 {
	
	String s = "Class B";
	{
		System.out.println(super.s);
	}
}

class C extends B {
	
	String s = "Class C";
	{
		System.out.println(super.s);
	}
}

