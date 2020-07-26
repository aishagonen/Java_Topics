import java.util.Arrays;
import java.util.PrimitiveIterator;
import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		String names;
		System.out.println("Enter your name: ");
		names = kb.nextLine();
		System.out.println("Welcome " + names);

//**************************************************************

// Strings:	
// Strings are classes. Strings are immutable. immutable means; every single time you change a string in any way,
// it doesn't delete the previous of that string in memeory. It creats a brand new locatin in memory for the string.
// This is kind of time-consuming so if you are planning on making a ton of different edits to a string you should use
// String Builder for that. 
// Java use index concepts and index starts always from 0. 	

		String message = "Hello ";
		String message1 = "Universe!";
		String message2 = new String("  Hello Universe!  ");

		System.out.println(message + message1);
		System.out.println(message1.toUpperCase());
		System.out.println(message.length()); // .length()
		System.out.println("aisha".toUpperCase()); // .toUpperCase()
		System.out.println(message1.toLowerCase()); // .toLowerCase()
		System.out.println(message.substring(0, 4)); // .'substring(,)' shows values between '( )'.
		System.out.println(message2.charAt(1)); // .charAt() --> to find particular index in string.
		System.out.println(message.contains("u")); // .contains("") -->its return type is boolean!
		System.out.println("Aisha".contains("h"));
		System.out.println(message.indexOf("m")); // .indexOf("") --> if the value 'm' is not in the string, shows '-1'.
		System.out.println(message.indexOf("e")); // .indexOf("") --> to find character index
		System.out.println(message.indexOf("Hello")); // stringin basladigi yeri gosterir.
		System.out.println(message.replace("H", "Y")); // .replace("", "")
		System.out.println(message2.trim()); // .trim() : Basta ve sonda olan bos yerleri yani space'leri siler. O
												// sekilde stringi yazar.
		System.out.println(message.compareTo(message1)); // Eger strings equal olsaydi, output 0 yazardi. 
// 1.string, message, 6 karakter, 2.string,message1, 9 karakter. Once az karakteri ilan stringi yazdigimiz icin sonuc negatif '-' sayi yazar.output:-13.
// once 2.stringi yazsaydik o zaman da pozitif sayi verirdi. output:13 
		
		System.out.println(message.endsWith("lo "));  // string 'lo ' ile bitiyorsa true, degilse false gosterir.
		
		
// We can combine the methods:			
		System.out.println(message.substring(0, 4).charAt(2));
		// System.out.println(message.substring(0,4).charAt(5));//String index out of
		// range 5. First takes 'substring', then find the 'charAt'.

// equal() : 
		String name = "java";
		String name1 = "Java";
		String name2 = "Python";
		String name3 = "java";

		System.out.println(name.equals(name1));
		System.out.println(name.equals(name2));
		System.out.println(name.equals(name3));
		System.out.println(name.equalsIgnoreCase(name1)); // equalsIgnoreCase --> its return type is boolean!

// to check lengths of two strings are equal or not:		
		String string1 = "hello";
		String string2 = "universe";
		System.out.println(string1.length() == string2.length()); // --> its return type is boolean!

//**************************************************************	

		String word = "Leaders are readers!";
		System.out.println("Word: " + word);
		System.out.println("Uppercase: " + word.toUpperCase());
		System.out.println("Lowercase: " + word.toLowerCase());
		System.out.println("First char: " + word.charAt(0));
		System.out.println("Fifth char: " + word.charAt(4));
		System.out.println("Length: " + word.length());
		System.out.println("Last char: " + word.charAt(19));
		System.out.println("Substring: " + word.substring(9, 19));

//**************************************************************	

		int num1, num2;

		System.out.print("Enter n1:  ");
		num1 = kb.nextInt();

		System.out.print("Enter n2:  ");
		num2 = kb.nextInt();

		System.out.println(num1 + " times " + num2 + " is " + (num1 * num2));

// **************************************************************	

		String str4 = "Bilal";

		System.out.println(str4.indexOf("l")); // l harfinin sirasini gosterir.
		System.out.println(str4.lastIndexOf("l")); // en sonki l harfinin sirasini gosterir.

// **************************************************************	
// Concatenation "+" means, writing strings side by side. 
//  Srting concat(): yani ikisini birlestirir.

		String myString = ".com";
		String mystr = "BeginnersBook".concat(myString);
		System.out.println(mystr);

		String str1 = "Great ";
		str1 = str1.concat("USA");
		System.out.println(str1);

// **************************************************************			

//Integer to String:  'Integer.parseInt(x)' and 'Integer.toString(x)' : 

		String s = "11";
		System.out.println(s + 3); // bu sekilde yazmakla toplamayi yapmaz. '113' seklinde gosterir.

		System.out.println(Integer.parseInt(s) + 3);

// stringi sunun icinde yazarsan --> "Integer.parseInt(s)"	o zaman stringle integeri toplayabilirsin yani islem yaparsin. veya;		

		int n = 9;
		System.out.println(n + 1); // buradaki n, integer olarak tanimlandigi icin toplanir.
		System.out.println(Integer.toString(n) + 1); // burada n'i stringe donusturdugun icin toplamaz, oldugu gibi
														// yazar.

//*** Interview Question:
// Q: String'teki '1500'u alip '1600' yapmak:

		String s2 = "Your total amount is 1500 USD";
		String total = s2.substring(21, s2.indexOf("USD") - 1);
		int totalValue = Integer.parseInt(total);
		System.out.println(totalValue + 100);

// **************************************************************			

		String a = "age: 47";
		a = a.replaceAll("\\D+", ""); // Bu yontemle stringin icinde digit olmayan her seyi yni '\\D+'yi bosla replace
										// eder ve sadece digitleri yazar.

		int t = Integer.parseInt(a);
		System.out.println(a + 2);

// **************************************************************			
// *** Interview Question:	
// Q: Extract the numbers out of the string:

		String string = "ADSGFHkjbvrvbir986skhsdh876";

// .replace all : ile sadece numbers yazdirabilirsin. Also, substring de kullanilabilir. 
//A:
		string = string.replaceAll("[a-zA-Z]", ""); // 1. way / buyuk harfleri de katmalisin.'[a-zA-Z]': buyuk, kucuk
													// butun harfler demektir.
		string = string.replaceAll("\\D+", ""); // 2. way / only numbers gosterir. '\\D+': digit olmayanlar demektir.
		System.out.println(string);

//**************************************************************	

		String str = "I love Java but I do not like to JavaScript and JQuery";
		String str2 = "ilhan Turkmen";

//.length : 	 to find length
		System.out.println("Length: " + str2.length()); // karakter sayisi.  

//.charAt() :	 to find particular index in string
		System.out.println("4th char: " + str.charAt(3));
		System.out.println("31th char: " +str.charAt(30));

//indexOf() : 	 to find character index:
		System.out.println(str.indexOf("like"));

//To find second J:
		System.out.println(str.indexOf("J", 8)); // ????????????????????????
// ?????????????????????????  ikisine de ?????????????????
		
		System.out.println(str.indexOf("J", str.indexOf("J") + 1)); // 33 / first ve second j'yi yazip +1 ekleyince
																	// third j'yi buluruz.
// to find last J:
		System.out.println(str.lastIndexOf("J")); // 48 / last J.

//Trim: 	 is used to remove space form string
		String str3 = "    hello world   ";
		System.out.println(str3);
		System.out.println(str3.trim());

//Substring: 	 is used to get specific string from current string
		String s3 = "Your total amount is 1500 USD";
		// System.out.println(s3.substring(19, 25));
		System.out.println(s3.substring(21, s3.indexOf("USD"))); // 'USD'nin U'sundan onceki yere kadar diyoruz yani.

//Split: 	
		String letters = "abcdefg";
		String [] letterArray = letters.split("");
		System.out.println(Arrays.toString(letterArray)); //outp: [a, b, c, d, e, f, g]
		
		char [] charArray = letters.toCharArray();
		System.out.println(Arrays.toString(charArray));
				
				
		// Another example:
		String language = "Java-Python-Ruby-Groovy"; // JavaPythonRubyGroovy
		System.out.println(language); // bizden bu listeyi '-'siz yazmamizi istiyor:
		String lang[] = language.split("-");
		System.out.println(lang[0]); // 0. index'i yazar / 'Java'
		// Listeyi yazdirmak icin for loop kullaniriz:
		for (int i = 0; i < lang.length; i++) {
			System.out.println(lang[i]);
		}
		// Another example: 		
		String pop = "textxXseleniumxXjavaxXPython"; // 'textseleniumjavaPython' seklinde yazdir:
		String pop1[] = pop.split("xX");
		System.out.println(pop1[1]); // 1. index'i yazar / 'selenium'

		for (int i = 0; i < pop1.length; i++) {
			System.out.println(pop1[i]);
		}

//equals:	 for 'string' don't use for 'string ==':
		String emp1 = "hey this is ilhan here";
		String emp2 = "hey This is ilhan here";

		System.out.println(emp1.equals(emp2)); // false / or you can use for loop:

		if (emp1.equals(emp2)) {
			System.out.println("correct");
		} else {
			System.out.println("incorrect");
		}

//replace
		String date = "01-01-1975";
		System.out.println(date.replace("-", "/"));

//upper and lower case
		String name4 = "my name is ILHAN";
		System.out.println(name4.toLowerCase());
		System.out.println(name4.toUpperCase());

//combination of mutiple string
		String firstName = "Michael";
		String lastName = " Jackson";
		System.out.println(firstName + lastName);

		String str5 = 50 + 30 + "Hello" + 40 + 40;
		System.out.println(str5); // 80Hello4040

		String str6 = 50 + 30 + "Hello" + (40 + 40); // sondaki sayilari parantez icine aldigimiz ocon tekrar integer
														// olarak islem yapar. yoksa onlari da string okur.
		System.out.println(str6); // 80Hello80

		int x = 100;
		int y = 200;
		String m = "Hello";
		String h = " world";
		System.out.println(x + y); // 300
		System.out.println(m + h); // Hello world
		System.out.println(x + m + h); // 100Hello world
		System.out.println(x + y + m + h); // 300Hello world
		System.out.println(m + h + x + y); // Hello world100200

// ******************************************************************************************
// Calculate total number of characters in the String:

		System.out.println("Enter a string: ");
		String s4 = kb.nextLine();

		int count = 0;

		for (int i = 0; i < s4.length(); i++) {
			count++;
		}
		System.out.println(count);

// **************************************************************

		String words = "SiliconeLabs";
		String reversed = "";

		for (int i = words.length() - 1; i >= 0; i--) {
			reversed = reversed + words.charAt(i); // returns character at the specified index in a string.
		}
		System.out.println(reversed);

// **************************************************************

/* You convert primitive types to a string with '.toString'.
 * String byteString = Byte.toString(bigByte);
 * String shortString = Short.toString(bigByte);
 * String intString = Integer.toString(bigInt);
 * String longString = Long.toString(bigByte);
 * String floatString = Float.toString(bigByte);
 * String doubleString = Double.toString(bigByte);
 * String booleanString = Boolean.toString(bigByte);
 * 
 * Yo convert from String to primitives with '.parseX'.
 * int stringToInt = Integer.parseInt(intString);
 * parseSort
 * parseLong
 * parseByet
 * parseDouble
 * parseBoolean
 * parseFloat		
*/	
// **************************************************************
// StringBuffer: 
// Synchronized. Slower than StringBuilder.		
// difference betw String is, when you update string, just changed the string. not keeps first string. So memory'yi sisirmiyoruz. 		

		// className objectName = new ClassName();
		StringBuffer stringBuffer = new StringBuffer("Slicone Labs");
		System.out.println(stringBuffer.reverse()); // Previous value is in the memory but changed. this is new value.

//**************************************************************				

// StringBuilder: 
// Non-Synchronized. Faster than StringBuffer.

		StringBuilder stringBuilder = new StringBuilder("This is a string ");
// append method is concatenating two string

		stringBuilder.append("builder ! "); // .append("xyz") : parantez icindekini 'string'e ekler.
		System.out.println(stringBuilder);
		stringBuilder.setCharAt(0, 'L'); // .setCharAt(x,'y') : 'O.' indexi 'y' ile degistirir.
		System.out.println(stringBuilder);
		System.out.println(stringBuilder.reverse()); // .reverse(): stringi tersten yazar.

//**************************************************************				
		
		String word1; // this line should be outside of iteration. cunku this is not repeated.
		
		System.out.println("Enter a word: ");
		word1 = kb.next();
		System.out.println("Entered: " + word1);
		System.out.println("Last character is " + word1.charAt(word.length()-1)); // shows last character.

// ** once yukaridaki 5 satiri yazdik. sonra bunu asagidaki do-while loop icine koyduk:

		do {
			System.out.println("Enter word: ");
			word = kb.next();
			
			if(word.equals("0")) {  // eger bunu ve break'i eklemezsek sonsuza kadar devam eder. 
				break;
			}	
			System.out.println("Entered: " + word);
			System.out.println("Last character is " + word.charAt(word.length()-1)); // shows last character.
		} while(true);  
		System.out.println("Bye..");	
				
// **************************************************************
		
// ABC'yi 'A B C' seklinde yazdirmak: 
		
		String str7 = "abc";
		
		for (int i = 0; i < 3; i++) {                // i, 0'dan basladigi ve i<3 dedigimiz icin abcdefg... de yazsan sadece 3 kere calisir. 
			System.out.print(i + " ");               // bu kod --> '0 1 2' seklinde yazar. Ama biz 'abc'yi yazdirmasini istiyoruz. O zaman asagidaki gibi yazariz. 
			System.out.print(str7.charAt(i) + " ");   //--> boyle 'a b c' seklinde yazar.
		} 
		
// **************************************************************
	
		String str8 = "abcabcABCabc";
		
		for (int i = 0; i < str8.length(); i++) {  // 'i < str2.length()' yazdigimiz icin kod, string ne kadarsa o kadar calisir.
			System.out.print(str8.charAt(i) + " ");
		}
		
// **************************************************************
		
		String str9 = "abcabcABCabc";
		char c1;  				// str.charAt(i)'yi uzun uzun yazmayalim diye c yaptik.
		int count1 = 0;
		
		for (int i = 0; i < str.length(); i++) {
			c1 = str9.charAt(i);
			
			if (c1 == 'a' || c1 == 'A') {
				count1++;
			}
		}
		System.out.println("Count: " + count1);
		
		
// **************************************************************
		
		String s0 = "Meral";     // ' Meral'i tersten yazdirir. 
		int length1 = s.length();
		
		for (int i=length1-1 ; i>=0; i--) {
			System.out.print(s0.charAt(i) + " ");
		}		
		
// **************************************************************		
		
		String words2 = "SiliconeLabs";
		String reversed1 = "";
		
		for (int i = words2.length()-1; i >=0;  i--) {
			reversed1 = reversed1 + words2.charAt(i); 	// returns character at the specified index in a string. 
		}
		System.out.println(reversed);

// **************************************************************		
// charAt () and do-while loop:
		
		String xy = "my oh my playdoh";
		
		System.out.println(xy.charAt(7)); // 7. karakteri gosterir.
		
		System.out.println(xy.charAt(xy.length()-1)); //son karakteri gosterir.
			
		String fullAd1 = xy + " great for kids.";
				
		System.out.println(fullAd1);
			
		System.out.println(fullAd1.contains("dough")); //kelime contains or not. true or false gosterir.
			
		System.out.println(fullAd1.indexOf("my"));
				
		System.out.println(fullAd1.indexOf("my", fullAd1.indexOf("my")+1));
		
		System.out.println(fullAd1.lastIndexOf("my")); // 'my' en son nereyse onun baslangic yerini gosterir.	

// **************************************************************	
		
		
		
				

			
		
		
		
		
	}

}
