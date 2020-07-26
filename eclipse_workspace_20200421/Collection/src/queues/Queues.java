package queues;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Queues {

	public static void main(String[] args) {
		
System.out.println("********************	QUEUE    *************************");

		
		Queue<String> queue = new LinkedList<String>(); //"LinkedList yazdik cunku interface'den obje olusturamayiz. Queues'ler interface'tir.
		
		queue.add("Kadriye");
		queue.add("Kadriye");
		queue.add("Canan");
		queue.add("Mirket");
		queue.add("Kursat");
		queue.add("Ercan");
		queue.add("Tanju");
		queue.add("Necmi");
		
		System.out.println("Queues printed [side by side] : ");
		System.out.println(queue);
		System.out.println();
		
		Iterator iteratorQ = queue.iterator();
		
		System.out.println("Queues with while loop by Iterator : ");
		while (iteratorQ.hasNext()) {
			System.out.println(iteratorQ.next());
			
		}
		System.out.println();
	
		queue.poll(); 	 // ilk olani once ceker yani 0.indexi,'Kadriye'yi.
		queue.poll();	 // Liste bos kalirsa '[]' gosterir.
		queue.remove();  
		
		System.out.println(queue);
		System.out.println();
		
		queue.peek(); 		 // siradaki ilk elemani belirtir.
		queue.element(); 	// siradaki ilk elemani belirtir.
		
		System.out.println(queue);
		System.out.println();
		
		System.out.println(queue.poll());  // 'Queues.poll()'u, 'syso()'nun icinde yazdigim icin, ilk indexteki poll ettigini gosterir.
		System.out.println(queue.peek()); // 'peek' en ustte olani, yani onceligi ilk olani gosterir.
										 
		System.out.println(queue);
		System.out.println();
		
		System.out.println(queue.size());
		System.out.println(queue.contains("Mary"));
		System.out.println(queue.toArray()[1]);
		
		System.out.println(queue);
		System.out.println();
		
		

	}

}

/*
 * QUEUE (Line) : 
		- Queues follows FIFO (first in first out). 
		- Q item'lari giris sirasina gore siralar.
		- .poll(); & .remove(); --> both methods ilk ekleneni remove eder. 


	* PriorityQueues : 
		- PQ implements Queues interface. 
		- PriorityQueues is not thread safe.
		- PQ item'lari natural order'a gore veya comparator based order'a gore siralar.
		  (Lexicographic) Alphabetic order is natural order for String if user didn't change it.
		- .poll(); & .remove(); --> both methods ilk ekleneni degil de oncelige gore remove eder.
		- Eger sirada bi item yoksa;
		  .poll(); ==> returns 'null'		  .remove(); ==> throw error.
		- .peek(); & .element(); --> both methods next item'i belirtir. 
		- Eger sirada bi item yoksa; 
		  .peek(); ==> returns 'null'		  .element(); ==> throw error.


 */

