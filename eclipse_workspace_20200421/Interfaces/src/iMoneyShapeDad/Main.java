package iMoneyShapeDad;

public class Main {

	public static void main(String[] args) {


// ********************	
		
	Kid ali = new Kid();
	
	System.out.println(ali.momEyes);	
	System.out.println(ali.dadHeight);	
	System.out.println(ali.name);	
	System.out.println(ali.mom());
	
// ********************
	
	BankAcc veli =new BankAcc();
	veli.withDrawLira(90);
	veli.withDrawEuro(20);
	veli.withDrawRupee(10);

// ********************
		
	Circle c = new Circle();
	c.draw();
	c.shapeMtd();
		
	Rectangle r = new Rectangle();
	r.draw();
	r.shapeMtd();	
		
	Triangle t = new Triangle();
	t.draw();
	t.shapeMtd();	

// ******************	

	}
}