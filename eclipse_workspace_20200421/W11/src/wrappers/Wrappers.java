package wrappers;

import java.util.ArrayList;

public class Wrappers {

	public static void main(String[] args) {
		
		// Boxing
		int a = 50; 
		
		Integer integer = a;
		System.out.println(integer);
		
		Integer a2 = new Integer(a);
		System.out.println(a2);
		
		Integer a3 = 5; 
		System.out.println(a3);
		

		// Unboxing
		Integer integer2 = 100;
		int b = integer2;
		System.out.println(b);
		
		
		Integer q = 5; 		// Boxes int to Integer obj. since q is an object.
		q = q + 10;			// Unboxes Integer to int, so can be added as an integer. 
		System.out.println(q); 

		
		// Boxing w ArrayList : 
		ArrayList<Integer> arrayList = new ArrayList<>(); 
		// In ArrayList we store item as an object, not as a dataType.
		
		arrayList.add(4); // Boxing
		
		int x = 100;
		arrayList.add(x); // Boxing
		
		int y = arrayList.get(0); // Unboxing
		System.out.println(y);

		
		String s[] =  {"10", "20"};
		
		System.out.println("Sum before: " + s[0] + s[1]);
		
		//Covert String to Integer :
		int t = Integer.parseInt(s[0]);
		int k = Integer.parseInt(s[1]);
		
		int f = t + k;
		System.out.println("Sum after: " + f);
		
	}

}

 /*
	Wrapper Classes :  Integer, Long, Byte, Double, Float, Short classes.
					  (int, long, byte, double, float, short are primitive dataType, NOT class.)
	- Wrap.clss. are insdide of Java.lang.Package.
	- All wrap.clss. are subclass of the 'abstract' class 'Number'.
	- Wrap.Class are used for change primitive dataTypes into objects and objects into prmtv.dataTyp. 
		= Autoboxing : primitive dataType ==> object.
					(int to Integer, long to Long, ...etc.)	
		= Unboxing : object ==> primitive dataType.
		 			(Integer to int, Double to double...etc.)
	
	
	
	
	
	
	
	
	
*/