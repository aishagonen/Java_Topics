package lab9;

interface X {
	
	void methodX();
}

class Y implements X {
	
	public void methodX() { // access modifier must be public. 
		System.out.println("Method X");
	}
}

