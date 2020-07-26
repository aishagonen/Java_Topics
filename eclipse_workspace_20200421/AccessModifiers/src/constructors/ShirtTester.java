package constructors;


public class ShirtTester {

	public static void main(String[] args) {

//		Shirt s = new Shirt();   // this line makes object. a new 's object'i yapti.
//								// 'new Shirt();' is a default   constructor. All constructors and methods have parantesis.		
//		s.setColor("White");
//		s.setSize('M');

//		s.putOn();				
//		s.putOff();

// if you want to create a lot of objects very quickly and very often then you may not want to call set color or set size etc. 
// you may want  to just pass those in parameters to the constructor. 
// instead of saying 'hey give me a shirt and I'll do it myself', I can say 'give me a white, medium shirt.'  	
// so let's create a constructor: and delete  first 3 lines above.	
		
		Shirt s = new Shirt("White", 'M');
		
		System.out.println(s.color);
		System.out.println(s.size);
		
		s.putOn();				
		s.putOff();
		
		
		
		
		
	}

}
