package cc;

public class C29TestArr {

	public static void main(String[] args) {

		/* insert code here */
		
		array[0] = 10;
		array[1] = 20;
		
		System.out.print(array[0] + ":" + array[1]);
		
	}

}


/*
	Which code fragment, when inserted at line 7, enables the code to print 10:20?
	A. int[] array n= new int[2];	: n!? hatali
	B. int[] array;array = int[2];  : 'new' olmali.
	C. int array = new int[2];		: [] eksik.
	D. int array[2];				: so? 

	Answ: Hicbiri dogru degil!?
	
	* Dogru yazilimlar: 
		int[] array; array = new int[2];
		int[] array = new int[2];
		int[] array = {...};
		int[] array = new int[] {...};
		


*/