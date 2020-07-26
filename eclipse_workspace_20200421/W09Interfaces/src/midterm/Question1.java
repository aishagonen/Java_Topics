package midterm;

public class Question1 {

	public static void main(String[] args) {

		int arr1 [] = {11, 3, 31, -7,-91};
		
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] > 0 ) {
				System.out.println(arr1[i] + " a positive number.");
			} 
			else if(arr1[i] < 0 ) {
				System.out.println(arr1[i] + " a negative number."); 
			}
			else {
				System.out.println("0 is not negative or postive number.");
			}
		}
			
	}

}
