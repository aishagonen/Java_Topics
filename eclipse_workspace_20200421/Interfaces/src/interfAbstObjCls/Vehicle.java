package interfAbstObjCls;

public class Vehicle extends Crashable implements Drivable {
// Vehicle class'i interface'indeki butun metodlari icermeli. Ayrica kendine ait fields ve methodlari da olabilir. 
	
	int numOfWheels = 2;
	double theSpeed = 0;
	int carStrength = 0;
	
	public Vehicle() {
		super();
	}

	public int getWheel() {
		return this.numOfWheels;
	} 
	
	public void setWheels(int numWheels) {
		this.numOfWheels = numWheels; 
	}	

	public double getSpeed() {
		return this.theSpeed;
	}
	
	public void setSpeed(double speed) {
		this.theSpeed = speed;
	}

	public Vehicle(int wheels, double speed) {
		
		this.numOfWheels = wheels;
		this.theSpeed = speed;
	}
	
	public void setCarStrength(int carStrnegth) {
		this.carStrength = carStrnegth;
	}
	
	public int getCarstrength() {
		return this.carStrength;
	}
	
	
}
