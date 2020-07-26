package basicOOP;

public class SmartPhoneTest {

	public static void main(String[] args) {

		SmartPhones iPhone = new SmartPhones();
		
		iPhone.brand = "11 pro";
		iPhone.capacity = 128;
		iPhone.ram = 4;
		iPhone.color = "Gold";
		
		System.out.println("*** IPhone ***");
		System.out.println("iPhone's brand is: " + iPhone.brand);
		System.out.println("iPhone's capacity is: " + iPhone.capacity + " GB");
		System.out.println("iPhone's ram is: " + iPhone.ram + " GB");
		System.out.println("iPhone's color is: " + iPhone.color);
		
		iPhone.sendEmail();
		iPhone.takePic();

		SmartPhones motorola = new SmartPhones();
		motorola.brand = "Z series";
		motorola.capacity = 32;
		motorola.ram =  2;
		motorola.color = "Black";
		
		System.out.println("*** Motorola ***");
		System.out.println("Motorala's brand is: " + motorola.brand);
		System.out.println("Motorala's capacity is: " + motorola.capacity + " GB");
		System.out.println("Motorala's ram is: " + motorola.ram + " GB");
		System.out.println("Motorala's color is: " + motorola.color);
		
		iPhone.sendEmail();
		iPhone.takePic();
		
	}

}
