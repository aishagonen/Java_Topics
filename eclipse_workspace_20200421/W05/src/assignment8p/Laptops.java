package assignment8p;

public class Laptops {

	String brand;
	String operatingSystem;
	double displaySize;
	int ramSize;
	
	public void infoLaptops() {
		System.out.println("Features for Laptop 1: " +
							"\nBrand: " + brand +
							"\nOperating system: "+ operatingSystem + 
							"\nDisplay size: " + displaySize + 
							"\nRAM: " + ramSize);
	}
	
	public void charge() {
		System.out.println("Laptop is charging...");
	}

	public void shutDown() {
		System.out.println("Laptop is shutting down...");
	}
}