import java.util.Random;
import java.util.Scanner;

public class MagicBalls {

	public static void main(String[] args) {

		System.out.println("Enter your question");
		
		Scanner kb = new Scanner(System.in);
		kb.next();  // !!! stringin ikinci kelimesini gosterdi hep. neden anlamadim!!!
		kb.close(); // soruyu sorduktan sonra bi sey gostermesi gerekmedigi icin 'kb scanner'ini kapattik. 

//******* bu kismi 	yukaridaki son iki satiri sildikten sonra 'next()'i ogrenmek icin calistir: 	
//		String a = kb.next(); // next() --> kb'de yazilan ilk stringi alir. Yani cumle yazsan sadece ilk kelimeyi gosterir. 
//		System.out.println(a);
//*************************	

		Random rand = new Random();
		int r = rand.nextInt(6)+1;
		System.out.println(r);
		
		if(r == 1) {
			System.out.println("As I see it, yes.");
		}  else if(r == 2) {
			System.out.println("Reply hazy, try again.");
		} else if(r == 3) {
			System.out.println("Don't count on it.");
		} else if(r == 4) {
			System.out.println("Outlook not so good.");
		}else if(r == 5) {
			System.out.println("Signs point to yes.");
		}else if(r == 6) {
			System.out.println("You got it.");
		}
		

		
	}

}
