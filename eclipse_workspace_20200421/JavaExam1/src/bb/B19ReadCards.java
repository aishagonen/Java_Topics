package bb;
//SQ: 64
public class B19ReadCards {

	void readCard(int cardNo) throws Exception {
		System.out.println("Reading Card");
	}
	
	void checkCard(int cardNo) throws RuntimeException { // line n1
		System.out.println("Checking Card");
	}
	
	public static void main(String[] args) { // 'throws Exception { ' olmali burasi

		B19ReadCards ex = new B19ReadCards();
		
		int cardNo = 12344;
		
		ex.checkCard(cardNo);  // line n2
		ex.readCard(cardNo);  // line n3

		
	}

}


/*What is the result?
A.  Reading Card
    Checking Card
B. Compilation fails only at line n1.
C. Compilation fails only at line n2.
D. Compilation fails only at line n3.
E. Compilation fails at both line n2 and line n3.

Ans: D

	Exception is checked exception during compilation, runtime will be checked during runtime. 
	Runtime Exception'i main methodun basinda declare etmek gerekmez. Ama eger check exception varsa onu yazmak gerek.
	readCard methodunda Exception olabilecegi belirtilmis. 
	Main method'a da 'throws Exception' yazmali ki main method hatayi yukari readCard methoduna firlatsin.  
	So Runtime Excp. hata vermez ama Exception hata verir. 

*/