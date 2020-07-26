package w1;

public class W1 {

	public static void main(String[] args) {

		boolean username = true;
		boolean password = false;
		
//			true || true = true
//			true || false = true
//			false || false = false
//			true && true = true
//			true && false = false
//			false && false = false
		
		System.out.println(username && password);
		
		System.out.println(true || true);    
		System.out.println(true || false);    
		System.out.println(false || false);   
		System.out.println(false || false || false || false || true );
		System.out.println("Or operator: " + (true || true));
		System.out.println("And operator: " + (true && (false || 9<0 || 9>8 )));
			

// **************************************************************		
		
// Widening Casting:
		
		short age = 23;
		double myDouble = age;
		
		System.out.println(myDouble);  //sonucu double cinsinden gosterir.
		System.out.println(age);	  // sonucu short cinsinden gosterir. 
		
		System.out.println(myDouble+age);
		// double > short. ikisiyle islem yapsan double cinsinden gosterir.
		
//*******************
		int n1=4;
		int n2=5;
		System.out.println((double)n1/n2); // sonucu double istiyorsan '(double)' yazmalisin.
		int sum = n1+n2;
		System.out.println(sum/2);
		double sum1=n1+n2;
		System.out.println(sum1/2);
		
// Narrowing Castig:
		
		double k = 20.9;
		int ad = (int) 20.9;
		System.out.println(k);
		System.out.println(ad);
		
		System.out.println(k+ad);
		//double > int. ikisiyle islem yapsan double cinsinden gosterir.
		

// **************************************************************		
		
				
		
		
	}

}
