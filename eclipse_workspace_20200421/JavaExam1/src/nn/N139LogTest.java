package nn;
//SQ:129
public class N139LogTest {

	public static void main(String[] args) {
		
		int x = 1;
		int y = 0;
		
		if (x++ > ++y) {
			System.out.println("Hello");
		}
		else {
			System.out.println("Welcome");
		}
		System.out.println("Log" + x + ":" + y);

	}

}


/* 
	What is the result?
	 
	A. Hello Log 1:0
	B. Hello Log 2:1
	C. Welcome Log 2:1
	D. Welcome Log 1:0



	Answ: 	Welcome
			Log2:1

*/