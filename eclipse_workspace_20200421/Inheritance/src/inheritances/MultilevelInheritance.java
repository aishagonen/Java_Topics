package inheritances;

public class MultilevelInheritance {

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle();
		rectangle.width = 9;
		rectangle.length = 8;
		rectangle.area();

	}
}

class Shape {
	int area;

}

class twoDimensionalShape extends Shape {

}

class Circle extends twoDimensionalShape {
	int radius;

	void area() {
		System.out.println("Area of the circle: " + 3 * radius * radius);
	}
}

class Rectangle extends twoDimensionalShape {
	int width;
	int length;

	void area() {
		System.out.println("Area of the rectangle: " + width * length);
	}
}
