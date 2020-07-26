package basicOOP;

public class MethodParam {

	public static void main(String[] args) {

// Create object to call void method: Also use  object to call non-void method too, but in different way. 
		
		MethodParam obj = new MethodParam();
		obj.add(5, 2);
	
// Print syso to call non-void method:
		
		System.out.println("Multiply the values: " + obj.multiply(3, 5));
		
		System.out.println(obj.fullName("Charlie", "Brown"));
	
	
	}

// Void method with parameterized:
	
	public void add(int num1, int num2) {
		
		int sum = num1 + num2;
		
		System.out.println("Sum of the values: " + sum );
	}
	
// Non-void method with parameterized:
	
	public int multiply(int num1, int num2) {
		
		int multiplyNum = num1 * num2;
		
		return multiplyNum;
	}
	
	public String fullName(String  firstName, String lastName) {
		
		return "Your full name is " + firstName +lastName;
  	}
	
}
