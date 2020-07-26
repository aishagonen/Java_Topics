package assignment12;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		int num;
		String answer;

		MyCalculator obj = new MyCalculator();
		System.out.print("I implemented: ");
		ImplementedInterfaceNames(obj);
		do {
			System.out.println("Enter a number");
			num = kb.nextInt();
			obj.divisor_sum(num);

			System.out.println("Do you want to find sum of number's divisions again? [Y or N]: ");
			answer = kb.next();
		} while (answer.equalsIgnoreCase("Y")); // or: } while (num <= 1000);
		System.out.println("Bye...");

		kb.close();
	}

	static void ImplementedInterfaceNames(Object o) {

		Class[] theInterfaces = o.getClass().getInterfaces();

		for (int i = 0; i < theInterfaces.length; i++) {
			String interfaceName = theInterfaces[i].getName();
			System.out.println(interfaceName);
		}

	}
}
