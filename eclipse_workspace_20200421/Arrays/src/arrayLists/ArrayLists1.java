package arrayLists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayLists1 {

	public static void main(String[] args) {
		
		System.out.println("********************    ARRAY LIST	 *********************");

		ArrayList<String> arrayListX = new ArrayList<>(2);
		arrayListX.add("Java");
		arrayListX.add("Soap");
		arrayListX.add("Rest");
		arrayListX.add("Cucumber");
	
		Iterator iteratorX = arrayListX.iterator();
		
		System.out.println("ArrayList with while loop : ");
		while (iteratorX.hasNext()) {
			System.out.println(iteratorX.next());	
		}
		System.out.println();
		
		System.out.println("ArrayList with for loop : ");
		for (int i = 0; i < arrayListX.size(); i++) {
			//System.out.println(arrayList.get(i));
			if (iteratorX.hasNext()) {
				System.out.println(iteratorX.next());
			}
		}
		System.out.println();


		ArrayList<String> arrList = new ArrayList<String>();
		
		arrList.add("Steve");
		arrList.add("Steve");
		arrList.add("Bill");
		arrList.add("Elon");
		arrList.add("King Shakir");

// 1.a.way : while loop + Iterator :
/*
		Iterator iteratorAL = arrList.iterator(); 
			
		System.out.println("ArrayList in forward direction with while loop by Iterator : ");
		while (iteratorAL.hasNext()) {
			System.out.println(iteratorAL.next() + " ");
		}
		System.out.println();
*/
		
		ListIterator<String> listIterator = arrList.listIterator(); 
// 1.b. way :  while loop + ListIterator : 
		System.out.println("List elements in forward direction: ");
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next() + " ");
		}
		System.out.println();
		
		
// for backward direction:  		
		
		System.out.println("ArrayList in backward direction: ");
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous() + " ");
		}
		System.out.println();
		
 
		Iterator iteratorAL1 = arrList.iterator(); // yukarida 'iterator' kullanarak yazdigimiz icin 2nd way'i tekrar yazdirmaz. 
										 		  // o nedenle tekrar 'iterator1' olusturup 2nd way'i yazdirdik. 
// 2.way: for loop :
		System.out.println("ArrayList with for loop : ");
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		System.out.println();
// 3.way: Iterator + for loop :
		System.out.println("ArrayList with for loop by Iterator : ");
		for (int i = 0; i < arrList.size(); i++) {
			if (iteratorAL1.hasNext()) {
				System.out.println(iteratorAL1.next());
			}
		}
		System.out.println();

//4.way: foreach loop :
		System.out.println("List ArrayList with foreach loop : ");
		String str = "";
		for (String s : arrList) {
			System.out.println(s + " ");
			str += s;
		}
		System.out.println();
		
		
//convert Array to ArrayList:
		int [] arr = {11,22,33,44,55};
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			arrayList.add(arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arrayList.get(i));
		}
		System.out.println();
		
		
		
		
		
	}
}
/* 
* Iterator : 
 	-Iteratorun amaci containerin icindeki elemanlari gezmek.
 	
*Iterator & ListIterator: 
 		- When I use * Iterator iteratorAL = arrList.iterator(); * I got the list in forward direction.  
 		AND
		- When I use * ListIterator<String> listIterator = arrList.listIterator();* I didn’t get print the list for backward direction.
		SO 
		- I should use * ListIterator* to get print for both -forward and backward- on the same page. 
		- Should not use  * Iterator * to get forward direction at all.
	 	- Even before printing in forward direction, you can not print in backward direction.

# ArrayList is one step more useful than Array.
# If you want to hold only unique elements, use SET. 
# If you want to create a program which has key-value relation, use MAP. 

* LIST : 
		- LinkedList, Vector ve ArrayList; List sinifindan gelir. Ozellikleri birbirine benzer.
		- All of them implements List interface. So they use same methods like --> .add, .remove, ...etc.
	 	- Ayni elemandan birden fazla olusturulabilir.
		 
	 * ArrayList : 
		- Dynamic, can add or remove elements to first (initial) size.
	 	- We can set ArrayList like --> 'ArrayList<String> arrList = new ArrayList<String>(2);' 
		  but we can add or remove elements later. So size can be different than what we write when we created the ArrayList. 
	 	- ArrayList print in order from firstIndex to lastIndex.
	 	- ArrayList'te ayni elemandan birden fazla olusturulabilir.
		- If you need to just add items and no need to change frequently so use ArrayList.  
		- ArrayList is one step more useful than Array.
	
	* LinkedList : 
		- If you need to change the list frequently, add or remove in random index numbers so use LinkedList. 
	
	* Vector :
		- Vector is smilar to ArrayList, but is not limited to a specific size. Just add or remove items.
		- Vector is synchronized; little bit slower than ArrayList.
		- Vector has many methods that are not part of the collection framework.     
		- Eger Vectorun icindekiler sadece String degil de bir record sinifinin objeleri olsaydi --> 'syso(vec)'
		  yazdigimizda listeyi goremezdik. Iterator kullanmamiz gerekirdi.
		- Vector'ler listeye ekledigin her item'i tutarlar. Belirli bir index'e eklesen bile, eski itemin index'ini bir kaydirir,
		 '.remove();' etmedikce itemi silmez. 
*/