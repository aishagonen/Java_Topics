package lab6;

import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) {

		String name; // To hold a name
		int idNumber; // To hold an id number
		String department; // To hold a department
		String position; // To hold a position
		Employee employee = null;

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Get the name.
		System.out.print("Enter the name: ");
		name = keyboard.nextLine();

		// Get the department name.
		System.out.print("Enter the department name: ");
		department = keyboard.next();

		// Get the position.
		System.out.print("Enter the position: ");
		position = keyboard.next();
		
		employee = new Employee(name, department, position);
		
		// Get the id.
		System.out.print("Enter the id number: ");
		idNumber = keyboard.nextInt();
		
		// Get the data from the class and display it.
		System.out.println();
		System.out.println("Here is the data that you provided:");
		System.out.println("Name: " + employee.getName());
		System.out.println("ID number: " + employee.getIdNumber());
		System.out.println("Department: " + employee.getDepartment());
		System.out.println("Department: " + employee.getPosition());

	}

}
