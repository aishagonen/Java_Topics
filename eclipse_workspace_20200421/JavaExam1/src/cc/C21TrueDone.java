package cc;
//SQ: 41
public class C21TrueDone {

	public static void main(String[] args) {
		
		boolean opt = true;
		
		switch (opt) {
		case true:
			System.out.println("True");
			break;
		default:
			System.out.println("***");
		}
		System.out.println("Done");

		
		
		
	}

}


/*
	Which modification enables the code fragment to print TrueDone?
	A. Replace line 7 With String opt = "true"; Replace line 10 with case "true":
	B. Replace line 7 with boolean opt = l ;Replace line 10 with case 1=
	C. At line 12, remove the break statement.
	D. Remove the default section.

	Answ: A

	Switch'ler boolean, double, long'larla calismaz. If-else'lerden farki. 
	String, int, short, byte, char olmasi gerek. 
	
	 

*/