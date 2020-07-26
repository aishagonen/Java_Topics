package ll;
//SQ:56
public class L110Stack {

	public static void main(String[] args) {
		
		int[] stack = {10,20,30};
		
		int size = 3;
		int idx = 0;
		
		/*line n1*/
		do {
			idx++;
		} while(idx < size-1);
		
		System.out.println("The top element: " + stack[idx]);

	}

}

/*
	Which code fragment, inserted at line n1, pints The Top element: 30?
	
	A. idx = 1 oldu. 
	B. idx = 3 oldu
	C. idx = 2 oldu
	D. idx 4 oldu
	E. 

	Answ: C

	30, 2.indexte oldugu icin, idx'in 2'yi vermesi gerek.

*/
