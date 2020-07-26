package AExamples;

public abstract class X {

	int i = 111;
	int methodX() {  // We are here in the 1st step
		return methodX(i);  //  2. step
	}
	abstract int methodX(int i);
}
class Y extends X {

	@Override
	int methodX(int i) {
		return 0;
	}	
}
class MainClass5 {
	
	public static void main(String[] args) {
		Y y = new Y();
		System.out.println(y.methodX()); 
	}
}