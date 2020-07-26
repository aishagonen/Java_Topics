import java.util.Scanner;

public class LeapYear {

	public static void is_LeapYear(int y) {
        boolean a = (y % 4) == 0;
        boolean b = (y % 100) != 0;
        boolean c = ((y % 100 == 0) && (y % 400 == 0));

        System.out.println(a && (b || c));
    }

	public static void main(String[] args) {
	
		Scanner kb = new Scanner(System.in);
		
		 System.out.print("Input a year: ");
	        int year = kb.nextInt();

	        is_LeapYear(year);
	        
	        kb.close();
		
	}

}
