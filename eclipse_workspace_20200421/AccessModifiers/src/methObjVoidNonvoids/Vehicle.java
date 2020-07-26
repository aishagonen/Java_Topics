package methObjVoidNonvoids;

public class Vehicle {
	
	public static void main(String[] args) {
	
		Car suv = new Car();
		
		suv.passenger = 5;
		suv.door = 4;
		suv.fuelCapacity = 20.7;
		suv.fuelBurnRate = 3.2;

		System.out.println("Count of passengers: "+ suv.passenger);
		System.out.println("Color of car: "+ suv.color);
		System.out.println("Count of doors: "+ suv.door);
		System.out.println("Fuel capacity: "+ suv.fuelCapacity);
		System.out.println("Fuel burn rate: "+ suv.fuelBurnRate);
		
		Car van  = new Car(7, "black", 5, 50.4, 2.1);
//		van.passenger = 7;
//		van.color = "black";
//		van.door = 5;
//		van.fuelCapacity = 50.4;
//		van.fuelBurnRate = 2.1;
	
//		System.out.println("Count of passengers: "+ van.passenger);
//		System.out.println("Color of car: "+ van.color);
//		System.out.println("Count of doors: "+ van.door);
//		System.out.println("Fuel capacity: "+ van.fuelCapacity);
//		System.out.println("Fuel burn rate: "+ van.fuelBurnRate);
		
		van.printDetails();	
	}
}

class Car {
	
	int passenger;
	int price;
	int speed;
	int door;
	double fuelCapacity;
	double fuelBurnRate;
	boolean roof;
	String color;
	
	public Car () {

	}
	public Car(int passenger, String c, int door, double fc, double fuelBurnRate) {
		
		this.passenger = passenger;
		color = c;
		this.door = door;
		fuelCapacity = fc;
		this.fuelBurnRate = fuelBurnRate;
	}
	void printTemplate() {
		System.out.println("This is my dream car!");
	}
	public String caps(String s) {
		return s.toUpperCase();
	}
	void printDetails() {
		
		System.out.println("Count of passengers: "+ passenger);
		System.out.println("Color of car: "+ color);
		System.out.println("Count of doors: "+ door);
		System.out.println("Fuel capacity: "+ fuelCapacity);
		System.out.println("Fuel burn rate: "+ fuelBurnRate);
	}
	double fuelNeeded(double time) {
		return fuelBurnRate * time;
	}
	double calcEndurance() {
		double endurance;
		endurance = fuelCapacity / fuelBurnRate;
		return endurance;
	}
	void setPassenger(int p) {
		if (p>0 && p<7) {
			passenger = p;
		}
		else {
			System.out.println("Error! Set count of passenger by 0-7.");
		}
	}
	
	boolean roof(boolean r)  {
		return false;
	}
	void checkSpeed() {
		// go on...
	}
}