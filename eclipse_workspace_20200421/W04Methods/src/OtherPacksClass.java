import newPack.Methods2;   // 

public class OtherPacksClass {
	
	public static void main(String[] args) {

		Methods2 obj = new Methods2();
	 // obj.method1();      // compile error.
	 // Methods2.method2(); // compile error.
	    Methods2.method3();
	    obj.method4();
	 // obj.method5();      // compile error.
	}

}
