package NestedClasses;

public class OuterS {
	
	private static int serialNumber = 10;

	
	static class Inner {
		
		int serialNumber = 20;
		
		int getValue() {
			return serialNumber;
		}
		
	}

	void displaySerialNumber() {
		Inner ic = new Inner();
		System.out.println("Serial Number : " + ic.getValue());
	}

	public static void main(String[] args) {
		
		OuterS oClass = new OuterS();
		oClass.displaySerialNumber();
		
		OuterS.Inner oiObj = new OuterS.Inner();	
		System.out.println("Serial Number : " + oiObj.getValue());
		// static olduklari icin, hata yok, ulasilabilir. 
		
		//OuterS.Inner obj = oClass.new Inner(); //static olduklari icin obj'yi olusturamaz. ????
		//System.out.println("Serial Number : " + obj.getValue());
		
		
	}
}