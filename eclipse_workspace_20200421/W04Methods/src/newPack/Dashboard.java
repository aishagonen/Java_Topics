package newPack;

public class Dashboard {

	public static void main(String[] args) {

// Feb 25,Tuesday class:
		
		System.out.println("Hello from Dashboard!");
		
		W4.printOut ("hello");
		W4.main(args);

// I can create object in this class and call methods from the other class.  		
		W4 object = new W4();
		object.areaOfTriangle(4, 5);

//*******************************************************		
// Feb 27, Thursday class: 
		
        Methods2 obj = new Methods2();
        obj.method1();
        Methods2.method2(); // this is static way of calling method
        Methods2.method3(); // call static way
        obj.method4();
		
        System.out.println("**********");
        
		System.out.println(Methods3.calculate1(4, 5));
		
	}

}
