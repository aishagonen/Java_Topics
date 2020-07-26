package sets;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSets {

	public static void main(String[] args) {
		
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
