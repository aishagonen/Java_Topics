package statics;

import java.util.ArrayList;

public class StaticBlocks {

	static int variable = 9;
	static ArrayList<String> list = new ArrayList<String>();

	static {
		System.out.println("Hello Universe!");

		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
	}

	static {
		System.out.println("Hello from static block!");
	}

	public static void main(String[] args) {

		System.out.println(list);

	}

}

/*
 * - Static blocks, executed one time end then stops. - Static blocks for
 * initializing static variables. - Static blocks can be used whenever we want
 * to execute any instructions or statements before execution of main method. -
 * if a class has static members that require complex initialization.
 */