package lab6;

public class Rectangle {

	double width;
	double length;
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}



	public void setLength(double length) {
		this.length = length;
	}



	public double getArea() {
		return getWidth() * getLength();
	}

	public double getPerimeter() {
		return 2 * (getWidth()+ getLength());
	}
	
	
	
	
	

}
