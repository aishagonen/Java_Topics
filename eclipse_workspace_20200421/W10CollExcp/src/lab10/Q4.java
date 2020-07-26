package lab10;

import java.util.ArrayList;

public class Q4 {

	public static void main(String[] args) {

		ArrayList myList = new ArrayList();
		
		String [] myArray;
		
		try {
			while (true) { 	// while loop is infinite. doesn't run, it hurts laptop!
				myList.add("My String");
			}	
		} 
		catch (RuntimeException re) {
			System.out.println("Caught an Exception");
		}
		System.out.println("Ready to use");
		
	}
}


/*What is the result?
A. Execution terminates in the first catch statement, and a RuntimeException is printed to the console.
B. Execution terminates in the second catch statement, and caught an Exception is printed to the console.
C. A runtime error is thrown in the thread "main".
D. Execution completes normally, and Ready to use is printed to the console.
E. The code fails to compile because a throws keyword is required.

Ans: Memory error, so answer is C => A runtime error is thrown in the thread "main".  
	 Catch blocks are useless. 
*/