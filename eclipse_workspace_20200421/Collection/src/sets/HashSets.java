package sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSets {

	public static void main(String[] args) {
		

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
		
		

	}

}
/*
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
		
 */ 
