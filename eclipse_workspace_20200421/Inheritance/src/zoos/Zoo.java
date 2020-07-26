package zoos;
import Bird;
import Fish;

public class Zoo {

	public static void main(String[] args) {

		
		Bird bird1 = new Bird(2, 9, "M");
		bird1.fly();
		bird1.sleep();
		bird1.eat();
	
		
		Cat cat1 = new Cat(4, 10, "F");
		cat1.jump();
		cat1.sleep();
		cat1.eat();
		
		Fish fish1 = new Fish(5, 7, "M");
		fish1.swim();
		fish1.sleep();
		fish1.eat();
		
		Dog dog1 = new Dog(1, 13, "F");
		dog1.bark();
		dog1.sleep();
		dog1.eat();
		
		
	}

}
