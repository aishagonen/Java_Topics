package RandomsP;
import java.util.Random;

public class RollingDice {

	public static void main(String[] args) {
	
		Random dice = new Random();
		int x = dice.nextInt(6) + 1; // sadece (6) yazsaydik, 0'dan 5'e kadar olan 6 sayiyi gosterirdi, 6'yi gostermezdi.
									// (6)+1 yazinca gosterecegi sayilari kaydirdik. Yine 6 tane sayi gosterecek ama simdi 1-6 arasindaki sayilari gosterir.
		System.out.println("You rolled: " + x);
		
	}

}
