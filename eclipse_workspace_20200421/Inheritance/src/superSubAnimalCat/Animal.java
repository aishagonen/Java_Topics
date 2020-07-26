package superSubAnimalCat;

public class Animal { // Animal class'i bir SuperClass. Ve SubClass is a copy of Animal.

	private String name = "Animal";
	public String favFood = "Food";

	protected final void changeName(String newName) {  /* Bu methoda, Animal classinin subClasslari da ulassin diye methodu protected yaptik. 
														 Public veya private degil.'final' means, bu methodu hicbir subClass degistiremez.*/
			this.name = newName;												
	}

	protected final String getName() {
		return this.name;
	}

	public void eatStuff() {
		System.out.println("Yum " + favFood);
	}

	public void walkAround() {
		System.out.println(this.name + " walks around.");
	}

	public Animal() {
		super();
	}

	public Animal(String name, String favFood) {
		super();
		this.name = name;
		this.favFood = favFood;
	}
	
}
