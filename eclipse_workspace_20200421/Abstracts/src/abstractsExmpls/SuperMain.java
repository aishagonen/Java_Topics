package abstractsExmpls;

public class SuperMain {

	public static void main(String[] args) {

		SubClass1 obj = new SubClass1();
		obj.getName("Adil");
		obj.getSex("Male");
		obj.getCountry("PAK");
		obj.display();
	}

}
