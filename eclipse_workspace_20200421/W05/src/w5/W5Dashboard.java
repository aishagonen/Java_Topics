package w5;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class W5Dashboard {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
		W5.showYourName();
		System.exit(0);  	// it finishes the program. 
		W5.showYourFullName();
		W5.parseInt();
		W5.grossPay();	
		start();
	
	}
	
	public static void start() {
	
		int command;
		
		do {
			String string = JOptionPane.showInputDialog("Which method do you want to call? [1,2,3,4] \n 1: Show your name. \n 2: Show your full name. \n 3: Gross pay. \n 4: Exit. ");
			command = Integer.parseInt(string);

			switch (command) {
			case 1:
				W5.showYourName();
				break;
			case 2:
				W5.showYourFullName();
				break;
			case 3:
				W5.grossPay();
				break;	
			
			case 4: 
				System.exit(0);
				break;
			}
		} while (command != 4);
	}
		

}
