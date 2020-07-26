package cc;
//SQ:33
import java.util.ArrayList;
import java.util.List;

// What is the result?
public class C26Names {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		
		names.add("Robb");
		names.add("Bran");
		names.add("Rick");
		names.add("Bran");

		
		if (names.remove("Bran")) {
			names.remove("Jon");
		}
		System.out.println(names);
		
	}

}

/*
  Answ: [Robb, Rick, Bran]
  
  - Void methods bos gibidir. Bir sey return etmedigi icin if hata verir. Ama non-void methodlar bir sey return eder.
    Burada da true/false return ettigi icin, calisir ve true/false olarak geri bildirimde bulunur. O yuzden de 
    if calisir. Burada Bran'i remove edebildigi icin, true dondurur ve if satatement'i calsitirir. 
  - Neden ilk siradaki Bran'i sildi, cunku list'lerde remove first index'ten baslar.
  - Eger list degil de set olsaydi, ikinci Bran'i kabul etmezdi, hata olurdu. 
  
  - Eger soru;
	  if (names.remove("Jon")) {
		 names.remove("Bran");
	   }
	   seklinde sorsaydi bu sefer de if condition 'false' dondurecegi icin statement'in icine girmezdi. 

*/