package queues;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueues {

	public static void main(String[] args) {
		
System.out.println("********************	PRIORITY QUEUE    *************************");

		
		PriorityQueue<String> priorityQueue = new PriorityQueue<>();
		
		priorityQueue.add("Shakir");
		priorityQueue.add("Necati");
		priorityQueue.add("Remzi");
		priorityQueue.add("Kadriye");
		priorityQueue.add("Canan");
		priorityQueue.add("Mirket");
		
		System.out.println("PriorityQueues printed [side by side] : ");
		System.out.println(priorityQueue);
		System.out.println();
		
		Iterator iteratorPQ = priorityQueue.iterator();
		
		System.out.println("PriorityQueues with while loop by Iterator : ");
		while (iteratorPQ.hasNext()) {
			System.out.println(iteratorPQ.next());
			
		}
		System.out.println();
		
		priorityQueue.add("Tanju");
		priorityQueue.add("Peyami");
		
		System.out.println(priorityQueue);
		System.out.println();
		
		priorityQueue.remove();
		priorityQueue.remove();
		
		System.out.println(priorityQueue);
		System.out.println();
		
		priorityQueue.poll();
		priorityQueue.poll();
		
		System.out.println(priorityQueue);
		System.out.println();
		
		System.out.println(priorityQueue.element()); // siradaki ilk elemani belirtir. 
		System.out.println(priorityQueue.peek()); 	// siradaki ilk elemani belirtir. 
		
		System.out.println(priorityQueue);
		System.out.println();
		
		System.out.println(priorityQueue.size());
		System.out.println(priorityQueue.contains("blue"));

		Object [] p = priorityQueue.toArray(); 	// PriorityQueues to Array:
		System.out.println(p[1]);
		
		priorityQueue.comparator();    // ??????????????????????????????????
		System.out.println(priorityQueue);  
		System.out.println();
		
		priorityQueue.clear();
		System.out.println(priorityQueue);  // outp: []
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


