package bookStore;

public class BookStore {

	private String storeName;
	private  int numOfBook;
	
	public BookStore(String storeName, int numOfBook) {
		super();
		this.storeName = storeName;
		this.numOfBook = numOfBook;
		System.out.println("Store name: "+ storeName + "\nBook numbers: "+ numOfBook);
	}
	public void workHours (String start, String close) {
		System.out.println("Start time: " + start + "\nClosing time: " + close);
	}
	public int numOfEmployee (int numOfEmployee) {
		return numOfEmployee;
	}
	
	
	
	
	
}
