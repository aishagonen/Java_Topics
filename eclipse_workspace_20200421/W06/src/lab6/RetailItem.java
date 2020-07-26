package lab6;

import java.util.Scanner;

public class RetailItem {

	private String description;
	private int unitsOnHand;
	private double price;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getUnitsOnHand() {
		return unitsOnHand;
	}
	public void setUnitsOnHand(int unitsOnHand) {
		this.unitsOnHand = unitsOnHand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public static void main(String[] args){
		
		RetailItem item; 
		String description; 
		int unitsOnHand;
		double price; 
		
		 // Create a Scanner object for keyboard input.
		Scanner kb = new Scanner(System.in);

		 // Create an object.
		 item = new RetailItem();
		 // Get the description
		 System.out.print("Tell me about the Item..");
		 description = kb.nextLine();
		 item.setDescription(description);
		 // Get the units
		 System.out.print("How many item do you need? ");
		 unitsOnHand = kb.nextInt();
		 item.setUnitsOnHand(unitsOnHand);
		  // Get the price.
		  System.out.print("How much is this item ? :  ");
		  price = kb.nextDouble();
		  item.setPrice(price);
		   System.out.println();
	       System.out.println("Here is the Item Descriptions : ");
	       System.out.println("Description : " + item.getDescription());
	       System.out.println("Units : " + item.getUnitsOnHand());
	       System.out.println("Price : " + item.getPrice());
	
	
	
	}
	
	
}
