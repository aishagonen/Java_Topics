package kk;
//SQ:72
public class K102App {

	int count;
	
	public static void displayMsg() {
		count++;							// line n1
		System.out.println("Welcome " + "Visit Count: " + count); // line n2
	}
	
	public static void main(String[] args) {
		
		K102App.displayMsg();	// line 3
		K102App.displayMsg();	// line 4
		
		

	}

}


/*
	What is the result?
	
	A. Compilation fails at line n3 and line n4.
	Lead to pass your exam quickly and easily. First Test, First Pass! - visit - http://www.certleader.com
	B. Compilation fails at line n1 and line n2.
	C. Welcome Visit Count:1Welcome Visit Count: 2
	D. Welcome Visit Count:1Welcome Visit Count: 2

*/