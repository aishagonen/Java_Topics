package lab10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Q7 {
	
// To convert a linked list to an Arraylist : 

	public static void main(String[] args) {

		LinkedList<String> linkedL = new LinkedList<>();
		
		linkedL.add("Shakir");
		linkedL.add("Necati");
		linkedL.add("Remzi");
		linkedL.add("Kadriye");
		
// 1.way: 		
		List<String> aList = new ArrayList<String>(linkedL);
	      
		System.out.println("The ArrayList elements are: ");
	      for (String str : aList) {
	         System.out.println(str);
	     }
	      System.out.println();

// 2.way:	      
	      ArrayList<String> arrayList = new ArrayList<>(linkedL);
	        
	       System.out.println("The ArrayList elements are: " + arrayList);
		
	}

}
