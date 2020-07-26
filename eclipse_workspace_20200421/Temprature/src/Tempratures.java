import java.util.Scanner;

public class Tempratures {

	public static void main(String[] args) {

// 3. Create a temperature converter program:
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the  temprature [F]:  " );
		int fah = kb.nextInt();
		
		double cel = (fah - 32) / 1.8;
		
		System.out.println(fah + " F is " + cel + " C.");	
		
		
	}

}
