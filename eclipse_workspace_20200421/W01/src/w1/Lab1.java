package w1;
import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {

	Scanner kb= new Scanner(System.in);
	
		System.out.println("How much ($) fuel does your car burn in one km? : $ ");
		int cost = kb.nextInt();    // nextInt  takes integer values.
		
		System.out.println("How many km did you drive? : ");
		int km = kb.nextInt();
		
		int costTotal =  cost * km;
		System.out.println("Your total cost is: " + costTotal);
		
	
	
// *********************	
		
		
		System.out.println("Enter your height (m): ");
		 double height = kb.nextDouble();    // nextDouble  takes double values.
		
		System.out.println("Enter your weight (kg): ");
		double weight = kb.nextDouble();
		
		double bmi =  weight / (height * height);
		System.out.println("Your BMI is: " +  bmi);
		

	
// *********************	
	
	
		System.out.println("Enter your name: ");
		String name = kb.nextLine(); // nextLine  takes string values.
		
		System.out.println("Enter your last name: ");
		String lastName = kb.next();
		
		System.out.println("Enter your age: ");
		String age = kb.nextLine();
	
		System.out.println("Enter your state: ");
		String state = kb.nextLine();
		
		System.out.println("Enter your place of birth: ");
		String pob = kb.nextLine();
	
		System.out.println("Enter your license number: ");
		String licnum = kb.nextLine();
		
		
// *********************	
	
	
		System.out.println("Enter your name: ");
		String name = kb.nextLine();
		
		System.out.println("Enter your last name: ");
		String lastName = kb.nextLine();
		
		System.out.println("Enter your work hours: ");
		int workHour = kb.nextInt();
	
		System.out.println("Your name and last name: " + name + " "+ lastName);
		int grossIncome = 42 * workHour;
		System.out.println("Your gross income is: " + grossIncome);
		
		double tax = grossIncome * 0.1;
		System.out.println("Your tax is: " + tax);
	
		double netIncome = grossIncome - tax;
		System.out.println("Your net income is: " + netIncome);
	
		
	
// *********************
	
		
		System.out.println("Enter radius of the circle: ");
		double radius = kb.nextDouble();
		double area = 3 * radius * radius;
		
		System.out.println("Area is: " + area );
		
		
// *********************		

	
	
	
		
	}

}
