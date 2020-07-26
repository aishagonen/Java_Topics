package basicOOP;

public class Car {

// Variables : properties : state (specific features)
	
		String model;
		String color;
		int engineSize;
		String madeBy;
		
	
	public static void main(String[] args) {
		
//Instantiation:
		
		Car honda = new Car();
		honda.model = "Civic";
		honda.color = "red";
		honda.engineSize = 2000;
		honda.madeBy = "Japanese";
		
//Print:
		
		System.out.println("Model of Honda is: "+ honda.model);
		System.out.println("Color of Honda: "+ honda.color);
		System.out.println("Engine size: "+ honda.engineSize);
		System.out.println("Made by "+ honda.madeBy);
		
		honda.stop();
		honda.accelerate();
		
	}
		
//Attributes == behavior (common features):
	
	public void accelerate() {
		System.out.println("Car is accelerating...");
	}
	public void stop() {
		System.out.println("Car stopped!");
	}
	
	
	
	
	
	
	
	
	

	
	
}
