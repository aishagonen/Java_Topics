package hh;
//SQ: 49
import java.time.LocalDate;

public class H73App {

	String myStr = "7007";
	
	public void doStuff(String str) {
		
		int myNum = 0;
		
		try {
			String myStr = str;
			myNum = Integer.parseInt(myStr);
		} 
		catch (NumberFormatException ne) {
			System.err.println("Error");	
		}
		System.out.println("myStr: " + myStr + ", myNum: " + myNum);
	}
	
	public static void main(String[] args) {

		H73App obj = new H73App();
		
		obj.doStuff("9009"); // try => ("9009a") : outp: ErrormyStr: 7007, myNum: 0
		
	
	}
}


/*
 
 	Answ: mystr: 7007, myNum: 9009
 	
 	
 	
 	
 	
 	
 */