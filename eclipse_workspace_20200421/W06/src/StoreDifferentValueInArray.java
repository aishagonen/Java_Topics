
public class StoreDifferentValueInArray {

	public static void main(String[] args) {

// Use 'Object' main class for store different values in array. 
		
		Object empData [] = new Object [5]; 	// Don't forget this Object class!
		empData [0] = "Tom";	// String
		empData [1] = 25; 		// int
		empData [2] = 'M'; 		// char
		empData [3] = 2500.45; 	// double
		empData [4] = true; 	// boolean
	
		for (int i = 0; i < empData.length; i++) {
			System.out.println(empData[i]);
		}
		
		
	}

}
