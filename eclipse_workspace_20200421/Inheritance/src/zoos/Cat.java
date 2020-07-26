package zoos;
import Animal;

public class Cat extends Animal {

	public Cat(int age, int weight, String gender) {
		super(age, weight, gender);
	}

	public void jump() {
		System.out.println("Jumping");
	}
	
	
	
}
