import java.util.Scanner;
public class PizzaSoup {

	public static void main(String[] args) {
	
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Pizza or Soup [P or S]: ");
		
		String answer = kb.next();
		
		if (answer.equalsIgnoreCase("P")) {
			System.out.println("You ordered pizza. Small, medium or large? [S, M, L]:");
			answer = kb.next();
				if(answer.equalsIgnoreCase("S")) {
					System.out.println("You ordered small pizza.");
				}	
				else if(answer.equalsIgnoreCase("M")) {
					System.out.println("You ordered medium pizza.");
				}	
				else if(answer.equalsIgnoreCase("L")) {
					System.out.println("You ordered large pizza.");
				}
				else {
					System.out.println("Invalid. Must enter S, M or L.");
				}
		}	

		else if(answer.equalsIgnoreCase("S")) {
			System.out.println("You ordered soup. Tomato or Lentil? [T or L]: ");
			answer = kb.next();
		
			if(answer.equalsIgnoreCase("T")) {
				System.out.println("You ordered tomato soup.");
			}	
			else if(answer.equalsIgnoreCase("L")) {
				System.out.println("You ordered lentil soup.");
			}	
			
			else {
				System.out.println("Invalid. Must enter T or L.");
			}
		}	
		else {
			System.out.println("Invalid. Must enter P or S.");
			}
	}		

}
