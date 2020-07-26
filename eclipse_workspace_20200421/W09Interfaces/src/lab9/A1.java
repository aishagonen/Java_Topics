package lab9;

interface A1{
	
	int i = 111;	
}

class B implements A1 {
	
	void methodB() {
		i = 222;
	}
}
	
// i can not be 222, because it assigned in interface already as 111. So it is final.
// code does not compile successfully. 
