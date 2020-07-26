package lists;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLists {

	public static void main(String[] args) {
		
		System.out.println("******************** 	LINKED LIST   ********************");

		LinkedList<String> linkedL = new LinkedList<>();
		
		linkedL.add("Amara");
		linkedL.add("Amara");
		linkedL.add("Amira");
		linkedL.add("Amin");
		linkedL.add("Kral Sakir");
		
		System.out.println("LinkedList printed [side by side] : ");
		System.out.println(linkedL);
		
		System.out.println();
		
		Iterator iteratorLL = linkedL.iterator();
		
		System.out.println("LinkedList with while loop by Iterator : ");
		while (iteratorLL.hasNext()) {
			System.out.println(iteratorLL.next());
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
		- Vectors can't handle primitive dataTypes.
*/