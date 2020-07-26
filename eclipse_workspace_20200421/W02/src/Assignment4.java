

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		
		System.out.println("Enter the number of classes held: ");
		int numHeld = kb.nextInt();
		System.out.println("Enter the number of the class you attended: ");
		int numAttend = kb.nextInt();
		
		int perClass = (100*numAttend) / numHeld;
		
		if (perClass > 75) {
			System.out.println("Your percentage of class attended is: "+ perClass + " %.");
			System.out.println("Well done! Get the exam.");
		} else {
			System.out.println("Your percentage of classes attended is: "+ perClass + " %.");
			System.out.println("Sorry, you are not allowed to get the exam.");
		}
		

//************************************************
		
		System.out.println("Enter your grade: ");
		int grade = kb.nextInt();
		
		if  (grade >= 80) {		
			System.out.println("Your grade is A. ");
		}
		else if (grade >= 60 && grade < 80){
			System.out.println("Your grade is B. ");
		}
		else if (grade >=50 && grade < 60) {
			System.out.println("Your grade is C. ");
		}
		else if (grade >=45 && grade < 50) {
			System.out.println("Your grade is D. ");
		}
		else if (grade >=25 && grade < 45) {
			System.out.println("Your grade is E. ");
		}
		else if (grade < 25) {
			System.out.println("Your grade is F. ");
		}
		
//************************************************
		
		System.out.println("Please enter quantity of items: ");
		int quantity = kb.nextInt();
		double totalCost = (quantity * 100);
		
		
		if (quantity < 1000) {
			System.out.println("Total cost is: $" + totalCost );
		} else {
			System.out.println("You got 10% discount.\nTotal cost is: $" + (totalCost - (totalCost * 0.1)));
		}
		
//************************************************		
		
		
	}

}
