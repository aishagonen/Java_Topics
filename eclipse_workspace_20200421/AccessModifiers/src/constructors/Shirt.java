package constructors;

public class Shirt {

	public static String color;
	public static char size;
	
//		Shirt(){
//			System.out.println("Here is inside of the constructor.");	 
//		}  // Shirt constructor'ini yazmasak da olur. Cunku default olarak zaten bu method var. 
//		  // buranin '//'larini acarsan main class'ta icindeki yazar.  
		
		Shirt(String newColor, char newSize) {
			color = newColor;
			size = newSize;
		}	
	
	public static void putOn() {
		System.out.println("Shirt is on.");
	}
	
	public static void putOff() {
		System.out.println("Shirt is off.");
	}
	
	public static void setColor(String newColor) {
		color = newColor;
	}
	public static void setSize(char newSize) {
		size = newSize;
	}

}
