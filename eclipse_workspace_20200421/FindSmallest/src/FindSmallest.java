import java.util.Scanner;

public class FindSmallest {

	public static void main(String[] args) {

		findSmallest();

		
		double doubleArray[] = new double[] { 43.1, 53.7, 32.3, 54.5 };

		System.out.println(smallestIndexNum(doubleArray));
		System.out.println(smallNum(doubleArray));
		System.out.println(smallNum2(doubleArray));
	}

	public static void findSmallest() {

		Scanner kb = new Scanner(System.in);

		System.out.print("Input the first number: ");
		double x = kb.nextDouble();

		System.out.print("Input the Second number: ");
		double y = kb.nextDouble();

		System.out.print("Input the third number: ");
		double z = kb.nextDouble();

		double smallest = Math.min(Math.min(x, y), z); // bu yontemi genelde bir kac element icin kullaniyoruz.
		System.out.println(smallest);
	}

	static int smallestIndexNum(double[] a) {

		int smallestInd = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < a[smallestInd]) {
				smallestInd = i;
			}
		}
		return smallestInd;
	}

	static int smallNum(double[] a) {

		double smallest = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < smallest) {
				smallest = a[i];
			}
		}
		return (int) smallest;
	}

	static int smallNum2(double[] a) {

		int smallestInd = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < a[smallestInd]) {
				smallestInd = i;
			}
		}
		return (int) a[smallestInd];
	}

}
