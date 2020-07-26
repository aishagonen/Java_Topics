package midterm;

public class Question4 {

	public static void main(String[] args) {

		StringBuilder strB = new StringBuilder("Hello Universe!");

		reverse(strB);

		reverse1("What a beautiful day!");

	}

	static void reverse(StringBuilder str1) {
		System.out.println(str1.reverse());
	}

	static void reverse1(String str) {
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println("Reversed string is:");
		System.out.println(reverse);
	}

}
