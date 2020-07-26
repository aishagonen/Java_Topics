package w6;

class Class0 {
	
}
//There can be only one public class per source file.
//A source file can have multiple non-public classes. 

public class Class1 {
// fields - attributes:
	
	private int x;
	private String y;

public Class1(int xInt, String yString) {
	this.x = xInt;
	this.y = yString;
}
public Class1() {  // bu sekilde bos bir constructor yazarsan error gider. Bu 1. way.
	
}
	public static void main(String[] args) {

		Class1 object = new Class1(9, "String"); //  Class1(9, String) / asagidaki parameterlari buraya yazarsan error gider bu da 2. way.
		System.out.println(object.x + " " + object.y);
		
		object.x = 10;
		object.y = "Value";
		System.out.println(object.x + " " + object.y);
		
		Class1 object2  = new Class1();
		object2.x = 11;
		object2.y = "Ahmet";
		
	}

	
	
}
