package abstractConcrete;

public class SuperClassMain extends SuperClass {

	int x = 100;

	void method() {
		System.out.println("Subclass");
	}

	public SuperClassMain() {
		System.out.println("Subclass constructor");
	}

	public static void main(String[] args) {
		
		// How can we use int x in the superclass ?
		// First we can create an object for Group2
		// Second upcasting

		SuperClassMain object1 = new SuperClassMain();
		
		System.out.println(object1.x);

		// upcasting : Superclass(or interface) identifier = new Subclass();
		SuperClass object2 = new SuperClassMain();
		System.out.println(object2.x);

		object2.method(); // Output : Subclass
		System.out.println(object2.x); // output : 50
		
		object2.method1(); // Output : Superclass1
		System.out.println(object1.x); // output : 100

	}

}
