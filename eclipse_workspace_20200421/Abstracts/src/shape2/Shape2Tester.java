package shape2;

public class Shape2Tester {

	public Shape2Tester() {
	}
	
	public static void main(String[] args) {

		Shape2 vec[] = {new Circle2(3), new Rectangle2 (4,5), new Circle2 (4), new  Circle2 (8)};
		
		for (int index = 0 ; index < vec.length; index ++) {
			System .out.println(vec[index]);	
		}
	}
	
	
}