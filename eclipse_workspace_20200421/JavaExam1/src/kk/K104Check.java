package kk;
//SQ:26 & 137  / Q: D37

public class K104Check {
	
	static int count = 0; 
	int i = 0;
	
	public void changeCount() {
		while (i<5) {
			i++;
			count++;
		}
	}
	
	public static void main(String[] args) {
		
		K104Check check1 = new K104Check();
		K104Check check2 = new K104Check();
		
		//check1.cC() and check2.cC()... ==> 0
		
		check1.changeCount(); // ==> 10
		check2.changeCount(); // ==> 10
		
		System.out.println(check1.count + ":" + check2.count);
			
		 
	}
	
}

/*
	What is the result?
	
	A. 10 : 10
	B. 5 : 5
	C. 5 : 10
	D. Compilation fails	
	
	
	Answ: 10:10

*/