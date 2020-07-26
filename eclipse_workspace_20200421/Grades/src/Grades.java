import java.util.Scanner;
public class Grades {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("First grade: ");
		int firstGrade = kb.nextInt();
		
		System.out.println("Second grade: ");
		int secondGrade = kb.nextInt();
		
		System.out.println("Third grade: ");
		int thirdGrade = kb.nextInt();
		
		int finalGrade = ((firstGrade + secondGrade + thirdGrade) / 3);
		System.out.println("Final grade is: " + finalGrade);
		
// Buraya kadar datayi  kb'den aliyorsun. Buradan sonra if'li kodlara geciyorsun. 
		 
		if (finalGrade<49) {
			System.out.println("You got F. Failed.");
		}
			else if (finalGrade>=50 && finalGrade<74) {
				System.out.println("You got C. Passed.");
			}
			else if (finalGrade>=75 && finalGrade<84) {
				System.out.println("You got B. Passed.");
			}
		else {
			System.out.println("You got A. Passed. Congrats!");
		}
		
//******************************************
// Grades:
		 
		int m;
		int f;
		double g;
		
		System.out.println("Enter midterm grade: ");
		m = kb.nextInt();
		
		System.out.println("Enter final grade: ");
		f = kb.nextInt();
		
		g = (m * 0.4) + (f * 0.6);
		
		
		if (g>=50) {
			
			System.out.println("Your grade is: " + g +". You passed!");
		}
		
		else {
			System.out.println("Your grade is: " + g +". You failed!");
		}
		
//******************************************
// Grade: 

		int grade = 101;
		
		if (grade > 100) {
			System.out.println("Invalid grade!");
		}
		else if (grade > 90) {		
			System.out.println("Your grade is A ");
		}
		else if (grade > 80){
			System.out.println("Your grade is B ");
		}
		else if (grade > 70) {
			System.out.println("Your grade is C ");
		}
		else if (grade > 60) {
			System.out.println("Your grade is D ");
		}
		else if (grade >= 0){
			System.out.println("Your grade is F. You failed!");
		}
		else if (grade < 0) {		
			System.out.println("Invalid grade!");
		}
		else {
			
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
