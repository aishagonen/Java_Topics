package lab10;
import java.io.IOException;

import javax.imageio.IIOException;

class X {

	public void printFileContent() {  //line n3
		/* code goes here*/
		throw new IOException();  //line n4
	}	
}

public class XTest {

	public static void main(String[] args) {  // line n1
		
		X xobj = new X();
		
		xobj.printFileContent();	// line n2	
	} //line n5
}

/*Which two modifications should you make so that the code compiles successfully? (Choose two.)
A. Replace line n1 with 'public static void main(String[] args) throws Exception { ' 
B. Replace line n2 with;
	try {
		xobj.printFileContent();
	}
	catch(Exception e) {}
	catch(IOException e) {}
C. Replace line n3 with 'public void printFileContent() throws Exception {'
D. Replace line n4 with 'throw IOException("Exception raised");'
E. At line n5, insert 'throw new IOException();'

Answ: A & C
*/



