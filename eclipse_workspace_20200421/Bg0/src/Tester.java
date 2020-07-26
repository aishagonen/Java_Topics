
public class Tester {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setSalary(2000);		
		System.out.println(e1.getSalary());
		
		Employee e2 = new Employee();
		System.out.println(e2.getSalary());

		Employee e3= new Employee(5000);
		System.out.println(e3.getSalary());
		
		Employee e4 = new Employee();
		System.out.println(e4.age);

	}

}
