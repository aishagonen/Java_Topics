package ilhanBey;
import java.util.Scanner;
public class Feb24 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
/* 1- Calculate credit score (if else)
 1- 299 Bad credit score
 2- 300 - 579 very poor score --> %16
 3- 580 - 669 fair credit score --> %18
 4- 670 - 739 good credit score --> %21
 5- 740 - 799 very good score --> %25
 6- 800 - 850 Excellent score --> %20
 Get score from user and print on the console score and evaluation then score percentage
*/
		System.out.println("Enter your  credit score: ");
		int creditScore = kb.nextInt();
		
		if (creditScore == 299) {
			System.out.println("Bad credit score!");
		} else if (creditScore >= 300 && creditScore <= 579) {
			System.out.println("Very poor score.\nYour score percentage is : 16%");
		} else if (creditScore >= 580 && creditScore <= 669) {
			System.out.println("Fair credit score.\nYour score percentage is : 18%");
		} else if (creditScore >= 670 && creditScore <= 739) {
			System.out.println("Good credit score.\nYour score percentage is : 21%");
		} else if (creditScore >= 740 && creditScore <=799) {
			System.out.println("Very good score.\nYour score percentage is : 25%");
		} else if (creditScore >= 800 && creditScore <= 850) {
			System.out.println("Excellent score.\nYour score percentage is : 20%");
		}else {
			System.out.println("Invalid score!");
		}

// ***********************************************************
/* 2-  Calculate insurance rate (if else  --> hint: nested)
 You have aa company and have company cars. You wanna buy insurance
 Liability Insurance
 car numbers         insurance price
 1 car                750 (per car)
 2-5 cars             550 (per car)
 6-8 cars             450 (per car) 
 9+                   350 (per car)
 Full insurance
 car numbers         insurance price
 1 car                1150 (per car)
 2-5 cars             1050 (per car)
 6-8 cars             900 (per car) 
 9+                   800 (per car)
 Example : There are 5 cars in my company i wanna liability.
           I am gonna pay 550 per car
           totalInsurance 5 x 550		
*/	
		System.out.println("How many cars do you have? ");
		int cars = kb.nextInt();
		
		System.out.println("What type of insurance do you want?\nLiability or Full [L or F]: ");
		String typeOfInsurance = kb.next();
		
		if (typeOfInsurance.equalsIgnoreCase("L")) {
			System.out.println("*** Liability Insurance ***");
			
			if (cars == 1) {
				System.out.println("Total insurance price is $750.");
			} else if (cars >= 2 && cars <= 5) {
				System.out.println("Total insurance price is $" + (550 * cars));
			} else if (cars >= 6 && cars <= 8) {
				System.out.println("Total insurance price is $" + (450 * cars));
			} else if (cars >= 9) {
				System.out.println("Total insurance price is $" + (350 * cars));
			} 
		}
		 if (typeOfInsurance.equalsIgnoreCase("F")){
			System.out.println("*** Full Insurance ***");
		 
			if (cars == 1) {
				System.out.println("Total insurance price is $1150.");
			} else if (cars >= 2 && cars <= 5) {
				System.out.println("Total insurance price is $" + (1050 * cars));
			} else if (cars >= 6 && cars <= 8) {
				System.out.println("Total insurance price is $" + (900 * cars));
			} else if (cars >= 9) {
				System.out.println("Total insurance price is $" + (800 * cars));
			} 
		 }

// ***********************************************************
/* 3- Password checker (if else --> hint: nested)
 Create aa login system and check exact password and username
 Variables:
 String secretUserName = "admin1";
 String secretPassword = "ab1c123";
 > Make sure that they match with secret ones and allows login successfully
 > Whenever login is not successful, let program tell exact reason
 > Why it is not valid
 --> username is not valid
 --> password is not valid
 --> both username and password are invalid
*/		   
		System.out.println("Enter username: ");
		String userName = kb.next();
		
		System.out.println("Enter the password: ");
		String password = kb.next();
		
		String secName = "admin1";
		String secPass = "ab1c123";
		
		if (userName.equals(secName) && password.equals(secPass)) {
			System.out.println("You logged in successfully.");
		}
		else if (userName.equals(secName) && !password.equals(secPass)) {
			System.out.println("Password is invalid!");
		}
		else if (!userName.equals(secName) && password.equals(secPass)) {
			System.out.println("Username is invalid!");
		}
		else if (!userName.equals(secName) && !password.equals(secPass)) {
			System.out.println("Username and password are invalid!");
		}
		
//****
// Ilhan Hoca'nin cozumu: 
		
//		String secretUserName = "admin1";
//		String secretPassword = "ab1c123";
//		
//		String username = "admin1";
//		String password = "ab1c123";
//		
//		if (username.equalsIgnoreCase(secretUserName) && password.equals(secretPassword)){
//			System.out.println("Login is succesful");
//		}else {
//			if (!username.equalsIgnoreCase(secretUserName)){
//				System.out.println("Error: Both username and password are invalid");
//			}else if (!username.equalsIgnoreCase(secretUserName)){
//				System.out.println("Error: Username is invalid");
//			}else {
//				System.out.println("Error: Password is invalid");
//			}
//		}
//		
//		System.out.println(secretPassword.charAt(3));
//
		
// ***********************************************************
/* 4- Create aa program and find which month is how many days. (switch&case)
   Example if user enter 5 (May) print on the console: number of days 31	
*/	
		System.out.println("Enter the month [1 - 12]: ");
		int month = kb.nextInt();
		
		switch (month) {
		case 1:
			System.out.println("1 * January *  Number of the days: 31");
			break;
		case 2:
			System.out.println("2 * February *  Number of the days: 29");
			break;
		case 3:
			System.out.println("3 * March *  Number of the days: 31");
			break;
		case 4:
			System.out.println("4 * April *  Number of the days: 30");
			break;
		case 5:
			System.out.println("5 * May *  Number of the days: 31");
			break;
		case 6:
			System.out.println("6 * Jun *  Number of the days: 30");
			break;
		case 7:
			System.out.println("7 * July *  Number of the days: 31");
			break;
		case 8:
			System.out.println("8 * August *  Number of the days: 31");
			break;
		case 9:
			System.out.println("9 * September *  Number of the days: 30");
			break;
		case 10:
			System.out.println("10 * October *  Number of the days: 31");
			break;
		case 11:
			System.out.println("11 * November *  Number of the days: 30");
			break;
		case 12:
			System.out.println("12 * December *  Number of the days: 31");
			break;
		default:
			System.out.println("Invalid number!");
			break;
		}
		
		
		
		
		
		
		
		
		
	}

}
