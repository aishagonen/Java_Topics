package w6;
//Different ways to initialize objects:
public class Initializing {

	private String name;
	private int id;
	
	public Initializing() {
	    // we are creating non-parameter constructor to be able to initialize the objects without using a parameter 
	}
	public Initializing(String name, int id) {
		this.name = name;
		this.id = id;
	}


	public static void main(String[] args) {
		
// Initializing through reference:
		Initializing object1 = new Initializing();
		object1.name = "Ahmet";
		object1.id = 4298;
		
// Initializing the object through methods:
		Initializing object2 = new Initializing();
		object2.setName("Ahmet Can");
		object2.setId(4298);
		
// Initializing through constructurs:
		Initializing object3 = new Initializing("Ahmet Can Turk", 4298);		
		
	}
	
//We only created setters, because we want to initialize the objects
// if you want to see the object values, you can create getters
	
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
}	





