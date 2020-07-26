package exceptions;

import java.util.Scanner;

public class Exceptions1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int [] arr ={1};
		
//		System.out.println("Hello Universe.");
//		System.out.println(arr[4]); // undefined, so Exception . Program will stop here. 
//		System.out.println(9/0); // Exception
//		System.out.println("Hello World");
	
		
		
// after try block, we need to create one or more catch block or finally block
		
		try {
			System.out.println(arr[4]); // Exception
			System.out.println(9/0); // Exception
			System.out.println("Hello Silicone Labs");
		}
		catch (Exception e) {
			System.out.println("This is catch block");
		}
		System.out.println("Hello World");
		System.out.println();
		
		try{
			System.out.println("Input your year of birth");
			int year = scanner.nextInt();
			int age = 2020 - year;
			System.out.println("This is your age : " + age);
		}
		catch (Exception e) {
			System.out.println("Invalid input");
		}
		System.out.println();
		
		
		
	}

}
