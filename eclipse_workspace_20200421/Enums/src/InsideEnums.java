
public class InsideEnums {

enum Flavor{
	CHOCOLATE, VANILLA, STRAWBERRY, LEMON; 
	
// You can also have a methods inside of Enum. Gostermek icin bu methodu sonradan ekledik ve if'leri sildik.
	public static void getVanilla() {
		System.out.println(Flavor.VANILLA);
		
	}
}	
	public static void main(String[] args) {
		
		Flavor flav = Flavor.LEMON;
		flav.getVanilla();   // burasini Enum'in icine metod yazdiktan sonra ekledik. Asagidakileri silip boyle de yazabilirsin. 
		
		if (flav ==flav.LEMON) {
			System.out.println("Yay! It is lemon.");
		} else if  (flav == flav.CHOCOLATE) {
			System.out.println("Yay! It is chocolate.");
		} else if (flav == flav.STRAWBERRY) {
			System.out.println("Yay! It is starwberry.");
		} else if (flav == flav.VANILLA) {
			System.out.println("Yay! It is vanilla.");
		} 
		
		
		
		
		
		
	}

}
