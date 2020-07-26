package w6;

import java.util.ArrayList;
import java.util.Scanner;

public class FlightTicketMachine {

// static seat number;
// buyTicket();
// Arraylist for customer objects.	
	

	private static int availableNumberOfSeat = 3;
	
	static ArrayList<Customer>custArr = new ArrayList<>();
	
	void buyTicket() {
		
		while (availableNumberOfSeat > 0 ) {
			Scanner kb = new Scanner(System.in);
			System.out.println("What is your name? ");
			String customerName = kb.nextLine();
			custArr.add(new Customer(customerName));
			availableNumberOfSeat--;
		}		
	}

	public static void main(String[] args) {
		
		new FlightTicketMachine().buyTicket();
		
	}	
	
	
	
	
	
	
	
	
	
	
}
