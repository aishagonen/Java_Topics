package constructors;

public class PublicPrivatesStatics {

	public static void main(String[] args) {
	
		aircrafts.wings = 2; 
		
		aircrafts cessna = new aircrafts(4, 140, 9.5, 56.5);
		aircrafts saratoga = new aircrafts(6, 201, 102.5, 20.5);
		
		System.out.println("For Cessna to fly  for 2,5 hours, it takes "+ cessna.fuelNeeded(2.5)+ " gallons of fuel.");
		System.out.println("For Saragota to fly  for 2,5 hours, it takes "+ saratoga.fuelNeeded(2.5)+ " gallons of fuel.");	
				
		cessna.cruiseSpeed = 110; // 'cruiseSpeed' public oldugu icin bu variable'i burada degistirebildim. 
		System.out.println(cessna.cruiseSpeed); 
		
		cessna.setPassenger(7);
		
		aircrafts.wings = 2;
		System.out.println("All of our aircrafts have " + aircrafts.wings + " wings.");
		System.out.println(cessna.wings);
		System.out.println(saratoga.wings);
		
		Math.cos(5.56);  // burada 'Math' is a class in Java and 'cos' is a method. 
						// We can use 'cos' method in 'Math' class without create an object. How?
						// Cunku, 'cos' methodu tagged as static. 		
	}	
}
class aircrafts {
	private int passengers;					//number of people
		int cruiseSpeed;		// miles per hour
	private double fuelCapacity;	// gallons
	private double fuelBurnRate;	// gallons per hour
	static int wings;
	
	aircrafts (int p, int c, double fc, double fbr){
		passengers = p;
		cruiseSpeed = c;
		fuelCapacity = fc;
		fuelBurnRate = fbr;
	}
	
	double fuelNeeded(double time) {    // non-void with argument
		 return fuelBurnRate *time;    // you can declare a name and assign the answer to this name, but we choose this way.
	}
	
	double calcEndurance() {
		double endurance;
		endurance = fuelCapacity / fuelBurnRate;
		return endurance;
	}
	
	void setPassenger (int p) {
		if (p>0 && p<=10) {
			passengers = p;
			System.out.println("Revised passenger count: " + p);
		}
		else {
			System.out.println("Error setting passengers!");
		}
	}
}
/* When you don't write anything infront of the variables, it means they are public. 
   
   public : able to be accessed by methods and codes inside of the class, and methods and codes in other classes or places in your program. 
   private : able to be accessed by method and codes inside of the class, not other places. 

 STATIC :
 * static variables : 
 	- static variables can be interfaced without even declaring an object.
 	- static variable'i kullanmak icin sadece 'className.' yazmak ve sonrasinda da variable'i bir seye assign etmek yeterli: 
 	 'aircrafts.wings = 2;' gibi. 
 	- Static variables are kind of behaves as global variables. 
 	- static variables are written blue and italic.   
 	 All aircrafts classindan cikan objeler will have same wings. Java says, ok, there is an aircrafts class and 'wings' is static, so 
 	 we put a varibale called wings in that class, and the value of wings is going to apply to all objects in the class. 
 	- if variable is static, we can interface and use it even before the object is created.   
 	 Variable'lari biz objectle kullaniyoruz, ve object'leri olusturduktan sonra yaziyoruz. 
 	 Ancak static variable'lari object olusturmadan once bile yazabiliriz.
 	- Static olan classa gomuluyor, non-static objeye gomuluyor. 

 * static Methods : 
 	- Eger methodu static yaparsak, icinde kullandigimiz variable'larin da static olmasi gerekir. 
 	  Yoksa method'un basina static yazmak sadece yetmez, methodun icindeki kodda red lines olur.
 	- Static method'lari class ismiyle cagiririz, obje ile degil.
 	- Static methodlari,sadece static methodlar cagirabilir. 
 	 
 	 
*/










