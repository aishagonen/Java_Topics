package aa;

import java.util.Scanner;

public class TwoWords {

	public static void main(String[] args) {

		String word1;
		String word2;
		
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter two words: ");
		word1 = kb.next();
		word2 = kb.next();
		
		System.out.println(word1 + word2);
		
		int dots = 30-(word1.length() + word2.length());
		
		System.out.print(word1);
		for (int i = 0; i < dots; i++) {
			System.out.print(".");
		}
		System.out.println(word2);
		
	}
}
		
