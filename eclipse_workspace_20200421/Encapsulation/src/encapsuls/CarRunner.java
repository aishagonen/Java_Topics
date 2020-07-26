package encapsuls;

public class CarRunner {

	public static void main(String[] args) {

		Car car1 = new Car();
		
		car1.setDoors(5);
		System.out.println("Count of doors: "+ car1.getDoors() );
		
		Car car2 = new Car("Black", "Forte", 1.6, 3);
	     System.out.println(car2.getDoors());
	
	}

}
