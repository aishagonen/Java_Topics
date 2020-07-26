package jj;
//SQ:94 / Q: 08
import java.io.IOException;

class X {

	public void printFileContent() {  //line n3
		/* code goes here*/
		throw new IOException();  //line n4
	}	
}

public class J98XTest {

	public static void main(String[] args) {  // line n1
		
		X xobj = new X();
		
		xobj.printFileContent();	// line n2	
	  //line n5
	}
}

/* 
	Which two modifications should you make so that the code compiles successfully? (Choose two.)
	
	C. Replace line n1 with 'public static void main(String[] args) throws Exception { ' 
	D. Replace line n2 with;
		try {
			xobj.printFileContent();
		}
		catch(Exception e) {}
		catch(IOException e) {}
	B. Replace line n3 with 'public void printFileContent() throws IOException {'
	E. Replace line n4 with 'throw IOException("Exception raised");'
	A. At line n5, insert 'throw new IOException();'
	
	
	Answ: A & C
	
		- (Exception e) en sonda yazilmazsa hata verir. 

*/

