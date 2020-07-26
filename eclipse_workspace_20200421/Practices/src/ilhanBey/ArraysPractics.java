package ilhanBey;
import java.util.Arrays;

public class ArraysPractics {

	public static void main(String[] args) {
		
//1.
		int [] points = {1,3,5,7,11,13,17,19,23,29};
		
		if(points.length == 10) {
			System.out.println("10 points found");
		}else {
			System.out.println("We need 10 points");
		}
		
		for (int j = (points.length)-1; j >= 0;  j--) {	 
			System.out.print(points[j] + ", ");
		} System.out.println(" ");
		
//2.
		int [] nums = {31,71,91,2};
		int sum = 0;
		int sumEvens = 0;
		int sumOdds = 0;
		
		for (int i : nums) {
			sum +=i;
			if (i % 2 == 0 ) {
				sumEvens += i;
			} else {
				sumOdds += i;
			}
		} System.out.println(sum);
		  System.out.println(sumEvens);
		  System.out.println(sumOdds);
		
//3. 	 
		String [] arr1 = {"zero", "one", "two","three","four","keys"};	
		
		int count=0;
		
		for (String s : arr1) {
			if (s.contains("e")) {
				count++;
			}
		}System.out.println(count);
		
//4. 
		String [] arr2 = new String[] {"apples", "banana", "kiwi", "cherries"};
//1. way:		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i].substring(0,3));
		}
//2.way:
		for (String fruit  : arr2) {
			System.out.println(fruit.substring(0,3));
		}

// *********		
		double[] thisYear1 = { 1.6, 2.1, 1.7, 3.5, 2.6, 3.7, 3.9, 2.6, 2.9, 4.3, 2.4, 3.7 };
		Arrays.sort (thisYear1);
		double max = (thisYear1.length -1);
		System.out.println(max);
		
		
		double[] thisYear = { 1.6, 2.1, 1.7, 3.5, 2.6, 3.7, 3.9, 2.6, 2.9, 4.3, 2.4, 3.7 };
		double sum = 0;
		for (int i = 0; i < thisYear.length; i++) {
			sum += thisYear[i]; // sum = sum + thisYear[i]
		}
		//System.out.println(sum / thisYear.length);
		double maximum = 0;
		for (int i = 0; i < thisYear.length; i++) {
			if (maximum < thisYear[i]) {
				maximum = thisYear[i];
			}
		}
		System.out.println(maximum);
		
// *********		
	
	}
		
}


// 1. Create int array points and assign 10 different numbers
//between 0 - 100 
//Verify there are 10 numbers or not
//Reverse array 
//int i[] ={1,2,3,4,5,6}
//Sample output:
//10 numbers found
//6,5,4,3,2,1

// 2. Create variable nums - assign several values
//using aa loop calculate the sum and print it
//ADDITIONAL steps:
//- calculate sum of even numbers
//- calculate sum of odd numbers   
//Sample output:
//Sum is 115167
//Sum of evens is 8022
//Sum of odds is 107145 

//3- String[] arr = {"zero", "one", "two","three","four","keys"};
//Count how many words have "e"  in array

//4- String[] arr = new String[] {"apples", "banana", "kiwi", "cherries"};
//Print app, ban, kiw, che
//Don't print all values




