
public class W9 {

	public static void main(String[] args) {

		extracted();

		int count3 = 0;
		
		while (count3 < 14) {
			if (count3 % 2 == 0) {
				System.out.println(count3 + " is an even number");
			} else {
				System.out.println(count3 + " is an odd number");
			}
			count3++;
		}

	}

	public static void extracted() {
		int b = 8;
		while (b == 8) {
			int i = 0;
		}
	}

	public void workHours(String start, String close) {
		System.out.println("Start time: " + start + "\nClosing time: " + close);
	}

}
