import java.util.Scanner;

public class BuyVeggie {

	public static void main(String[] args) {
		
// Create a program and buy apples, carrots and tomatoes:		
// 1. Way: Short way: 
		
		Scanner kb = new Scanner(System.in);
		
		double apple = 3.99;
		double carrot = 0.99;
		double tomato = 1.59;
		double taxRate = 0.06;
		double cost;
		double totalPrice;
		double itemPrice=0;
		
		System.out.println("Enter wight of product [kg]: ");
		double weightItem = kb.nextDouble();
				
		System.out.println("Enter name of product [A, C, T]: ");
		String  itemName = kb.next();	
		
		switch (itemName.toUpperCase()) {
		case "A": 
			itemPrice = apple;
			break;
		case "C": itemPrice = carrot;	
		break;
		case "T": itemPrice = tomato;	
		break;
		default:
			break;
		}
		cost = itemPrice * weightItem;
		totalPrice =  cost + (cost * 0.06);	
		System.out.printf("Total price without tax is: $%.2f\n", cost);
		System.out.printf("Total price with tax is: $%.2f\n", totalPrice );
		
		System.out.println("\nThank you for shopping! ");

// **************************************	
// 2. Way: Long way:
//		
//		double apple = 3.99;
//		double carrot = 0.99;
//		double tomatoes = 1.59;
//		double taxRate = 0.06;
//		double cost;
//		double totalPrice;
//		
//		System.out.println("Enter wight of product [kg]: ");
//		double weightItem = kb.nextDouble();
//		
//		System.out.println("Enter name of product [A, C, T]: ");
//		String  product = kb.next();
//		
//		if (product.equalsIgnoreCase("A")) {
//			System.out.println("For " + weightItem + " kg apples; ");
//			cost = apple * weightItem;
//			totalPrice = cost + (cost * 0.06);
//			
//			System.out.println("Total price without tax is: $ " + cost);
//			System.out.println("Total price with tax is: $ " + totalPrice );
//		} 
//		else if (product.equalsIgnoreCase("C")) {
//			System.out.println("For " + weightItem + " kg carrots; ");
//			cost = carrot * weightItem;
//			totalPrice = cost + (cost * 0.06);
//			
//			System.out.println("Total price without tax is: $ " + cost);
//			System.out.println("Total price with tax is: $ " + totalPrice );
//		} 
//		else if (product.equalsIgnoreCase("T")) {
//			System.out.println("For " + weightItem + " kg tomatoes; ");
//			cost = tomatoes * weightItem;
//			totalPrice = cost + (cost * 0.06);
//			
//			System.out.println("Total price without tax is: $ " + cost);
//			System.out.println("Total price with tax is: $ " + totalPrice );
//		}
//		System.out.println("\nThank you for shopping! ");
				
	}

}
