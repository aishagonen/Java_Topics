package abstractConcrete;

public abstract class AbstractClass {

	abstract void abstractMethod();

	void concreteMethod() {
		// concrete methods are still allowed in abstract classes
		System.out.println("This is a concrete method.");
	}
}

class B extends AbstractClass {

	void abstractMethod() {
		System.out.println("B's implementation of abstractMethod.");
	}
}

class C extends AbstractClass {
	// Your code goes here } public class AbstarctClassMain {

	@Override
	void abstractMethod() {
		System.out.println("C is implementation of abstractMethod");
	}

}
