package basicOOP;

public class HelperMeth {

	public String getName() {
		return "John";
	}

	public int getAge() {
		return 20;
	}

	public double getGPA() {
		return 3.75;
	}
	
	private String fatherJob() {
		return "doctor";	
	}

//Helper method:
	
	public String info() {
		return "Name: " + this.getName() +
				"\nAge: " + this.getAge() + 
				"\nGPA: " + this.getGPA() + 
				"\nFather's job: " + this.fatherJob(); 
		
	}
	
	
	
	
}
