package ff;
//SQ:3 & 23 / Q:K103
public class F58Person {

	String name;
	int age = 25;
	
	public F58Person(String name) {
		this();		 	// line n1
		setName(name);
	}
	
	public F58Person(String name, int age) {
		F58Person(name);	// line n2
		setAge(age);
	}
	
	// setter and getter methods go here
	
	public String show() {
		return name + " " + age + " " + number;
	}
	
	
	public static void main(String[] args) {
		
		F58Person p1 = new F58Person("Jesse");
		F58Person p2 = new F58Person("Walter", 52);
		
		System.out.println(p1.show());
		System.out.println(p2.show());
	}

}


/* 
 	What is the result?
	A. Jesse 25 Walter 52
	B. Compilation fails only at line n1
	C. Compilation fails only at line n2
	D. Compilation fails at both line n1 and line n2


*/
