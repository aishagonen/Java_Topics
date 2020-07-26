import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
	

		Scanner kb = new Scanner(System.in);

//******************************************************			
		int count3 = 0;
		while(count3 < 14){
			if (count3 %2 ==0) {
				System.out.println(count3 + " is an even number");
			}
			else {
				System.out.println(count3 + " is an odd number");
			}
			count3++;		
		}

//******************************************************		
		
// create a program that finds odd - even numbers in a number of given:
		for(int i = 0 ; i < 19 ; i++){
			
			if (i %2 == 0) {
				System.out.println( i + " is an even number");
			}
			else {
				System.out.println( i + " is an odd number");
			}
		}	

//******************************************		
		int  a;
		
// 1. way:	
		do{
			System.out.println("Number: ");
			a = kb.nextInt();
			
			if (a == -1) {
				break;
			}	
			if (a%2 == 0) {
				System.out.println(a + " is an even number.");
			}
			else {
				System.out.println(a + " is an odd number.");
			}
		}while(true);
		
// 2. way:	
		System.out.println("Number: ");
		a = kb.nextInt();
		
		while(a != -1) {
			if (a %2 == 0) {
				System.out.println(a + " is an even number.");
			}
			else {
				System.out.println(a + " is an odd number.");
			}
			System.out.println("Number: ");
			a = kb.nextInt();
		}
			System.out.println("Bye...");

//******************************************		

			
	}

}
