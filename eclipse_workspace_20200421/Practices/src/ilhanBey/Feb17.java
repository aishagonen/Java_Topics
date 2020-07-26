package ilhanBey;
import java.util.Scanner;

public class Feb17 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
//	1. Create aa program and calculate your age:		

		System.out.println("Enter your birthday: [yyyy]");
		int dob = kb.nextInt();
		
		System.out.println("Enter current year: [yyyy]");
		int cury = kb.nextInt();
		
		int age = cury-dob;
		System.out.println("Your age is : "+ age);
		

// 2. Create aa program and buy apples, carrots and tomatoes:		

		double apple = 3.99;
		double carrot = 0.99;
		double tomatoes = 1.59;
		double taxRate = 0.06;
		double cost;
		double totalPrice;
		
		System.out.println("Enter wight of product [kg]: ");
		double weightItem = kb.nextDouble();
		
		System.out.println("Enter name of product [A, C, T]: ");
		String  product = kb.next();
		
		if (product.equalsIgnoreCase("A")) {
			System.out.println("For " + weightItem + " kg apples; ");
			cost = apple * weightItem;
			totalPrice = cost + (cost * 0.06);
			
			System.out.println("Total price without tax is: $ " + cost);
			System.out.println("Total price with tax is: $ " + totalPrice );
		} 
		else if (product.equalsIgnoreCase("C")) {
			System.out.println("For " + weightItem + " kg carrots; ");
			cost = carrot * weightItem;
			totalPrice = cost + (cost * 0.06);
			
			System.out.println("Total price without tax is: $ " + cost);
			System.out.println("Total price with tax is: $ " + totalPrice );
		} 
		else if (product.equalsIgnoreCase("T")) {
			System.out.println("For " + weightItem + " kg tomatoes; ");
			cost = tomatoes * weightItem;
			totalPrice = cost + (cost * 0.06);
			
			System.out.println("Total price without tax is: $ " + cost);
			System.out.println("Total price with tax is: $ " + totalPrice );
		}
		System.out.println("\nThank you for shopping! ");
		
		
//3. Create aa temperature converter program:
		
		System.out.println("Enter the  temprature [F]:  " );
		int fah = kb.nextInt();
		
		double cel = (fah - 32) / 1.8;
		
		System.out.println(fah + " F is " + cel + " C.");
		
		
// 4. Create aa program as price checker:
		
		System.out.println("Enter the  price: $ " );
		int price = kb.nextInt();
		
		if (price < 25 ) {
			System.out.println("The price is cheap and buy it!");
		} else if (price >= 26 && price < 100) {
			System.out.println("The price is expensive!");
		} else {
			System.out.println("Go home!");
		}

		
// 5. Create aa voting eligibility program:
		
		System.out.println("Enter your age: ");
		int age1 = kb.nextInt();
	
		if (age1 > 18) {
			System.out.println("You are eligible to vote.");
		} else {
			System.out.println("You are not eligible to vote");
		}
		
		
	}

}