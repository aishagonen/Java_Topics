package inheritances;

public class Constructor {

	public static void main(String[] args) {
		
		FirstClass object = new FirstClass(); // prints 'First' class.
		ThirdClass object1 = new ThirdClass(); // prints all classes, bec third class has extends second and second has extends first class.
		SecondClass object2 = new SecondClass(); // prints First and Second.
		
	}
}
class FirstClass {
	public FirstClass() {
		System.out.println("First");
	}
}
class SecondClass extends FirstClass {
	public SecondClass() {
		System.out.println("Second");
	}
}
class ThirdClass extends SecondClass{
	public ThirdClass() {
		System.out.println("Third");	}
}

