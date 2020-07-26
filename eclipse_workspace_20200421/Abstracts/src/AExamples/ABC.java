package AExamples;

abstract class ABC {

	abstract void methodOne(); 
	
}
abstract class XYZ extends ABC {
	int i;
	
	@Override
	void methodOne() {
		methodOne(i *= i);
	}
	
	abstract void methodOne(int i);
}

class PQR extends XYZ {

	public PQR(int i) {
		this.i = i;
	}

	@Override
	void methodOne(int i) {
		System.out.println(i++);	
	}
}

class MainClassABC {
	
	public static void main(String[] args) {
		
		PQR pqr = new PQR(1);
		
		pqr.methodOne();
	}
}
