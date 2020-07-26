package w5;

import java.util.Scanner;

public class Monday {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
// For Loops:
		
		int sum = 0;
		
		for (int i = 0; i <= 5; i++) {
			sum = sum + i; 
		}	System.out.println(sum);
		
//***
		int sun = 0;
		
		for (int i = 5; i <= 100; i+=10) {
			sun = sun + i; 
		} System.out.println(sun);

//***
//		for (int j = 5; j <= 100; j+=10) {
//		} System.out.println(j);

//***		
//*Interview Question:		
// Reverse string / Reverse Array / Reverse Numbers: 		
		String word = "SiliconeLabs";
		String reversed = "";
		
		for (int i = word.length()-1; i >=0;  i--) {
			reversed = reversed + word.charAt(i); 	// returns character at the specified index in a string. 
		}
		System.out.println(reversed);

//***
// Even numbers: 0 is not even or odd. so start from 2.
		for (int even = 2; even <= 10; even+=2) {
			System.out.println(even);
		} 

// Odd numbers:
		
		for (int odd = 1; odd <= 10; odd+=2) {
			System.out.println(odd);
		}

//***		
// Print 'Hey you!' after 5, after print continue to count until 10. Use for loop: 	
	
		for (int i = 1; i <=10; i++) {
			System.out.print(i + " ");
			
			if (i == 5) {
				System.out.print(" Hey you! " );
			} 
		} 
//***		
// Print 'Hey you!' after every 5* : 
		
		for (int i = 1; i <=20; i++) {
			System.out.print(i + " ");
			
			if (i % 5 == 0 ) {
				System.out.print(" Hey you! " );
			} 
		} 

//***		
// write dimensional 1 to 10:   '|__' seklinde yazdirir.
// r = row, c = column
		
		for (int r = 0; r <=10; r++) {
			for (int c = 0; c <= r; c++) {
				System.out.print( c + " ");
			} System.out.println( );
		} System.out.println("bye!");
		
		
//***		
// write 10 times 1 to 10: 
		
		for (int r = 0; r <= 10 ; r++) {
			for (int c = 0; c <= 10; c++) {
			System.out.print( c + " " );	
			} System.out.println();
		}System.out.println("bye!");
		
//***		
// While Loop:
	
		int i = 1;
		while (i <= 10) {
			System.out.print( i + " ");
			i++;
		}
		System.out.println("\nfinish!");
		
//***
		int a = 1;
		while (a <= 100) {
			if (a % 2 == 0)     // while'in icindeki 'if'e curly bracket koyma, if'i direct okusun. 
				System.out.print( a + " ");	
			 a++;		
		} System.out.println(" \ndone!");

//***		
// Do - While Loops:

// Ask from user to give you $5. until you get 5, ask again. When you get 5, say 'thank you'.		
		int amount;
		
		do {
			System.out.println("Give me $5, please:");
			amount = kb.nextInt();
		} while (amount !=5);
		System.out.println("Thank you!");

//***	
// Break:
		
		for (int k = 1; k <=5; k++) {
			System.out.println(k);
			if (k > 2) {
				break;
			}
		}

// Continue:
		
		for (int m = 0; m <=10; m++) {
			if (m == 1 || m ==4) {
				continue; 		// means: 'm' 1 veya 4 olursa yazdirma ve continue yani calismaya, sonraki satirlari okumaya devam et.
			} System.out.println(m);
		} 
		
		
	}
	
}
