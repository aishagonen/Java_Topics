package abstractsExmpls;

public abstract class Super {

	abstract void getName(String name);
	abstract void getSex(String sex);
}

abstract class AbstClass extends Super {
	
	abstract void getCountry(String country);
}

class SubClass1 extends AbstClass {
	
	String name, sex, city, country;

	void getName(String name) {
		this.name = name;
	}

	void getSex(String sex) {
		this.sex = sex;
	}

	void getCountry(String country) {
		this.country = country;
	}

	void display() {
		System.out.println("Name: " + name);
		System.out.println("Sex: " + sex);
		System.out.println("Country: " + country);	
	}	
}
