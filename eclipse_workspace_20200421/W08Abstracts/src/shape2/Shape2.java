package shape2;

public abstract class Shape2 {

	public Shape2() {
	}
	
	public abstract double area();
	
	public String toString() {
		return "[area =  " + area() + "]";
	}
}
