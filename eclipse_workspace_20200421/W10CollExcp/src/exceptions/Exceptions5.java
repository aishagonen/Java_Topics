package exceptions;

public class Exceptions5 {

	static void method()  { // throws keyword tells me that this method can throw exception

		System.out.println("This is method () ");

	throw new ArithmeticException(); // this line is creating and throwing Exception object
}

	// this is a caller method
	public static void main(String[] args) {

		try {
			method();
		} 
		catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception handled");
		} 
		catch (Exception e) {
			System.out.println("Exception handled");
		}

	}

}
