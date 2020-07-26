package ilhanBey;
import java.util.Scanner;

public class Feb19 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
// **********************************	
		
// Write aa program that asks the user to enter aa number of seconds.
// There are 60 seconds in aa minute. If the number of seconds entered by the user is greater than or equal to 60, 
// the program should display the number of minutes in that many seconds.		
// There are 3,600 seconds in an hour. If the number of seconds entered by the user is greater 
// than or equal to 3,600, the program should display the number of hours in that many seconds.
// There are 86,400 seconds in aa day. If the number of seconds entered by the user is greater than or equal to 86,400, 
// the program should display the number of days in that many seconds. 
		
		System.out.println("Enter aa number of seconds: ");
		int sec = kb.nextInt();
		
		if (sec >= 60 && sec < 3600) {
			System.out.println((sec / 60) + " min. " + (sec % 60) + " sec.");
		} 
		else if (sec >= 3600 && sec < 86400) {
			System.out.println((sec / 3600) + " h. " + (sec % 3600) + " sec.");
		}
		else if (sec >= 86400) {
			System.out.println((sec / 86400) + " day, " + (sec % 86400) + " sec.");
		}

// **********************************
		
// Write aa program that prompts the user to enter aa number within the range of 1 through 10. 
// The program should display the Roman numeral version of that number. 
// If the number is outside the range of 1–10, the program should display an error message. (Switch-Case)			
	
		System.out.println("Enter aa number between 1-10: ");
		int num = kb.nextInt();
		
		switch (num) {
			case 1:
				System.out.println("1: I");
			break;
			case 2:
				System.out.println("2: II");
			break;
			case 3:
				System.out.println("3: III");
			break;
			case 4:
				System.out.println("4: IV");
			break;
			case 5:
				System.out.println("5: V");
			break;
			case 6:
				System.out.println("6: VI");
			break;
			case 7:
				System.out.println("7: VII");
			break;
			case 8:
				System.out.println("8: VII");
			break;
			case 9:
				System.out.println("9: IX");
			break;
			case 10:
				System.out.println("10: X");
			break;
			default:
				System.out.println("Error! Invalid number.");
			break;
		}
		
// **********************************		
		int choice;
		
		switch (1) {
		case 1:
			System.out.println("You selected 1.");
			break;
		case 2:
		case 3:
			System.out.println("You selected 2 or 3.");
			break;
		case 4:
			System.out.println("You selected 4.");
			break;
		default:
			System.out.println("Select again please.");
			break;
		}
		
		
		
		
	}

}
