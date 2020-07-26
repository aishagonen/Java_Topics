package cc;
// SQ: 111
public class C23Xabcd {

	public static void main(String[] args) {

		int x = 100;
		int a = x++; // a = 100 101
		int b = ++x; // b = 101 102
		int c = x++; // c = 102 103
		int d = (a<b) ? (a<c) ? a: (b<c) ? b: c; 
		
		//int d = (a<b) ? (a<c) ? a: (b<c) ? b: c :x; ==> bu sekilde gelirse outp: d=100.	
		
		System.out.println(d); 
	}

}



/* 
 * outp: Unresolved compilation problem.  
   d compile exception verir. 
   Ternary operation'da kac tane '?' varsa o kadar ':' olmali. 
   int'i boolen'a declare edemezsin.
 	
 	
	What is the result?
	A. 100
	B. 101
	C. 102
	D. 103
	E. Compilation fails
	
	Answ: E
	
*/