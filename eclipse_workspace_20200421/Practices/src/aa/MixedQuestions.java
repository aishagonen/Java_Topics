package aa;

import java.util.Scanner;

public class MixedQuestions {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
// 1. Find the common numbers of 2 arrays: Output: 3,4. 

		int [] arr1 = {1,2,3,4,5,6,7,8};
		int [] arr2 = {3,4,0,10,11};
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
		
// 2. String has unique (duplicate) characters or not:  		
		
		String str = "Hello Universe.";
		int count = 0;
		
		char s [] = str.toCharArray();  // Stringi, character'lerine ayirdik ve array'e donusturduk. 

// 2a: Output: e e l e :
			
		for(int i = 0; i <s.length; i++) {   
            for(int j = i+1; j <s.length; j++) {  
                if(s[i] == s[j]) {   
                System.out.println(s[i]); 
                count ++;
                }  
            } 
                
        } 	
		
// 2b: Output: e l :
		
		for(int i = 0; i <s.length; i++) {  
            count = 1;  
            for(int j = i+1; j <s.length; j++) {  
                if(s[i] == s[j] && s[i] != ' ') {  
                    count++;  
                    //Set string[j] to 0 to avoid printing visited character  
                    s[j] = '0';  
                }  
            }  
            //A character is considered as duplicate if count is greater than 1  
            if(count > 1 && s[i] != '0')  
                System.out.println(s[i]);  
        }  
		
// 3. Find the factorial of a number: 
		
		int num;
		System.out.println("Enter a number: ");
		num = kb.nextInt();
	
		int i;
		int fact = 1;  
		  for(i = 1; i <= num; i++){    
		      fact = fact * i;    
		  }    
		  System.out.println("Factorial of " + num + " is: " + fact); 

// 4. Check the number if it is palindrome: 	 
// 4a: 1. Way: 
		int reversedInteger = 0; 
		int remainder; 
		int originalInteger;
		
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
	    
// 4b: 2. Way: 	        
        int reversedInt = 0; 
        int remainder1; 
        int originalInt;
        
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
	   
// 5. 
		System.out.println("Enter a string: ");
		String  s2 = kb.nextLine();
		
		int count1 = 0;
		
		for (int l = 0; l < s2.length(); l++) {
		if(s2.charAt(l) != ' ')  // bu satir, space'i saymaz, sadece harflerin sayisini alir. 
			count1 ++;
		} System.out.println(count1);
		
	
		kb.close();
	}
}
