package exceptions;
import java.util.Scanner;

public class Exception1DoWhile {

	public static void main(String[] args) {
	
		int x=1;
		
		do {
			try {
				Scanner	kb = new Scanner(System.in);
				System.out.println("Enter first number: ");
				int n1 = kb.nextInt();
				
				System.out.println("Enter second number: ");
				int n2 = kb. nextInt();
				
				int sum = n1/n2;
				System.out.println(sum);
					
				x = 2;	
			} 
			catch (Exception e) {
				System.out.println("Invalid.");	
			}		
		} while(x == 1);

		
	}
}

