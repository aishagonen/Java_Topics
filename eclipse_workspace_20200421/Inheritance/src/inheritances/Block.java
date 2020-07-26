package inheritances;

public class Block {

	public static void main(String[] args) {

		GrandParent object = new GrandParent();
		Parent object1 = new Parent();
		Child object2 = new Child();	

	}

}

class GrandParent {
// fields and methods area.
// Anonymous blocks:
	{
		System.out.println("GrandParentClass");
	}	
}
class Parent extends GrandParent {
	{
		System.out.println("ParentClass");
	}
	
}
class Child extends Parent {
	{
		System.out.println("ChildClass");
	}
	
}