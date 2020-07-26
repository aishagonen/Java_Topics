package ee;
//SQ:39
public class E42CCMask {

	public static String maskCC(String creditCard) {
		String x = " XXXX-XXXX-XXXX-";
			// line n1	
	}
	
	public static void main(String[] args) {
		
		System.out.println(maskCC("1234-5678-9101-1121"));
			
	}

}

/*
 	You are developing a banking module. You have developed a class named ccMask that has a maskcc
	method. Given the code fragment: (yukarida)
	AND;
	You must ensure that the maskcc method returns a string that hides all digits of the credit card number
	except the four last digits (and the hyphens that separate each group of four digits).
	Which three code fragments should you use at line n1, independently, to achieve this requirement?

	A. StrinBuilder sb = new StringBuilder(creditCard);
		sb.substring(15,19);
		return x + sb;
	
	B. return x + creditCard.substring(15,19);

	C. StringBuilder sb = new StringBuilder(x);
		sb.append(creditCard,15,19);
		return sb.toString();
		
	D. StringBuilder sb = new stringBuilder(creditCard);  		==> 
		stringBuilder s = sb.insert(0,x);
		return s.toString();
	
	E. StringBuilder sb = new StringBuilder(creditCard);
		sb.replace(0,15,x);
		return sb.toString();



	Answ: B, C, E



*/













