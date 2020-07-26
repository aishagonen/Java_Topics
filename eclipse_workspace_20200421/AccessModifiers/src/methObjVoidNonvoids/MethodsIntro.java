package methObjVoidNonvoids;
import java.util.Scanner;

public class MethodsIntro {

	public static void main(String[] args) { /*Java looks for the 'main' method and begins executing line by line here. 
 But, if we put every thing in this main method, here will be like logical chunks. 
 So we can separate all things and one way is the using methods to keep clean main method 
 and make easy to understand what the program is doing. 
 You have to define other methods in outside of 'main method's and inside of class.       
*/
		
		System.out.println("Program start.\n");
		welcome();
		sumLetters();
		System.out.println("\nProgram end.");
		
		Scanner kb = new Scanner(System.in);
		int num;
		System.out.println("Enter a number to get a season: ");
		num = kb.nextInt();
		
		if (num ==1) 
			printSpring();
		if (num ==2) 
			printSummer();
		if (num ==3) 
			printFall();;
		if (num ==4) 
			printWinter();
		
		int b = 11;
		int d = 1;
		int answer ; 
		answer = multNumbers(b,d);
		System.out.println("Result is: "+ answer );
		
	}
	
	public static void welcome() { /* this method is 'void'.It means, this method doesn't do 
 anything other than print something to the screen.   
 So we declare it as 'void'->> you don't plan to return anything back like integer, double. We are just printing staff.
 'Void' tells Java that don't expect  answer out of me, I am not doing any calculation to give you back, etc.  
 */
		System.out.println("Hello Universe!");
		System.out.println("What a beautiful day!");
	}
	
	public static void sumLetters() { /* this method doesn't return anything, it just does the calculation prints 
the screen and exits back up.
These variables inside of the 'sumLetter' method are only exist inside of this method. 
It means, out side of 'sumLetter' method, these variables can't be resolved, no place in this program are they understood. 
These variables just can used in here.    
*/	
		int aisha = 5;
		int gonen = 5;
		int sum;
		sum = aisha + gonen;
		
		System.out.println("The number of letters in my full name is: " + sum);
	}	
	
	public static void printSpring() {
		System.out.println("The season is Spring, and flowers are blooming!");
	}
	public static void printSummer() {
		System.out.println("The season is Summer, and it is getting hot!");
	}
	public static void printFall() {
		System.out.println("The season is Fall, and leaves are falling!");
	}
	public static void printWinter() {
		System.out.println("The season is Winter, and it is snowing!");
	}
	
	public static int multNumbers(int a, int c) {  
// we are giving integer arguments answer is returning as an integer.
		int answer = a * c;
		return answer;		
	}
	
}







