package lab10;

import java.awt.geom.AffineTransform;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class Q6 {

	public static void main(String[] args) {

		try {
			int num = 10;
			int div = 0;
			int ans = num / div;	
		} 
		catch (ArithmeticException ae) {
			ans = 0;  // bu kisim try'in disinda, 'ans' burada invalid.	// line n1 
		}
		catch (Exception e) {
			System.out.println("Invalid calculation");
		}
		System.out.println("Answer = " + ans); // line n2
	}	
}



/* What is the result?
A. Answer = 0
B. Invalid calculation
C. Compilation fails only at line n1.
D. Compilation fails only at line n2.
E. Compilation fails only at line n1 and line2.

Ans: E. Compilation fails only at line n1 and line2.

 */
