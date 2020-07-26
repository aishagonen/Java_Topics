package cc;
//SQ: 119
public class C20Availables {

	public static void main(String[] args) {

		int x = 5;
		
		while (isAvailable(x)) {
			System.out.print(x);
			
		}
	
		
	}

	public static boolean isAvailable(int x) {
		return x-- > 0 ? true : false;
	}

	
}


/*
	Which modification enables the code to print 54321?
	
	A. Replace line 10 with System, out. print (--x) ; 
	B. At line 11, insert x --;
	C. Replace line 10 with --x; and, at line 11, insert system.out.print (x);
	D. Replace line 18 With return (x > 0) ? false: true;
	
	
	Answ: B.
	
	
	
	
*/
