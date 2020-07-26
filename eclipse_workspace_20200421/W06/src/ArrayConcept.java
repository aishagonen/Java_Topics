
public class ArrayConcept {

	public static void main(String[] args) {
		
// Array: Use to create single variable, store multiple values.
// What are limitations: 
// 1. Static array: Size is fixed. To solve this issue we use dynamic array or arrayList
// 2. Can not store different data types. You have to store string. But if you are asked to put different types variable into array --> So you have to create dynamic array or arrayList.  


		int a [] = new int [4]; 	// this is length for array / ('size' for arrayList.) 
		a [0] = 10;		// lowest index.
		a [1] = 20;
		a [2] = 30;
		a [3] = 40; 	// highest index.
		
	// to find length
		System.out.println(a.length);
		
	// how to print out specific value from array:
		System.out.println(a[0]);
		System.out.println(a[2]);
	 // System.out.println(a[4]);  bu kod error verir cunku 'index is out of bounds exception'.
		
	// We can use regular for loop to print out array as a list. 
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	// We can use for each loop to print out array as a list. 	
		for (int i : a) {
			System.out.println(i);
		}
		
		double d [] = new double [2];
		d[0] = 12.33;
		d[1] = 10.55;
		
		double d1 [] = {12.33, 10.55};
				
	// String Array: 
		String s []= new String [4];
		s[0] = "Java";
		s[1] = "Python";
		s[2] = "Groovy";
		s[3] = "Ruby";
		
		for (int i = 0; i < s.length; i++) {
//			System.out.println(s[i]);
//		} instead of this used below:
			if (s[i].equals("Groovy")) {
				System.out.println(" I don't like " + s[i]);
			} else {
				System.out.println("I love " + "s[i]");
			}
		}
		
	}

}


