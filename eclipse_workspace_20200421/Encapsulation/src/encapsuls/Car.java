package encapsuls;

public class Car {

	private String color;
	private String model;
	private double engine;
	private int doors;

	public Car() {

	}
	
	public Car(String color, String model, double engine, int doors) {

		this.color = color;
		this.model = model;
		this.engine = engine;
		setDoors(doors); 
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getEngine() {
		return engine;
	}

	public void setEngine(double engine) {
		this.engine = engine;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		if (doors == 2 || doors == 4) {
			this.doors = doors;
		} else {
			System.out.println("Count of doors must be 2 or 4.");
		}
	}

	public void start() {
		System.out.println("Car run.");
	}

	public void stop() {
		System.out.println("Car stopped.");
	}

}
