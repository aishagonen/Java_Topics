package methObjVoidNonvoids;
public class MethodsEntry {

	public static void main(String[] args) {
	
//		int a = 2;
//		int b = 7;
//		
//		System.out.println(a*b);
//		
//		int c = 11;
//		int d = 3;
//		
//		System.out.println(c*d);
//		
//		int e = 1;
//		int f = 9;
//		
//		System.out.println(e*f);
//		
// Bu satirlarin hepsini tek tek yazmak yerine metod yazip, main'de bunlari cagiriyoruz. 
		
		welcome ();
		multiply(2, 7);
		multiply(11, 73);
		multiply(1, 9);
		divide(77, 11);
		divide(45670, 10);
		divide(78, 12);
	}
	
// metodlari main metodun disinda yaziyoruz ama classin icinde tanimliyoruz. 		
	public static void welcome () {
		System.out.println("Welcome to our calculator!");
	}
	
	public static void multiply (int a, int b) {  
		System.out.println(a * b);
	}
	
	public static void divide (int a, int b) {  
		System.out.println(a / b);
	}
}





