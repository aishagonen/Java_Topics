package ff;
//SQ:70

class Vehicle {
	
	int x;
	
	Vehicle() {
		this(10); 	//line n1
	}
	
	Vehicle(int x) {
		this.x = x;
	}	
}

public class F53Car extends Vehicle {

	int y;
	
	F53Car() {
		super();
		this(20);  // line n2
	}
	
	F53Car(int y) {
		this.y = y;
	}
	
	public String toString() {
		return super.x + ":" + this.y;
	}
 	
	public static void main(String[] args) {
		
		Vehicle y = new F53Car();
		
		System.out.println(y);
		

	}

}

/*
 
 
 
 
 
 
 */
