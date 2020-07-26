package forEachLoops;

import java.util.ArrayList;

public class ForEachLoops {

	public static void main(String[] args) {
		
				
		
// foreach loop: for enhanced loop:
		int []arr2 = {4,5,6,7,8};
		
		for (int i : arr2) {
			System.out.println(i);
		}		
// ayni islemi for loop'la yazalim:
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
//********************************************			
// 1. Way: For Loop:	
// Basically, we write 'for' like that:
		
		for(int i=0; i<3; i++) {
			System.out.println(i);
		}
// Sometimes you don't want to write a full of for loop all the time. Then use 2.way.	
// 2.Way: For Each Loop:		
		
		String [] cars = {"BMW","Honda","Buick","Chevy"};
		
// Normalde listeyi boyle gosterebililriz. Bu 1. yol:
		/*
		  for(int i=0; i<cars.length; i++) {
		 	System.out.println(i);
		  }
		 */
// Bunu 2. yolla soyle yazariz:	cleaner and faster way.	
		
		for (String car : cars) {
			System.out.println(car);
		}
		
//********************************************		
		
		char [] harfs = {'a', 'b','m', 'h'};
			for (char harf : harfs) {
				System.out.println(harf);
			}
	
//********************************************			
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(3);
		numbers.add(7);
		numbers.add(1);
		
		for (Integer no : numbers) {
			System.out.println(no);
		}

//********************************************			
// Array'deki sayilarin toplami: 
		
		int [] nums = {31,71,91,2};
		int sum = 0;
//1. Way:
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];  
		} System.out.println(sum);

//2. way:	 ????????????????????????	
		for (int i : nums) {
			sum += i;
		}System.out.println(sum);
			
//********************************************		
		
		
		
		
		
	}

}
