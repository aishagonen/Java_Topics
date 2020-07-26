package w1;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {

// 1)
		System.out.println(10 + 20 + "Javatpoint");   
        System.out.println("Javatpoint" + (int)10 + 20);  

        
// 2)		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter number 1: ");
		int num1 = kb.nextInt();
		System.out.println("Enter number 2: ");
		int num2 = kb.nextInt();
		int productOfNumbers = num1*num2;
		System.out.println("Product of two numbers is: " + productOfNumbers);
	
	}
}
