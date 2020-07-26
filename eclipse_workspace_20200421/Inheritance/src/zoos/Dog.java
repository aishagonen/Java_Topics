package zoos;
import Animal;

public class Dog extends Animal {

	public Dog(int age, int weight, String gender) {
		super(age, weight, gender);
	}
	
	public void bark() {
		System.out.println("Barking");
	}
}
