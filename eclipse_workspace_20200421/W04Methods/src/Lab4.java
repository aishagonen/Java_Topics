
import java.util.Scanner;

public class Lab4 {
	
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
//1.
		int [] arrayArgument = {9,8,7,6,5,4,3};
		arrayPrinter(arrayArgument);
//2.
		areaOfRect(5, 10);
//3. 	
		System.out.println("Enter a number: ");
		int n = kb. nextInt();
		
		sumv(n);
		sumnv(n);
//4.
		System.out.println("Enter a string: ");
		String string = kb.next();
		reversev(string);
		System.out.println("\n");
		reversenv(string);
		System.out.println("\n");
//5.
		int [] arrayArgument1 = {9999,9999,8,7,6};
		brute(arrayArgument1);
//6.
		if (isEven(11)) {
			System.out.println("Number is even.");
		} else {
			System.out.println("Number is odd.");
		}
	}

	
//1.		
	public static void arrayPrinter(int []arrayParameter) {
				
		for (int i=0; i< arrayParameter.length; i++) {
			System.out.println(arrayParameter[i]);
		} 	
	}
	
//2.		
	public static void areaOfRect(int length, int width) {
		System.out.println(length * width);
	}
	
//3.
	public static void sumv (int n) {
		
		int result = 0;
		
		while(n > 0) {
			result += n % 10;
			n /= 10;
		}
		System.out.println(result);
	}
	
	public static int sumnv(int n) {
		
		int result = 0;
		
		while(n > 0) {
			result += n % 10;
			n /= 10;
		}
		System.out.println(result);
		return result;
	}
	
//4. // ?????????????????????????????
	public static void reversev(String string) {
		
		for (int i = string.length()-1; i >-1; i--) {
			System.out.print(string.charAt(i));
		}
		
	}
	
	public static String reversenv(String string) {  
//			char [] ch = string.toCharArray();
//			String reverse="";
		for (int i = string.length()-1; i >-1; i--) {
			System.out.print(string.charAt(i));
		}
		return string;
	}	
	
//5. Brute force method: 
	public static void  brute(int [] arr) {
	
		System.out.println("Finding duplicate elements in array using brute force method"); 
			for (int i = 0; i < arr.length; i++) { 
				for (int j = i + 1; j < arr.length; j++) { 
					if (arr[i] == (arr[j]) ) {
						// got the duplicate element 
						System.out.println(arr[j]);
					}
				}
			}
	}
	
//6. 
	public static boolean isEven(int num) {
	
		if (num % 2 == 0) {
	        return true;
	    } 
		else {
	        return false;
	    }  
	}			
	
}
