package iMoneyShapeDad;

abstract class Shape {

	
	public void shapeMtd() {
		
		System.out.println("In the Shape Method.");
	}
	
	abstract void draw();	
}

class Rectangle extends Shape {
	
	void draw () {
		System.out.println("Drawing rectangle: ");
	}	
}

class Circle extends Shape {
	
	void draw () {
		System.out.println("Drawing circle: ");
	}	
}

class Triangle extends Shape {
	
	void draw () {
		System.out.println("Drawing triangle: ");
		
	}
	public void shapeMtd() {
		
		System.out.println("In the Triangle Method.");
	}
}



