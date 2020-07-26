package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
public class Collections {

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
		
		
System.out.println("********************	VECTOR    *************************");
				
		Vector<String> vecStr = new Vector();
		
		vecStr.add("John");
		vecStr.add("Khan");
		vecStr.add("Kaan");
		
		System.out.println("Vector printed [side by side] : "); // Eger Vectorun icindekiler sadece <String> degil de bir record sinifinin 
		System.out.println(vecStr);								// objeleri olsaydi --> 'syso(vec)' yazdigimizda listeyi goremezdik.
		System.out.println();									// Iterator kullanmamiz gerekirdi.
		
		
		Iterator iteratorVS = vecStr.iterator();
		
		System.out.println("Vector with while loop by Iterator : ");
		while (iteratorVS.hasNext()) {
			System.out.println(iteratorVS.next());
		}
		System.out.println();
		
		
		Vector vec = new Vector();
		
		vec.add("Apple");
		vec.add("Apple");
		vec.add("Lemon");
		vec.add("Fig");
		vec.add("Orange");
		vec.add(3, 11);
		vec.add(0, 'a');
		vec.remove(0);
		
		System.out.println("Vector printed [side by side] : ");
		System.out.println(vec); 
		System.out.println();
		
		Iterator iteratorVec = vec.iterator();
		
		System.out.println("Vector with while loop by Iterator : ");
		while (iteratorVec.hasNext()) {
			System.out.println(iteratorVec.next());
		}
		System.out.println();
		

System.out.println("********************	QUEUE    *************************");

		
		Queue<String> queue = new LinkedList<String>(); //"LinkedList yazdik cunku interface'den obje olusturamayiz. Queues'ler interface'tir.
		
		queue.add("Kadriye");
		queue.add("Kadriye");
		queue.add("Canan");
		queue.add("Mirket");
		queue.add("Kursat");
		queue.add("Ercan");
		queue.add("Tanju");
		queue.add("Necmi");
		
		System.out.println("Queues printed [side by side] : ");
		System.out.println(queue);
		System.out.println();
		
		Iterator iteratorQ = queue.iterator();
		
		System.out.println("Queues with while loop by Iterator : ");
		while (iteratorQ.hasNext()) {
			System.out.println(iteratorQ.next());
			
		}
		System.out.println();
	
		queue.poll(); 	 // ilk olani once ceker yani 0.indexi,'Kadriye'yi.
		queue.poll();	 // Liste bos kalirsa '[]' gosterir.
		queue.remove();  
		
		System.out.println(queue);
		System.out.println();
		
		queue.peek(); 		 // siradaki ilk elemani belirtir.
		queue.element(); 	// siradaki ilk elemani belirtir.
		
		System.out.println(queue);
		System.out.println();
		
		System.out.println(queue.poll());  // 'Queues.poll()'u, 'syso()'nun icinde yazdigim icin, ilk indexteki poll ettigini gosterir.
		System.out.println(queue.peek()); // 'peek' en ustte olani, yani onceligi ilk olani gosterir.
										 
		System.out.println(queue);
		System.out.println();
		
		System.out.println(queue.size());
		System.out.println(queue.contains("Mary"));
		System.out.println(queue.toArray()[1]);
		
		System.out.println(queue);
		System.out.println();
		
		
		
System.out.println("********************	PRIORITY QUEUE    *************************");

		
		PriorityQueue<String> priorityQueue = new PriorityQueue<>();
		
		priorityQueue.add("Shakir");
		priorityQueue.add("Necati");
		priorityQueue.add("Remzi");
		priorityQueue.add("Kadriye");
		priorityQueue.add("Canan");
		priorityQueue.add("Mirket");
		
		System.out.println("PriorityQueues printed [side by side] : ");
		System.out.println(priorityQueue);
		System.out.println();
		
		Iterator iteratorPQ = priorityQueue.iterator();
		
		System.out.println("PriorityQueues with while loop by Iterator : ");
		while (iteratorPQ.hasNext()) {
			System.out.println(iteratorPQ.next());
			
		}
		System.out.println();
		
		priorityQueue.add("Tanju");
		priorityQueue.add("Peyami");
		
		System.out.println(priorityQueue);
		System.out.println();
		
		priorityQueue.remove();
		priorityQueue.remove();
		
		System.out.println(priorityQueue);
		System.out.println();
		
		priorityQueue.poll();
		priorityQueue.poll();
		
		System.out.println(priorityQueue);
		System.out.println();
		
		System.out.println(priorityQueue.element()); // siradaki ilk elemani belirtir. 
		System.out.println(priorityQueue.peek()); 	// siradaki ilk elemani belirtir. 
		
		System.out.println(priorityQueue);
		System.out.println();
		
		System.out.println(priorityQueue.size());
		System.out.println(priorityQueue.contains("blue"));

		Object [] p = priorityQueue.toArray(); 	// PriorityQueues to Array:
		System.out.println(p[1]);
		
		priorityQueue.comparator();    // ??????????????????????????????????
		System.out.println(priorityQueue);  
		System.out.println();
		
		priorityQueue.clear();
		System.out.println(priorityQueue);  // outp: []
		System.out.println();
		

System.out.println("********************	HASHSET    *************************");
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Water");
		hs.add("Ice");
		hs.add("Cloud");
		hs.add("Sky");
		hs.add("Ocean");
		hs.add("Water");
		hs.add("Sea");
		hs.add("Air");
		
		System.out.println("HashSet printed [side by side] : ");
		System.out.println(hs);
		System.out.println();
		
		Iterator<String> iteratorHs = hs.iterator();
		
		System.out.println("HashSet with while loop by Iterator : ");
		while (iteratorHs.hasNext()) {
			System.out.println(iteratorHs.next());
		}
		System.out.println();
		
		System.out.println("HashSet with foreach loop : ");
		String strng = "";
		for (String s : hs) {
			//System.out.println(s);
			strng += s;
		}
		System.out.println(strng);
		System.out.println();
		
		
		hs.remove("Air");
		
		System.out.println(hs);
		System.out.println();
		
		System.out.println(hs.size());
		System.out.println(hs.contains("blue"));
		System.out.println(hs.contains("Sky"));
		System.out.println(hs.isEmpty());
		System.out.println(hs);
		System.out.println();
		
		hs.clear();
		
		System.out.println(hs.isEmpty());
		System.out.println(hs);
		System.out.println();

		
		HashSet<Integer> hush =new HashSet<Integer>();
		
		hush.add(113);
		hush.add(23);
		hush.add(7);
		hush.add(11);
		
		System.out.println("Integer HashSet printed [side by side] : ");
		System.out.println(hush);
		System.out.println();
		
		Iterator<Integer> iteratorIntHs = hush.iterator();
		
		System.out.println("Integer HashSet with while loop by Iterator : ");
		while (iteratorIntHs.hasNext()) {
			System.out.println(iteratorIntHs.next());
		}
		System.out.println();
 
		
		Object [] h = hush.toArray(); 	// HashSet to Array:
		
		System.out.println(h[3]);
		System.out.println(h[0]);
		System.out.println();
		
		System.out.println("Sum of the values: " +hush.hashCode()); // ".hashCode" shows sum of the values. 
		System.out.println();
		
		hush.clear();
		System.out.println(hush); // HashSet bossa '[]' gosterir. 
		System.out.println();

		
		HashSet<String> hashSet = new HashSet();
		
		hashSet.add("Treeset");
		hashSet.add("HashSet");
		hashSet.add("ArrayList");
		hashSet.add("ArrayList");
		hashSet.add("LinkedList");
		
		Iterator<String> iterator = hashSet.iterator();
		
		String string = ""; 	// Concatenate all the elements in a string.
		while (iterator.hasNext()) {
			string += iterator.next();
		}
		System.out.println(string);
		System.out.println();
		
		
		HashSet<Integer> hashSet2 = new HashSet();
		hashSet2.add(5);
		hashSet2.add(6);
		hashSet2.add(7);
		hashSet2.add(8);
		hashSet2.add(3);
		
		System.out.println("Integer HashSet2 printed [side by side] : ");
		System.out.println(hashSet2);
		System.out.println();
		
		System.out.println("Integer HashSet2 with foreach loop : ");
		for (Integer integer : hashSet2) {
			System.out.println(integer);
		}
		System.out.println();
		
		Iterator<Integer> iterator1 = hashSet2.iterator();
		
		System.out.println("Integer HashSet2 with while loop : ");
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		System.out.println();
		
		// Find sum of all the numbers :		
		int sum =0;
		
		while (iterator1.hasNext()) {
			sum += iterator1.next();
		}
		System.out.println("Sum of the numbers: " + sum);
		System.out.println();
		
		
		// Convert Array to ArrayList :
		int [] array = {1,2,2,3,3,4,5,6};
		
		ArrayList<Integer> arrayLists = new ArrayList<>();
		
		for (int i = 0; i < array.length; i++) {
			arrayLists.add(array[i]);
		}
		for (int i = 0; i <arrayLists.size(); i++) {
			System.out.println(arrayLists.get(i));
		}
		System.out.println();
		
		// Convert this ArrayList into set :
		
		Set<Integer> setArr = new HashSet<>();
		for (int i = 0; i < arrayLists.size(); i++) {
			setArr.add(arrayLists.get(i));// array[i]
		}
		System.out.println(setArr);
		System.out.println();
		
		
		Set<String> names= new HashSet();
		
		names.add("Robb");
		names.add("Bran");
		names.add("Rick");
		names.add("Bran");
		
		if (names.remove("Bran")) {
		}
		
		System.out.println(names);
		System.out.println();
		
	
System.out.println("********************	LINKED HASHSET    *************************");

		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		
		linkedHashSet.add("A");
		linkedHashSet.add("E");
		linkedHashSet.add("B");
		linkedHashSet.add("C");
		System.out.println("Z");
		
		System.out.println("LinkedHashSet printed [side by side] : ");
		System.out.println(linkedHashSet);
		System.out.println();
		
		linkedHashSet.add("F");
		linkedHashSet.add("D");
		linkedHashSet.remove("C");
		
		System.out.println(linkedHashSet.size());
		System.out.println(linkedHashSet.contains("blue"));
		System.out.println();


System.out.println("********************	TREESET    *************************");

		
		TreeSet<String> treeSet = new TreeSet<>();
		
		treeSet.add("America");
		treeSet.add("New Zeland");
		treeSet.add("Austria");
		treeSet.add("Norway");
		treeSet.add("Australia");
		
		System.out.println("TreeSet printed [side by side] : ");
		System.out.println(treeSet);
		System.out.println();

		TreeSet<Integer> treeSet1 = new TreeSet<>();
		
		treeSet1.add(11);
		treeSet1.add(3);
		treeSet1.add(7);
		treeSet1.add(1);
		treeSet1.add(31);
		
		System.out.println(treeSet1);
		System.out.println();
		

		Set<Integer> numbers= new TreeSet();
		
		numbers.add(5);
		numbers.add(4);
		numbers.add(2);
		numbers.add(5);
		
		System.out.println(numbers);
		System.out.println();
		
// Question : What is the sum of the elements in numbers set ? 
		
// Solution 1 :
		Iterator<Integer> iteratorNum = numbers.iterator();
		int sumNum = 0;
		while (iteratorNum.hasNext()) {
			sumNum = sumNum + iteratorNum.next();		
		}
		System.out.println(sumNum);
		System.out.println();
		
// Solution 2 :
		Iterator<Integer> iteratorNo = numbers.iterator();
		
		int sumNo = 0;
		for (int i = 0; i < numbers.size(); i++) {
			if (iteratorNo.hasNext()) {
				sumNo = sumNo + iteratorNo.next();	
			}
		}
		System.out.println(sumNo);
		System.out.println();


System.out.println("********************	MAP / HASHMAP    *************************");
		
		Map map = new HashMap(); // upcasting
		
		map.put(1, "Shakir");
		map.put(3, "Remzi");
		map.put(11, "Necati");
		map.put(1, "Kadriye");
		map.put(11, "Canan");
		
		// Traversing Map : 
		Set setMap = map.entrySet();  // Converting to 'Set'. So we can traverse. 
	
		Iterator iteratorMap = setMap.iterator();
		
		System.out.println("Map printed with while loop: ");
		while (iteratorMap.hasNext()) {
		// Converting to 'Map.Entry'. So we can get  'key' and 'value' separately. 
			Map.Entry entry = (Map.Entry) iteratorMap.next();
			System.out.println("Key : " + entry.getKey());
			System.out.println("Value : " + entry.getValue());
		}
		System.out.println();
		
		
		
		Map<Integer,String> mapmap = new HashMap<Integer, String>(); // upcasting
		
		mapmap.put(101, "Shakir");
		mapmap.put(105, "Canan");
		mapmap.put(103, "Remzi");
		mapmap.put(107, "Kadriye");
		
		System.out.println("Map printed with foreach loop: ");
		for (Map.Entry entry : mapmap.entrySet()) {
			System.out.println("Keys : " + entry.getKey() + " / Value : " + entry.getValue()); 
		}
		System.out.println();
		
		
		
		Map<String,String> emails = new HashMap<>(); // upcasting
		
		emails.put("acturk@siliconelabs.com", "12345");
		emails.put("acturk@siliconelabs.com", "12345");
		emails.put("bob@siliconelabs.com", "12345");
		emails.put("cemil@siliconelabs.com", "12345");
		emails.put("huseyin@siliconelabs.com", "12345");
		
		System.out.println("Map printed with foreach loop: ");
		for (Map.Entry entry : emails.entrySet()) {
			System.out.println("Keys : " + entry.getKey() + "\n" + "Value : " + entry.getValue());
		}
		System.out.println();
	
		
		Set setEmail = emails.entrySet();
		
		Iterator iteratorEmails = setEmail.iterator();
		
		System.out.println("Map printed with while loop: ");
		while (iteratorEmails.hasNext()) {
			HashMap.Entry entry = (HashMap.Entry) iteratorEmails.next();
			System.out.println("Key : " + entry.getKey());
			System.out.println("Value : " + entry.getValue());
		}
		System.out.println();
		
				
System.out.println("********************	HASHMAP    *************************");
		
//what if you have one million of variables. how can we store into one accessible place? Answer is HashMap!							
			
		int a = 11;
		int b = 31;
		int c = 93;
		
// 	   		   < key  , value >
		HashMap<String, Integer> happy = new HashMap<String, Integer>();
		happy.put("a", 11);
		happy.put("b", 31);
		happy.put("c", 93);	
			
		System.out.println(happy);
		System.out.println(happy.get("a")); // "a"nin value'sunu verir.
		System.out.println();
		
		
		HashMap<String, String> fun= new HashMap<String, String>();
		
		fun.put("username", "password");
		fun.put("rakamWahed", "KarimMohsen");
		fun.put("coolguy71", "Aloevera&3");
		fun.put("huhukomsu","karakedi31");
		
		System.out.println(fun);
		System.out.println();
		
		fun.remove("username");
		
		System.out.println(fun);
		System.out.println();
		
		System.out.println(fun.containsKey("coolguy71"));
		System.out.println(fun.containsKey("coolguy79"));
		System.out.println(fun.containsValue("Aloevera&3"));
		System.out.println(fun.containsValue("Aloevera3"));
		System.out.println(fun.size());
		System.out.println(fun.replace("username", "ElKalam"));
		
		System.out.println(fun);
		System.out.println();
		
		System.out.println(fun.keySet());
		System.out.println(fun.values());
		
		System.out.println(fun);
		System.out.println();
		
		
//		 	   < key  , value >
		HashMap<String, String> starbucks = new HashMap<>();
		
		starbucks.put("Robert","Caramel Macchiato");
		starbucks.put("Amara","Peppermint Mocha");
		starbucks.put("Joy","Frappuccino");
		starbucks.put("Amira"," Cappuccino");
		starbucks.put("Robert","Espresso");
		starbucks.put("Amin","Espresso");
		
		System.out.println("HashMap printed with while loop: ");
		System.out.println(starbucks);
		System.out.println();
		 
		Set setStar = starbucks.entrySet();    			   // Set sinifindan bir obje olusturduk. Bu olusturdugumuz objeyi yani 
													      //'setStar'i ==> 'starbucks.entrySet();' metoduna bagladik. 
		Iterator iteratorStarbucks = setStar.iterator(); // sonra 'iteratoru'de 'set'e bagladik.
		
		System.out.println("HashMap printed with while loop: ");
		while (iteratorStarbucks.hasNext()) {
			HashMap.Entry entry = (HashMap.Entry) iteratorStarbucks.next();
			System.out.println("Key: " + entry.getKey());
			System.out.println("Value: " + entry.getValue());
		}
		System.out.println();
		
System.out.println("*******************   .  *************************");
		
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

* QUEUE (Line) : 
		- Queues follows FIFO (first in first out). 
		- Q item'lari giris sirasina gore siralar.
		- .poll(); & .remove(); --> both methods ilk ekleneni remove eder. 


	* PriorityQueues : 
		- PQ implements Queues interface. 
		- PriorityQueues is not thread safe.
		- PQ item'lari natural order'a gore veya comparator based order'a gore siralar.
		  (Lexicographic) Alphabetic order is natural order for String if user didn't change it.
		- .poll(); & .remove(); --> both methods ilk ekleneni degil de oncelige gore remove eder.
		- Eger sirada bi item yoksa;
		  .poll(); ==> returns 'null'		  .remove(); ==> throw error.
		- .peek(); & .element(); --> both methods next item'i belirtir. 
		- Eger sirada bi item yoksa; 
		  .peek(); ==> returns 'null'		  .element(); ==> throw error.


* SET (Kume) : 
		- Ayni elemandan tekrar olusturulamaz. You can write but can't get print again, just one!
		- If you want to hold only unique elements, than use Set. 
		- All of them implements Set interface. So they use same methods like --> .add, .remove, ...etc.
	 	
 	*HashSet :		(hash, karisik, alt-ust etmek demek.) 
 		- Contains only unique elements.
 		- Datanin giris sirasini onemsemez, karisik siralar.
 		- HashSet doesn't have index number. 
 		- It is a single place to store a lot of different values. ArrayList is simple way to store different values.
		  HashSet is like array but we can access HashSet different from ArrayList.   	
		-'.remove("xxx");' ==> remove ederken neyi silmek istiyorsan onu yazmalisin. 
		-'.hashCode();' ==> shows sum of the values in the set.
		
	*LinkedHashSet :
		- Contains only unique elements.
		- Datanin giris sirasini onemser, giris sirasina gore siralar.
		
	* TreeSet :
		- Contains only unique elements.
		- TreeSet is faster than LinkedSet and HashSet. 
		- Datanin giris sirasini onemsemez, alphabetic or numeric olarak siralar. 
		- Items stored in ascending order.First buyuk harfler, sonra kucuk harfler siralanir.  
		- Siralama islemi compailer'a yuk oldugu icin, ozellikle siralama yapmak gerekmiyorsa bunu kullanma.  
		
* MAP :
		- HashMap, LinkedHashMap, TreeMap implement Map.
		- All of them have 'key & value'. 
		
	* HashMap :
		- It doesn't maintain any order. 
		- HashMap'lerde <String,String>  ==>  < KeyUnique , ValueNotUnique > seklinde olmali. 		
		- Key degerleri ayni olursa ilk eklenen silinir. En son eklenen tutulur.	
	
	* LinkedHashMap :
		- Inherits HashMap class.
		- LinkedHashMap datanin giris sirasina gore siralar.  		
	
	* TreeMap :
		- TreeMap implements Map and Sorted Map.
		- Ascending ordera gore siralar. 
		
*/








