package newPack;
import java.util.Arrays;

public class W4 {	
	public static void main(String[] args) {		
		
		helloWorld();
		printOut("I love Java");
		addNumbers(1, 2, 3);
		areaOfTriangle(3, 6);
		int[] arr = {1,2,3,4};
		int [] arr1 = {5,6,7,8,9};
		String [] names = {"Charlie", "Lucy", "Snoopy"};
		printarray(arr);
		printarray(arr1);
		printarray(names);		
	}		
	
	public static void printOut(String print) {
		System.out.println(print + " so much.");
	}		
	public static void addNumbers(int a, int b, int c) {
		int addition = a + b + c;
		System.out.println(addition);
	}	
	public static void areaOfTriangle(int height, int base) {
		System.out.println((height * base) / 2);
	}
// Overloading methods: method names same, but  variable type is different. 		
// printArray(int ...) vs. printArray(String ...) :
	
	public static void printarray(int [] source) {
		System.out.println(Arrays.toString(source)); // prints values of array.
	}	
	public static void printarray(String [] source) { // Overloading of the printArray Method. 
		System.out.println(Arrays.toString(source)); 
	}			
	public static void helloWorld() {
		System.out.println("Hello World");
		System.out.println("Hello Silicone Labs.");
	}
}
