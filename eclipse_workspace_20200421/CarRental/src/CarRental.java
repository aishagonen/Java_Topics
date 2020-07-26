import java.util.Scanner;
public class CarRental {

	public static void main(String[] args) {
		
// do-while	+ if + else if + else kullandim: 
		
// Car Renter Programi Kodu: 


		Scanner kb = new Scanner(System.in); //scanner'li kodlarda bunu olusturmayi unutma!
		String answer;
		double price = 0;
		int discountRate = 0;
		
		do {   // programa do-while'i en son ekledik. aslinda yazmaya asagidaki satirdan basladik.
		
			System.out.println("Compact or Full-size? [C or F] : ");
			answer = kb.next();
	
			
			if (answer.equalsIgnoreCase("C")) {
				price = 40;
			}
				else if (answer.equalsIgnoreCase("F")) {
					price = 50;
				
				}
			else {
				System.out.println("Invalid entry. Must C or F.");
				System.exit(0);
			}
			
			// buradan gerisi another if-else statement. simdi coupon soracak.
			
			System.out.println("Do you have coupon? [Y or  N]: ");
			 answer = kb.next();
			
			if (answer.equalsIgnoreCase("Y")) {
				System.out.println(" Is it 10% or 20% ? [10 or 20] :");
				discountRate = kb.nextInt();
	
				if (discountRate == 10) {
					price = price * 0.9;  // 10% --> 0.9 diye yazilir.(1.yol)
				}
					else if (discountRate == 20) {
						price *= 0.8;  // 20% --> 0.8 diye yazilir ve price *= 0.8 yazarak da indirim hesaplanabilir.(2.yol)
					}
				
				else {
					System.out.println("Invalid entry. Mus enter 10 or 20. ");
				}
				
			}
				
			System.out.printf("Price: $ %.2f\n",  price);  // price'i dollar ve cent olarak gostercegi icin 'printf' ve icine '%.2f' ve '+' yerine de ',' kullandik.
			
			// buraya kadarina asagidaki soruyu ekleyip hepsini do-while loopunun icine koydu ki cevap Y oldugu surece devam etsin.
			
			System.out.println("Do you want to rent again? [Y or N]: ");
			answer = kb.next();
		
		} while (answer.equalsIgnoreCase("Y"));  
				

	}

}
