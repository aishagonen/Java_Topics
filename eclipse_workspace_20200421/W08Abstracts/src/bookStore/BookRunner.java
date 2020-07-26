package bookStore;

public class BookRunner {

	public static void main(String[] args) {

		BarnesNoble bn = new BarnesNoble ("Clifton Branch", 7000);
		bn.workHours("9am", "9pm");
		System.out.println(bn.numOfEmployee(13));
	
	}

}
