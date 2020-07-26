package aa;
// Q: 6  / SQ: 52 

abstract class Planet {
	
	protected void revolve() { 		//line n1	
	}
	
	abstract void rotate();			// line n2

}

class A06Earth extends Planet {

	void revolve() {				// line n3
	}
	
	@Override
	protected void rotate() {		// line n4
	}
}


/*
	Which two modifications, made independently, enable the code to compile?

	A. Make the method at line n1 public.
	B. 			"		line n2 public.
	C. 			"		line n3 public.
	D. 			"		line n3 protected.
	E. 			"		line n4 public.

Answ: C and D.

* Method'lari override ederken, daha az visible bir access modifier kullanilmaz. 
  Mesela 'protected' method, subclass'ta 'default' olarak override edilemez, hata verir. 
  Ama 'default' methodu subclass'ta 'protected' yapabilirsin. 
	
	public > protected > default > private.
  


*/