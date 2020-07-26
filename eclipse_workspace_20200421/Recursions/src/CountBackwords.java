
public class CountBackwords {
	
	public static void main(String[] args) {

		countBack(1111);
	}
	
	public static void countBack(int n) {
		
		if (n == 0 ) {
			System.out.println("Done!");
		}else {
			System.out.println(n);
			n--;
			countBack(n);
		}
	}
}
