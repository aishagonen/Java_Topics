package basicOOP;

public class HondaTest {

	public static void main(String[] args) {
		
//Create an object

		Honda civic = new Honda();
		civic.model = "Honda Civic";
		civic.color = "red";
		civic.engineSize = 2000;
		civic.madeBy = "Japanese";
		
		System.out.println("Modal: "+ civic.brand);
		System.out.println("Color: "+ civic.color);
		System.out.println("engineSize: "+ civic.engineSize);
		System.out.println("Made by "+ civic.madeBy );
		
		civic.accelerate();
		civic.stop();
		


	}

}
