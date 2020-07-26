package AExamples;

abstract class A1 { 	// i'leri harflerle degistirdik, her metodun classin icindeki i etc, kendi classina ait. 

	abstract int firstMethod(int c);
	
	abstract int secondMethod(int c);
	
	int thirdMethod(int b) { 	// 124
		return secondMethod(++b); 	// 125
	}
}

abstract class B extends A1 {
	
	int secondMethod(int d) {
		return firstMethod(++d);	// 126
	}
}

class C extends B{
	
	int firstMethod(int i) { 	// 126
		return ++i; 	// 127
	}
}
class MainA1 {
	
	public static void main(String[] args) {

		C c = new C ();
		System.out.println(c.thirdMethod(124)); // outp: 127
		System.out.println(c.secondMethod(124)); // outp: 126
	}
}
