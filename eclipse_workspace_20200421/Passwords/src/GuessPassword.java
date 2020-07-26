import java.util.Scanner;

public class GuessPassword {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
		String password = "let me in";
		System.out.println("Guess the password: ");
		
		String guess = kb.nextLine();
		
		//System.out.println(password.equals(guess));
		
		if (password.equals(guess)) {
		//if (password.toLowerCase().equals(guess.toLowerCase())) //Eger sadece kucuk harf olmasi gerekirse '.toLowerCase.' eklemek gerek.
			System.out.println("Password is correct.");
			//return; //'return' yazarsan devam etmez, sonrakileri okumaz, yani burada kalir.
		}
			else if ("password".equals(guess)) {
				System.out.println("You got the second password.");
			}
		
		else {
			System.out.println("Wrong password.");
		}
		
		System.out.println("Going to run."); //if ya da else hangisi olursa olsun bunu da sonunda yazar. 
		//Cunku bracelerin disinda yazilmis. Ama yukariya 'return' yazarsan burayi okumaz.
			
		
	}

}

