package kk;
//SQ:21 
public class K108FieldInit {

	char c;
	boolean b;
	float f;
	
	void printall() {
		System.out.println("c= " + c);
		System.out.println("b= " + b);
		System.out.println("f= " + f);
		
	}
	
	public static void main(String[] args) {
		
		K108FieldInit f = new K108FieldInit();
		
		f.printall();

	}

}


/* 
	What is the result?
	A. c = b = false f = 0.0
	B. c = null b = true f = 0.0
	C. c = 0 b = false f = 0.0f
	D. c = null b = false f = 0.0F

	Answ: 	c=  
			b= false
			f= 0.0

*/