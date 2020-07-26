

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {

// 1- Take values of length and breadth of a rectangle from user and check if it is square or not.		

		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter length: ");
		int length = kb.nextInt();
		
		System.out.println("Please enter breadth: ");
		int  breadth  = kb.nextInt();
		
		if (length  == breadth) {
			System.out.println("This is a square.");
		}
		else {
			System.out.println("This is not a square. This is a rectangle. ");
		}
	
		
		
//****************************************************		
		
// 2- Write a Java program to check whether two String objects contain the same data.
		
		String string1 = "The String class represents character strings.";
		String string2 = "The String class represents character strings";
		String string3 = "The String class represents character strings.";
		
		System.out.println(string1.equals(string2));
		System.out.println(string1.equals(string3));
		
//****************************************************			
	
// 3- Write a Java program to replace all the 'd' characters with 'f' characters.
// Original string: The quick brown fox jumps over the lazy dog. 
// New String: The quick brown fox jumps over the lazy fog.
		
		String words = "The quick brown fox jumps over the lazy dog.";
		System.out.println(words.replace("d", "f"));
		
		
		
		
		
	}

}
