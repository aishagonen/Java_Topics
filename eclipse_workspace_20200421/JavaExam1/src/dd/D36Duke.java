package dd;
//SQ: 45
public class D36Duke {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder("Duke");
		
		String str1 = sb1.toString();
				// line n1
		String str2 = str1;
		System.out.println(str1 == str2);
		

//		String s = "Hi";
//		String b = "Hi";
//		String c = "hi";
//
//		s = c;
//
//		System.out.println(s==c);
//		System.out.println(s==b);
		
	}

}

/*
	A. String str2 = str1; ==> true 
	B. String str2 = new String(str1); ==> false
	C. String str2 = sb1.toString(); ==> false
	D. String str2 = "Duke";  ==> Duke

	A-  String str2 = str1; means, both objects are in same point. 
	
	B- 	String str2 = new String(str1);	means
		String str2 = Duke 
		
	C-	String str1 = sb1.toString();  means :
		String str1 = Duke	
		
	D-	String str2 = sb1.toString();  means :
		String str1 = Duke
	
	
	Answ: A. 

	string olduklari icin == isareti objectlerin yerini point eder, value olarak esitlige .equal ile bakiyoruz. 


*/