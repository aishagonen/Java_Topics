package AExamples;

abstract class A {

	int i = 111;
	int j = 222;
	
	abstract void methodOne();
	abstract void methodTwo();
}

abstract class P extends A {
	
	@Override
	void methodOne() {
		System.out.println(i); // 111
		System.out.println(j); // 222
		
		i = ++i; // 111
		j = --j; // 222
	}
}
class G extends P {

	@Override
	void methodTwo() {
		System.out.println(i); // 111
		System.out.println(j); //222
		
		i = i++; // 112
		j = j--; // 221
	}
	
}
class MainClass {
	
	public static void main(String[] args) {
		
		G c = new G();
		
		c.methodOne(); //111 222
		c.methodTwo(); //112 221
		
		System.out.println(c.i); //112
		System.out.println(c.j); //221
	}
}