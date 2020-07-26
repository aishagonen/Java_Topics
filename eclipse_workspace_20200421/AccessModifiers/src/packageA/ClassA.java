package packageA;
public class ClassA { // p s v :
	public static void main(String[] args) {
// Why main method is static? : Static olmadigi zaman main method doesn't run. 
// Static means, objeden bagimsiz, yani bu methodu calistirmak icin illa bi obje olusturmana gerek yok. 
// Static method'lar bellekte direct olusuyorlar. Static bir method, static olmayan bir methodu direct cagiramaz. 
// So, static olmayanlar icin once obje olustur.	
		System.out.println("Hello Universe!");		
		sum(2, 5); 									// p s v
		System.out.println(mult(1, 0)); 			// p s
		ClassA objeA = new ClassA(); 				// p v
		objeA.turnOn();
		System.out.println(objeA.askAge(1960)); 	// p
		
// ClassB'deki method'lar:
		ClassB.turnOff(); 							// p s v
		System.out.println(ClassB.decide()); 		// p s
		ClassB objeB = new ClassB(); 				// p v
		objeB.calcArea(1, 1);
		System.out.println(objeB.askYas(1970)); 	// p
	}
	public static void sum(int a, int b) {
		System.out.println(a + b);
// Static oldugu icin bu methodun calismak icin hicbir classta objeye ihtiyaci yok. Ama hangi classtaki method oldugunu 
// gostermek icin 'className.methodName' yani 'ClassA.sum' yazarak cagirman gerekir. 
// Ekrana yazdirmak icin syso yazmalisin. 
// Void oldugu icin method'un basina return type yazilmaz. Parametrelere yaz. 
	}
	public static int mult(int a, int b) {
		return a * b;
// Void degil, so hangi type'i return edecegini basta yazmalisin. Baska bi sey yazma. 
// Static oldugu icin main method'ta sadece methodun adini yaz. eger baska classtan cagiririsan ait oldugu classla beraber yaz. 
	}
	public void turnOn() {
		System.out.println("Turning on...");
// static olmadigi icin main method'ta class adiyla beraber cagirmak gerekir, even in this class. 
// parametre almiyorsa () bos birakilir.
	}
	public int askAge(int bd) {		
		return (2020 - bd);		
	}
}
