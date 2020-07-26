package NestedClasses;

public class OuterNS {
	
	private int serialNumber = 10;
	

	class Inner {
		
		int getValue() {
			return serialNumber;
		}
		
	}
	
	void displaySerialNumber() {
		Inner ic = new Inner();
		System.out.println("Serial Number : " + ic.getValue());
	}
	
	public static void main(String[] args) {
		
		OuterNS oClass = new OuterNS();
		oClass.displaySerialNumber();
		
		OuterNS.Inner object = oClass.new Inner();
		System.out.println("Serial Number : " + object.getValue());
		
		OuterNS.Inner obj = oClass.new Inner();
		System.out.println("Serial Number : " + obj.getValue());
		
		
		
		
	}
}
