package employee;

public class Employee {

	   
	private String firstName;
	private String email;
	private String jobTitle;
	private double salary;
	
	

	public Employee() {
	}

	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getJobTitle() {
		return jobTitle;
	}




	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}




	public double getSalary() {
		return salary;
	}




	public void setSalary(double salary) {
		this.salary = salary;
	}




	public  void work() {
		System.out.println(firstName + " is working as a " + jobTitle +".");
		
				
	}

}

