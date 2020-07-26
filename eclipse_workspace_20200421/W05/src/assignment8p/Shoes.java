package assignment8p;

public class Shoes {

	String color;
	String brand;
	int size;
	int heelHeight;
	
	public void infoShoes() {
	
		System.out.println("Features for Shoe 1: " + 
							"\nColor: " + color + 
							"\nBrand: "+ brand +
							"\nSize: " + size + 
							"\nHeel height: " + heelHeight);
	}
	
	public void casual() {
		System.out.println("These shoes are for a casual occasion.");
	}
	
	 public void sport() {
		System.out.println("These shoes are for a sports activity.");
	}	
}
