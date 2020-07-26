import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {

		
		Stack<String> games = new Stack<String>();
// Stack'ta asagidan yukariya dogru ust uste koydugunu dusun. Siralama oyle oluyor. 
		games.add("Call of Duty");   // 0.sirada yani en altta.
		games.add("Guitar Hero");    // 1.sirada yani ortada.
		games.add("Super Monkey");   // 2.sirada yani en ustte.
		
		System.out.println(games.pop()); // cunku en ustte 'Super Monkey'var. Once onu pop eder ve onu gosterir.
		System.out.println(games.pop()); // simdi en uste 'Guitar Hero' geldi. O yuzden onu pop eder ve onu gosterir.
//		System.out.println(games.pop()); // simdi en uste 'Call of Duty' geldi. O yuzden onu pop eder ve onu gosterir.
		//System.out.println(games.pop()); // Hic bir sey kalmadi,hepsini sirayla pop etti. 
		// o yuzden console'da 'Exception in thread "main" java.util.EmptyStackException' diye hata gosterir.
		
		System.out.println(games.peek());
		
		System.out.println(games); // pop ettikce icinde kalan elemani gosterir.3 kere pop edince ici bos [] gosterir. tekrar pop ettiginde hata verir. 

//**************************************************
		
/*  Y
 * 	B
 *  R	
 */ 
		Stack<Character> tower = new Stack<Character>();
		
		tower.add('R');
		tower.add('B');
		tower.add('Y');
		
		System.out.println(tower.contains('P'));
		System.out.println(tower.contains('Y'));
		System.out.println(tower.empty());    // eger empty ise 'true', degilse 'false' gosterir.
		System.out.println(tower.get(1));    // 1. siradaki degeri gosterir. 
		System.out.println(tower.get(0));
		System.out.println(tower.set(0, 'P')); // 0. degeri 'P' olarak degistirir ve 0. degeri gosterir.
		System.out.println(tower);  // Bir ustteki koddan dolayi, 0. karakter olan R yerine P gosterir.
		System.out.println(tower.size());
	
	
	
	}

}
