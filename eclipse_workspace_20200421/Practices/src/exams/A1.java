package exams;
// Which of the class definitions fail to compile?

final class A1 {

	public A1() {	
	}
}

public class A2 {
	
	private static int i;
	
	private A2() { 		// Constructors can be only public, private, protected, default.
	}
}

abstract class A3 {
	
	private static int i;
	
	public void doStuff() {
	}
	
	public A3() {
	}
}

class A4 { 		
	
	protected static final int i;  // bir variable final olarak tanimlaniyorsa deger vermemiz gerekir.
	// bir variable 'protected static final' olarak tanimlanabilir. 
	
	private void doSttuff() {
	}
}

final abstract class A5 {  // The class A5 can be either abstract or final, not both.
	
	protected static int i;
	
	void doStuff() {
	}
}
/*Class'larin basina sadece 'public, abstract or final'yazilir. Bi sey yazmiyorsa 'default' demektir. 
 * Bi class, can be either abstract or final. Can not be both.
 * Bir variable final olarak tanimlaniyorsa deger vermemiz gerekir.
 * Bir variable 'protected static final' olarak tanimlanabilir.
 * Constructors can be only public, private, protected, default. 
 * 
 * Answ: class A4 and class A5 fail to compile.
 */











