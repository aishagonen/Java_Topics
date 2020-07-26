package week7;

public class Employee {

	String name;
	int salary;
	
	void favoriteQuote() {
		System.out.println("(sight) Tomorrow is a work day.");
	}
}	
	
class Teacher extends Employee {
	int studentNum;
	String [] quizQuestions;
	
	void favoriteQuote() {   // this is overriding, there are green arrows in the line number. 
		System.out.println("(angry) Why didn't forget yourself!");
		super.favoriteQuote(); // bu kod super classtaki 'favoriteQuote' methodunu calistirir.
	
	}	
}	
	
class DataScientist extends Employee {
	int numberOfProjects;
	String [] skills;
	
	void favoriteQuote() {
		System.out.println("(sip coffee) The world is a big data problem.");

	}
}
	
class Housewife extends Employee {
	String numOfChildren;
	String [] foodForTonight;
	
	void favoriteQuote() {
		System.out.println("(to kids) When I was your age...");

	}
}
	
	
	
	
	