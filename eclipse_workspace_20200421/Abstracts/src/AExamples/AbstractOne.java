package AExamples;

//interface DogInterface{
//	void bark();
//	void run();
//}       //  bu kismi en son ekledik, aralarindaki farki anlatirken. Notu en sonda.


// Abstract classes is a bunch of variables and methods that can be used to create other classes.  
// Abstract classes' methods can be protected, public, default. Interfaces' are public by default. 
abstract class Dog{
	
	
	public void bark() {
		System.out.println("Bark bark!");
	}

// Abstract method is a method that isn't implemented yet. Implemented means, you put the code inside the curly braces.No code.  
	public abstract void run();	
}

// When we create 'public abstract void run();' we get red underline 'class Chiu'. Because it needs to know how the run method.
// Since we are extending it we don't have to add the 'bark', because it is already implemented here.But for abstract 'run' method,  
// we didn't say what it should do, so we have to say  what should do in 'Chiu class':   
class Chiu extends Dog { 
	
	public void run() {
		System.out.println("Dog run!");
	} // So when we write in main class, run code works. 	
}

public class AbstractOne {

	public static void main(String[] args) {

//		Dog d = new Dog();  // 'Dog' classinin basindaki 'abstract' kelimesini kaldirinca methodu okuyor. 
//		d.bark();       // Ama 'Dog' classi, 'abstract' oldugu icin onu kullanamaz. You can't use abstract class like a regular class.  
// Abstract class helps make regular classes that you use there. So abstract'a ulasmak icin yeni bir class olusturup onu 'extends Dog' yapiyoruz. 
// Bu yeni class'i Abstract classin ve public class'in disinda  yaziyoruz.

// So, 'Dog d = new Dog();'i ve 'd.bark();'i degistirip, soyle yazariz:		
		Chiu c = new Chiu();
		c.bark();
		c.run();

	/* We typed what to do for 'run method' inside Chiu class. So why we need to keep 'abstract run method' in the abstract class? Because when we delete it still code is working.
	 Because, 'abstract class' helps us to organize what a dog should have. What should this class be able to do. So we can list out 100% make sure that every single dog has to have this method.
	 It might be different for other dogs, so that's why we make it abstract. So each specific dog can run or bark little differently. Basically it's saying you have to implement your own run method.
	 But all these dogs will bark the same. 
	 How is this different than an interface? For interface,'interface DogInterface{} yazarsin.Interface also list of variables and methods. Interface assumes that all the methods are abstract. 
	 Which means, not implemented, there is not code inside, it's just a list. But an abstract class is different because, you can have a list of methods and ones that are already implemented.That 
	 is the huge differences btw abstract and interfaces classes. You can't have any implemented methods inside of an interface. but you can have both abstract methods and implemented methods inside of an abstract class.    
	 If we want to  use the 'DogInterface' instead of the abstract method on 'class Chiu', we have to type 'DogInterface' and change 'extends' to 'implements'. Because we implementeing the methods from the inteface. Because
	 we know that we aren't extending it, because extending means, adding on to previously implemented methods. We are implementing all the methods in the interface. But we are extending what's already  there.    
	*/				
	
	}
}

//override - run time 
//overload - compile
//concrete method
//
