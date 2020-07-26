package sets;

import java.util.LinkedHashSet;

public class LinkedHashSets {

	public static void main(String[] args) {
		
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