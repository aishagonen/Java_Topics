package w3;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
// *****************************************************		
// Q1. 
		System.out.println("Enter array length: ");
		int arrayLength = kb.nextInt();
		
		int [] arr = new int [arrayLength];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter item " + (i+1) + ": ");
			arr [i] = kb.nextInt();
		}
// for  loop:		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr [i]);
			if(i < arr.length-1)   // if'li kisim, sayilarin arasina ',' koysun ama son sayiya koymasin diye. 
				System.out.print(", ");
		}

// foreach loop:
		for (int i : arr) {
			System.out.print( i+ ", ");
		}
		
// while loop:
		int  i=0;
		while (i<arrayLength) {
			System.out.print(arr [i] + ", ");
			i++;
		}

// *****************************************************		
// Q2.		
		double prices [] = { 111.1, 3.3, 1.11, 7, 3.11, 5, 1.51, 33, 11.77, 77 };
		
		int count = 0; 
		
		for (int j = 0; j< prices.length; j++) {
			if (prices[j] > 20) {
				count++;
			}
		}
		System.out.println(prices.length - count); // elementes less than 20; 
		
		if (count > 0) {
			System.out.println(count + " number of the item is greater than 20.");
		}  else {
			System.out.println("there is no item greater than 20.");
		}
		
// 2. Way: 
		for(int i=0; i<prices.length; i++) {
			if(prices[i]>20) {
				count++;
			}
		}
		if(count>0) {
			System.out.println("Count: "+ count);			
		}
		else {
			System.out.println("Not found.");
		}
		
		
// *****************************************************		
// Q3. 1. Way: Hoca'nin yaptigi ancak, her 100 olamayan index icin 'else condition'i yaziyor.
		
		int [] myArray = { 33, 111, 100, 71, 63, 11, 1, 51, 113, 7};
	
		for (int i = 0; i < myArray.length; i++) {
										
			if (myArray[i] == 100) {		// myArray[i];=value'yu gosterir.
				System.out.println("Value  found at index "  + i);
				break;
			} else {
				System.out.println("100 not found in the array.");
			}
		}
		
	// 2. Way: Kocamin yaptigi, perfect!
		boolean isFound=false;
				
		for(int i = 0; i < myArray.length; i++) {
			if(myArray[i] == 100) {
				isFound= true;
				System.out.println("Value found at index " + i);
				break;
			}
		}
		if(!isFound) {
			System.out.println("100 not found");
		}
		
// *****************************************************		
// Q4.		
		int[] nums = { 100, 234, 311, 5433, 6454, 1233, 54523, 45645,12234};
		int sum = 0;
		int sumOfEvens = 0;
		int sumOfOdds = 0;
		
		for (int i = 0; i < nums.length; i++) {
			sum  = sum + nums[i];
			if (nums[i] % 2 == 0) {      // parity = oddness or evenness
				sumOfEvens = sumOfEvens + nums[i];
			}else {
				sumOfOdds =  sumOfOdds  + nums[i];	
			}
		}
		System.out.println("Sum of the array: " + sum);  	// 126167 
		System.out.println("Sum of evens: " + sumOfEvens);  // 19022
		System.out.println("Sum of odds: " + sumOfOdds);    // 107145
	
// *****************************************************		
// Q5.		
		for (int i = 7; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
		
// *****************************************************		
// Q6.	
		int ROWCOUNT = 7;
		
		for(int r=1; r<=ROWCOUNT; r++) {
			System.out.print(r + ":  ");
			for(int c=1; c<=ROWCOUNT-r+1; c++) {
				System.out.print(c);
			}
			System.out.println();		
		}
// *****************************************************		
// Q7. 
			int ROWCOUNT = 6;
			
			for(int r=1; r<=ROWCOUNT; r++) {
				System.out.print("$");
				
				for(int c=1; c<=r-1; c++) {
					System.out.print(" ");
				}
				System.out.print("$");
				System.out.println();
				
			}
			
// *****************************************************				

			for (int i = 0; i < 10; i++) {
				for(int c=1; c<=15; c++) {
					System.out.print("$");
				}
				System.out.println();
			}

		
		
		
		
		
		
	}

}
