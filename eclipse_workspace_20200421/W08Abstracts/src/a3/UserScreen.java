package a3;

public class UserScreen {

	public UserScreen() {
	}
	
	public void show(Car cars) {
		
		Car car = cars;
		System.out.println("Weight: " + car.getWeight());
		System.out.println("Model: " + car.getModel());
		System.out.println("Colorl: " + car.getColor());
		System.out.println("Fuel per hour: " + car.fuelPerHour());
	}	
}
