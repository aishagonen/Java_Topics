package aa;
//Q:  / SQ: 128

class Product {

	double price;
	
}

public class A01ProductTester {
									// prt        // 100
	public void updatePrice(Product product, double price) {
		
		price = price *2;  // 200  		
		product.price = product.price + price; // 200(14.lineda bulduk)
	}				  // 200 (22.line'da vermis)
	
	public static void main (String [] args) {
		
		Product prt = new Product();
		
		prt.price = 200;  
		double newPrice = 100;
		
		A01ProductTester t = new A01ProductTester();
		
		t.updatePrice(prt, newPrice);
		
		System.out.println(prt.price + " : " + newPrice);
		
	}
}


/* 
  	What is the result?
	A. 200.0 : 100.0
	B. 400.0 : 200.0
	C. 400.0 : 100.0
	D. Compilation fails.


	outp: 400.0 : 100.0
*/