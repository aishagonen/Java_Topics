package inheritances;

public class Reference {
	
	public static void main(String[] args) {
		
		SuperClass object = new SuperClass();
		object.overridenMethod();
		SuperClass object1 = new SubClass();
		object1.overridenMethod();
		object1.superClassField = 10;
		object1.superClassMethod();
		
		SuperClass object2 = new SuperClass();
		object2.overridenMethod();
//casting an object:		
//		((SubClass)object2).overridenMethod(); // Java doesn't know which one. So gives error. 
//		((SubClass)object2).subClassMethod(); // also gives error.		
		
	}
}
class SuperClass{
	int superClassField;
	
	void overridenMethod() {
		System.out.println("Hello from SuperClass");
}
	void superClassMethod(){
		System.out.println("SuperClass Method.");
	}
}
class SubClass extends SuperClass {
	int subClassField;
	
	void overridenMethod() {
		System.out.println("Hello from SubClass.");
	}
	void subClassMethod () {
		System.out.println("SubClass Method.");
	}
}




