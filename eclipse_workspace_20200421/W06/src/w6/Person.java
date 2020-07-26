package w6;

public class Person {

	private String name;
	private int age;
	private String job;
	
	public Person(String name, int age, String job) {

		this.name = name;
		this.age = age;
		this.job = job;
	}
// age'i degistirmek icin method olsturduk: bunlari test'te cagirdik ve age'i degistirebildik.	
	public void changeTheAge(int number) {
		this.age = number;
	}
	public void showAge() {
		System.out.println(age);
	}
// private olan age'i degistirmek icin method yerine bu sekilde getter-setter da olusturup kullanabilirisn.
// get-set for age:
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	
	
	
	
	
	
	
	
	
}
