
public class Fibonacci1 {

	public static void main(String[] args) {

// Fibonacci 1. way:
		
		int n = 10, t1 = 0, t2 = 1;
		
		System.out.print("First " + n + " terms: ");
	
		for (int i = 1; i <= n; i++) {
			System.out.print(t1 + " + ");
			
			int  sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}
		System.out.println( );
		

// Fibonacci 2. way:		
		
		int j = 1, k = 10, w1 = 0, w2 = 1;
		
		System.out.print("First " + k + " terms: ");
		 
		while (j <= k) {
			System.out.print(w1 + " + ");
			
			int  sum = w1 + w2;
			w1 = w2;
			w2 = sum;
			
			j++;
		}
	
	}

}
