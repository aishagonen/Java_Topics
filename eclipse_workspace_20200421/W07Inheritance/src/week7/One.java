package week7;

public class One {

	public static void main(String[] args) {	
		three object1 = new three();
		object1.printFullName();
		object1.printMiddleName();
	}
	void printName() {
		System.out.println("Ahmet");
	}
}
class two extends One {
	void printMiddleName() {
		System.out.println("Can");
	}
}
class three extends two {
	void lastName() {
		System.out.println("Turk");
	}
	void printFullName() {
		super.printName();
		super.printMiddleName();
		this.lastName();
	}
}
// 'this' keyword is being used to refer to the fields and methods in current class.
// 'super'   "			"	"		"			"			"     "	  super class. 