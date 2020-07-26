package a3;

public class Ford extends Car {

	private int maxSpeed;
	
	public Ford() {
	}
	
	@Override
	int fuelPerHour() {
		return 5;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
}
