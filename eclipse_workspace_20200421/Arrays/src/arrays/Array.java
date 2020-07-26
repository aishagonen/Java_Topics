package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Array {

	public static void main(String[] args) {

System.out.println("********************    ARRAYS	 *********************");
// Arrays to String : 

		int[] arr = { 4, 6, 5, 2, 3, 7, 8 };

// 1.way : Array'i yan yana yazdirmak:		
		System.out.println(Arrays.toString(arr));
													// lenght => how many elements does array have.
		System.out.println(arr.length); 			// array'in size'i yani eleman sayisi: 7.

		System.out.println((arr.length) - 1); 		// array'in son elemaninin index'teki yerini gosterir: 6.

		System.out.println(Arrays.binarySearch(arr, 4)); // sort yapmadan search yaptigin icin sonuc cikmaz.
		System.out.println(); 							// once sort, sonra search yapilir.

// 2.way : 'for' loop, Array'dekileri alt alta yazar:
		System.out.println("Array's items by for loop : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();

// 3.way : 'foreach' loop, Array'dekileri alt alta yazar:
		System.out.println("Array's items by foreach : ");
		for (int i : arr) {
			System.out.println("Number: " + i);
		}
		System.out.println();

// Arrays.sort(arrayName); --> Array'i kucukten buyuge veya alphabetical siralar:
		System.out.println("Sorted Array: ");
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr)); 			// outp: 2,3,4,5,6,7,8
		System.out.println();

// Binary search method is giving an index number after sorting the values:
		System.out.println(Arrays.binarySearch(arr, 4)); 	// 4'un index'teki yerini gosterir: 2.
		System.out.println();
	
		
System.out.println("********************    ARRAYS	 *********************");

		String arr1[] = { "Java", "Eclipse", "Slack", "Homework" };
		
		System.out.println(Arrays.toString(arr1)); 	// outp: [Java, Eclipse, Slack, Homework]

		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1)); 	// outp: [Eclipse, Homework, Java, Slack]

		System.out.println(Arrays.binarySearch(arr1, "Slack")); 	// outp: 3. / indexteki yeri siralamadan sonra 3.
		System.out.println();
	
		
System.out.println("********************    ARRAYS	 *********************");

		String[] stringArray = { "Java", "Python", "SQL", "C++" };
		
		System.out.println(stringArray[3]); 	// 3.indexteki itemi gosterir: C++
		
		System.out.println(Arrays.toString(stringArray)); //outp: [Java, Python, SQL, C++]
		System.out.println();


System.out.println("********************   FIXED SIZE ARRAY	 *********************");		

        int arr3 [] = new int[1]; 	// this is a fixed size array
       
        arr3[0] = 90;
    //  arr3[1] = 10; // Burada hata verir. Cunku  basta  Array'in size'na [1] dedik. Baska ekleyemezsin. Eklemek icin size'i degistirmelisin.
        System.out.println(Arrays.toString(arr3)); 		//outp: [90]
		System.out.println();	
        
		
		int way1[] = new int[4];

		System.out.println(way1); 						 //outp: [I@7852e922 / it shows array's memory location. Don't do that.
		System.out.println(Arrays.toString(way1)); 		//outp: [0, 0, 0, 0] / now it shows what is in the array which is all 0 now.
		System.out.println();
		
		way1[0] = 7;
		way1[1] = 11;
		way1[2] = 3;
		way1[3] = 93;
// 		way1 [4] = 55;  	// Array'in size'i 4 oldugu icin 5. elementi almaz ve hata verir --> ArrayIndexOutOfBoundsException

		System.out.println(way1.length); 			// arry'in size'i: 4.
		System.out.println(Arrays.toString(way1)); 
		System.out.println();


System.out.println("********************    ARRAYS	 *********************"); 	

//		int [] way2 = new int[] {...};    seklinde de yazilabilir.
		int way2[] = new int[] { 1, 7, 11, 23, 93, 71 }; 		// long way
		
		System.out.println(Arrays.toString(way2));
		System.out.println(way2[2]); 			// Array'in 2. index'indeki elemani gosterir.
		System.out.println();
		
		
		int[] way3 = { 51, 97, 31, 63 };
		System.out.println(Arrays.toString(way3)); 	//outp : [51, 97, 31, 63]
		System.out.println();


		int bucky[] = { 0, 2, 4, 6, 9, 64, 836 };
		
		System.out.println(bucky[4]); 				// indexteki 4. sayiyi gosterir: 9
		System.out.println(bucky.length); 			// indexin size'ini gosterir: 7
		System.out.println("Array's items by for loop : ");
		for (int b = 0; b < bucky.length; b++) {
			System.out.println(bucky[b]);
		}
		System.out.println();
		

System.out.println("********************    ARRAYS	 *********************"); 		
		
		int arr9[] = { 1, 2, 3, 4, 5 }; 
		
		System.out.println(arr9.length); 				// outp: 5
		System.out.println(Arrays.toString(arr9));		// outp: [1, 2, 3, 4, 5]
		
		arr9[4] = 99; 	// 4.index'te 5'i 99  ile degistirdik. 
		
		System.out.println("Highest index number : " + (arr9.length - 1)); 	// outp: 4
		System.out.println(Arrays.toString(arr9)); 							// outp: [1, 2, 3, 4, 99]
		System.out.println();


System.out.println("******************** FIND COMMON NUMBERS IN ARRAY	 *********************"); 
// Find the common numbers of 2 arrays: Output: 3,4. 

		int [] arra = {1,2,3,4,5,6,7,8};
		int [] arrb = {3,4,0,10,11};
		
		for (int i = 0; i < arra.length; i++) {
			for (int j = 0; j < arrb.length; j++) {
				if (arra[i] == arrb[j]) {
					System.out.println(arra[i]);
				}
			}
		} 	// outp: 3,4	
		System.out.println();
		
		
System.out.println("********************  INT ARRAY TO STRING	 *********************");

		int[] intArray = { 1, 2, 3, 4, 5 };
		
		String intArrayString = Arrays.toString(intArray);  // with this method, numbers change into the String.

		System.out.println(Arrays.toString(intArray)); 	  // This is method prints the array's elements as a String.
														 //outp: [1, 2, 3, 4, 5]
		System.out.println(intArrayString); 			//outp: [1, 2, 3, 4, 5]
											
		System.out.println(intArray.length); 	//outp: 5.
		System.out.println();


System.out.println("********************    CHAR ARRAY TO STRING	 *********************"); 		
// char to String : 

		char[] arrsample = { 'S', 'i', 'l', 'i', 'c', 'o', 'n', 'e' };
		
		String charString = new String(arrsample);
		
		System.out.println(charString); 	// outp: Silicone
		System.out.println();


System.out.println("********************    DOUBLE ARRAY TO STRING	 *********************"); 
// double to String : 

		double[] doubleArray = { 11.1, 3.3, 1.11 };
		
		System.out.println(Arrays.toString(doubleArray));
		System.out.println();

		
System.out.println("********************    BOOLEAN ARRAY TO STRING	 *********************"); 
// boolean to String :

		boolean[] booleanArray = { true, false };
		
		System.out.println(Arrays.toString(booleanArray)); 		// outp: [true, false]
		System.out.println(booleanArray[0]); 					// outp: true
		System.out.println();
		

System.out.println("********************   FRUIT ARRAY	 *********************"); 
		
		String[] fruit = new String[7]; 	// []'nun icine listende kac tane item varsa onu yaziyorsun.
		
		fruit [0] = "Mango";
		fruit [1] = "Apple";
		fruit [2] = "Starwberry";
		fruit [3] = "Lemon";
		fruit [4] = "Orange";
		fruit [5] = "Watermelon";
		fruit [6] = "Mandarin";
		
		System.out.println(fruit[4]);				 // outp: Orange
		System.out.println(Arrays.toString(fruit)); // outp: [Mango, Apple, Starwberry, Lemon, Orange, Watermelon, Mandarin]
		System.out.println();
		
		
// Bu for loop,'I like..' or 'I don't like..' yazdirir: 
		for (int i=0; i< fruit.length; i++) {
			if (fruit[i].equals("Mango")) {
				System.out.println("I don't like " + fruit[i]);
			} 
			else {
				System.out.println("I like " + fruit[i]);	
			}			
		}
		System.out.println();

		
// Bu for loop,'..is delicious.' or 'It is tasty.' or '..has vitamin C' yazdirir: 		
		for (int i=0; i< fruit.length; i++) {
			if (fruit[i].equals("Apple")) {
				System.out.println(fruit[i] + " is delicious.");	
			}
				else if (fruit[i].equals("Mandarin")) {
					System.out.println(fruit[i] + " has vitamin C.");
				}
				else if (fruit[i].equals("Lemon")) {
					System.out.println(fruit[i] + " is my favorite.");
				}					
				else if (fruit[i].equals("Starwberry")) {
					System.out.println(fruit[i] + " is yummy.");
				}
			else {
				System.out.println("It is tasty.");
			}
		}
		System.out.println();

		
System.out.println("********************    MULTI ARRAYS	 *********************"); 	
// Multi Arrays:  

		int[] numberArray = new int[10];

		for (int i = 0; i < numberArray.length; i++) {
			numberArray[i] = i;
		}

		System.out.println("--------------------------------------");

		for (int j = 0; j < numberArray.length; j++) {
			System.out.print("| " + j + " ");
		}
		System.out.println("|");

		System.out.println("--------------------------------------");

		String[][] multiDArray = new String[10][10];

		for (int i = 0; i < multiDArray.length; i++) {
			for (int j = 0; j < multiDArray[i].length; j++) {
				System.out.print("| " + multiDArray[i][j] + " ");
			}
			System.out.println("|");
		}

		System.out.println("--------------------------------------");

		for (int row : numberArray) {
			System.out.print(row);
		}
		System.out.println("\n");

		for (String[] rows : multiDArray) {
			for (String column : rows) {
				System.out.print("| " + column + " ");
			}
			System.out.println("|");
		}

		System.out.println("--------------------------------------");
		

System.out.println("********************    STRING INTO CHAR ARRAY	 *********************"); 		
		
		String str = "Jason Gibdum";
	
		char array[] = new char[16];
		
		str.getChars(0, 12, array, 0);  
 		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		System.out.println(array[5]);
		System.out.println(array[6]);
		System.out.println(array[7]);
		System.out.println(array[8]);
		System.out.println(array[9]);
		System.out.println(array[10]);
		System.out.println(array[11]);
		System.out.println(array[12]);
		
//		str.getChars(3, 5, array, 7); 
//		System.out.println(array[7]);
//		System.out.println(array[8]);
//		System.out.println(array[9]);
		
		
	}

}
/*
 	* Differences btw. Array & ArrayList :

		1. to find how many item in;
			- Array     ==> .length()
			- ArrayList ==> .size()  		
		2. ArrayList can hold 'different data types'. 
		 - Array can hold  'same type'. 
		3. Array is fixed size. 
	 	 - ArrayList is not, we can add values with ==> '.add' method. 		
		4. Array'i yazdirmak icin syso'nun icine ==> 'Arrays.toString(arrayName)' yazilir.
		 - ArrayList'i yzdrmak icin syso'nun icine ==> '(arrayListName)' yazilir.
		5. Multiple data type varsa, ArrayList'i sort edemezsin. ??!!

	* creating an array  ==>  dataType arrayName [] = new dataType [lengthOfArray];	
	 
	* Arrays.sort(arrayName); 	==> Array'i kucukten buyuge veya alphabetical siralar.
	 
	* Arrays.binarySearch(arr, x) 	==> binary search : x'in index'teki yerini bulur.
	 	-Binary search method is giving an index number after sorting the values.	
	 
	* arrayName[x] = y;  ==> Array'in x. indexindeki elemani y ile degistirir. 
	 
 	* (arr.length) 	  ==> array'in eleman sayisini yazar.
	* ((arr.length) - 1) ==> last element'in index'teki yerini yazar.
	
	* default value is 'null' for each index for String. If you don't assign any value it's mean each index is 'null'.	
	* default value is 0 for each index for integers. If you don't assign any value it's mean each index is '0'.		
	 		
	* String into a Char Array :
	  '.getChars(beginIndex, endIndex, destination, destBegin)' ==> String'i char array'ine koyar.  




# ArrayList is one step more useful than Array.
# If you want to hold only unique elements, use SET. 
# If you want to create a program which has key-value relation, use MAP. 
	
*/