package bookStore;

public class BarnesNoble extends BookStore {

	public BarnesNoble(String storeName, int numOfBook) {
		super(storeName, numOfBook);

	}
	
	@Override
	public void workHours (String start, String close) {
		System.out.println("Start time: " + start + "\nClosing time: " + close);
	}

	@Override
	public int numOfEmployee(int numOfEmployee) {
		return numOfEmployee;
	}

	
	
	
	
}
