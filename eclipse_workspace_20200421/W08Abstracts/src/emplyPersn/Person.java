package emplyPersn;

abstract class Person {

	private String name;
	private String gender;
	
	public Person(String nm, String gen) {
		this.name = nm;
		this.gender = gen;
	}
	public abstract void work();
	
	public String toString() {
		return "Name: " + name + " / Gender: " + gender;
	}
	public void changeName(String newName) {
		this.name = newName;
	}

}
