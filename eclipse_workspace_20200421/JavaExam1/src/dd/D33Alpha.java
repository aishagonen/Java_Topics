package dd;
// SQ: 88
class D33Alpha {

	int ns;			//ns - 50 - 125 - 0
	static int s;  // 0  - 50 - 125 - 125
	
	D33Alpha(int ns) {
		if (s<ns) {
			s = ns;
			this.ns = ns;
		}
	}
	
	void doPrint() {
		System.out.println("ns= " + ns + " s = " + s);
	}
		
}	
	

class TestA {

	public static void main(String[] args) {
		
		D33Alpha ref1 = new D33Alpha(50);
		D33Alpha ref2 = new D33Alpha(125);
		D33Alpha ref3 = new D33Alpha(100);
		
		ref1.doPrint();
		ref2.doPrint();
		ref3.doPrint();
	
		
	}

}


/*
 	What is the result?
 	
 	A. 	ns = 50 s = 125
 		ns = 125 s = 125
 		ns = 100 s = 125
 	
 	B. 	ns = 50 s = 125
 		ns = 125 s = 125
 		ns = 0 s = 125
 		
 	C. 	ns = 50 s = 50
 		ns = 125 s = 125
 		ns = 100 s = 100
 		
 	D. 	ns = 50 s = 50
 		ns = 125 s = 125
 		ns = 0 s = 125
 	
 	
 	- static int s :  bir deger vermedigimiz icin default olarak  s=0.
 	
 	Answ: D
 	
 	
 */





