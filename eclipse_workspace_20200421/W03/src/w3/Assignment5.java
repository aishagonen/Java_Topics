package w3;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
// 1. 
		String [] array1 = {"Charlie", "Lucy", "Sally", "Schroeder", "Patty"};
	
		Arrays.sort(array1);
		System.out.println(Arrays.toString(array1));
		
		 
		int [] array2 = {11,39,3,97,17};		
		
		Arrays.sort(array2);
		System.out.println(Arrays.toString(array2));
		
// 2. 
		System.out.println("Please enter number of the day: ");
		int day= kb.nextInt();
		
		switch (day) {
			case 1:
				System.out.println("Monday.");
				break;
			case 2: 
				System.out.println("Tuesday.");
				break;
			case 3: 
				System.out.println("Wednesday.");
				break;
			case  4: 
				System.out.println("Thursday.");
				break;
			case 5: 
				System.out.println("Friday.");
				break;
			case 6: 
				System.out.println("Saturday.");
				break;
			case 7: 
				System.out.println("Sunday.");
				break;
			default: 
				System.out.println("Invalid.");
				break;
		}
		

	}

}
