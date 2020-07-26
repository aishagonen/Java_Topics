package kk;
//SQ: 118 
import java.util.ArrayList;

public class K105Points {

	public static void main(String[] args) {
		
		ArrayList<Integer> points = new ArrayList<>();
		
		points.add(1);
		points.add(2);
		points.add(3);
		points.add(4);
		points.add(null);
		points.remove(2);
		points.remove(null);
		
		System.out.println(points);
		

	}

}
/*
	What is the result?
	
	A. A NullPointerException is thrown at runtime.
	B. [1, 2, 4]
	C. [1, 2, 4, null ]
	D. [1, 3, 4, null ]
	E. [1, 3, 4 ]
	F. Compilation fails.

	Answ:  [1, 2, 4]

*/