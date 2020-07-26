package gg;
//SQ:104
public class G65TestScope {

	public static void main(String[] args) {
		
		int var1 = 200;
		
		System.out.println(doCalc(var1));
		System.out.println(" " + var1);

	}
	
	static int doCalc(int var1) {
		var1 = var1 * 2;
		return var1;
	}

	
}



/*
	A. 400 200
	B. 200 200
	C. 400 400
	D. Compilation fails.


	Answ: A
	
*/