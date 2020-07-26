
public class TreeShapes {

	public static void main(String[] args) {


// Agac seklinde * yazdirmak icin:		
		
		int RC = 5;
		
		for(int i=1; i<=RC; i++ ) {
			for(int sp=0; sp< RC-i; sp++) {
				System.out.print(" ");
			}
			for(int star=0; star< 2*i-1; star++) {
				System.out.print("*");
			}
			
			System.out.println();
		}


	}

}
