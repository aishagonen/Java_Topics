package employee;
import java.io.ObjectInputStream.GetField;

public class EmployeeTester {


	public static void main(String[] args) {


	
		Employee emp1 = new Employee();
		emp1.getFirstName();
		emp1.getEmail();
		emp1.getJobTitle();
		emp1.getSalary();
		

		emp1.work();
		
		System.out.println("Frist name: " + emp1.getFirstName());
		System.out.println("Email: " + emp1.getEmail());
		System.out.println("Job title: "+ emp1.getJobTitle());
		System.out.println("Hourly salary: "+ emp1.getSalary());
	
		
		
		
		
	}
		
}


