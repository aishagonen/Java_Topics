package assignment8p;

import javax.jws.soap.SOAPBinding;

public class MainTester {

	public static void main(String[] args) {
		
		System.out.println("***** Books *****");
		Books book1 = new Books();
		book1.subject = "Fiction";
		book1.format = "Hardcover";
		book1.condition = "Used";
		book1.pageSize = 75;
		
		book1.infoBooks();
		book1.published();
		book1.sold();
		
		System.out.println("\n***** Shoes *****");
		Shoes shoes1 = new Shoes();
		shoes1.color = "Taupe";
		shoes1.brand = "Franco Sarto";
		shoes1.size = 8;
		shoes1.heelHeight = 2;
		
		shoes1.infoShoes();
		shoes1.casual();
		shoes1.sport();
		
		System.out.println("\n***** Mouses *****");
		Mouses mouse1 = new Mouses();
		mouse1.color = "Black";
		mouse1.brand = "Dell";
		mouse1.model = "M185";
		mouse1.price = 21.99;
		
		mouse1.infoMouses();
		mouse1.rightClick();
		mouse1.leftClick();
		
		System.out.println("\n***** Laptops *****");
		Laptops laptop1 = new Laptops();
		laptop1.brand = "Apple";
		laptop1.operatingSystem = " MacOS";
		laptop1.displaySize = 13.3;
		laptop1.ramSize = 16;
		
		laptop1.infoLaptops();
		laptop1.charge();
		laptop1.shutDown();
		
	}

}
