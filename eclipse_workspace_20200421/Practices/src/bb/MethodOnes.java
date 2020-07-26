package bb;

public class MethodOnes {

	static int methodOne(int i) {
		return methodTwo(i*=11);  // i=121
	}
	
	static int methodTwo(int i) {  // 121
		return methodThree(i/=11); // i=11
	}
	
	static int methodThree(int i) { // 11
		return methodFour(i-=11); // i=0
	}
	
	static int methodFour(int i) { // 0
		return i+=11; 	// i=11
	}
	
	public static void main(String[] args) {

		System.out.println(methodOne(11));	
		
	}

}





//outp : 11