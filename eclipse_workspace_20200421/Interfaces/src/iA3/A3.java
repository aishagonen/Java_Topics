package iA3;

class A3 implements D {
	
	public int methodD(int i) {
		return i =+ i * i;
	}
}

interface D {
	
	int methodD(int i);
}
	
//public class MainClass3 {
//	
//	public static void main(String[] args) {
//		
//		D d = new A3();
//		System.out.println(d.methodD(2)); // outp:4
//	}
//}