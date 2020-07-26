
public class Palindromes {

	public static void main(String[] args) {

// Palindromes: tersinden okundugunda da ayni olan kelimeler. 	
// ex:mom, dad, poop, race car, nurses run, etc.		
// For Strings:
		
//Check if a string is palindrome or not. 
// Create non-void and boolean methods.
//Palindrome String = “mom”, “abba”, etc 
		
		
		
		
		String original = "nurses run";
		original = original.replace(" ", "");
		
		String reverse = "";
		for(int i = original.length() - 1; i >= 0; i--) {
			reverse += original.charAt(i);	
		}System.out.println(reverse);
		
		boolean palindrome = true;
		for(int i = 0; i < original.length(); i++) {
			if(original.charAt(i) != reverse.charAt(i)) {
				palindrome = false;
			}
		}
		
		if(palindrome) {
			System.out.println("PALINDROME!");
		} else {
			System.out.println("Not a palindrome!");
		}
		
// *********************************
// For Integers:
// 1. Way: 
		int reversedInteger = 0, remainder, originalInteger;
		System.out.println("Enter a number: ");
		int num2 = kb.nextInt();
        
		originalInteger = num2;

        // reversed integer is stored in variable
        for( ;num2 != 0; num2 /= 10 )
        {
            remainder = num2 % 10;
            reversedInteger = reversedInteger * 10 + remainder;
        }

        // palindrome if orignalInteger and reversedInteger are equal
        if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " is a palindrome.");
        else
            System.out.println(originalInteger + " is not a palindrome.");
//			    
// 3. Way: 
        
        int reversedInt = 0, remainder1, originalInt;
        
        System.out.println("Enter a number: ");
        int num3 = kb.nextInt();
        originalInt = num3;

        // reversed integer is stored in variable 
        while( num3 != 0 )
        {
            remainder1 = num3 % 10;
            reversedInt = reversedInt * 10 + remainder1;
            num3  /= 10;
        }

        // palindrome if orignalInteger and reversedInteger are equal
        if (originalInt == reversedInt)
            System.out.println(originalInt + " is a palindrome.");
        else
            System.out.println(originalInt + " is not a palindrome.");
   

		
		
	}

}
