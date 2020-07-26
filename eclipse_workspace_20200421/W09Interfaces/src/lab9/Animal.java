package lab9;

import java.util.ArrayList;

abstract class Animal {
	
}

interface Hunter {
	
}

class Cat extends Animal implements Hunter {
	
}

class Tiger extends Cat {
		
}

class Main {
	
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
// 		myListD.add(new Cat());   // D -->> every Tiger can be Cat, but every Cat can not be Tiger.
	//E.	
		ArrayList<Animal> myListE = new ArrayList<>();
		myListE.add(new Cat());
	}
}


/*
 	Given the following class declarations: Which answer fails to compile? 
 	
 	A. Option A
	B. Option B
	C. Option C
	D. Option D
	E. Option E
	
	
 */


