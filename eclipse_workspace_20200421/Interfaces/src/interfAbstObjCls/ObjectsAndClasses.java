package interfAbstObjCls;
// Constaructors are used for eliminate the default values by user defined values.

public class ObjectsAndClasses {

	public static void main(String[] args) {

		Object superCar = new Vehicle();

		
	//	System.out.println(superCar.getSpeed()); // superCar'in type'ini  Vehicle olarak belirledik. Ancak 
// Java onu Object olarak algilar bu yuzden superCar Vehicle'in metodlarina ulasamaz. Ama eger  casting yaparsak ulasir.
		
		System.out.println(((Vehicle)superCar).getSpeed()); // 0.0
		
		Vehicle superTruck = new Vehicle();
		
		System.out.println(superCar.equals(superTruck)); // false

// Each time when we create an object,it creates a unique identifier for that object. This unique idenifier is called 'hashcode'. Every object has unique code number.  		
	
		System.out.println(superCar.hashCode()); // 2018699554
	
// Whenever you don't need an object in memory, Java goes in and cleans it up. Java doing it itself. 

// 'getClass()' method shows the object's class: 
		System.out.println(superCar.getClass()); // class interfAbstObjCls.Vehicle. Java knows superCar is a vehicle, even I define it as an Object
		System.out.println(superTruck.getClass()); // class interfAbstObjCls.Vehicle. 
	
		System.out.println(superCar.getClass().getName()); // interfAbstObjCls.Vehicle // classin sadece name'ini istiyorsan bu sekilde. 

// Eger iki objenin de ayni classta olup olmadigini gormek istersen look below:
		if (superCar.getClass() == superTruck.getClass()) {
			System.out.println("The Same.");
		} // The Same. // Demek ki ayni classtalar.
	
		System.out.println(superCar.getClass().getSuperclass()); // class interfAbstObjCls.Crashable // superCar objesinin, yani type of Vehicle'in super classi, Crashable'dir diyor.
	
		
	}
	
}
/*
 'toString' methodu, zaten Object classinda yazili. Bu methodu override edersek, bir obje cagirdigimizda mutlaka calisir.
 public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
 }








*/