package NestedClasses;

public class OuterClass {
	
	static int id = 4298;
	static String name = "Ahmet";
	
	void outerMethod(){
		System.out.println("OuterS method");
	}
	
	static class Inner {
		void display(){
			System.out.println("Name : " + name);
			System.out.println("ID : "+id);
		}
		
	}
	
	public static void main(String[] args) {
		
		// Object for outer class:
		OuterClass outerClass = new OuterClass();
		
		//outerClass.display(); // compiler error
		
		OuterClass.Inner inner = new OuterClass.Inner();
		Inner object = new Inner();
		
		inner.display();
		object.display();
		
		//inner.outerMethod();// --> compiler error	
		//System.out.println(inner.id);  --> inner can't access outer's members, only methods. 
		
		// We don't need to create object for OuterClass. 
		// Because nestedClass is static and static properities, methods or classes can be accessed without objcet.  
	
		
		
		
	}
}


/*
 	NESTED CLASSES : OUTER AND INNER CLASS : 
 
	- Nested class'lar provides more more security. A lot of encapsulation!
	- Inner class can reach all member -even private- of outher class.	
	- Nested classes is more readable and maintanable, because all of them in one place.		
	- Nested classes require less code to write. 
	- Inner classes can be ==> final, abstract, public, private, protected. 
	- OuterClass has access to his members but not have access to InnerClass' members/methods. 
	- InnerClass'in objecti de OuterClass'in memberlarina direct ulasamaz.
	- OuterClass.this : ....
	
	* NESTED CLASS :
	 	- Static Nested Class : 
	 	- Inner Classes : 
	 	 	= Member Inner Class
	 	 	= Local Inner Class 
	 	 	= Anonymous Inner Class
	
	- Static Nested Class :
		# to Create object for static InnerClass/nested class :
			OuterClass.InnerClass objectName = new OuterClass.InnerClass(); 
		# No need to create the instance of static nested class : 
			OuterS.Inner.method();	
		# Eger InnerClass static'se static memberlara ulasir. Non-static InnerClass, non-Static memberlara ulasir.   
	
	= Member Inner Class : 
		# Non-Static class that inside a class but outside a method. 
		# only be created if we have a reference to an instance of outer class. 
		# its definition is directly enclosed by another class or interface declaration. 
			- so it provides more security by making inner class properties specific to only outer class, but not for external classes.
			- Instantiation the OuterClass :
					Outer obj = new Outer();
					Outer.Inner ico = obj.new Inner(); 
	
	= Local Inner Class :
		# Non-Static class that inside a method. 
		# It is not a member class of any other class. 
		# Create object, inside the method, but outside the LocalClass.
		# 
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
*/