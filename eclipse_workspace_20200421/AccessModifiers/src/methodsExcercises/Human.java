package methodsExcercises;

public class Human {
	
	String name;
	int age;
	int height;
	String eyeColor;
	
	public Human() {
		
	}
	
	public void speak() {
	System.out.println("Hi, my name is " + name);
	System.out.println("My age is " + age);
	System.out.println("I am " + height + " inches tall");
	System.out.println("My eye color is " + eyeColor);
	}
	
	public void eat() {
		System.out.println("I am eating.");
	}
	public void walk() {
		System.out.println("I am walking.");
	}
	
	public void work() {
		System.out.println("I am working.");
	}
	
	
	
	
	
}
