package w5;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class W5 {
// GUI (Graphical User Interface) program:
	
//****************************************************	
//	main methodun hepsini W5Dashboard calssina tasidik.
//	public static void main(String[] args) {
//
//		Scanner kb = new Scanner(System.in);
//		
////		showYourName();
//		//	System.exit(0);  	// it finishes the program. 
////		showYourFullName();
////		parseInt();
////		grossPay();	
//		
//	
////**** user'dan inputu bu sekilde aliyorduk. bunun panelli sekli  asagida:	
////		System.out.println("Which method do you want to call? [1,2,3]");
////		int command = kb.nextInt();
////****		
//		int command;
//		
//		do {
//			String string = JOptionPane.showInputDialog("Which method do you want to call? [1,2,3,4] \n 1: Show your name. \n 2: Show your full name. \n 3: Gross pay. \n 4: Exit. ");
//			command = Integer.parseInt(string);
//
//			switch (command) {
//			case 1:
//				showYourName();
//				break;
//			case 2:
//				showYourFullName();
//				break;
//			case 3:
//				grossPay();
//				break;	
//			
//			case 4: 
//				System.exit(0);
//				break;
//			}
//		} while (command != 4);
//	}
//*****************************************************************
	
	
	public static void showYourName() {
		
		String name;
		
		name = JOptionPane.showInputDialog("Enter your name: ");
		JOptionPane.showMessageDialog(null, "Hello " + name); // we need to type 'null' to show message.		
	}
	
	public static void showYourFullName() {
		
		String firstName;
		String middleName;
		String lastName;
	
		firstName = JOptionPane.showInputDialog("Enter your first name: ");
		middleName = JOptionPane.showInputDialog("Enter your middle name: ");
		lastName = JOptionPane.showInputDialog("Enter your last name: ");

		JOptionPane.showMessageDialog(null, "Hello " + firstName + " " + middleName + " " + lastName);	
		System.out.println("Hello " + firstName + middleName + lastName) ;
	}

	public static void parseInt() {

		int number;
		String string;
		
		string = JOptionPane.showInputDialog("Enter your number: ");
		number = Integer.parseInt(string);   // for 'double' --> 'Double.parseDouble(string);'

		System.out.println(number + 9);
	}
	
	public static void grossPay() {
		
		String name;
		int hours;
		String stringHours, stringPayRate, stringGrossPay;
		double payRate;   // means: how much do you get hourly.
		double grossPay;
		
		name = JOptionPane.showInputDialog("What is your name?  ");
		
		stringHours = JOptionPane.showInputDialog("How many hours did you work?  ");
		hours = Integer.parseInt(stringHours);
		
		stringPayRate = JOptionPane.showInputDialog("What is your pay rate?  ");
		payRate = Double.parseDouble(stringPayRate);
		
		grossPay = hours * payRate; 
		JOptionPane.showMessageDialog(null, "Hello " + name + " , your gross pay is " + grossPay);
	}
	
	
	
	
	
	
	
	
	
}
