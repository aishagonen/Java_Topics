// Find the factorial of a number:
public class Factorial {

	public static void main(String[] args) {

// 1. Yol: with Method: 5! = 5 * (4 * 3 * 2 * 1) = 120
		System.out.println(factorial(5));
		
// *****************************************
// 2. Yol:for loop: 
		
		int num;
		System.out.println("Enter a number: ");
		num = kb.nextInt();
	
		int i;
		int fact = 1;  
		  for(i = 1; i <= num; i++){    
		      fact = fact * i;    
		  }    
		  System.out.println("Factorial of " + num + " is: " + fact); 

	}
	
	public static int factorial(int n) {
		if(n == 1) {
			System.out.println("factorial(" + n + ") = 1.");
			return 1;
		} else {
			System.out.println("factorial(" + n + ") = " + n + " * factorial(" + (n - 1) + ").");
			return n * factorial(n - 1);
		}
		
	}

}
