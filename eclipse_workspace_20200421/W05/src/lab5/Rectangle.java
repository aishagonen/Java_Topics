package lab5;

public class Rectangle {

	private double width; 
	private double length;
// These 2 private variables are not connected methods that we wrote below.We didn't use them.  
// Because below methods have own values are declared in their inside, in parenthesis. 	
	public double area(double width, double length) {
		return width*length;	 // or --> double area = width * length;
								//	 	   return area;
	}
	
	public double perimeter(double width, double length) {
		return 2*(width + length); 		 // or --> double perimeter = 2*(width + length);
										//	  	   return perimeter;
	}
	
	public static void main(String[] args) {
	
		Rectangle rectangle = new Rectangle();
		System.out.println(rectangle.area(3, 5));
		System.out.println(rectangle.perimeter(3, 11));
	
	}

}
