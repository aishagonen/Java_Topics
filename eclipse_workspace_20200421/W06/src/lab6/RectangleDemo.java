package lab6;

public class RectangleDemo {

	public static void main(String[] args) {

		Rectangle frame = new Rectangle();					
		
		System.out.println("Sending the value 10.0 to " + "the setLength method.");	
		
		frame.setLength(10.0);					
		frame.setWidth(16.81);

		System.out.println("The width: "+ frame.getWidth());
		System.out.println("The width: "+ frame.getLength());
		System.out.println("The width: "+ frame.getArea());
		System.out.println("The width: "+ frame.getPerimeter());
		System.out.println("Done.");
	}

}
