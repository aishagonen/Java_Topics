package vehicles;
public class Car extends Vehicle {  

// Constructor:
	public  Car() {
		System.out.println("Car --- const parent.");
	}
	
// Methods:	
	public  void start() {
		System.out.println("Car --- start method.");
	}
	public  void stop() {
		System.out.println("Car --- stop method.");
	}
	public String refuel() {
		return "Car --- refuel return type.";
	}

	
	
	
}
