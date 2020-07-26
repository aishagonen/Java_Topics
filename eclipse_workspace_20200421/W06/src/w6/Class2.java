package w6;

public class Class2 {

	int x;
    String y;

    public Class2() {  // bu sekilde bos bir constructor yazarsan error gider. Bu 1. way.
		System.out.println("You used the non parameter costructor to create your object.");

    }	
    public Class2(int xInt, String yString) {
		this.x = xInt;
		this.y = yString;
		System.out.println("You used the 2 parameter costructor to create your object.");
    }
	
	public static void main(String[] args) {

		Class1 object1 = new Class1(3,"String Value");
		Class2 object2 = new Class2(9,"Another string");
		Class2 object3 = new Class2(3,"stringValue");
		object3.x = 5;
		object3.y = "Java";
	}

}
