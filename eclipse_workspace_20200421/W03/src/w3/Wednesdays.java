package w3;

import java.util.Arrays;

public class Wednesdays {

	public static void main(String[] args) {

		String string1 = "string 77";
		System.out.println(string1.trim());
// aradaki bosluklari silmek icin bir metod yok. 		
		System.out.println(string1.substring(0,6)+string1.substring(7,9));
		
	String str = "geekss@for@geekss";
	String [] arrOfStrings = str.split("ee", 3);
	System.out.println(Arrays.toString(arrOfStrings));
		
		
		
		
		
		
		
		
		
		
	}

}
