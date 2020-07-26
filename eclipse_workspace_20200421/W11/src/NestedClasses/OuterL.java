package NestedClasses;

public class OuterL {

	private int data = 30;
	
	void display() {
		
		class Local {
			
			void msg() {
				System.out.println("Value is : " + data);
			}
			
		}
		
		Local local1 = new Local();
		local1.msg();

	}

	public static void main(String[] args) {
		
		OuterL outerL = new OuterL();
		outerL.display();
		
	}

}
