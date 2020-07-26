package assignment11;

public class Tester {

	public static void main(String[] args) {

		Student student1 = new Student(4298, "Ahmet Can", "Turk" );
		student1.display();
	}
}

class Person {
	
	String name;
	String lastname;
}

class Student extends Person {
	
	int id;
	
	Student (int id, String name, String lastname) {
		this.id = id;
		super.name = name;
		super.lastname = lastname;
	}
	
	void display() {

		System.out.println("Student id: " + id +"\nName: "+ super.name +"\nLast name: "+ super.lastname);
	}	
}



