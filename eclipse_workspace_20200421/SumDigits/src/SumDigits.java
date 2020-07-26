import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
		sumDigits1(343465725);
		
		System.out.println("Enter at least three digits number: ");
		int num = kb.nextInt();
		sumDigits(num);
		
		
	}
	
	public static void sumDigits1(long n) {
		
   		int result = 0;
		
		while(n > 0) {
			result += n % 10;
			n /= 10;
		}
		
		System.out.println(result);
	}
	
	public static void sumDigits(long num) {
		
   		int sum = 0;
   		if (num < 100) {
			System.out.println("Invalid number!");
   		}else {
   			while(num > 0) {
   				sum += num % 10;
   				num /= 10;
   			} 
   			
   			System.out.println(sum);
		}
	}
}
