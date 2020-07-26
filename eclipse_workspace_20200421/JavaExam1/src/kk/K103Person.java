package kk;
//SQ:23 & 3 / Q:F58
public class K103Person {

	String name;
	int age = 25;
	
	public K103Person(String name) {
		this();		 	// line n1
		setName(name);
	}
	
	public K103Person(String name, int age) {
		K103Person(name);	// line n2
		setAge(age);
	}
	
	// setter and getter methods go here
	
	public String show() {
		return name + " " + age + " ";
	}
	
	
	public static void main(String[] args) {
		
		K103Person p1 = new K103Person("Jesse");
		K103Person p2 = new K103Person("Walter", 52);
		
		System.out.println(p1.show());
		System.out.println(p2.show());
	}

}


/* 
 	What is the result?
	
	A. Compilation fails at both line n1 and line n2.
	B. Compilation fails only at line n2.
	C. Compilation fails only at line n1.
	D. Jesse 25Walter 52

*/
