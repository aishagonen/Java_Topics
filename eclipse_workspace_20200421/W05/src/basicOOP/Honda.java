package basicOOP;

public class Honda {

//Variables == properties == state (specific features)
	
		String brand;
		String model;
		String color;
		int engineSize;
		String madeBy;

	
		//Attributes == behavior (common features)
		
		public void accelerate(){
			System.out.println("Car is accelerating...");
		}
		
		public void stop(){
			System.out.println("Car is stopping...");
		}

}
