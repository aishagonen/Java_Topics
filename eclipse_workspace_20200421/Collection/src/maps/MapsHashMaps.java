package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapsHashMaps {

	public static void main(String[] args) {
		
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

		// what if you have one million of variables. how can we store into one
		// accessible place? Answer is HashMap!

		int a = 11;
		int b = 31;
		int c = 93;

//		 	   		   < key  , value >
		HashMap<String, Integer> happy = new HashMap<String, Integer>();
		happy.put("a", 11);
		happy.put("b", 31);
		happy.put("c", 93);

		System.out.println(happy);
		System.out.println(happy.get("a")); // "a"nin value'sunu verir.
		System.out.println();

		HashMap<String, String> fun = new HashMap<String, String>();

		fun.put("username", "password");
		fun.put("rakamWahed", "KarimMohsen");
		fun.put("coolguy71", "Aloevera&3");
		fun.put("huhukomsu", "karakedi31");

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

//				 	   < key  , value >
		HashMap<String, String> starbucks = new HashMap<>();

		starbucks.put("Robert", "Caramel Macchiato");
		starbucks.put("Amara", "Peppermint Mocha");
		starbucks.put("Joy", "Frappuccino");
		starbucks.put("Amira", " Cappuccino");
		starbucks.put("Robert", "Espresso");
		starbucks.put("Amin", "Espresso");

		System.out.println("HashMap printed with while loop: ");
		System.out.println(starbucks);
		System.out.println();

		Set setStar = starbucks.entrySet(); // Set sinifindan bir obje olusturduk. Bu olusturdugumuz objeyi yani
											// 'setStar'i ==> 'starbucks.entrySet();' metoduna bagladik.
		Iterator iteratorStarbucks = setStar.iterator(); // sonra 'iteratoru'de 'set'e bagladik.

		System.out.println("HashMap printed with while loop: ");
		while (iteratorStarbucks.hasNext()) {
			HashMap.Entry entry = (HashMap.Entry) iteratorStarbucks.next();
			System.out.println("Key: " + entry.getKey());
			System.out.println("Value: " + entry.getValue());
		}
		System.out.println();

	}

}
/*
 *  MAP :
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