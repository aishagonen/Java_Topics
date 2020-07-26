import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		int c = 4;
		int d = 2;
		
		System.out.println("Addition: " + (c + d));
		System.out.println("Subtraction: " + (c - d));
		System.out.println("Multiply: " + (c * d));
		System.out.println("Divide: " + (c / d));
		System.out.println("Remainder (mod): " + (c % d));
		System.out.println("Exponent: " + Math.pow(c, d));
	
// **************************************************************			
// Create a calculator with if-else statements:
			
			System.out.println("Please enter first number: ");
			int n1 = kb.nextInt();
			
			System.out.println("Please enter second number: ");
			int n2 = kb.nextInt();
			
			System.out.println("Please enter operation sign: ");
			char opr = kb.next().charAt(0);
			
			if (opr == '+') {
				System.out.println(n1 + n2);		
			} else if (opr == '-') {
				System.out.println(n1 - n2);
			} else if (opr == '*') {
				System.out.println(n1 * n2);
			} else if (opr =='/') {
				System.out.println((double) n1 / n2);
			} // else if (opr  != charAt, n1 && n2 != Integer) { }
				System.out.println("invalid");
			
			
// **************************************************************		
// // Create a calculator with switch-case statements:
			
			
			System.out.println("*******************************");
			
			String mathOperators = "1. Addition \n"
					                +"2. Subtraction \n"
					                +"3. Multiplication \n"
					                +"4. Division";
			
			System.out.println(mathOperators);
			
			System.out.println("*********************************");
			
			System.out.println("Please enter math operator");
			
			String operators = kb.nextLine();
			
			int a;
			int b;
			
			switch (operators){
			case "1":
				System.out.println("Enter first number");
				a = kb.nextInt();
				System.out.println("Enter second number");
				b = kb.nextInt();
				System.out.println("Addition: "+ (a+b));
				break;
			case "2":
				System.out.println("Enter first number");
				a = kb.nextInt();
				System.out.println("Enter second number");
				b = kb.nextInt();
				System.out.println("Subtraction: "+ (a-b));
				break;
			case "3":
				System.out.println("Enter first number");
				a = kb.nextInt();
				System.out.println("Enter second number");
				b = kb.nextInt();
				System.out.println("Multiplication: "+ (a*b));
				break;
			case "4":
				System.out.println("Enter first number");
				a = kb.nextInt();
				System.out.println("Enter second number");
				b = kb.nextInt();
				System.out.println("Division: "+ (a/b));
				break;	
			default:
				System.out.println("invalid input");
			}

// **************************************************************				
	
	
	}

}
