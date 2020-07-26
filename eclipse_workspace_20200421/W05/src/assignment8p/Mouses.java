package assignment8p;

public class Mouses {

	String color;
	String brand;
	String model;
	double price; 
	
	public void infoMouses() {
		System.out.println("Features for Mouse 1: " +
							"\nColor: " + color + 
							"\nBrand: "+ brand +
							"\nModel: " + model + 
							"\nPrice: " + price);
	}
	
	public void rightClick () {
		System.out.println("Right is cliked!");
	}
	
	public void leftClick () {
		System.out.println("Left is cliked!");
	}	
}
