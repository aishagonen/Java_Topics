package assignment8p;

public class Books {

	String subject;
	String format;
	String condition;
	int pageSize;

	public void infoBooks() {
		System.out.println("Features for Book 1: " + 
							"\nSubject: " + subject + 
							"\nFormat: "+ format +
							"\nCondition: " + condition + 
							"\nPage size: " + pageSize);
	}
	
	public void published() {
		System.out.println("Book was published.");
	}
	
	public void sold() {
		System.out.println("Book was sold.");
	}	
}
