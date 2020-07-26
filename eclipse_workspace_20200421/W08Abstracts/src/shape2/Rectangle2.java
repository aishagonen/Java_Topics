package shape2;

public class Rectangle2 extends Shape2 {

	int width;
	int length;
	
	public Rectangle2(int width, int length) {
		super();
		this.width = width;
		this.length = length;
	}

	@Override
	public double area() {
		return width * length ;
	}
}
