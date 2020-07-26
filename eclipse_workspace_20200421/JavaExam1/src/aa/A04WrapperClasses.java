package aa;
//Q:   / SQ: 114
public class A04WrapperClasses {

	public static void main(String[] args) {

		Short s1 = 200;
		Integer s2 = 400;
		Long s3 = (long) s1 + s2;		// line n1
		String s4 = (String) (s3 * s2); // line n2
		System.out.println("Sum is " + s4);
		
	}
}


/*
 	What is the result?
 	A. Sum is 600
	B. Compilation fails at line n1.
	C. Compilation fails at line n2.
	D. A ClassCastException is thrown at line n1.
	E. A ClassCastException is thrown at line n2.
 	
 	Answer : C. Compilation fails at line n2.
 	
 	Cannot cast from long to String.
 
	 Short, Integer, Long ve String classlarindan obje olusturulmus. s'ler data type degil, obje. 
	 Kucuk datatytpler buyuk dataType'a donusebilir.
	 
	 9. line'da casting yapip integeri longa ceviriyor. 
	 10.lineda long stringe donusturulmez. 
	 
	 
*/