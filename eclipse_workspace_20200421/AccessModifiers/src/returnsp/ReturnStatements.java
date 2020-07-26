package returnsp;

public class ReturnStatements {

	public static void main(String[] args) {
		
		printAMessage(); 		
	//	add (5,4);
	
	// if want to store that value in to another integer, let say sum:  
		int sum = add (5, 4); // can't do that. have to  use 'return' statement. 
		System.out.println(sum);

		String shouting = caps ("why are you reading my diary!");
		System.out.println(shouting);
		
		int [] awArray = arrayFromInts (3,7,1);
		System.out.println(awArray[0]);
		System.out.println(awArray[1]);
		System.out.println(awArray[2]);
	}
	public static void printAMessage () {
		System.out.println("This is first method: Print a message metodu.");
	}		
	//'add (5,4);'un cagirdigi method bu:
//	public static void add (int a, int b) {
//		System.out.println(a+b); //  
//	}
	// 'int sum = add (5, 4);'icin method bu:
	public static int add (int a, int b) {
		return a+b;
	}
	public  static String caps (String s) {
		return s.toUpperCase();	
	}		
	public static int[] arrayFromInts (int a, int b, int c) {
		int[] array = new int[3];
		array[0] = a;
		array[1] = b;
		array[2] = c;
		return array;
	}	
}
