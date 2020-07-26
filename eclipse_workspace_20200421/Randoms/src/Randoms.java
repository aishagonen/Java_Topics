import java.util.Scanner;
import java.util.Random;

public class Randoms {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);	
		
//  kb'den aldigi answer, 'y' oldugu muddetce 'do'nun icindeki 0'dan 5'e kadar, ama 5 dahil degil, sayilari random gosterir:
		
		Random rand = new Random();
		
		String answer;
		int num;
		int num1;
		
		do {
			num = rand.nextInt(5);
			System.out.println(num + " ");
			System.out.println("Play again? Y or N: ");
			answer = kb.next();
		} while (answer.equalsIgnoreCase("Y"));

		
// **************************

//  kb'den aldigi answer, 'y' oldugu muddetce 1'den 6'ya kadar, 6 da dahil, sayilari random gosterir. Zar gibi. 		
		
		do {
			num1 = rand.nextInt(6)+1;
			System.out.println(num1 + " ");
			System.out.println("Play again? Y or N: ");
			answer = kb.next();
		} while (answer.equalsIgnoreCase("Y"));

		
	}

}
