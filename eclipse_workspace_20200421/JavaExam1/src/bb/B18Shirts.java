package bb;
//SQ: 51
public class B18Shirts {

	public static void main(String[] args) {

		String shirts[] [] = new String [2] [2];

		shirts [0][0] = "red";
		shirts [0][1] = "blue";
		shirts [1][0] = "small";
		shirts [1][1] = "medium";
		
		for (int index = 1; index < 2; index++) {
			for (int idx = 1; idx < 2; idx++) {
				System.out.print(shirts[index] [idx] + ":");
			}
		}   // outp --> medium :		
		
	}

}


/* 
 	Which code fragment prints red: blue: small: medium? 
 	
 	A. for (int index = 1; index < 2; index++) {
			for (int idx = 1; idx < 2; idx++) {
				System.out.print(shirts[index] [idx] + ":");
			}
		}  
		A'da index 1'den baslamiz ve sadece indexte yeri '1 1' olani yani medium: yazdirir. 
 	
 	
 	B. for (int index = 0; index < 2; index++) {
			for (int idx = 0; idx < index; ++idx) {
				System.out.print(shirts[index] [idx] + ":");
			}
		}
		B'de sadece indexte yeri '1 0' olani yani small: yazdirir.   
	
	C. for (String c : colors) {
			for(String s : sizes) {
				System.out.print(s + ":");
			}
		}
	 	C'de colors ve sizes variable olarak tanimlanmamis ve [] yazilmamis. Hata verir.
		
	D.  for (String[]c : shirts) {
			for(String s:c) {
				System.out.print(s);
			}
		}
	
	E. for (int index = 0; index < 2;) {
			for (int idx = 0; idx < 2;) {
				System.out.print(shirts[index] [idx] + ":");
				idx++;
			}
			index++;
		}
 	
 	Answ: D & E
 		
 	
 */ 
