package assignment10;

public class AmazonBookStores {
	
	static int comics = 120; 
	static int SciFiNovels = 100;
	static int Biography = 130;
	static int customerCount=0;
	static int numberOfBooks=0;

	public AmazonBookStores() {
		customerCount ++;
	}

	void buyComics(){
		comics--;
		numberOfBooks++;
		
	}
	void buySciFi(){
		SciFiNovels--;
		numberOfBooks++;
	}
	void buyBiography(){
		Biography--;
		numberOfBooks++;
	}
	
	public static void main(String[] args) {

		AmazonBookStores customer1 = new AmazonBookStores();
		AmazonBookStores customer2 = new AmazonBookStores();
		AmazonBookStores customer3 = new AmazonBookStores();
		AmazonBookStores customer4 = new AmazonBookStores();

		customer1.buyComics();
		customer2.buySciFi();
		customer3.buyBiography();
		customer3.buyBiography();
		customer3.buyComics();
		customer4.buyComics();
		
		System.out.println("Number of created customer is: " + customerCount);
		System.out.println("Number of sold books: "+ numberOfBooks );
	
	}
}
