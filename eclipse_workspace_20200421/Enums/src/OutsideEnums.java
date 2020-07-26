// Enum is basically a list of things that don't change. if a class and an array had a baby. It's a list of values doesn't change but it sets up like a class.
// You access it like a class. // you can put Enum inside of the class or outside of the class. 
// Enum doesn't have types like arrays. Enum is just a list of labels. 
// You can also have a methods inside of Enum.

enum Levels{
// "Low", "Medium", "High"; // bu sekilde yainca her yer kirmizi oldu. Enum oldugu icin label seklinde type etmeliyiz. 
	LOW, MEDIUM, HIGH;     // you can type it lowerCase but tavsiye edilmez. UpperCase ile taninir ve variable ile karistirilmaz. 	
}

public class OutsideEnums {

//	static String [] levels = {"Low", "Medium", "High"}; // basina 'static' yazdik ki main access it and we don't have to do an 'object' in 'main method'.
// Yukariya Enum'i yazinca bu array'i sildik. 	
	
	public static void main(String[] args) {

//		System.out.println(levels[0]);
//		System.out.println(levels[1]);
//		System.out.println(levels[2]);	// Yukariya Enum'i yazinca array'i sildik, dolayisiyla bunlari da sildik.	
				
		System.out.println(Levels.HIGH);    // '(levels.)' yazinca hemen onerilerde 'LOW, HIGH, MEDIUM'cikar
		
		Levels l = Levels.LOW;
		System.out.println(l);
		
		switch (l) {
			case LOW:
			System.out.println("Low level.");
				break;
			case MEDIUM:
				System.out.println("Medium level.");
				break;
			case HIGH:
				System.out.println("High level.");
				break;
		}	
		
	}

}
