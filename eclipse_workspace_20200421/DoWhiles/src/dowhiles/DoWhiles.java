package dowhiles;
import java.util.Scanner;
public class DoWhiles {


// 'do-while';
// 1.for the validation. Ask user a value first, if value is valid then run the program. 'do' runs once and checks it first, then 'while' runs. 
// 2.First run the program and ask 'play again?' if write while loop so it ask first 'play again?" doesn't make sense. so use 'do-while'.  
// 'do-while' loop checks the condition AFTER executing the first statement. If condition is false, statements inside of the loop executed 1 time. Then stops. 
// 'while' loop checks the condition BEFORE executing the statement. If condition is false, statements inside of the loop doesn't executed.		
// Difference between 'while' and 'do-while' loop: 
// 'do-while' loop runs at least one time. then check the condition and if it is false loop stops. but one time runs no matter what.  
 
	
	
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a 4 digit number: ");
			
		int num = kb.nextInt();
		int sum = 0;
		
		do {
			sum += num %10;
			num /= 10;
			
		} while (num>0);
		System.out.println("Sum is: " + sum);	
		
// ************************************			

		int i = 15;
		do {
			System.out.println(i);
			i++;
		} while (i<=11);	
			
// **********************************		
		
		int a = 10;
		do {
			System.out.println("Hi");
		} while(a < 10); 	
				
		//while loop oldugu icin do icindeki kodu bi kere yazar. 
		//sonra check eder 'a' kucuk mu esit mi vs. o yuzden bir kere yazar.
										
// **********************************
//  kb'den aldigi answer, 'y' oldugu muddetce 'do'nun icindekileri yazar:	
		String answer;
		
		do {
			System.out.println("Hi");
			System.out.println("Play again? Y or N: ");
			answer = kb.next();
		} while (answer.equalsIgnoreCase("Y"));
				
// **********************************
// Nested Loop:
		DoWhiles rand = new DoWhiles();
		
		do {
			do {	
				num = 1+ rand.nextInt(6);
			} 
			while (num<5); // 'while' conditioni belirtir. yani diyorum ki; eger num 5'ten kucukse istemiyorum, calismaya devam et.
			System.out.println(num + " ");
			System.out.println("Play again? Y or N: ");
			answer = kb.next();
		} while (answer.equalsIgnoreCase("Y"));
		
// eger random cikan sayi 5'ten kucukse sormasin, 5 veya 6 gelinceye kadar calissin istiyorsan do'nun icinde tekrar do yazilir. yani Nested Loop olur.		
		
// **********************************		
// Difference between 'while' and 'do-while' loop: 
// 'do-while' loop runs at least one time. then check the condition and if it is false loop stops. but one time runs no matter what.  
		int count4 = 0;
		
		do {
			System.out.println( count4);
			count4++;
		} while (count4 < 6);

// **********************************		
// 'while' loop checks the condition BEFORE executing the statement. If condition is false, statements inside of the loop doesn't executed.		
		boolean condition = false;
		
		while (condition) { 
			System.out.println("Inside of while loop");	
		}
		
// 'do-while' loop checks the condition AFTER executing the first statement. If condition is false, statements inside of the loop executed 1 time. Then stops. 
		do {
			System.out.println("Inside of do-whileloop");
		} while (condition);
	
// **********************************
// Do - While Loops:

// Ask from user to give you $5. until you get 5, ask again. When you get 5, say 'thank you'.		
		int amount;
		
		do {
			System.out.println("Give me $5, please:");
			amount = kb.nextInt();
		} while (amount !=5);
		System.out.println("Thank you!");

// **********************************	

		
		
	
		
		
		
		
		
		
// **********************************
		
	
	}

}
