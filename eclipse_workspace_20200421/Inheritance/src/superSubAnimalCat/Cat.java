package superSubAnimalCat;

public class Cat extends Animal {
// Every Cat is an Animal. Because every method and field in animals is in the class Cat.
	
	
	public String favToy = "Yarn";
	
	public void playWith() {
		System.out.println("Yeah " + favToy);
	}
	
	public void walkAround() {
		System.out.println(this.getName() + " stalks around");
	}
	
	public String getToy() {
		return this.favToy;
	}
	
	public Cat() {
		
	}

	public Cat(String name, String favFood, String favToy) { //  name and favFood'u superClass'tan alir.
		super(name, favFood);
		this.favToy = favToy;
	}
	
	
}
