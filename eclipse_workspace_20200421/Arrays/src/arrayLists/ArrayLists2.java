package arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayLists2 {

	public static void main(String[] args) {

System.out.println("********************    ARRAY LIST	 *********************");
		
		ArrayList arrayList = new ArrayList();
        
        arrayList.add(90);
        arrayList.add("Java");
        arrayList.add(true);
        
        System.out.println(arrayList); 			// outp: [90, Java, true]
        System.out.println(arrayList.size());   // to find how many item in the ArrayList : 3
        System.out.println(arrayList.size()-1); // last element'in index'teki yerini yazar: 2
        arrayList.remove(2);					// 2.indexi siler.
        System.out.println(arrayList);			// outp: [90, Java]
        System.out.println();

System.out.println("********************    ARRAY LIST	 *********************");		
// Declaring arrayList in one statement:

        ArrayList numbers = new ArrayList<>(Arrays.asList("Eclipse" , 4, 6, 'o'));
       
        numbers.add(9);
        
        System.out.println(numbers); 	//outp: [Eclipse, 4, 6, o, 9]
        System.out.println(); 			// Multiple data type varsa, ArrayList'i sort edilmezmis.      
        

System.out.println("******************** GENERIC ARRAY LIST	 *********************");    
// Generic ArrayLists : holds one kind of data type. 
// String :       
        ArrayList<String> names = new ArrayList<>();
        
        names.add("Java");
        names.add("5");
        names.add("This is a string");
        
        System.out.println(names); 	// outp: [Java, 5, This is a string]
        System.out.println();
        
// Integer :        
        ArrayList<Integer> ages = new ArrayList<>();
        
        ages.add(8);
        ages.add(9);
        ages.add(10);
        
        System.out.println(ages); 	//outp: [8, 9, 10]
        System.out.println();
        
        ages.set(0, 18); 			// '.set(x,y)' method is changing the number in the target index. 0.index'e 18 yazar.
        ages.set(2, 11);			// 2.index'e 11 yazar.
       
        System.out.println(ages);
        System.out.println(ages.size());  		// ArrayList'in size'ini gosterir : 3
        System.out.println((ages.size()-1)); 	// highest index number'i gosterir : 2
        System.out.println();
        
// Double :
        ArrayList<Double> ages1 = new ArrayList<>();
       
        ages1.add(90.0);
        
        System.out.println(ages1); 	//outp: [90.0]
        System.out.println();
        

// Byte :
        ArrayList<Byte> ages2 = new ArrayList<>();
        
        ages2.add((byte)1); 
 
        System.out.println(ages2); 	//outp: [1]
        System.out.println();
	
        
System.out.println("********************    ARRAY LIST	 *********************");	

        ArrayList nolist = new ArrayList();
		
        nolist.add(5);
		nolist.add(3);
		nolist.add(1);
		System.out.println(nolist); 		//outp: [5, 3, 1]
		System.out.println();
		
		nolist.add(6);
		nolist.add(0,4);
		
		System.out.println(nolist); 		//outp:  [4, 5, 3, 1, 6]
		System.out.println();
		
		nolist.remove(1);  					// 1.indexi siler.
		
		System.out.println(nolist);			 // outp: [4, 3, 1, 6]
		System.out.println();
		
		Collections.sort(nolist);			// ArrayList'i sort eder.
		
		System.out.println(nolist);	 		//outp: [1, 3, 4, 6]
		System.out.println();
		

System.out.println("********************   LOGIN PAGE	 *********************");			
//LoginPage Example:

		ArrayList<String>loginPageLinkList = new ArrayList<String>();
		
		loginPageLinkList.add("Login");
		loginPageLinkList.add("Sign up");
		loginPageLinkList.add("Forgot password");
		loginPageLinkList.add("Privacy Policy");
		loginPageLinkList.add("Contact us");

		System.out.println("Total links are on login page is " + loginPageLinkList.size());	
		System.out.println();
		
		for (int i=0; i < loginPageLinkList.size(); i++) {
			System.out.println(loginPageLinkList.get(i));
				if (loginPageLinkList.get(i).equals("Privacy Policy")) {
					System.out.println("Click on: " + loginPageLinkList.get(i));
					break;  // break'i kaldirirsan 'Contact us'i da yazdirir. yoksa yazdirmaz. 
				}			
		}
		System.out.println();


System.out.println("********************    FRUITS LIST	 *********************");	
//  Fruits Example:
				ArrayList fruitList = new ArrayList();
				
				fruitList.add("Mango");
				fruitList.add("Apple");
				fruitList.add("Strawberry");
				fruitList.add("Lemon");
				fruitList.add("Orange");
				fruitList.add("Watermelon");
				fruitList.add("Mandarin");
				fruitList.add("1");
				fruitList.add("1.11");
				
				fruitList.remove("Mandarin");      // '.remove("x") : x'i siler.
				fruitList.remove(7);   			  //'.remove(i) : index 7'deki elemani siler. yani indexteki sirasini yazarak da silebilirsin. 
				//fruitList.clear();    		 // '.clear()' :  butun listeyi siler.
//1.way:				
				System.out.println("FruitList is printed side by side: " );
				System.out.println(fruitList); 	// outp: [Mango, Apple, Strawberry, Lemon, Orange, Watermelon, 1]
				System.out.println();
				
				System.out.println(fruitList.contains("Lemon"));	// listede varsa 'true' yoksa 'false' gosterir: true
				System.out.println();
				
				Collections.sort(fruitList);
				
				System.out.println(fruitList); 			// outp: [1, Apple, Lemon, Mango, Orange, Strawberry, Watermelon]
				System.out.println(fruitList.get(6));  // outp: Watermelon
				System.out.println(fruitList.size()); // Listenin size'ini yani kac elemani oldugunu gosterir: 7.
				System.out.println();				

// 2. way:for loop:
				System.out.println("FruitList is printed by for loop: " );
				for (int i = 0; i< fruitList.size(); i++) {
					System.out.println(fruitList.get(i));
				}
				System.out.println();
				

		
		
		
		
		
		
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
	
		* arrayList.size() 	 ==> to find how many item in the ArrayList.
		* arrayList.size()-1 ==> last element'in index'teki yerini yazar.	
		* .remove("xyz") ==> xyz'yi listeden siler.
		* .remove(i) 	 ==> index i'deki elemani siler.
		* .clear()'		 ==> butun listeyi siler.
		* .contains("abc") ==> abc listede varsa 'true', yoksa 'false' yazar.
		* .get(x) ==> 
		
		* Collections.sort(arrayListName); ==> ArrayList'i sort eder.
	
		* Generic ArrayList holds one kind of data type. 
	
	
	
	
	
	
	
	
	
	
	
	
	
*/
