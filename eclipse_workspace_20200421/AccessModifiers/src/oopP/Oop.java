package oopP;
//Java is object oriented programming language. Why Java use object oriented language? 
// Because it is faster. Avoid to repeat codes. OOP lang. approach mother language approach to develop and applications. 
// Object is a class'in kopyasi.In java also object is bundle of related state (variables: brand, color size.. etc. specific features.) and behavior (running, stopping, accelerating... etc. common features.).  
// And class is a prototype (blueprint) from which individual objects are created.
// Instantiation: Creation of an object. Class objName = new Constructor(); Ex: Animal cat = new Animal (); --> bu bir instantiation.
// Constructor must be same with class name. 
// OOP, yani Object Oriented Programming is just objects with variables and methods.





public class Oop { //  extends Oop1 { 
// 'extends'  diger classlardaki methodlara ulasmayi saglar. 
// 'extends' gorunce bilicez ki burada Inheritance var. Oop is subclass, Oop1 is superclass.
// Inheritance is good for reusability of code. 	
	String name;  // 'name' isminde bir object olusturduk
	
	public void sayName() {  // ve 'sayName'isminde bir metod olusturduk.
		System.out.println("My name!");
	}	
// Bu object ve metod beraber bize 'My name!' yazdirir. 		

//****
// Polymorphism :  1. Overloading  2. Overriding.
// 1. Overloading : You can have same name, but different  variables and methods, parameters.  
	
	public void sayName(String name) {
		System.out.println("My name is "+ name); // ilk methodla ayni isim ama variable'lari degisik.
	}
	
// 2. Overriding :	
	
	public void sayHi() {  		// Oop1 class'inda 'sayHi' isimli method var. Burada da 'sayHi' methodu var. Overriding oldu. 
		System.out.println("overriding");	
	}
	
//	public static void main(String[] args) { // main method bu classta oldugu icin once buradaki 'sayHi' metodunu gorur. Digerini gormez. 
//											// eger bu classtaki 'sayHi' metodunu kaldirisan Oop1'deki  sayHi'i  cagirir.
//		Oop o1 = new Oop();
//		o1.sayHi();
//		
//
//	}
	

// Encapsulation : getter/setter : 	
	
	private String flavor;
	
	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String newFlavor) {
		flavor = newFlavor;      // buradaki 'flavor' yerine 'this.flavor' ; 'newFlavor' yerine de 'flawor' da yazabilirsin. normalde oyle yaziliyor. 
	}							//simdi cok karisiklik olmasin diye oyle yazdik.
	
	public void openBag() {
		System.out.println("Bag  is opened.");
	}	
// Buradaki flavor kodlarini main method'da cagirdik. 	
	
	
	
	
	
	
	
}


