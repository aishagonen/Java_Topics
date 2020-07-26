package dd;
//SQ: 123
public class D38Qty {
	
	public static void main(String[] args) {

		double discount = 0;
		int qty = Integer.parseInt(args[0]);
		
			// line n1
		
	}

}
/* 
	- Which two code fragments can be independently placed at line n1 to meet the requirements?

	if value of the qty is greater than or equal 90, discount = 0.5
	if value of the qty is betw. 80 and 90, discount = 0.2

	A. 	if(qty>=90) {discount = 0.5;}
		if(qty>80 && qty<90) {discount = 0.2;}
	
	B. 	discount = (qty>=90) ? 0.5 : 0;
		discount = (qty>80) ? 0.2 : 0;
		
	C.	discount = (qty>=90) ? 0.5 : (qty>80) ? 0.2 : 0  
	
	D. if (qty>80 && qty<90) {
			discount = 0.2;
		} else {
			discount = 0;
		}
		if (qty>90) {
			discount = 0.5;
		} else {
			discount = 0;
		}
	
	E. 	discount = (qty>80) ? 0.2 : (qty>=90) ? 0.5:0;
	
	Answ: A, C.

*/