package inheritances;

public class Vehicle {

	public int seat;
	public double price;

	public void does() {
		System.out.println("Vehicle carries people and items.");
	}

	public static void main(String[] args) {

		ElectricCar electricCar = new ElectricCar();
		electricCar.carbonFootPrint = 9;
		electricCar.seat = 4;
		electricCar.price = 40000;
		electricCar.does();
	}
}

class Car extends Vehicle {
	public int horsePower;

	public void does() {
		System.out.println("Car can be for sport events.");
	}
}

class MotorCycle extends Vehicle {
	public String type;

	public void does() {
		System.out.println("Motorcycle carries people.");
	}
}

class HybridCar extends Car {
	public int carbonFootprint;
	public int fulePerMile;

	public void does() {
		System.out.println("Hybrid car works fuel and electric.");
	}
}

class ElectricCar extends Car {
	public int carbonFootPrint;

	public void does() {
		System.out.println("Electric car is enviroment friendly.");
	}
}
