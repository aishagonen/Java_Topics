package iExamples;

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
		
		ArrayList<Animal> myListA = new ArrayList<>();
		myListA.add(new Tiger());
		 
		ArrayList<Hunter> myListC = new ArrayList<>();
		myListC.add(new Tiger());
		ArrayList<Hunter> myListB = new ArrayList<>();
		myListB.add(new Cat());
		
		ArrayList<Tiger> myListD = new ArrayList<>();
// 		myListD.add(new Cat());   // D -->> every Tiger can be Cat, but every Cat can not be Tiger.
		
		ArrayList<Animal> myListE = new ArrayList<>();
		myListE.add(new Cat());
	}
}