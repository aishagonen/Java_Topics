package schools;

public class School {

	private String schoolName;
	private int numOfTeachers;
	private int numOfStudent;
	
	public School(String schoolName, int numOfTeachers, int numOfStudent) {
		super();
		this.schoolName = schoolName;
		this.numOfTeachers = numOfTeachers;
		this.numOfStudent = numOfStudent;
		
		System.out.println("School name: "+ schoolName + "\nNumber of teachers: " 
							+ numOfTeachers + "\nNumber of students: "  + numOfStudent );
	}
	
	
}
