package NestedClasses;

interface A {
	
	void print(String string);
	
}

public class AnonymousClasses implements A {

	public static void main(String[] args) {
		
		A a = new A() { // when you create an object from InterfaceA, you create an AnonymousClass.  
						// And you have to Override InterfaceA's methods.
			@Override
			public void print(String string) {
				System.out.println("This is the string : " + string);
			}
		}; // You have to use ';' because it means actually, line13 to 19 is a statement. 
		a.print("Ahmet");
	}

	@Override
	public void print(String string) {
		System.out.println(string);
	}

	
}