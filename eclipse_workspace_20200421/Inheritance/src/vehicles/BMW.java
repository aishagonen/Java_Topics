package vehicles;

public class BMW extends Car {

	public BMW () {
		super.start();
		System.out.println("BMW const.");
	}
	
	@Override
	public  void start() {
		System.out.println("Car --- BMW starts.");
		System.out.println("Car --- start method.");
	}
	public void theftSafety() {
		System.out.println("BMW --- theft safety.");
	}
	public int personNum() {
		int i =5;
		return i;
	}
	
	
	
	
	
	
	
}
