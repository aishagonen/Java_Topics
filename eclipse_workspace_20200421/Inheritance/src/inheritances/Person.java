package inheritances;

public class Person {

	public String name;
	public int age;

	public void does() {

	}

	public static void main(String[] args) {

		mathTeacher lastTeacher = new mathTeacher();
		lastTeacher.age = 31;
		lastTeacher.classHours = "40";
		lastTeacher.graduatedCollege = "Yale";
		lastTeacher.name = "Naruto";
		lastTeacher.studentNum = 17;

	}

}

class teachers extends Person {
	public int studentNum;
	public String graduatedCollege;

	public void does() {

	}
}

class mathTeacher extends teachers {
	public String classHours;

	public void does() {

	}
}

class physicsTeacher extends teachers {
	public String classHours;
	public String labHours;
	public String[] experiments;

	public void does() {

	}
}

class Student extends Person {
	public String graduationDate;

	public void does() {

	}
}
