package iAdvenceArthmtc;

interface AdvancedArithmetic {

	void divisor_sum(int n);
	
}
	
class MyCalculator implements AdvancedArithmetic {
	
	@Override
	public void divisor_sum(int num) {

		int sumOfDiv = 0;
		
		if (num <= 1000) {
			for (int i = 1; i <= num; i++) {	
				if (num % i == 0) {
					sumOfDiv = sumOfDiv + i; // sumOfDiv += i
				}
			}
			System.out.println("The sum of the divisors of " + num + " is: " + sumOfDiv);
		} 
		else {
			System.out.println("Entered number must be less than 1000");			
		}
	
	}
}
