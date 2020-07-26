import java.util.Scanner;

public class PatternHalfDiamond {

	public static void main(String[] args) {

		System.out.println("How many starts would you like? : ");
		Scanner kb = new Scanner(System.in);
		int starsNum = kb.nextInt();
		
		for (int r = 1; r <= starsNum; r++) {			// row
			for (int c = 0; c < r; c++) {				// column
				System.out.print("*"); 
			}
			System.out.println();
		}
		
		for (int r = starsNum-1; r > 0; r--) {			// row
			for (int c = 0; c < r; c++) {				// column
				System.out.print("*"); 
			}
			System.out.println();
		}
	
//******************************************************			

		
		
		
	}

}
