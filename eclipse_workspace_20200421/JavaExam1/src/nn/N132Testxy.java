package nn;
//SQ:67

public class N132Testxy {

	int x, y;
	
	public N132Testxy(int x, int y) {
		initialize(x,y);
	}
	
	public void initialize(int x, int y) {
		this.x = x * x;
		this.y = y * y;
	}
	
	public static void main(String[] args) {
		
		int x = 3, y = 5;

		N132Testxy obj = new N132Testxy(x,y);
		
		System.out.println(x + " " + y);
		
	}

}


/*
		What is the result?
		A. Compilation fails.
		B. 3 5
		C. 0 0
		D. 9 25
		
		Answ: 3 5

*/