
public class Recursion {
// Recursion means, something stopped the flow of the program.  
	
	public static void main(String[] args) {

//		sayHi(); 
		sayHi(5);
	
	}

	/*public static void sayHi() {
		System.out.println("Hi!");
		sayHi();  // burada metodun icinde kendini yazdik ve main metodda cagirdigi zaman 
	  }			 // infinitely fast sekilde infinite time ayni seyi yazdirir. Computer da hey woow 
				// slow down der gibi durur. O yuzden recursion'da en onemli sey ne zaman durmasi gerektigini bilmesidir.
			   // bunun icin de we need a base case. So it doesn't do it forever infinitely fast and infinitely many.
			  // O yuzden 'sayHi()'metodunun icine '(int n)' yazarak ve de n yerine kac kere calistirip dursun istiyorsak o sayiyi yazip 
	*/		 //	kodu duzeltiyoruz ve asagiya tekrar yaziyorum:
	
	public static void sayHi(int n) {
		if (n == 0) {
			System.out.println("Done!");
		}else {
			System.out.println("Hi!");
			n--;     // eger 'n'i each time decrement etmezsek ayni hatayi verir. cunku azaltmazsak, o zaman 'n' hic 0 olmaz ki.
			sayHi(n);
		}	
	}

}
