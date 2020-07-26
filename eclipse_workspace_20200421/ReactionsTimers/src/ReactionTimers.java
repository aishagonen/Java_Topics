
import java.util.Scanner;

public class ReactionTimers {

	public static void main(String[] args) throws InterruptedException { // buradaki 'throw' kismini 'Thread' kismini yazinca eklememizi java istedi. 
																		//cunku bi seyler ters gidebilirmis. Yoksa  'Thread' satiri kirmizi gorunuyordu.

// Reaction time: bu kod 1'er saniye arayla '3 2 1 Goo!' yazar:  
	
		System.out.println("3");
		Thread.sleep(1000);    // 'millis' means 'milisecond' --> 1000 millis = 1 second. 
		System.out.println("2");
		Thread.sleep(1000); 
		System.out.println("1");
		Thread.sleep(1000); 
		
		System.out.println("GOO!");	
		
// burdan gerisi; userdan 'enter'a basmasini ister ve  kac 'milisecond'da entera bastigini gosterir. 	
		
		long startTime = System.currentTimeMillis();
		
		Scanner kb = new Scanner(System.in);
		kb.next();
		long stopTime = System.currentTimeMillis();
		long reactionTime = stopTime - startTime;
		
		System.out.println(reactionTime + " ms.");
		
		
		
		
		
		
		
		
	}

}
