package jj;
//SQ:92
public class J94Employee {

	private String name;
	private int age;
	private int salary;
	
	public J94Employee() {
	}
	
	public J94Employee(String name, int age) {
		setName(name);
		setAge(age);
		setSalary(2000);
	}
	
	public J94Employee(String name, int age, int salary) {
		this(name,age);
		setSalary(salary);
		//this(name,age); // 9.satirdaki constructor'i cagirir.  
	//Constructor'la ilgilikodlar basa yazilir.Program burada hata verir
	}

	//getter and setter methods for attributes go here. //  Ben onlari asagiya ekledim.
	public void printDetails() {
		System.out.println(name + " : " + age + " : " + salary);
	}
	private void setSalary(int i) {
		this.salary = salary;
	}

	private void setAge(int age2) {
		this.age = age;
	}

	private void setName(String name2) {
		this.name = name;		
	}
}



/*
	Which is the result?
	A. Compilation fails in the Employee class.
	B. null : 0: 0Jack : 50 : 0Chloe : 40 : 5000
	C. null : 0 : 0Jack : 50 : 2000Chloe : 40 : 5000
	D. Compilation fails in the Test class.
	E. Both the Employee class and the test class fail to compile. 
 

 
 */
