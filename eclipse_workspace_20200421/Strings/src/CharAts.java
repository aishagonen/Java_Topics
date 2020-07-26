import java.util.Scanner;

public class CharAts {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);

	
// **************************************************************			
		String word; // this line should be outside of iteration. cunku this is not repeated.
		
		System.out.println("Enter a word: ");
		word = kb.next();
		System.out.println("Entered: " + word);
		System.out.println("Last character is " + word.charAt(word.length()-1)); // shows last character.

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
		
		String str1 = "abc";
		
		for (int i = 0; i < 3; i++) {                // i, 0'dan basladigi ve i<3 dedigimiz icin abcdefg... de yazsan sadece 3 kere calisir. 
			System.out.print(i + " ");               // bu kod --> '0 1 2' seklinde yazar. Ama biz 'abc'yi yazdirmasini istiyoruz. O zaman asagidaki gibi yazariz. 
			System.out.print(str1.charAt(i) + " ");   //--> boyle 'a b c' seklinde yazar.
		} 
		
// **************************************************************
	
		String str2 = "abcabcABCabc";
		
		for (int i = 0; i < str2.length(); i++) {  // 'i < str2.length()' yazdigimiz icin kod, string ne kadarsa o kadar calisir.
			System.out.print(str2.charAt(i) + " ");
		}
		
// **************************************************************
		
		String str = "abcabcABCabc";
		char c;  				// str.charAt(i)'yi uzun uzun yazmayalim diye c yaptik.
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			
			if (c == 'a' || c == 'A') {
				count++;
			}
		}
		System.out.println("Count: " + count);
		
		
// **************************************************************
		
		String s = "Meral";     // ' Meral'i tersten yazdirir. 
		int length = s.length();
		
		for (int i=length-1 ; i>=0; i--) {
			System.out.print(s.charAt(i) + " ");
		}		
		
// **************************************************************		
		
		String words = "SiliconeLabs";
		String reversed = "";
		
		for (int i = words.length()-1; i >=0;  i--) {
			reversed = reversed + words.charAt(i); 	// returns character at the specified index in a string. 
		}
		System.out.println(reversed);

// **************************************************************		
// charAt () and do-while loop:
		
		String x = "my oh my playdoh";
		
		System.out.println(x.charAt(7)); // 7. karakteri gosterir.
		
		System.out.println(x.charAt(x.length()-1)); //son karakteri gosterir.
			
		String fullAd = x + " great for kids.";
				
		System.out.println(fullAd);
			
		System.out.println(fullAd.contains("dough")); //kelime contains or not. true or false gosterir.
			
		System.out.println(fullAd.indexOf("my"));
				
		System.out.println(fullAd.indexOf("my", fullAd.indexOf("my")+1));
		
		System.out.println(fullAd.lastIndexOf("my")); // 'my' en son nereyse onun baslangic yerini gosterir.	

// **************************************************************	
		
		
		
		

		
		
	}

}
