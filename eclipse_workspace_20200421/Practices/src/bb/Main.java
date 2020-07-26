package bb;

class A {
	
	static int i = 1111;
	
	static {
		i = i-- - --i;   // i = i:1111, --:1110 - --:1109, i:1109 = 2 (go ln 19)
	}
	
	{
		i = i++ + ++i; 	// 0 = 0 + 2 = 2 (go ln23)
	}
	
}

class B extends A {
	
	static {
		i = --i - i--; 	// 2 = --:1 - 1 = 0 (go ln11)
	}
	
	{
		i = ++i + i++; 	// 2 = 3 + 4 = 6 (finish!)
	}
	
}

public class Main {

	public static void main(String[] args) {

		B b = new B();
		
		System.out.println(b.i); //(start ln7)
		
		
	}

}






/*
 Calisma sirasi : 
 Super static ==> Sub static ==> Super Anonymus ==> Super Constr.  ==> Sub Anonymus ==> Sub Constr.
 
 
 outp : 6
 
 */

