package ii;
//SQ:65
public class I82MyField {

	int x;
	int y;
	
	public void doStuff(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void display() {
		System.out.println(x + " " + y + " :");
	}
	
	public static void main(String[] args) {
		
		I82MyField m1 = new I82MyField();
		
		m1.x = 100;
		m1.y =200;
		
		I82MyField m2 =new I82MyField();
		
		m2.doStuff(m1.x, m1.y);
		m1.display();
		m2.display();
		
	}

}


/*

	What is the result?
	A. 100 0 : 100 200:
	B. 100 0 : 100 0 :
	C. 100 200 : 100 200 :
	D. 100 200 : 100 0 :

	Answ:  



*/