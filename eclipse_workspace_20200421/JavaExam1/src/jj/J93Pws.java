package jj;
//SQ:34
public class J93Pws {
	
	public static void main(String[] args) {
		
		String names [] = {"Thomas", "Peter", "Joseph"};
		String pwd [] = new String[3];
		
		int idx = 0;
		
		try {
			for (String n : names) {
				pwd[idx] = n.substring(2,6);
				idx++;
			}
		} 
		catch (Exception e) {
			System.out.println("Invalid Name");
		}
		for (String p : pwd) {
			System.out.println(p);
		}
		

	}

}


/*

	What is the result?
	A. Invalid Name
	B. Invalid Name omas
	C. Invalid Name omas null null
	D. omas ter


	Answ: 	Invalid Name
			omas
			null
			null

*/
