package nn;
//SQ:10

import java.util.ArrayList;
import java.util.List;

public class N130Colors {

	public static void main(String[] args) {
		
		List colors = new ArrayList();
		
		colors.add("green");
		colors.add("red");
		colors.add("blue");
		colors.add("yellow");
		colors.remove(2);
		colors.add(3,"cyan");
		
		System.out.println(colors);
		

	}

}


/*
	What is the result?
	A. (green, red, yellow, cyan)
	B. (green, blue, yellow, cyan)
	C. (green, red, cyan, yellow)
	D. AnIndexOutOfBoundsExceptionis thrown at runtime.


	Answ: [green, red, yellow, cyan]

*/