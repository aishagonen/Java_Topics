package w3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import sun.net.www.content.audio.wav;

import java.*; // eger import edecegin classin devamini hatirlamiyorsan bunu yap. Butun classalri kapsar. 

public class W3 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
        System.out.println("Hello Everyone !");
        // 1) only one block is going to work
        // 2)first true condition block is going to work 
        // if no condition is true, else is going to work
        // else block doesn't have condition
		        int x = 90;
		        
		        if (false) {
		            x = 100;
		        }
		        else if (9 == 8 || 6<9) {
		            x = 102;
		        }
		        else{
		            x = 101;
		        }
		        
		        System.out.println(x);
//******************************************************		        
// Difference between switch-case and if-else
//1) i have option to excited the codes in different blocks
//2) instead of conditions, switch case blocks use value equality
        int y = 8; // key 
        switch (y){ // y = key
        case 1 : // value = 1
            System.out.println("This is case 1");
            break;
        case 2 : // value = 2
            System.out.println("This is case 2");
            break;
        case 3 : // value = 3
            System.out.println("This is case 3");
            break;
        default: // 
            //System.out.println("No values were equal to keys");
        }
        
//*************************************************		        
      
      Scanner scanner = new Scanner(System.in);
      System.out.println("What is the day : ");
      String key = scanner.nextLine();
      switch (key) {
      case "monday":
          System.out.println("This is Monday");
          //break;
      case "tuesday":
          System.out.println("This is Tuesday");
          //break;
      case "wednesday":
          System.out.println("This is Wednesday");
          //break;
      default:
          System.out.println("This is not the first 3 days of the week");
		          
		      }
		        
//*************************************************	
        
        char charKey = 'Y';
        
        switch (charKey) {
        case 'Z':
            System.out.println("Key is Z");
            
        case 'Y':
            System.out.println("Key is Y");
            
        case 'A':
            System.out.println("Key is A");
            break;
        default:
            System.out.println("This is the default");
        }
        
//***************************************************************
// Arrays: 
        	
        int [] arr = {4,6,5,2,3,7,8};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr); // 2,3,4,5,6,7,8
        System.out.println(Arrays.toString(arr));
//******************************************************	
// binary search method is giving an index number after sorting the value
        System.out.println(Arrays.binarySearch(arr, 4)); //2
        
        String arr1[] = {"Java", "Eclipse", "Slack", "Homework"};
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.binarySearch(arr1, "Slack"));
        
//******************************************************	        
// Arraylist:
        ArrayList arrayList = new ArrayList();
// First difference : Arraylists can hold different data types
// Second difference : Arrays are fixed size, but arraylists are not.
// we are adding value with add method
        arrayList.add(90);
        arrayList.add("Java");
        arrayList.add(true);
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        arrayList.remove(2);
        System.out.println(arrayList);
        
//******************************************************	        
// Declaring ArrayList in one statement: Yani ArrayList'i boyle yazarak da olusturabilirsin:
        
        ArrayList numbers = new ArrayList<>(Arrays.asList("Eclipse" , 4, 6, 'o'));
        
        numbers.add(9);
        System.out.println(numbers);
       
    
        int arr3 [] = new int[1]; // this is a fixed size array
        arr3[0] = 90;
      //arr3[1] = 10;
        
//******************************************************	        
// Generic Arraylists : They are going to hold one kind of data type:
// String:		        
        ArrayList<String> names = new ArrayList<>();
        names.add("Java");
        names.add("5");
        names.add("This is a string");
        System.out.println(names);
        
//******************************************************	        
// Double:		        
        ArrayList<Double> ages1 = new ArrayList<>();
        ages1.add(90.0);
//******************************************************	
// Byte:		        
        ArrayList<Byte> ages2 = new ArrayList<>();
        ages2.add((byte) 1);
//******************************************************	
// Integer:		        
        ArrayList<Integer> ages = new ArrayList<>();
        ages.add(8);
        ages.add(9);
        ages.add(10);
        ages.set(0, 18); // set method is changing the number in the target index
        System.out.println(ages);
        
//******************************************************	        
// Another way to declare string:
// char:		        
        char [] arrsample = {'S','i','l','i','c','o','n','e'};
        String string = new String(arrsample);
        System.out.println(string);
        
        int [] intArray = {1,2,3,4,5};
        String intArrayString = Arrays.toString(intArray); // 
        System.out.println(Arrays.toString(intArray)); // this is a method to print the array elements
        System.out.println(intArrayString);

// *********************************************************		    
// Print Hello Silicone Labs 1 time:
		System.out.println("Hello Silicone Labs");
		
// Print Hello Silicone Labs for 99 times:	
		for(int i = 0 ; i <= 99 ; i++){
			System.out.println(i + " : Hello Silicone Labs");
		}
//******************************************************			
// looping trough array:	
		int [] arr5 = {3,4,5,6,7,8,9,5,6,4,3,2};
		
		for(int i = 0 ; i < 5 ; i++){      // 'i<5' yerine 'array'in length'ini' yazmak daha dogru. cunku 'i<6' yazsan kod hata verir.
			System.out.println(arr5[i]);  // Cunku 6. index yok. o yuzden 'i < array5.length' yazmak daha dogru.
		}
		
		for(int i = 0 ; i < arr5.length ; i++){
			System.out.println(arr5[i]);  // [i] index sayisi, 0. index'i alip yaziyor sonra diger index'leri	
		}

		for(int i = 0 ; i < arr5.length ; i++){
			System.out.println(arr5[i] + 9);    // for loop'la array'deki elemenlarla maatematiksel islem yapabilirsin. 
		}
		
//******************************************************			
// I put initialization step to outside of the for loop:
		int count=0;
		
		for(; count < 5 ; count ++){
			System.out.println( count+ " : count");
		}

//******************************************************			
// for loop with decreasing numbers:
		for(int i = 5; i >- 3 ; i--){
			System.out.println(i + " = i" );
		}
		
//******************************************************			
// for loop with increasing numbers by 2:
		for (int i = 0; i < 10; i+=2) { 	// i = i + 2
			System.out.println("i : " + i);
		}
		
//******************************************************			
// for loop with increasing numbers by 2:
		for (int i = 1; i < 10; i *= 2) { 	// i = i + 2
			System.out.println("i : " + i);
		}

//******************************************************	
// create a program that finds odd - even numbers in a number of given:
		for(int i = 0 ; i < 19 ; i++){
			if (i %2 == 0) {
				System.out.println( i + " is an even number");
			}
			else {
				System.out.println( i + " is an odd number");
			}
		}

//******************************************************	
// foreach loop: for enhanced loop:  this way is easy for look through the list. 
		int []arr2 = {4,5,6,7,8};
		
		for (int i : arr2) {
			System.out.println(i);
		}
		
//******************************************************			
// While loop:
// While loop is like combination of 'for and if'.

// increasing numbers: 		
		int j = 0;
		
		while (j < 10) {
			System.out.println(j);
			j++; // bu komutu yazmazsan loop sonsuza kadar calisir. 
		}

//******************************************************			
// decreasing numbers:
		while (j>-10) {
			System.out.println(j);
			j--;
		}
		
		
//loops trough the array 
		int m =0;
 		int []arr7 = {4,5,6,7,8};
		
 		while (m < arr2.length) {
			System.out.println(arr7[m]);
			m++;
		}

//******************************************************			
	/* ceyrek diamond pattern:
	    *
	    **
	    ***
	    ****
	    *****
	    ******
	    */
		
		String stringg = "";
		int count1 = 0;
		
		while (count1 < 6) {
			stringg = stringg + "*";
			System.out.println(stringg);
			count1++;	// bu kodu yazmazasan loop sonsuza kadar calsisir. 
		}

//******************************************************			
		int count2 = 0;
		
		while(count2 < 14){
			System.out.println(count2);
			count2++;	
			break; // break statements kills the loop
		}

//******************************************************			
		int count3 = 0;
		
		while(count3 < 14){
			if (count3 %2 ==0) {
				System.out.println(count3 + " is an even number");
			}
			else {
				System.out.println(count3 + " is an odd number");
			}
			count3++;		
		}

//******************************************************			
// Difference between 'while' and 'do-while' loop: 
// 'do-while' loop runs at least one time. then check the condition and if it is false loop stops. but one time runs no matter what.  	
		int count4 = 0;
		
		do {
			System.out.println( count4);
			count4++;
		} while (count4 < 6);


//******************************************************				
// 'while' loop checks the condition BEFORE executing the statement. If condition is false, statements inside of the loop doesn't executed.		
		boolean condition = false;
		
		while (condition) { 
			System.out.println("Inside of while loop");
			
		}

//******************************************************		
// 'do-while' loop checks the condition AFTER executing the first statement. If condition is false, statements inside of the loop executed 1 time. Then stops. 
		do {
			
			System.out.println("Inside of do-whileloop");
		} while (condition);
		
//******************************************************			
// two dimensional arrays:
//		 				{(row)outerSet}  {(column)innerSet}
		int [][] twoDimArry = {{1,2,3,4}, {9,8,7,6}};
		
		for (int outerSet = 0; outerSet < 2; outerSet++) {
			for (int innerSet = 0; innerSet < 4; innerSet++) {
				System.out.print(twoDimArry[outerSet][innerSet]);
			}  // output: 12349876
		}
//									row  column		
		System.out.println(twoDimArry[1][2]); // output:7
		System.out.println(twoDimArry[0][3]); // :4
		System.out.println(twoDimArry[0][1]); // :2
		System.out.println(twoDimArry[1][0]); // :9
		System.out.println(twoDimArry[1][2]);

//******************************************************				
		int arr9 [] ={1,2,3,4,5}; // lenght = how many elements does array have
		
		System.out.println(arr9.length);
		arr9[4] = 99;
		System.out.println("Highest index number : "  +(arr9.length -1));
		System.out.println(Arrays.toString(arr9));
		
	
		
		
	}

}
