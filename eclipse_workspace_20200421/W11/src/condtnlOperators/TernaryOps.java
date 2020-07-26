package condtnlOperators;

public class TernaryOps {

	public static void main(String[] args) {
		
		int a, b;

		a = 10;
		
		/*
		if (a==1) {
			b = 20;
		} else {
			b = 30;
		}
		*/
		
		b = (a == 1 || false) ? 20 : 30;
		System.out.println("b = " + b);

		b = (a == 10) ? 40 : 10;
		System.out.println("b = " + b);

		
		
		int x,y;
		x = 10;
		y = (x==1) ? 20 : 30;  // if parantez is true --> 20 / false --> 30
		
		System.out.println("Value of y is: " + y);
		
		y = (x==10) ? 20 : 30;
		System.out.println("Value of y is: " + y);
		
	
	}

}



/*
	 Ternary Operator ( ? :)	:
	 	- '?' => if  and 	':' => else.
	 
	  
	  
 */

