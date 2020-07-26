package bb;
//SQ: 109
class B13CD {

	int r;
	
	B13CD(int r) {
		this.r = r;
	}
	
}
public class B13DVD extends B13CD{

	int c;
	
	B13DVD(int r, int c) {
		// line n1
		
	}
	
	public static void main(String[] args) {

		B13DVD dvd = new B13DVD(10, 20);
		
		//System.out.println(dvd.r);
		
	}

}


/*
  Whic code should be use at line n1 to instantiate the dvd object successfully? 
 
  Answ: super(r);
		this.c = c;
  
  
 */