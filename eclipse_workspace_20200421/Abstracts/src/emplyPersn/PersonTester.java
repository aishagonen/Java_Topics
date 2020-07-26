package emplyPersn;

public class PersonTester {

	public static void main(String[] args) {

		Person s = new Employee("Hina", "Female", 0);
		Person e = new Employee("Aslam", "Male", 22);
		
		s.work();
		e.work();
		e.changeName("Adil");
		System.out.println(e.toString());
	}

}
