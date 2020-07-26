package gg;
//SQ:126 

import java.util.ArrayList;

import oo.Animal;
import oo.Cat;
import oo.Hunter;
import oo.Tiger;

public interface Hunter {
	
}

public abstract class Animal {
	
}

public class Cat extends Animal implements Hunter {
	
}

public class G66Tiger extends Cat {

	public static void main(String[] args) {
		
	//A.
		ArrayList<Animal> myListA = new ArrayList<>();
		myListA.add(new Tiger());
	//C. 	 
		ArrayList<Hunter> myListC = new ArrayList<>();
		myListC.add(new Tiger());
	//B.	
		ArrayList<Hunter> myListB = new ArrayList<>();
		myListB.add(new Cat());
	//D.	
		ArrayList<Tiger> myListD = new ArrayList<>();
//		 myListD.add(new Cat()); 
	//E.	
		ArrayList<Animal> myListE = new ArrayList<>();
		myListE.add(new Cat());

	}

}



/* 
 	Given the following class declarations: (up), Which answer fails to compile?
 	
 	
 	Answ: E ? 

  	Hocayla cozduk cevap: D -->> every Tiger can be Cat, but every Cat can not be Tiger. 
 
 
 
 
  
 */
