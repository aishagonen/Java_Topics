import java.util.Random;

public class StringBuilders {

	public static void main(String[] args) {

// StringBuilder:
// Strings are immutable and immutable means; you can't change. Mutable is every single time you change a string in any way
// it doesn't delete the previous of that string in memeory. It creats a brand new locatin in memory for the string.
// This is kind of time-consuming so if you are planning on making a ton of different edits to a string you should use
// String Builder for that. 
// String builder gets a block of memory and it continous to use it doesn't recreate the string over agin. 
// Non-Synchronized. Faster than StringBuffer.

		StringBuilder stringBuilder = new StringBuilder("This is a string "); 
		
// append method is concatenating two string

		stringBuilder.append("builder ! "); // .append("xyz") : parantez icindekini 'string'e ekler.
		System.out.println(stringBuilder);
		
		stringBuilder.setCharAt(0, 'L'); // .setCharAt(x,'y') : 'O.' indexi 'y' ile degistirir.
		System.out.println(stringBuilder);
		System.out.println(stringBuilder.reverse()); // .reverse(): stringi tersten yazar.

//**************************************************************	

		StringBuilder randSB = new StringBuilder("A random value"); 
		
		System.out.println(randSB.append(" again")); 
		
		System.out.println(randSB); // Artik bastaki string, randSB, de degisti:'A random value again' oldu.
// delete:
		System.out.println(randSB.delete(15, 21)); 		// indexteki 15 ile 21 arasindaki karakterleri siler.		 

// to find out the string has how much total space in memory: 
		System.out.println(randSB.capacity());  // 30 karakterlik yeri varmis. 

// memorydeki yerini arttirmak icin:
		randSB.ensureCapacity(60); // yeri en az 60 karakterlik olsun dedik.
		System.out.println(randSB.capacity()); // now kapasitesi 62 karakterlik oldu.
		
		System.out.println(randSB.length()); 
// capacityi size'ina  donusturmek:
		randSB.trimToSize();
		System.out.println(randSB.capacity());
		
		System.out.println(randSB.insert(1, "nother"));

// String Builder'i stringe convert etmek: ???????????????????????
//		String oldSB = new  randSB.toString();
		

/* Asagidakiler String'teki gibi String Builder'larda da ayni calisir. 
 * charAt()
 * indexOf()
 * lastIndexOf()
 * subString()  
 */

		
		
// **************************************************************
	}

}
