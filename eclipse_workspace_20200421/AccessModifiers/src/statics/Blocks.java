package statics;
/*
 * Here we will learn to see how the different part (Anonymus block, Constructor and Static)
 * and what would be the order of execution.
 */
public class Blocks {
// Anonymus Block:
	{
		System.out.println("Hello from inside of the anonymus block.");
	}

// Static Block:
	static {
		System.out.println("Static Block.");
	}

	public Blocks() {
		System.out.println("Constructor.");
	}

	public static void main(String[] args) {

		Blocks object = new Blocks();

	}

}
// Order of execution : Static --> Anonymus --> Constructor 