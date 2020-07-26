package hh;
//SQ: 27
public class H76Product {

	int id;
	String name;
	
	public H76Product(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
	
	public static void main(String[] args) {
		
		H76Product p1 = new H76Product(101, "Pen");
		H76Product p2 = new H76Product(101, "Pen");
		H76Product p3 = p1;
		
		boolean ans1 = p1 ==p2;
		boolean ans2 = p1.name.equals(p2.name);
		
		System.out.println(ans1 + ":" + ans2);
		
	}

}


/*
	What is the result?
	A. true:true
	B. true:false
	C. false:true
	D. false:false



	Answ: C 















*/