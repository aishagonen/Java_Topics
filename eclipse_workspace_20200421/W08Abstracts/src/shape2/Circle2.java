package shape2;

public class Circle2 extends Shape2 {

	int radius;
	
	public Circle2(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double area() {
		return radius * 3 * radius;
	}

}
