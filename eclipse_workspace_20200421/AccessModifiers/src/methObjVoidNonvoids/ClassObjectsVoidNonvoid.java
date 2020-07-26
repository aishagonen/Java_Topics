package methObjVoidNonvoids;

public class ClassObjectsVoidNonvoid {

// A class is a template. Template like for making a movie,like for writing a book. 
// It is organizing a listing of logical characteristic that all of the objects that you create and they have to follow the template.    
// A class defines the form of an object. 
// An object is an specific instance of a class. 	
// Class --> template ; Object --> what you create from the template.
// Class has variables also has methods. Class methods operate on the class variables.  	
// Class should be organized with logical groupings of variables and methods. 	
// Instance --> when you create an instance object, you are creating actually a copy, reserving memory, creating an object 
// that's a specific instance that follows the logical organization of the class.     	
// Instance variable --> Variables that are part of the class definition. 
// Class = use 'class' keyword + give it a name + open a curly brace + inside of the class declare instance variables ||& methods + closing curly brace.  	
	
	public static void main(String[] args) {
		
		int var1 = 5;
		double var2 = 3.65;		
// Objeler de ykaridaki variable'lar gibi aslinda. basta type - variable name - tanimlamak. 
// Objeler de; once hangi classta yani hangi type bir obje olusturuyorsun - objenin adi - classin bir ornegi olan yeni bir objeyi ifade eden ()'li tanim. 
		aircraft saratoga = new aircraft();	
		// or asagidaki gibi de yazilir.
		aircraft cessna;
		cessna = new aircraft();
		
		cessna.passengers = 4;		// 'cessna.' yazdigimizda 'aircraft' classina ait carakteristikler oneri olarak cikar. Java biliyor ki 'cessna' objesi,
		cessna.cruiseSpeed = 140;	// 'aircraft' classina ait ve oradaki karakteristik ozellileri alir. 
		cessna.fuelBurnRate = 9.5;	// burada bu karakteristikleri tanimliyor, degerlerini veriyoruz. 
		cessna.fuelCapacity = 56.5;
		
		System.out.println("Number of Cessna passenger: " + cessna.passengers);
		System.out.println("Number of Cessna cruise speed: " + cessna.cruiseSpeed);
		
		saratoga.passengers = 6;
		saratoga.cruiseSpeed = 201;
		saratoga.fuelBurnRate = 102.5;
		saratoga.fuelCapacity = 20.5;
		
		System.out.println("Number of Saratoga passenger: " + saratoga.passengers);
		System.out.println("Number of Saratoga fuel burn rate: " + saratoga.fuelBurnRate);
// calling void method:
		System.out.println("\nEndurance of Cessna: "); 
		cessna.calculateEndurance();
		System.out.println("\nEndurance of Saratoga: "); 
		saratoga.calculateEndurance();

// calling non-void method:
		System.out.println("Endurance of Cessna: "+ cessna.calcEndurance()); 
		
		double enduranceCessna = cessna.calcEndurance();
		System.out.println("Endurance of Cessna: "+ enduranceCessna);
// calling non-void method with argument:
		System.out.println("For Cessna to fly  for 2,5 hours, it takes "+ cessna.fuelNeeded(2.5)+ " gallons of fuel.");
		System.out.println(cessna.fuelNeeded(2.5)); // non-void 

// Non-void methodlari you can use for print it or use for arithmetic, or mathematical computations etc. 
		System.out.println((cessna.fuelNeeded(2) * 3));
		System.out.println(cessna.calcEndurance()*2);
// But, you can't use the void methods in the same way:		
//		System.out.println(saratoga.calculateEndurance() *2); // --> ERROR verir. 
		
		System.out.println();
		System.out.println("*********** *********** ***********");

		double revenueHouston, revenueSeattle, revenueOrlando;
		
		groceryStore houstonStore = new groceryStore();
		groceryStore seattleStore = new groceryStore();
		groceryStore orlandoStore = new groceryStore();
// creates object of class groceryStore.Now in memory, there is 3 object named 'houstonStore','sS, oS...' have the characteristic of the 'groceryStore' class.

		
		houstonStore.soldApple = 534; 	// storing info into houstonStore variables.
		houstonStore.applePrice = 0.99;
		houstonStore.soldOrange = 429;
		houstonStore.orangePrice = 0.87;
		revenueHouston = (houstonStore.applePrice * houstonStore.soldApple) + (houstonStore.orangePrice * houstonStore.soldOrange);
		houstonStore.grossRevenue(); 	// ustteki uzun satir yerine 'groceryStore' classinda method olusturduk. 
		
		System.out.println("*** Houston Store ***");	// print out houstonStore info.
		System.out.println("Apples sold: " + houstonStore.soldApple );
		System.out.println("Apple reatil cost: " + houstonStore.applePrice);
		System.out.println("Orange sold: " + houstonStore.soldOrange);
		System.out.println("Orange reatil cost: " + houstonStore.orangePrice);
		System.out.println("Revenue of Houston store: " + revenueHouston);
// calling non-void method:		
		System.out.println("Revenue of Houston store: " + houstonStore.grosRev());

				
		seattleStore.soldApple = 765; 	// storing info into seattleStore variables.
		seattleStore.applePrice = 0.99;
		seattleStore.soldOrange = 842;
		seattleStore.orangePrice = 0.97;
		revenueSeattle = (seattleStore.applePrice * seattleStore.soldApple) + (seattleStore.orangePrice * seattleStore.soldOrange);
		seattleStore.grossRevenue(); 	// ustteki uzun satir yerine 'groceryStore' classinda met
		
		System.out.println("*** Seattle Store ***"); 	// print out seattleStore info.
		System.out.println("Apples sold: " + seattleStore.soldApple);
		System.out.println("Apple reatil cost: " + seattleStore.applePrice );
		System.out.println("Orange sold: " + seattleStore.soldOrange);
		System.out.println("Orange reatil cost: " + seattleStore.orangePrice );
		System.out.println("Revenue of Seattle store: " + revenueSeattle);
// calling non-void method:		
		System.out.println("Revenue of Seattle store: " + seattleStore.grosRev());

		orlandoStore.soldApple = 534; 	// storing info into orlandoStore variables.
		orlandoStore.applePrice = 0.65;
		orlandoStore.soldOrange = 343;
		orlandoStore.orangePrice = 0.99;
		revenueOrlando = (orlandoStore.applePrice * orlandoStore.soldApple) + (orlandoStore.orangePrice * orlandoStore.soldOrange);
		orlandoStore.grossRevenue(); 	// ustteki uzun satir yerine 'groceryStore' classinda met
		
		System.out.println("*** Orlando Store ***"); 	// print out orlandoStore info.
		System.out.println("Apples sold: " + orlandoStore.soldApple );
		System.out.println("Apple reatil cost: " + orlandoStore.applePrice);
		System.out.println("Orange sold: " + orlandoStore.soldOrange);
		System.out.println("Orange reatil cost: " + orlandoStore.orangePrice);
		System.out.println("Revenue of Orlando store: " + revenueOrlando);
// calling non-void method:		
		System.out.println("Revenue of Orlando store: " + orlandoStore.grosRev());
// calling non-void method with argument:		
		System.out.println("Orlando target: $744 of apple sales. ");
		System.out.println("Need to sell "+ orlandoStore.appleRevTarget(744) + " apples.");
	}
 }
class aircraft {
	int passengers;			//number of people
	int cruiseSpeed;		// miles per hour
	double fuelCapacity;	// gallons
	double fuelBurnRate;	// gallons per hour

// calss 'aircraft'	icinde methods olusturuyoruz. this is a general data.
	void calculateEndurance() {  // void diyoruz cunku bu method bir sayiya return etmeyecek. 
		double endurance;
		
		endurance = fuelCapacity / fuelBurnRate;
		System.out.println(endurance + " hours.");
	}
// Answer'i print etsin istiyorsan o zaman void'i kullan. 
// Answer'i print etmesin, sadece hesaplasin ve cagirildigi yere cevabi biraksin istiyorsan non-void yani return kullan. 
// Non-void methodlari you can use for print it or use for arithmetic, or mathematical computations etc. 
	double calcEndurance() {
		double endurance;
		endurance = fuelCapacity / fuelBurnRate;
		return endurance;
	}
	
	double fuelNeeded(double time) {    // non-void with argument
		 return fuelBurnRate *time;    // you can declare a name and assign the answer to this name, but we choose this way.
	}	
	
}	
//***

 class groceryStore {
	 int soldApple;
	 double applePrice;
	 int soldOrange;
	 double orangePrice;
 
	 void grossRevenue() { 
		 double revenue;
		 
		 revenue = (soldApple * applePrice) + (soldOrange * orangePrice);
		 System.out.println("Gross revenue is $" + revenue);
	 }
	// Answer'i print etsin istiyorsan o zaman void'i kullan. 
	// Answer'i print etmesin, sadece hesaplasin ve cagirildigi yere cevabi biraksin istiyorsan non-void yani return kullan. 
 
	 double grosRev() {
		double rev;
		rev = (soldApple * applePrice) + (soldOrange * orangePrice);
		return rev;
	 }
 
	 double appleRevTarget(double revenue) { // non-void with argument.
		 return revenue/applePrice;
	 }
	 
 
 
 }	 
	 
	 
	 
	 



 
 
 
 
 
 
 
 
 
 