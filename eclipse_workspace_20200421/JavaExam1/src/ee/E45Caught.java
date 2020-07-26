package ee;

import java.util.ArrayList;
//SQ: 40
public class E45Caught {

	public static void main(String[] args) {
		
		ArrayList myList = new ArrayList();
		
		String [] myArray;
		
		try {
			while(true) {
				myList.add("My String");
			}
		}
		catch (RuntimeException re) {
			System.out.println("Caught a RuntimeExpection");
		}
		catch (Exception e) {
			System.out.println("Caught an Expection");
		}
		System.out.println("Ready to use");

	}

}


/*
	A. Execution terminates in the first catch statement, and caught a RuntimeException is printed to the
		console.
	B. Execution terminates in the second catch statement, and caught an Exception is printed to the console.
	C. A runtime error is thrown in the thread "main".
	D. Execution completes normally, and Ready to use is printed to the console.
	E. The code fails to compile because a throws keyword is required.


	Answ: C

*/