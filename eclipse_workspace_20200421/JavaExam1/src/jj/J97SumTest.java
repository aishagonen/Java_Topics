package jj;
//SQ:   /Q:51
public class J97SumTest {

	public static void doSum(Integer x, Integer y) {
		System.out.println("Integer sum is " + (x + y) );
	}
	
	public static void doSum(double x, double y) {
		System.out.println("double sum is " + (x + y) );
	}
	
	public static void doSum(float x, float y) {
		System.out.println("float sum is " + (x + y) );
	}
	
	public static void doSum(int x, int y) {
		System.out.println("int sum is " + (x + y) );
	}
	
	public static void main(String[] args) {
		
		doSum(10,20);
		doSum(10.0, 20.0);

	}

}
/*
	What is the result?
	A. int sum is 30float sum is 30.0
	B. int sum is 30double sum is30.0
	C. integer sum is 30double sum is 30.0
	D. integer sum is 30float sum is 30.0
	

	Answ: 	int sum is 30
			double sum is 30.0

*/