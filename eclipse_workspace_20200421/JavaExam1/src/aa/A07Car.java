package aa;
//SQ: 95
class A07Vehicle {

	String type = "4W";
	int maxSpeed = 100;

//	A07Vehicle(){
//		System.out.println("Super constructer is called");
//	}
	
	A07Vehicle(String type, int maxSpeed) {
		this.type = type;
		this.maxSpeed = maxSpeed;
	}
}


class A07Car extends A07Vehicle{

	String trans;

	A07Car(String trans) {		// line n1
		//super();
		this.trans = trans;
	}

	A07Car(String type, int maxSpeed, String trans) {
		super(type, maxSpeed);
		this(trans);			// line n2
		//this.trans = trans;
	}

	public static void main(String[] args) {
		
		A07Car c1 = new A07Car("Auto");
		A07Car c2 = new A07Car("4W", 150, "Manual");
		
		System.out.println(c1.type + " " + c1.maxSpeed + " " + c1.trans);
		System.out.println(c2.type + " " + c2.maxSpeed + " " + c2.trans);
	}

}

/*
 	outp: Implicit super constructor A07Vehicle() is undefined. Must explicitly invoke another constructor
	Constructor call must be the first statement in a constructor. 
	
	Answ: Compilation fails at both line n1 and line n2.
	
	- this() and super() ayni yerde kullanilamaz. 
	- Obje olustururken superClass'in parametresiz constructor'ini calsitiririz. 
	
		
	
 */


