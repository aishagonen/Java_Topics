package exceptions;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {


		try {
			int [] i = {4,6,9};
			
			System.out.println(i[3]);
			
		} 
		catch (Exception e) {
			System.out.println("Exception happened!");
		}
		
// ***************************************************
	
		try {
			Scanner kb = new Scanner(System.in);
			
			System.out.println("Enter your favorite number: ");
			int n = kb.nextInt();
			
			System.out.println(n);	
		} 
		catch (Exception e) {
			System.out.println("Invalid entry.");
	    }
		
// ***************************************************		
		
		try {
//			int [] i= null;  	// for 1. catch
			int [] i = {7};		// for 2. catch
			
			System.out.println(i[2]);		
		} 	
		catch (NullPointerException e) {
				System.out.println("Your array is null.");
	  	}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Your index is out of bounds.");
		}
		catch (Exception e) {
			System.out.println("Something went wrong.");
		}
		
		
// ***************************************************			
		
		
		
		
		
	}

}
