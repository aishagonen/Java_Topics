package employee;

public class EmployeeRunner {

	public static void main(String[] args) {
	
		Teacher teacherObj = new Teacher();
		teacherObj.name = "Ahmet";
// Teacher class doesn't have the field but we can use Employee's fileds. Because Teacher class extends Employee class. 		

		DataScientist dataScientist = new DataScientist();
		Housewife housewife = new Housewife();
		
		teacherObj.favoriteQuote();
		dataScientist.favoriteQuote();
		housewife.favoriteQuote();		
		
	}

}
