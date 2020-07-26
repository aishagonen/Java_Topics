package hh;
//SQ: 6
public class H71App {

	public static void main(String[] args) {
		
		Boolean[] bool =new Boolean[2];
		
		bool[0] = new Boolean(Boolean.parseBoolean("true"));
		bool[1] = new Boolean(null);
		
		System.out.println(bool[0] + " " + bool[1]);

	}

}


/*
	What is the result?
	
	A. True false
	B. True null
	C. Compilation fails
	D. A NullPointerException is thrown at runtime
	

	Answ: A


*/