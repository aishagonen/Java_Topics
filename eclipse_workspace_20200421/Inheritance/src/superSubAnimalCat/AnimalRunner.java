package superSubAnimalCat;

public class AnimalRunner {

	public static void main(String[] args) {
		
		Animal genericAnimal = new Animal();
		
		System.out.println(genericAnimal.getName());
 		System.out.println(genericAnimal.favFood);
 		System.out.println();
		
 		Cat morris = new Cat("Morris", "Tuna", "Rubber Mouse");
 		
 		System.out.println(morris.getName());
 		System.out.println(morris.favFood);
 		System.out.println(morris.favToy);
 		
 		Animal tobby = new Cat("Tabby", "Sallmon", "Ball"); // Java knows that Tobby is a cat. We defined it here. 
// so when we call 'walkAround' method, Java knows Tabby is an animal, also Tabby is a cat. Is there any 'walkAround'method in Cat class? Yes.
// So Java uses Cat classin icindeki 'wakAround' methodunu kullanir.     		
 		acceptAnimal(tobby);
 		
	}

	public static void acceptAnimal(Animal randAnimal) { // Animal'in objectini olusturdu.
 		
		System.out.println();
		System.out.println(randAnimal.getName());
		System.out.println(randAnimal.favFood);
		System.out.println();
		
		randAnimal.walkAround();
		
// Casting: randAnimal bir Animal objesi. Casting yaparak Java'ya diyorum ki bunu Cat objesi olarak dusun. 
// O yuzden normalde Cat'in method ve fieldlarina ulasamazken, casting yaptiktan sonra ulasabilir. 		
		
//		System.out.println(tempCat.favToy); // Animal class'i subClass'inin fields and mehods'larini kullanamaz. Ancak; look below:
		
		Cat tempCat = (Cat) randAnimal; // means: I create a 'tempCat' and want to take the 'randomAnimal''i Animal class'indan 
// and convert it into a cat. 
		System.out.println(tempCat.favToy);  //Simdi Java, Animal classinda olusan objeyi Cat olarak dusundugu icin Cat'in method ve fieldsini kullanabilir.  
		
		System.out.println(((Cat)randAnimal).favToy);
		
		if (randAnimal instanceof Cat) {  // randAnimal is a cat also an animal. 
			System.out.println(randAnimal.getName() + " is a Cat."); 
		}
	}	
}

// If you want to access fields or methods only found in the Cat class, you have to cast the object to that specific class first.

