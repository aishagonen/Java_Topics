package vehicles;

public class VehicleRunenr {

	public static void main(String[] args) {

		BMW b1 = new BMW();
		b1.start();
		b1.stop();
		b1.theftSafety();
		b1.engine();
		System.out.println(b1.personNum());
		System.out.println(b1.refuel());
		
		System.out.println("*****************************");
		
		Car car = new Car();
		car.start();
		car.stop();
		car.refuel();
		car.engine();
		System.out.println(car.refuel());
				
		
		
		
		
		
		
		
	}

}
