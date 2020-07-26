package student;

public class Main {

	public static void main(String[] args) {

		
		Students s = new Students();
// bu kisim 'privite' olmayan 'name' icin. 'setName' yeterli.
		
		s.setName("Charlie");			
		System.out.println(s.name);

		s.setAge(21);
		System.out.println(s.age);
		
// bu kisim 'privite' olan 'name' icin. 'setName1' ve getName() gerekli. 		
		
		s.setName1("Lucy");
		System.out.println(s.getName1());
		
		s.setAge1(24);
		System.out.println(s.getAge1());
		
		
		
		
		
		
		
	}

}
